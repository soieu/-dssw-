-- 2. 매출분석
SELECT
    COUNT(quantity) 총주문건,
    SUM(sales) 총매출합계,
    ROUND(AVG(sales),0) 평균매출,
    MAX(sales) 최고매출,
    MIN(sales) 최저매출
FROM
    order_info;
    
-- 3. 매출 비교 분석
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
    substr(reserv_date,1,6) 년월
FROM
    reservation
GROUP BY
    substr(reserv_date,1,6)
;