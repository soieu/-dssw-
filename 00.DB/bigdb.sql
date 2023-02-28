-- 2. ����м�
SELECT
    COUNT(quantity) ���ֹ���,
    SUM(sales) �Ѹ����հ�,
    ROUND(AVG(sales),0) ��ո���,
    MAX(sales) �ְ����,
    MIN(sales) ��������
FROM
    order_info;
    
-- 3. ���� �� �м�
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
    substr(reserv_date,1,6) ���
FROM
    reservation
GROUP BY
    substr(reserv_date,1,6)
;