--1) 어제 만든 SCORE_STGR 테이블의 SNO 컬럼에 INDEX를 추가하세요.
CREATE INDEX SCORE_STGR_SNO_IDX
	ON STUDENT(SNO)

--2) 어제 만든 ST_COURSEPF 테이블의 SNO, CNO, PNO 다중 컬럼에 INDEX를 추가하세요.
CREATE INDEX ST_COURSEPF2_SNO_CNO_PNO_IDX
	ON ST_COURSEPF2(SNO, CNO, PNO)

	-------------------------------------------------------------------------------------------------------------------

--뷰 이름은 자유
--1) 학생의 평점 4.5 만점으로 환산된 정보를 검색할 수 있는 뷰를 생성하세요.
CREATE OR REPLACE VIEW V_STUDENT_SCORE AS
SELECT ST.SNO
	 , ST.SNAME
     , ROUND(ST.AVR * 4.5 / 4.0, 2) AS SCORE_4_5    
    FROM STUDENT ST
    
		   
--2) 각 과목별 기말고사 평균 점수를 검색할 수 있는 뷰를 생성하세요.
CREATE OR REPLACE VIEW V_COURSE_SCORE_AVR AS
SELECT C.CNAME
	 , ROUND(AVG(SC.RESULT), 2)
    FROM STUDENT ST  
    JOIN ST_COURSEPF2 SC 
    ON ST.SNO = SC.SNO
    JOIN COURSE C 
    ON SC.CNO = C.CNO
	GROUP BY C.CNAME;
    
--3) 각 사원과 관리자(MGR)의 이름을 검색할 수 있는 뷰를 생성하세요.
CREATE OR REPLACE VIEW DEPT_EMP_DIRECTOR AS
SELECT ENAME
	 , MGR
	FROM EMP

SELECT *
	FROM DEPT_EMP_DIRECTOR

--4) 각 과목별 기말고사 평가 등급(A~F)까지와 해당 학생 정보를 검색할 수 있는 뷰를 생성하세요.
CREATE OR REPLACE VIEW MAJOR_SCORE_GRADE AS
SELECT SCG.GRADE
	 , ST.SNAME
	 , CO.CNAME
	FROM STUDENT ST
	JOIN SCORE SC
	  ON ST.SNO = SC.SNO
	JOIN COURSE CO
	  ON CO.CNO = SC.CNO
	JOIN SCGRADE SCG
	  ON SC.RESULT BETWEEN LOSCORE AND HISCORE
SELECT *
	 FROM MAJOR_SCORE_GRADE

--5) 물리학과 교수의 과목을 수강하는 학생의 명단을 검색할 뷰를 생성하세요.
CREATE OR REPLACE VIEW PHS_PF_ST AS
SELECT PF.SECTION
	 , PF.PNAME
	 , CO.CNAME
	 , ST.SNAME
	FROM PROFESSOR PF
	JOIN COURSE CO
	  ON PF.PNO = CO.PNO
	NATURAL JOIN STUDENT ST
	WHERE PF.SECTION = '물리' 
-------------------------------------------------------------------------------------------------------------------

--1) 4.5 환산 평점이 가장 높은 3인의 학생을 검색하세요.
SELECT ROWNUM
	 , AVR3
	 , A.SNAME
	FROM (
		SELECT ROUND(AVG(ST.AVR * 1.125), 2) AS AVR3
			 , ST.SNAME
			FROM STUDENT ST
	       WHERE ST.AVR IS NOT NULL
	       GROUP BY ST.SNAME
	       ORDER BY AVR3 DESC
	) A
	WHERE ROWNUM <= 3
	
--2) 기말고사 과목별 평균이 높은 3과목을 검색하세요.
SELECT ROWNUM
	 , A.CNAME
	 , SCRE3
	FROM (
		SELECT ROUND(AVG(SC.RESULT), 2) AS SCRE3
			 , CO.CNAME
			FROM SCORE SC
			JOIN COURSE CO
		      ON SC.CNO = CO.CNO
		   WHERE SC.RESULT IS NOT NULL
		   GROUP BY CO.CNAME
		   ORDER BY SCRE3 DESC
	) A
	WHERE ROWNUM <= 3

--3) 학과별, 학년별, 기말고사 평균이 순위 3까지를 검색하세요.(학과, 학년, 평균점수 검색)
SELECT ROWNUM
	 , A.MAJOR
	 , A.SYEAR
	 , FAVG
	FROM (
		SELECT ST.MAJOR
			 , ST.SYEAR
			 , ROUND(AVG(SC.RESULT),2) AS FAVG
			FROM STUDENT ST
			JOIN SCORE SC
			  ON ST.SNO = SC.SNO
		   WHERE ST.MAJOR IS NOT NULL
		   GROUP BY ST.MAJOR, ST.SYEAR
		   ORDER BY FAVG DESC
	) A
	WHERE ROWNUM <= 6

--4) 기말고사 성적이 높은 과목을 담당하는 교수 3인을 검색하세요.(교수이름, 과목명, 평균점수 검색)


--5) 교수별로 현재 수강중인 학생의 수를 검색하세요.

-------------------------------------------------------------------------------------------------------------------

--1) CNO이 PK인 COURSE_PK 테이블을 생성하세요.(1번 방식으로)


--2) PNO이 PK인 PROFESSOR_PK 테이블을 생성하세요.(2번 방식으로)


--3) PF_TEMP 테이블에 PNO을 PK로 추가하세요.


--4) COURSE_PROFESSOR 테이블에 CNO, PNO을 PK로 추가하세요.


--5) BOARD_NO(NUMBER)를 PK로 갖으면서 BOARD_TITLE(VARCHAR2(200)), BOARD_CONTENT(VARCHAR2(2000)), 
--   BOARD_WRITER(VARCHAR2(20)), BOARD_FRGT_DATE(DATE), BOARD_LMDF_DATE(DATE) 컬럼을 갖는 T_BOARD 테이블을 생성하세요.


--6) BOARD_NO(NUMBER), BOARD_FILE_NO(NUMBER)를 PK로 갖으면서 BOARD_FILE_NM(VARCHAR2(200)), BOARD_FILE_PATH(VARCHAR2(2000)),
--   ORIGIN_FILE_NM(VARCHAR2(200)) 컬럼을 갖는 T_BOARD_FILE 테이블을 생성하세요.

--7) 다음 구조를 갖는 테이블을 생성하세요.
--   T_SNS                              T_SNS_DETAIL                        T_SNS_UPLOADED
--   SNS_NO(PK)    SNS_NM               SNS_NO(PK, FK)   SNS_BEN            SNS_NO(PK, FK)    SNS_UPL_NO(PK)
--     1            페북                   1               4000                   1                  1
--     2           인스타                  2               10000                  1                  2
--     3           트위터                  3               30000                  2                  1
--                                                                               2                  2