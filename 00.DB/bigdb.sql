-- 2. 매출분석
SELECT
    COUNT(quantity) 총주문건,
    SUM(sales) 총매출합계,
    ROUND(AVG(sales),0) 평균매출,
    MAX(sales) 최고매출,
    MIN(sales) 최저매출
FROM
    order_info;
    
-- 3. 매출 비교 분석 ???????????????????????????????????ㅍ
SELECT
    count(*) 총주문건,
    SUM(sales) 총매출합계,
    sum(decode(item_id, ( SELECT item_id FROM item WHERE product_desc = '온라인_전용상품'), 1, 0)) 온라인전용상품주문건,
    sum(decode(item_id, ( SELECT item_id FROM item WHERE product_desc = '온라인_전용상품'), sales, 0)) 온라인전용상품매출합계,
    ROUND(sum(decode(item_id, ( SELECT item_id FROM item WHERE product_desc = '온라인_전용상품'), 1, 0)) * 100 / count(*), 2) 주문건수비율,
    ROUND(sum(decode(item_id, ( SELECT item_id FROM item WHERE product_desc = '온라인_전용상품'), sales, 0)) * 100 / SUM(sales), 2) 매출합계비율
FROM
    order_info;
    
    
-- 4. 상품별 매출 분석
SELECT
    o.item_id,
    i.product_name,
    sum(o.sales) 매출합계
FROM
    order_info o JOIN item i
ON
    o.item_id = i.item_id 
GROUP BY
    o.item_id,
    i.product_name
ORDER BY
    매출합계 DESC;

-- 5. 월별상품 매출 분석 (시계열 분석)
SELECT
    substr(r.reserv_date,1,6) 년월,
    sum(DECODE(i.product_name, 'SPECIAL_SET', o.sales,0)) special_set,
    sum(DECODE(i.product_name, 'PASTA', o.sales,0)) PASTA,
    sum(DECODE(i.product_name, 'PIZZA', o.sales,0)) PIZZA,
    sum(DECODE(i.product_name, 'SEA_FOOD', o.sales,0)) SEA_FOOD,
    sum(DECODE(i.product_name, 'SALAD_BAR', o.sales,0)) SALAD_BAR,
    sum(DECODE(i.product_name, 'SALAD', o.sales,0)) SALAD,
    sum(DECODE(i.product_name, 'SANDWITCH', o.sales,0)) SANDWITCH,
    sum(DECODE(i.product_name, 'WINE', o.sales,0)) WINE,
    sum(DECODE(i.product_name, 'JUICE', o.sales,0)) JUICE,
    sum(DECODE(i.product_name, 'STAKE', o.sales,0)) STAKE
FROM
    reservation r 
JOIN order_info o
ON 
    r.reserv_no = o.reserv_no
JOIN item i
ON
    o.item_id = i.item_id
GROUP BY
    substr(r.reserv_date,1,6)
ORDER BY
    substr(r.reserv_date,1,6)
;


-- 6. 월별 총 매출, 전용 상품 매출 비교 분석
SELECT
    substr(r.reserv_date,1,6) 년월,
    sum(sales) 매출합계, 
    sum(DECODE(i.product_name, 'SPECIAL_SET', o.sales,0)) special_set
FROM
    reservation r 
JOIN order_info o
ON 
    r.reserv_no = o.reserv_no
JOIN item i
ON
    o.item_id = i.item_id
GROUP BY
    substr(r.reserv_date,1,6)
ORDER BY
    substr(r.reserv_date,1,6)
;

-- 7 매출 기여율
SELECT
    substr(r.reserv_date,1,6) 년월,
    sum(sales) - sum(DECODE(i.product_name, 'SPECIAL_SET', o.sales,0)) ETC, 
    sum(DECODE(i.product_name, 'SPECIAL_SET', o.sales,0)) special_set,
    round(sum(DECODE(i.product_name, 'SPECIAL_SET', o.sales,0)) / sum(sales) * 100,1) 매출기여율
FROM
    reservation r 
JOIN order_info o
ON 
    r.reserv_no = o.reserv_no
JOIN item i
ON
    o.item_id = i.item_id
GROUP BY
    substr(r.reserv_date,1,6)
ORDER BY
    substr(r.reserv_date,1,6)
;

-- 8 예약 완료 취소건 분석
SELECT
    substr(r.reserv_date,1,6) 년월,
    sum(sales) - sum(DECODE(i.product_name, 'SPECIAL_SET', o.sales,0)) ETC, 
    sum(DECODE(i.product_name, 'SPECIAL_SET', o.sales,0)) special_set,
    round(sum(DECODE(i.product_name, 'SPECIAL_SET', o.sales,0)) / sum(sales) * 100,1) 매출기여율,
    count(*) 총주문건,
    count(*) 예약완료건,
    SUM(DECODE(r.cancel, 'Y', 1, 0)) 예약취소건
FROM
    reservation r 
JOIN order_info o
ON 
    r.reserv_no = o.reserv_no
JOIN item i
ONC
    o.item_id = i.item_id
GROUP BY
    substr(r.reserv_date,1,6)
ORDER BY
    substr(r.reserv_date,1,6)
;
