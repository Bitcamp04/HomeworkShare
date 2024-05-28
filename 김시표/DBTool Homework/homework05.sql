--1) WITH 절을 이용하여 정교수만 모여있는 가상테이블 하나와 일반과목(과목명에 일반이 포함되는)들이 모여있는 가상테이블 하나를 생성하여 
--   일반과목들을 강의하는 교수의 정보 조회하세요.(과목번호, 과목명, 교수번호, 교수이름)
WITH 
	PINFORM AS(
		SELECT CO.CNO
	     , CO.CNAME
	     , PF.PNO
		 , PF.PNAME
	 		FROM PROFESSOR PF
	 		JOIN COURSE CO
	 	  	ON PF.PNO = CO.PNO
	  		WHERE ORDERS = '정교수'
	    	AND CNAME LIKE '%일반%'
				)
				SELECT CNO
					 , CNAME
					 , PNO
					 , PNAME
					FROM PINFORM;

--2) WITH 절을 이용하여 급여가 3000이상인 사원정보를 갖는 가상테이블 하나와 보너스가 500이상인 사원정보를 갖는 가상테이블 하나를 생성하여
--   두 테이블에 모두 속해있는 사원의 정보를 모두 조회하세요.
WITH 
	SAL3000UP AS(
	   SELECT ENO
		 	, ENAME
		 	, SAL
		   FROM EMP
	 	   WHERE SAL >= 3000
				),
	COMM500UP AS(
		SELECT ENO
			 , ENAME
			 , COMM
			FROM EMP
		    WHERE COMM >= 500
				)
SELECT SAL3000UP.ENO
	 , SAL3000UP.ENAME
	 , SAL3000UP.SAL
	 , COMM500UP.COMM
	FROM SAL3000UP
	JOIN COMM500UP
	  ON SAL3000UP.ENO = COMM500UP.ENO

--3) WITH 절을 이용하여 평점이 3.3이상인 학생의 목록을 갖는 가상테이블 하나와 학생별 기말고사 평균점수를 갖는 가상테이블 하나를 생성하여
--   평점이 3.3이상인 학생의 기말고사 평균 점수를 조회하세요.
WITH
	AVG33UP AS(
	   SELECT ST.SNAME
			, ST.AVR
		   FROM STUDENT ST
		  WHERE ST.AVR >= 3.3
			  ),
 FINALSCORE AS(
 	   SELECT ST.SNAME
 	   		, AVG(SC.RESULT) AS FINALRESULT --별칭 지정하는이유 한번만 더 설명
 	   	   FROM STUDENT ST
 	   	   JOIN SCORE SC
 	   	     ON ST.SNO = SC.SNO
 	   	   GROUP BY ST.SNAME
 	   	      )
 SELECT AVG33UP.SNAME
 	  , AVG33UP.AVR
 	  , FINALSCORE.FINALRESULT
 	 FROM AVG33UP
 	 JOIN FINALSCORE
 	   ON AVG33UP.SNAME = FINALSCORE.SNAME
 
--4) WITH 절을 이용하여 부임일자가 25년이상된 교수정보를 갖는 가상테이블 하나와 과목번호, 과목명, 학생번호, 학생이름, 교수번호, 기말고사성적을
--   갖는 가상테이블 하나를 생성하여 기말고사 성적이 90이상인 과목번호, 과목명, 학생번호, 학생이름, 교수번호, 교수이름, 기말고사성적을 조회하세요.
WITH
	 UPPF AS (
		SELECT PNAME
			 , HIREDATE
			FROM PROFESSOR
			WHERE HIREDATE <= ADD_MONTHS(SYSDATE, -25 * 12)
		       ),
	OVERALL AS (
		SELECT CO.CNO
			 , CO.CNAME
			 , ST.SNO
			 , ST.SNAME
			 , PF.PNO
			 , PF.PNAME
			 , SC.RESULT
			FROM COURSE CO
			JOIN PROFESSOR PF
			  ON CO.PNO = PF.PNO
			JOIN SCORE SC
			  ON SC.CNO = CO.CNO
			JOIN STUDENT ST
			  ON ST.SNO = SC.SNO
		   WHERE SC.RESULT >= 90
			   )
SELECT OVERALL.CNO
	 , OVERALL.CNAME
	 , OVERALL.SNO
	 , OVERALL.SNAME
	 , OVERALL.PNO
	 , OVERALL.RESULT
	 , UPPF.HIREDATE
	 , UPPF.PNAME
	FROM OVERALL
	JOIN UPPF
	  ON OVERALL.PNAME = UPPF.PNAME

-----------------------------------------------------------------------------------------------------------------------------------

--1) STUDENT 테이블을 참조하여 ST_TEMP 테이블을 만들고 모든 학생의 성적을 4.5만점 기준으로 수정하세요
CREATE TABLE ST_TEMP AS
    SELECT SNAME
	 	 , ROUND(AVR*1.125, 2) AS AVR
	 	 , MAJOR
	 	 , SYEAR
	 	FROM STUDENT;
	SELECT *
		FROM ST_TEMP;

--2) PROFESSOR 테이블을 참조하여 PF_TEMP 테이블을 만들고 모든 교수의 부임일자를 100일 앞으로 수정하세요
CREATE TABLE PF_TEMP AS
	SELECT PNAME
		 , HIREDATE +100 AS FUTURE_DATE
		FROM PROFESSOR
	SELECT *
		FROM PF_TEMP

--3) ST_TEMP 테이블에서 화학과 2학년 학생의 정보를 삭제하세요
SELECT *
	FROM ST_TEMP

--4) PF_TEMP 테이블에서 조교수의 정보를 삭제하세요


--5) EMP 테이블을 참조하여 EMP2 테이블을 만들고
-- DNO = 30인 사원의 급여를 15프로 상승시킨 값으로 변경하시고
-- DNO = 10인 사원의 급여를 5프로 상승시킨 값으로 변경,
-- DNO = 20인 사원의 급여를 10프로 상승시킨 값으로 변경하세요.
CREATE TABLE EMP2 AS
	SELECT ENAME
		 , ENO
		 , CASE
		 	WHEN DNO = '10' THEN SAL * 0.05
		 	WHEN DNO = '20' THEN SAL * 0.10
		 	WHEN DNO = '30' THEN SAL * 0.15
		 	ELSE SAL
		 END AS SAL
		 , DNO
		FROM EMP
		WHERE DNO IN('10', '20', '30')
	SELECT *
		FROM EMP2
		
--6) 화학과 2학년 학생중 기말고사 성적의 등급이 A, B인 정보를 갖는 테이블 SCORE_STGR을 생성하세요.(SNO, SNAME, MAJOR, SYEAR, CNO, CNAME, RESULT, GRADE)
CREATE TABLE SCORE_STGR AS
	SELECT ST.SNO
		 , ST.SNAME
		 , ST.MAJOR
		 , ST.SYEAR
		 , CO.CNO
		 , CO.CNAME
		 , SC.RESULT
		 , SCG.GRADE
		FROM STUDENT ST
	    JOIN SCORE SC
	      ON ST.SNO = SC.SNO
	    JOIN COURSE CO
	      ON CO.CNO = SC.CNO
	    JOIN SCGRADE SCG 
          ON SC.RESULT BETWEEN SCG.LOSCORE AND SCG.HISCORE
       WHERE SCG.GRADE IN ('A', 'B')
SELECT *
	FROM SCORE_STGR

--7) 생물학과 학생중 평점이 2.7이상인 학생이 수강중인 과목의 정보를 갖는 테이블 ST_COURSEPF를 생성하세요. (SNO, SNAME, CNO, CNAME, PNO, PNAME, AVR)
CREATE TABLE ST_COURSEPF
	SELECT ST.SNO
		 , ST.SNAME
		 , CO.CNO
		 , CO.CNAME
		 , PF.PNO
		 , PF.PNAME
		 , ST.AVR
		FROM STUDENT ST
		JOIN 
		  