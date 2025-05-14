
SELECT animal_id, name, sex_upon_intake
FROM animal_ins AS ani
WHERE ani.name LIKE 'Lucy%'
   OR ani.name LIKE '현윤%'
   OR ani.name LIKE 'Ella%'
   OR ani.name LIKE 'Pickle%'
   OR ani.name LIKE 'Rogan%'
   OR ani.name LIKE 'Sabrina%'
   OR ani.name LIKE 'Mitty%';
