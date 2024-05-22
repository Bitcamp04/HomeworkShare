--1) 평점이 3.0에서 4.0사이의 학생을 검색하라(between and)
SELECT *
FROM STUDENT s 
WHERE s.AVR BETWEEN 3.0 AND 4.0;

--2) 1994년에서 1995년까지 부임한 교수의 명단을 검색하라(between and)
SELECT *
FROM PROFESSOR p 
WHERE p.HIREDATE BETWEEN TO_DATE('19940101 000000','YYYYMMDD HH24miss') AND  TO_DATE('19951231 235959','YYYYMMDD HH24miss');


--3) 화학과와 물리학과, 생물학과 학생을 검색하라(in)
SELECT *
FROM STUDENT s 
WHERE s.MAJOR  IN ('화학','물리','생물');

--4) 정교수와 조교수를 검색하라(in)
SELECT *
FROM PROFESSOR p 
WHERE p.ORDERS IN ('정교수','조교수');

--5) 학점수가 1학점, 2학점인 과목을 검색하라(in)
SELECT *
FROM COURSE c 
WHERE c.ST_NUM IN (1,2);

--6) 1, 2학년 학생 중에 평점이 2.0에서 3.0사이인 학생을 검색하라(between and)
SELECT *
FROM STUDENT s 
WHERE (s.AVR between 2.0 AND 3.0) AND (s.SYEAR  between 1 AND 2);

--7) 화학, 물리학과 학생 중 1, 2 학년 학생을 성적순으로 검색하라(in)
SELECT *
FROM STUDENT s 
WHERE (s.MAJOR  IN ('화학','물리')) AND (s.SYEAR  between 1 AND 2)
ORDER BY s.AVR ;


--8) 부임일이 1995년 이전인 정교수를 검색하라(to_date)
SELECT *
FROM PROFESSOR p 
WHERE p.HIREDATE < TO_DATE('19950101 000000','YYYYMMDD HH24miss');

--1) 송강 교수가 강의하는 과목을 검색한다
SELECT *
FROM COURSE c 
WHERE c.PNO =(
	SELECT PNO
	FROM PROFESSOR
	WHERE PNAME = '송강'
);

--2) 화학 관련 과목을 강의하는 교수의 명단을 검색한다
SELECT p.PNO ,p.PNAME ,p."SECTION" ,c.CNAME 
FROM PROFESSOR p 
JOIN COURSE c 
ON p.PNO = c.PNO  
WHERE c.CNAME LIKE '%화학%';

--3) 학점이 2학점인 과목과 이를 강의하는 교수를 검색한다
SELECT p.PNO ,p.PNAME ,p."SECTION" ,c.CNAME,c.ST_NUM  
FROM PROFESSOR p 
JOIN COURSE c 
ON p.PNO = c.PNO  
WHERE c.ST_NUM = 2;

--4) 화학과 교수가 강의하는 과목을 검색한다
SELECT p.PNO ,p.PNAME ,p."SECTION" ,c.CNAME,c.ST_NUM  
FROM PROFESSOR p 
JOIN COURSE c 
ON p.PNO = c.PNO  
WHERE p."SECTION" ='화학';

--5) 화학과 1학년 학생의 기말고사 성적을 검색한다
SELECT s.SNAME ,s2."RESULT" ,s.SYEAR 
FROM STUDENT s 
JOIN SCORE s2 
ON s.SNO = s2.SNO 
WHERE s.SYEAR = 1;

--6) 일반화학 과목의 기말고사 점수를 검색한다
SELECT c.CNAME ,s2."RESULT" 
FROM COURSE c 
JOIN SCORE s2 
ON c.CNO = s2.CNO 
WHERE c.CNAME = '일반화학';

--7) 화학과 1학년 학생의 일반화학 기말고사 점수를 검색한다
SELECT c.CNAME ,s2."RESULT" ,s.SNAME ,s.SYEAR,s.MAJOR 
FROM COURSE c 
JOIN SCORE s2 
ON c.CNO = s2.CNO 
JOIN STUDENT s 
ON s.SNO = s2.SNO 
WHERE c.CNAME = '일반화학' AND s.SYEAR  =1 AND s.MAJOR ='화학';

--8) 화학과 1학년 학생이 수강하는 과목을 검색한다
SELECT DISTINCT c.CNAME 
FROM STUDENT s 
JOIN SCORE s2 
ON s.SNO = s2.SNO 
JOIN COURSE c 
ON s2.CNO = c.CNO 
WHERE s.MAJOR ='화학' AND s.SYEAR =1;

--9) 유기화학 과목의 평가점수가 F인 학생의 명단을 검색한다
SELECT s.*,s3.GRADE,s2."RESULT"  
FROM STUDENT s 
JOIN SCORE s2 
ON s.SNO = s2.SNO 
JOIN COURSE c 
ON s2.CNO = c.CNO 
JOIN SCGRADE s3 
ON s2."RESULT" BETWEEN s3.LOSCORE AND s3.HISCORE 
WHERE c.CNAME = '유기화학' AND s3.GRADE = 'F';

--1) 학생중에 동명이인을 검색한다
SELECT  *
FROM STUDENT original
JOIN STUDENT copy
ON original .SNAME = COPY.SNAME 
WHERE original .SNO <> COPY.SNO ;

--2) 전체 교수 명단과 교수가 담당하는 과목의 이름을 학과 순으로 검색한다
SELECT *
FROM PROFESSOR p 
LEFT OUTER JOIN COURSE c 
ON p.PNO =c.PNO 
ORDER BY p."SECTION" ;

--3) 이번 학기 등록된 모든 과목과 담당 교수의 학점 순으로 검색한다
SELECT *
FROM PROFESSOR p 
right OUTER JOIN COURSE c 
ON p.PNO =c.PNO 
ORDER BY c.ST_NUM  ;


--1) 각 과목의 과목명과 담당 교수의 교수명을 검색하라
SELECT *
FROM PROFESSOR p 
full OUTER JOIN COURSE c 
ON p.PNO =c.PNO ;

--2) 화학과 학생의 기말고사 성적을 모두 검색하라
SELECT s.SNO ,s.SNAME ,s.MAJOR ,s2."RESULT" 
FROM STUDENT s 
JOIN SCORE s2 
ON s.SNO =s2.SNO  
WHERE s.MAJOR ='화학'
ORDER BY s.SNAME ;

--3) 유기화학과목 수강생의 기말고사 시험점수를 검색하라
SELECT s.SNO ,s.SNAME ,s.MAJOR ,s2."RESULT",c.CNAME  
FROM STUDENT s 
JOIN SCORE s2 
ON s.SNO =s2.SNO  
JOIN COURSE c 
ON s2.CNO =c.CNO 
WHERE c.CNAME = '유기화학'
ORDER BY s.SNAME ;

--4) 화학과 학생이 수강하는 과목을 담당하는 교수의 명단을 검색하라
SELECT DISTINCT p.PNAME 
FROM STUDENT s 
LEFT JOIN SCORE s2 
ON s.SNO =s2.SNO 
LEFT JOIN COURSE c 
ON s2.CNO = c.CNO 
JOIN PROFESSOR p 
ON p.PNO = c.PNO
WHERE s.MAJOR ='화학';
--5) 모든 교수의 명단과 담당 과목을 검색한다
SELECT p.*,c.CNAME 
FROM PROFESSOR p 
JOIN COURSE c 
ON p.PNO = c.PNO  ;

--6) 모든 교수의 명단과 담당 과목을 검색한다(단 모든 과목도 같이 검색한다)
SELECT p.*,c.CNAME 
FROM PROFESSOR p 
LEFT OUTER JOIN COURSE c 
ON p.PNO = c.PNO  ;

