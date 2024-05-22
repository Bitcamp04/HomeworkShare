--1) 평점이 3.0에서 4.0사이의 학생을 검색하라(between and)
SELECT *
	FROM STUDENT ST
	WHERE AVR BETWEEN 3.0 AND 4.0;

--2) 1994년에서 1995년까지 부임한 교수의 명단을 검색하라(between and)
SELECT HIREDATE
	 , PNAME
FROM PROFESSOR
WHERE HIREDATE BETWEEN TO_DATE('1994-01-01', 'YYYY-MM-DD') AND TO_DATE('1995-12-31', 'YYYY-MM-DD');
 

--3) 화학과와 물리학과, 생물학과 학생을 검색하라(in)
SELECT ST.MAJOR
	 , ST.SNAME
	FROM STUDENT ST
	WHERE ST.MAJOR IN ('화학', '물리', '생물');

--4) 정교수와 조교수를 검색하라(in)
SELECT P.PNAME
	 , P.ORDERS
	FROM PROFESSOR P
	WHERE ORDERS IN ('정교수', '조교수');

--5) 학점수가 1학점, 2학점인 과목을 검색하라(in)
SELECT C.CNAME
	 , C.ST_NUM
	FROM COURSE C
	WHERE ST_NUM IN ('1', '2');
	
--6) 1, 2학년 학생 중에 평점이 2.0에서 3.0사이인 학생을 검색하라(between and)
SELECT S.SNAME
	 , S.AVR
	 , S.SYEAR
	FROM STUDENT S
	WHERE S.AVR BETWEEN 2.0 AND 3.0 
    AND S.SYEAR BETWEEN '1' AND '2';
	  
--7) 화학, 물리학과 학생 중 1, 2 학년 학생을 성적순으로 검색하라(in)
SELECT S.SNAME
	 , S.MAJOR
	 , S.AVR
	 , S.SYEAR
	FROM STUDENT S
	WHERE S.MAJOR IN ('화학', '물리')
	AND S.SYEAR IN('1', '2')
	ORDER BY AVR DESC;

--8) 부임일이 1995년 이전인 정교수를 검색하라(to_date)
SELECT P.PNAME
     , P.HIREDATE
FROM PROFESSOR P
WHERE P.HIREDATE < TO_DATE('1995-01-01', 'YYYY-MM-DD');

------------------------------------------------------------------------

--1) 송강 교수가 강의하는 과목을 검색한다
SELECT P.PNAME
	 , P.PNO
	 , C.CNO
	 , C.CNAME
	 FROM PROFESSOR P
	 JOIN COURSE C
	   ON P.PNO = C.PNO
	 WHERE PNAME IN '송강';

--2) 화학 관련 과목을 강의하는 교수의 명단을 검색한다
SELECT P.PNAME
	 , P.PNO
	 , C.CNAME
	 , C.CNO
	FROM PROFESSOR P
	JOIN COURSE C
	  ON P.PNO = C.PNO
   WHERE C.CNAME LIKE('%화학%');
	
--3) 학점이 2학점인 과목과 이를 강의하는 교수를 검색한다
SELECT P.PNAME
	 , P.PNO
	 , C.CNAME
	 , C.ST_NUM
	FROM PROFESSOR P
	JOIN COURSE C
	  ON C.PNO = P.PNO
   WHERE C.ST_NUM LIKE ('2');

--4) 화학과 교수가 강의하는 과목을 검색한다
SELECT P.PNAME
	 , P.PNO
	 , P.SECTION
	 , C.CNAME
	FROM PROFESSOR P
	JOIN COURSE C
	  ON P.PNO = C.PNO
   WHERE P.SECTION LIKE ('화학');

--5) 화학과 1학년 학생의 기말고사 성적을 검색한다
SELECT ST.SNAME
	 , ST.SYEAR
	 , ST.MAJOR
	 , SC.RESULT
	FROM STUDENT ST
	JOIN SCORE SC
      ON SC.SNO = ST.SNO
    WHERE ST.SYEAR LIKE 1
      AND ST.MAJOR LIKE '화학';
   
--6) 일반화학 과목의 기말고사 점수를 검색한다
SELECT CO.CNAME
	 , SC.RESULT
  FROM COURSE CO
  JOIN SCORE SC
	ON SC.CNO = CO.CNO
 WHERE CO.CNAME LIKE '일반화학';
	 
--7) 화학과 1학년 학생의 일반화학 기말고사 점수를 검색한다
SELECT ST.SNAME
     , ST.MAJOR
 	 , ST.SYEAR
 	 , CO.CNAME
 	 , SC.RESULT
	 FROM STUDENT ST
	 JOIN SCORE SC
	   ON ST.SNO =SC.SNO
	 JOIN COURSE CO
	   ON CO.CNO = SC.CNO
	WHERE ST.SYEAR LIKE '1'
	  AND CNAME LIKE '일반화학'
	  AND ST.MAJOR LIKE '화학';

--8) 화학과 1학년 학생이 수강하는 과목을 검색한다
SELECT ST.SNAME
	 , ST.MAJOR
	 , ST.SYEAR
	 FROM STUDENT ST
	 JOIN SCORE SC
	 ON SC.SNO = ST.SNO
	 JOIN COURSE CO
	 ON SC.CNO = SC.CNO
	 WHERE ST.SYEAR = '1'
	 AND ST.MAJOR LIKE '화학';

--9) 유기화학 과목의 평가점수가 F인 학생의 명단을 검색한다
SELECT CO.CNAME
	 , ST.SNAME
	 , SCG.GRADE
	 , SC.RESULT
	FROM SCORE SC
	JOIN STUDENT ST
	  ON SC.SNO = ST.SNO
	JOIN COURSE CO
	  ON CO.CNO = SC.CNO
	JOIN SCGRADE SCG
	  ON SC."RESULT" BETWEEN SCG.LOSCORE AND SCG.HISCORE
   WHERE CNAME = '유기화학'
     AND SCG.GRADE = 'F';
     
------------------------------------------------------------------------
     
--1) 각 과목의 과목명과 담당 교수의 교수명을 검색하라
SELECT CO.CNAME
	 , PF.PNAME
	FROM PROFESSOR PF
	RIGHT OUTER JOIN COURSE CO
	ON CO.PNO = PF.PNO;
	 
--2) 화학과 학생의 기말고사 성적을 모두 검색하라
SELECT ST.SNAME
	 , ST.MAJOR
	 , SC.RESULT
	FROM SCORE SC
	FULL JOIN STUDENT ST
	  ON SC.SNO = ST.SNO
   WHERE ST.MAJOR LIKE '화학';

--3) 유기화학과목 수강생의 기말고사 시험점수를 검색하라
SELECT CO.CNAME
	 , SC."RESULT"
	FROM COURSE CO
	JOIN SCORE SC
	  ON CO.CNO = SC.CNO
   WHERE CNAME LIKE '일반화학';

--4) 화학과 학생이 수강하는 과목을 담당하는 교수의 명단을 검색하라
SELECT ST.MAJOR
	 , ST.SNAME
	 , CO.CNAME
	 , PF.PNAME
	FROM COURSE CO
	JOIN PROFESSOR PF
	  ON PF.PNO = CO.PNO
	JOIN SCORE SC
	  ON SC.CNO = CO.CNO
	JOIN STUDENT ST
	  ON ST.SNO = SC.SNO
   WHERE MAJOR LIKE '화학';

--5) 모든 교수의 명단과 담당 과목을 검색한다
SELECT PF.PNAME
	 , CO.CNAME
	FROM PROFESSOR PF
	LEFT OUTER JOIN COURSE CO
    ON PF.PNO = CO.PNO;

--6) 모든 교수의 명단과 담당 과목을 검색한다(단 모든 과목도 같이 검색한다)
SELECT PF.PNAME
	 , CO.CNAME
	FROM PROFESSOR PF
    FULL JOIN COURSE CO
    ON PF.PNO = CO.PNO;



