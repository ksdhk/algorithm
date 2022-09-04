-- 코드를 입력하세요
SELECT ANIMAL_ID
, NAME
, CASE WHEN  instr(SEX_UPON_INTAKE,'Neutered') =1
     THEN 'O'
     WHEN  instr(SEX_UPON_INTAKE,'Spayed') =1
     THEN 'O'
     ELSE 'X'
     END   AS 중성화
FROM ANIMAL_INS
ORDER BY ANIMAL_ID