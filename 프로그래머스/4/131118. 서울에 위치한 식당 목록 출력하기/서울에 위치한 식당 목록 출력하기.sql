-- 코드를 입력하세요
SELECT r1.rest_id, r1.rest_name, r1.food_type, r1.favorites, r1.address, ROUND(AVG(r2.review_score), 2) AS avg_score
from rest_info r1, rest_review r2
where r1.rest_id = r2.rest_id and address like "서울%"
group by r1.rest_id, r1.rest_name, r1.food_type, r1.favorites, r1.address
order by avg_score desc, r1.favorites desc;