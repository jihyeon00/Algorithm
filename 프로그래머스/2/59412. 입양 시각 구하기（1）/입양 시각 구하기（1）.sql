-- 코드를 입력하세요
SELECT
    TO_NUMBER(TO_CHAR(DATETIME, 'HH24')) HOUR, count(*)
FROM
    ANIMAL_OUTS
group by
    TO_NUMBER(TO_CHAR(DATETIME, 'HH24'))
having
    TO_NUMBER(TO_CHAR(DATETIME, 'HH24')) between 9 and 19
order by 1;