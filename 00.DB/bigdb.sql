-- 2. ����м�
SELECT
    COUNT(quantity) ���ֹ���,
    SUM(sales) �Ѹ����հ�,
    ROUND(AVG(sales),0) ��ո���,
    MAX(sales) �ְ����,
    MIN(sales) ��������
FROM
    order_info;
    
-- 3. ���� �� �м� ???????????????????????????????????��
SELECT
    count(*) ���ֹ���,
    SUM(sales) �Ѹ����հ�,
    sum(decode(item_id, ( SELECT item_id FROM item WHERE product_desc = '�¶���_�����ǰ'), 1, 0)) �¶��������ǰ�ֹ���,
    sum(decode(item_id, ( SELECT item_id FROM item WHERE product_desc = '�¶���_�����ǰ'), sales, 0)) �¶��������ǰ�����հ�,
    ROUND(sum(decode(item_id, ( SELECT item_id FROM item WHERE product_desc = '�¶���_�����ǰ'), 1, 0)) * 100 / count(*), 2) �ֹ��Ǽ�����,
    ROUND(sum(decode(item_id, ( SELECT item_id FROM item WHERE product_desc = '�¶���_�����ǰ'), sales, 0)) * 100 / SUM(sales), 2) �����հ����
FROM
    order_info;
    
    
-- 4. ��ǰ�� ���� �м�
SELECT
    o.item_id,
    i.product_name,
    sum(o.sales) �����հ�
FROM
    order_info o JOIN item i
ON
    o.item_id = i.item_id 
GROUP BY
    o.item_id,
    i.product_name
ORDER BY
    �����հ� DESC;

-- 5. ������ǰ ���� �м� (�ð迭 �м�)
SELECT
    substr(r.reserv_date,1,6) ���,
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


-- 6. ���� �� ����, ���� ��ǰ ���� �� �м�
SELECT
    substr(r.reserv_date,1,6) ���,
    sum(sales) �����հ�, 
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

-- 7 ���� �⿩��
SELECT
    substr(r.reserv_date,1,6) ���,
    sum(sales) - sum(DECODE(i.product_name, 'SPECIAL_SET', o.sales,0)) ETC, 
    sum(DECODE(i.product_name, 'SPECIAL_SET', o.sales,0)) special_set,
    round(sum(DECODE(i.product_name, 'SPECIAL_SET', o.sales,0)) / sum(sales) * 100,1) ����⿩��
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

-- 8 ���� �Ϸ� ��Ұ� �м�
SELECT
    substr(r.reserv_date,1,6) ���,
    sum(sales) - sum(DECODE(i.product_name, 'SPECIAL_SET', o.sales,0)) ETC, 
    sum(DECODE(i.product_name, 'SPECIAL_SET', o.sales,0)) special_set,
    round(sum(DECODE(i.product_name, 'SPECIAL_SET', o.sales,0)) / sum(sales) * 100,1) ����⿩��,
    count(*) ���ֹ���,
    count(*) ����Ϸ��,
    SUM(DECODE(r.cancel, 'Y', 1, 0)) ������Ұ�
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
