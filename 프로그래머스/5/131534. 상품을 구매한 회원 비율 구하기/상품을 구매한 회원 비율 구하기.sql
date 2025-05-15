SELECT YEAR(o.sales_date) AS 판매연도, MONTH(o.sales_date) AS 판매월, COUNT(DISTINCT o.user_id) AS 구매유저,ROUND(COUNT(DISTINCT o.user_id) * 1.0 / (SELECT COUNT(*) FROM user_info WHERE YEAR(joined) = 2021),1) AS 구매비율
FROM user_info u, online_sale o
WHERE u.user_id = o.user_id AND YEAR(u.joined) = 2021 AND YEAR(o.sales_date) = 2022
GROUP BY YEAR(o.sales_date), MONTH(o.sales_date)
ORDER BY 판매연도, 판매월;
