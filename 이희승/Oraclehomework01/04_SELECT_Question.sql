--1) 성적순으로 학생의 이름을 검색하라
SELECT SNAME  
	FROM STUDENT 
	ORDER BY AVR ;

--2) 학과별 성적순으로 학생의 정보를 검색하라

SELECT SNO 
	,SNAME 
	,MAJOR 
	,SYEAR 
	,AVR 
	FROM STUDENT 
	ORDER BY AVR ;
--3) 학년별 성적순으로 학생의 정보를 검색하라
SELECT SNO 
	,SNAME 
	,MAJOR 
	,SYEAR 
	,AVR 
	FROM STUDENT 
	ORDER BY SYEAR, AVR ;

--4) 학과별 학년별로 학생의 정보를 성적순으로 검색하라
SELECT SNO 
	,SNAME 
	,MAJOR 
	,SYEAR 
	,AVR 
	FROM STUDENT 
	ORDER BY MAJOR , SYEAR ;

--5) 학점순으로 과목 이름을 검색하라
SELECT ST_NUM
      ,CNAME
      FROM COURSE
      ORDER BY ST_NUM;


--6) 각 학과별로 교수의 정보를 검색하라
SELECT PNAME
      ,SECTION
FROM PROFESSOR
ORDER BY SECTION;

--7) 지위별로 교수의 정보를 검색하라
SELECT PNAME
      ,ORDERS
FROM PROFESSOR
ORDER BY ORDERS;

--8) 각 학과별로 교수의 정보를 부임일자 순으로 검색하라
SELECT PNAME
      ,HIREDATE
FROM PROFESSOR
ORDER BY SECTION,HIREDATE;


