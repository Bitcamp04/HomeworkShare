--1) 다중 컬럼 IN절을 이용해서 기말고사 성적이 80점 이상인 과목번호, 학생번호, 기말고사 성적을 모두 조회하세요.
SELECT CC.CNO 
      ,STT.SNO 
      ,SC."RESULT" 
FROM STUDENT STT
JOIN SCORE SC
ON SS.SNO = SC.SNO 
JOIN COURSE CC
ON SC.CNO = CC.CNO 
WHERE (STT.SNO,CC.CNO)IN
(SELECT ST.SNO ,C.CNO 
FROM COURSE C
JOIN SCORE S
ON C.CNO = S.CNO 
JOIN STUDENT ST
ON ST.SNO = S.SNO 
WHERE S."RESULT" >=80)

--2) 다중 컬럼 IN절을 이용해서 화학과나 물리학과면서 학년이 1, 2, 3학년인 학생의 정보를 모두 조회하세요.
SELECT S.*
FROM STUDENT S
WHERE (S.MAJOR,S.SYEAR) IN (('화학',1),('화학',2),('화학',3),('물리',1),('물리',2),('물리',3))

--3) 다중 컬럼 IN절을 사용해서 부서가 10, 20, 30이면서 보너스가 1000이상인 사원의 사원번호, 사원이름, 부서번호, 부서이름, 업무, 급여, 보너스를 
--   조회하세요.(서브쿼리 사용)
SELECT E2.ENO 
      ,E2.ENAME 
      ,E2.DNO ,DD.DNAME 
      ,E2.JOB 
      ,E2.SAL 
      ,E2.COMM 
FROM EMP E2
JOIN DEPT DD
ON E2.DNO = DD.DNO 
WHERE E2.ENO IN 
(
SELECT E.ENO 
FROM EMP E
WHERE E.DNO IN (10,20,30) AND E.COMM >=1000

--4) 다중 컬럼 IN절을 사용하여 기말고사 성적의 최고점이 100점인 과목의 과목번호, 과목이름, 학생번호, 학생이름, 기말고사 성적을 조회하세요.(서브쿼리 사용)
SELECT C.CNO
      ,C.CNAME 
      ,ST.SNO 
      ,ST.SNAME 
      ,SC.RESULT 
FROM STUDENT ST
JOIN SCORE SC
ON ST.SNO =SC.SNO 
JOIN COURSE C
ON C.CNO = SC.CNO 
WHERE C.CNO IN 
(
SELECT S.CNO 
FROM SCORE S
GROUP BY S.CNO
HAVING MAX(S.RESULT) = 100
)
ORDER BY CNAME,RESULT ;