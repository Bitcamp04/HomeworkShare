--1) 각 학생의 평점을 검색하라(별칭을 사용)
SELECT AVR AS 평점
FROM STUDENT;

--2) 각 과목의 학점를 검색하라(별칭을 사용)
SELECT ST_NUM AS 학점
FROM COURSE;

--3) 각 교수의 지위를 검색하라(별칭을 사용)
SELECT ORDERS 직위
		FROM PROFESSOR ;

--4) 급여를 10%인상했을 때 연간 지급되는 급여를 검색하라(별칭을 사용)
SELECT SAl 
		,(SAL+(SAL/10))*10 AS 인상된월급
 		FROM EMP;	


--5) 현재 학생의 평균 평점은 4.0만점이다. 이를 4.5만점으로 환산해서 검색하라(별칭을 사용)
SELECT AVR
    ,(AVR / 4.0) * 4.5 AS "4.5환산"
    	FROM STUDENT;


