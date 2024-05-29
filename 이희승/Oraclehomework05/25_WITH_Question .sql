--1) WITH 절을 이용하여 정교수만 모여있는 가상테이블 하나와 일반과목(과목명에 일반이 포함되는)들이 모여있는 가상테이블 하나를 생성하여 
--   일반과목들을 강의하는 교수의 정보 조회하세요.(과목번호, 과목명, 교수번호, 교수이름)
WITH JUNG AS (
        SELECT P.PNO 
              ,P.PNAME
        FROM PROFESSOR  P
        WHERE ORDERS ='정'
),
WITH COSE AS(
      SELECT C.CNO
      C.CNAME
      P.PNO
      FROM COURSE C
      WHERE C.CNAME LIKE '%일반%'
)
SELECT CC.CNO
      ,CC.CNAME
      ,CC.PNO
      ,J.PNAME
      FROM JUNG J
      JOIN COSE CC
      ON J.PNO=CC.PNO;
--2) WITH 절을 이용하여 급여가 3000이상인 사원정보를 갖는 가상테이블 하나와 보너스가 500이상인 사원정보를 갖는 가상테이블 하나를 생성하여
--   두 테이블에 모두 속해있는 사원의 정보를 모두 조회하세요.
WITH 
      OVER3000 AS (
	 		SELECT ENO
	 			  ,ENAME
	 			  ,SAL
	 			  FROM EMP
	 			  WHERE SAL >=3000
            ),
            COMMOVER500 AS(     
                  SELECT ENO
	 			  ,ENAME
	 			  ,COMM
	 			  FROM EMP
	 			  WHERE COMM >=500
            )
SELECT O.ENO
      ,O.ENAME
      ,O.SAL
      ,C.COMM
FROM OVER3000 O
JOIN COMMOVER500 C
ON O.ENO=C.ENO;
--3) WITH 절을 이용하여 평점이 3.3이상인 학생의 목록을 갖는 가상테이블 하나와 학생별 기말고사 평균점수를 갖는 가상테이블 하나를 생성하여
--   평점이 3.3이상인 학생의 기말고사 평균 점수를 조회하세요.
WITH 
      OVER33 AS (
                  SELECT SNO 
                        ,AVR
                  FROM STUDENT
                       WHERE AVR>= 3.3
      ),
      JIMAL AS (
            SELECT ST.SNO
                  ,AVG(SC.RESULT) AS AVG_RE
                  FROM STUDENT ST
                  JOIN SCORE SC 
                  ON ST.SNO=SC.SNO
                  GROUP BY ST.SNO
      )
      SELECT OVR.SNO
            ,JI.AVG_RE
            FROM OVER33 OVR
            JOIN JIMAL JI
            ON OVR.SNO=JI.SNO;

--4) WITH 절을 이용하여 부임일자가 25년이상된 교수정보를 갖는 가상테이블 하나와 과목번호, 과목명, 학생번호, 학생이름, 교수번호, 기말고사성적을
--   갖는 가상테이블 하나를 생성하여 기말고사 성적이 90이상인 과목번호, 과목명, 학생번호, 학생이름, 교수번호, 교수이름, 기말고사성적을 조회하세요.
WITH
    HIREOVER AS (SELECT * FROM PROFESSOR WHERE MONTHS_BETWEEN(SYSDATE, HIREDATE) / 12 >= 25),
    COUSTPF AS (
                    SELECT CNO
                         , C.CNAME
                         , SNO
                         , ST.SNAME
                         , C.PNO
                         , SC.RESULT
                        FROM SCORE SC 
                        NATURAL JOIN COURSE C
                        NATURAL JOIN STUDENT ST
                )
SELECT COUSTPF.CNO
     , COUSTPF.CNAME
     , COUSTPF.SNO
     , COUSTPF.SNAME
     , HIREOVER.PNO
     , HIREOVER.PNAME
     , COUSTPF.RESULT
    FROM COUSTPF
    LEFT JOIN HIREOVER
    ON COUSTPF.PNO = HIREOVER.PNO
    WHERE COUSTPF.RESULT >= 90;





