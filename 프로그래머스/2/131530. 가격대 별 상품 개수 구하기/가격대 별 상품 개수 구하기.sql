-- 코드를 입력하세요
-- 문제: PRODUCT 테이블에서 
-- 만원 단위의 가격대 별로 상품 개수를 출력
-- 이때 컬럼명은 각각 컬럼명은 PRICE_GROUP, PRODUCTS로 지정
-- 가격대 정보는 각 구간의 최소금액
-- (10,000원 이상 ~ 20,000 미만인 구간인 경우 10,000)으로 표시
-- 가격대를 기준으로 오름차순 정렬

-- 가격대 /10000 했을경우 
-- 몫이 1보다 작으면 0, 2보다 작으면 10000, .... => GROUP BY 쓸 방법이없음
-- 
 
SELECT  TRUNC(PRICE, -4) AS PRICE_GROUP, COUNT(PRODUCT_ID) PRODUCTS
FROM    PRODUCT
GROUP BY TRUNC(PRICE, -4)
ORDER BY TRUNC(PRICE, -4)
;