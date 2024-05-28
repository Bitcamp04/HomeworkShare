SELECT c.CNO AS "과목번호",c.ST_NUM AS "학점",c.CNAME AS "과목이름",c.PNO AS "담당교수 번호" 
FROM COURSE c ;

SELECT s.SNO AS "학생번호",s.SNAME AS "학생이름" FROM STUDENT s ;

SELECT * FROM DEPT d ;		

SELECT c.CNO AS "과목번호",c.ST_NUM "학점",c.CNAME AS 과목이름,c.PNO 담당교수번호 FROM COURSE c ;

SELECT s.SNO ,s.SNAME ,sc.RESULT FROM STUDENT  s JOIN SCORE  sc ON s.SNO =sc.SNO ; 

SELECT d.DNO ,d.DNAME ,d.LOC ,NVL(d.DIRECTOR,'팀장없음') AS DIRECTOR  FROM DEPT d ;  

SELECT e.ENO ,e.ENAME ,e.SAL ,NVL(e.COMM,0) COMM  FROM EMP e ;

SELECT e.ENAME||'-'||e.SAL FROM EMP e;

SELECT s.SNO||'-'||s."RESULT" FROM SCORE s ;

SELECT DISTINCT e.JOB  FROM EMP e ;

SELECT DISTINCT e.ENAME,e.JOB  FROM EMP e;--값이 전부 동일해야 중복제거를 해줌

SELECT * FROM EMP e ORDER BY e.JOB  DESC ,e.SAL ;

SELECT * FROM EMP e WHERE e.ENAME  LIKE '김%';

SELECT * FROM EMP e WHERE SAL BETWEEN 3000 AND 4000;

SELECT * FROM EMP e WHERE e.JOB  IN ('지원','개발');

SELECT count(s.SNAME) AS "student number",s.MAJOR  FROM STUDENT s GROUP BY s.MAJOR;  

SELECT e.ENO ,e.ENAME ,e.DNO ,e.SAL 
FROM EMP e
ORDER BY e.DNO ASC,e.SAL DESC ;

SELECT e.ENO AS 사원번호 ,e.ENAME ,e.DNO ,e.SAL 
FROM EMP e
ORDER BY 사원번호 ASC,4 DESC ;--별칭이나 컬럼의 인덱스로도 가능하다.

SELECT * FROM STUDENT s WHERE s.AVR <=3.0 ORDER BY s.MAJOR ,s.SYEAR,s.AVR  ;

SELECT * FROM STUDENT s WHERE s.MAJOR ='화학';

SELECT * FROM STUDENT s WHERE s.MAJOR <>'화학';

SELECT * FROM EMP e WHERE e.SAL >'3000';--컬럼의 데이터와 다른 데이터 형태로 비교할 때 다른 데이터 형태를 사용하면 
--컬럼의 데이터가 변경되어 비교 하기 때문에 속도가 느려질 수 있다. 데이터 수가 많다면 속도가 굉장히 느려진다. 항상 
--테이블 컬럼의 데이터 형태와 맞춰 비교를 해야한다.즉, 컬럼의 데이터 형태를 변경시키는 행위를 하지 말아야 한다.
--변경은 컬럼의 데이터가 아닌 비교 대상의 데이터가 되어야 한다.

SELECT e.ENO ENO,e.ENAME ENAME,e.JOB JOB,e.SAL SAL ,e.COMM COMM 
FROM EMP e 
WHERE e.JOB = '경영';

SELECT e.ENO ENO,e.ENAME ENAME,e.JOB JOB,e.SAL SAL ,e.COMM COMM 
FROM EMP e 
WHERE e.COMM IS NULL;
 
SELECT e.ENO ENO,e.ENAME ENAME,e.JOB JOB,e.SAL SAL ,e.COMM COMM 
FROM EMP e 
WHERE e.COMM IS NOT NULL;

SELECT d.DNO DNO,d.DNAME DNAME FROM DEPT d WHERE d.DIRECTOR IS NOT NULL; 

SELECT d.DNO DNO,d.DNAME DNAME FROM DEPT d WHERE d.DIRECTOR IS NULL;

SELECT s.SNO ,s.SNAME FROM STUDENT s WHERE s.SNAME LIKE '%우';

SELECT s.SNO ,s.SNAME FROM STUDENT s WHERE s.SNAME LIKE '___';

SELECT c.CNO ,c.CNAME ,c.ST_NUM FROM COURSE c WHERE c.CNAME LIKE '%화학%';

SELECT p.PNO ,p.PNAME FROM PROFESSOR p WHERE p.PNAME LIKE '___';

SELECT s.SNO ,s.SNAME ,s.MAJOR ,s.SYEAR FROM STUDENT s WHERE s.SYEAR = 1 AND s.SNAME LIKE '노%';

SELECT e.ENO ,e.ENAME ,e.JOB ,e.SAL FROM EMP e WHERE e.JOB = '회계' AND e.SAL >=3000 AND e.ENAME LIKE '___';

SELECT s.SNO ,s.SNAME ,s.MAJOR ,s.SYEAR FROM STUDENT s WHERE s.SYEAR = 1 OR  s.SNAME LIKE '노%';

SELECT s.SNO ,s.SNAME ,s.MAJOR ,s.SYEAR FROM STUDENT s WHERE s.MAJOR IN ('화학','물리');



--and or 혼합, join등 복잡해지면 ()을 사용해 우선순위를 명확하게 하는 것이 좋다.
--or and혼합시 and가 or보다 우선순위가 높기 때문에 원하는 결과를 못 얻을 수 있다.
SELECT s.SNO ,s.SNAME ,s.MAJOR ,s.SYEAR FROM STUDENT s WHERE (s.MAJOR ='화학' OR s.MAJOR = '물리') AND s.SYEAR = 1;
SELECT s.SNO ,s.SNAME ,s.MAJOR ,s.SYEAR FROM STUDENT s WHERE (s.MAJOR IN ('화학','물리')) AND s.SYEAR = 1;


SELECT e.ENO ,e.ENAME ,e.SAL ,e.DNO  FROM EMP e WHERE e.SAL >=3000 and (e.DNO = 10 OR e.DNO = 30) ;
SELECT e.ENO ,e.ENAME ,e.SAL ,e.DNO  FROM EMP e WHERE e.SAL >=3000 and (e.DNO IN (10,30)) ;


SELECT e.ENO ,e.ENAME ,e.SAL  FROM EMP e WHERE SAL BETWEEN 3000 AND 5000;--작은 값 큰값 순서로 한다.

SELECT s.SNO ,s.SNAME ,s.AVR,s.SYEAR ,s.MAJOR 
FROM STUDENT s 
WHERE (s.AVR BETWEEN 3.0 AND 3.7) AND (s.SYEAR BETWEEN 2 AND 4);

--날짜 형식 사용한 between and
--to_date 함수 사용 비교 할 값을 날짜 형식으로 변환한다.
SELECT * FROM PROFESSOR p WHERE p.HIREDATE  
BETWEEN TO_DATE('20000101 00:00:00','yyyyMMdd HH24:mi:ss') AND TO_DATE('2001/12/31 23:59/59','yyyy/MM/dd HH24:mi/ss');


SELECT e.ENO ,e.ENAME ,e.SAL ,e.DNO  FROM EMP e WHERE (e.DNO IN (10,20,30)) ;



SELECT s.SNO ,s.SNAME ,s.MAJOR ,s.SYEAR FROM STUDENT s WHERE s.MAJOR IN ('생물','유공') AND s.SYEAR IN (1,2,3); 





--1) 모든 학생의 정보를 검색해라
SELECT * FROM STUDENT s ;

--2) 모든 과목의 정보를 검색해라
SELECT * FROM COURSE c ;

--3) 기말고사 시험점수를 검색해라
SELECT s."RESULT"  FROM SCORE s ;

--4) 학생들의 학과와 학년을 검색해라
SELECT s.MAJOR ,s.SYEAR  FROM STUDENT s ;

--5) 각 과목의 이름과 학점을 검색해라
SELECT c.CNAME ,c.ST_NUM  FROM COURSE c ;

--6) 모든 교수의 직위를 검색해라
SELECT p.ORDERS  FROM PROFESSOR p ;

--1) 각 학생의 평점을 검색하라(별칭을 사용)
SELECT s.AVR AS "평점" FROM STUDENT s ;

--2) 각 과목의 학점를 검색하라(별칭을 사용)
SELECT c.ST_NUM AS "학점" FROM COURSE c ;

--3) 각 교수의 지위를 검색하라(별칭을 사용)
SELECT p.ORDERS as"지위" FROM PROFESSOR p ;

--4) 급여를 10%인상했을 때 연간 지급되는 급여를 검색하라(별칭을 사용)
SELECT (e.SAL*1.1)AS "급여" FROM EMP e ;

--5) 현재 학생의 평균 평점은 4.0만점이다. 이를 4.5만점으로 환산해서 검색하라(별칭을 사용)
SELECT (s.AVR*4.5/4.0) AS "평균 평점" FROM STUDENT s ;

--1) '__학과인 __학생의 현재 평점은 __입니다' 형태로 학생의 정보를 출력하라
SELECT s.MAJOR||'학과인 '||s.SNAME ||'학생의 현재 평점은 '||s.AVR||'입니다' AS 학생정보 FROM STUDENT s ;

--2) '__과목은 __학점 과목입니다.' 형태로 과목의 정보를 출력하라
SELECT c.CNAME||'과목은 '||c.ST_NUM||'학점 과목입니다' AS 과목정보 FROM COURSE c ;

--3) '__교수는 __학과 소속입니다.' 형태로 교수의 정보를 출력하라
SELECT p.PNAME ||'교수는 '||p."SECTION" ||'학과 소속입니다' AS 교수정보 FROM PROFESSOR p ;

--4) 학교에는 어떤 학과가 있는지 검색한다(학생 테이블 기반으로 검색한다)
SELECT DISTINCT s.MAJOR FROM STUDENT s ;

--5) 학교에는 어떤 학과가 있는지 검색한다(교수 테이블 기반으로 검색한다)
SELECT DISTINCT p."SECTION" FROM PROFESSOR p ;

--6) 교수의 지위는 어떤 것들이 있는지 검색한다
SELECT DISTINCT p.ORDERS  FROM PROFESSOR p ;

--1) 성적순으로 학생의 이름을 검색하라
SELECT s.SNAME FROM STUDENT s ORDER BY s.AVR DESC ;

--2) 학과별 성적순으로 학생의 정보를 검색하라
SELECT * FROM STUDENT s ORDER BY s.MAJOR ,s.AVR DESC ;

--3) 학년별 성적순으로 학생의 정보를 검색하라
SELECT * FROM STUDENT s ORDER BY s.SYEAR ,s.AVR DESC ;

--4) 학과별 학년별로 학생의 정보를 성적순으로 검색하라
SELECT * FROM STUDENT s ORDER BY s.MAJOR ,s.SYEAR ,s.AVR DESC ;

--5) 학점순으로 과목 이름을 검색하라
SELECT c.CNAME FROM COURSE c ORDER BY c.ST_NUM ;

--6) 각 학과별로 교수의 정보를 검색하라
SELECT * FROM PROFESSOR p ORDER BY p."SECTION" ;

--7) 지위별로 교수의 정보를 검색하라
SELECT * FROM PROFESSOR p ORDER BY p.ORDERS  ;

--8) 각 학과별로 교수의 정보를 부임일자 순으로 검색하라
SELECT * FROM PROFESSOR p ORDER BY p."SECTION" ,p.HIREDATE ;

--1) 화학과 학생을 검색하라
SELECT * FROM STUDENT s WHERE s.MAJOR = '화학';

--2) 평점이 2.0 미만인 학생을 검색하라
SELECT * FROM STUDENT s WHERE s.AVR <2.0;

--3) 관우 학생의 평점을 검색하라
SELECT s.AVR FROM STUDENT s WHERE s.SNAME = '관우';

--4) 정교수 명단을 검색하라
SELECT * FROM PROFESSOR p WHERE p.ORDERS = '정교수';

--5) 화학과 소속 교수의 명단을 검색하라
SELECT * FROM PROFESSOR p WHERE p."SECTION"  = '화학';

--6) 송강 교수의 정보를 검색하라
SELECT * FROM PROFESSOR p WHERE p.PNAME ='송강';

--7) 학년별로 화학과 학생의 성적을 검색하라
SELECT s.AVR FROM STUDENT s WHERE s.MAJOR = '화학' ORDER BY s.SYEAR; 

--8) 2000년 이전에 부임한 교수의 정보를 부임일순으로 검색하라
SELECT * FROM PROFESSOR p WHERE p.HIREDATE < TO_DATE('2000-01-01:00:00:00','YYYY-MM-DD:HH24:MI:SS')  ORDER BY p.HIREDATE ;

--9) 담당 교수가 없는 과목의 정보를 검색하라
SELECT * FROM COURSE c WHERE c.PNO IS NULL ;


--1) 유공과와 생물과, 식영과 학생을 검색하라
SELECT * FROM STUDENT s WHERE s.MAJOR IN ('유공','생물','식영');

--2) 화학과가 아닌 학생중에 1학년 학생을 검색하라
SELECT * FROM STUDENT s WHERE (s.MAJOR <> '화학') AND (s.SYEAR = 1);

--3) 물리학과 3학년 학생을 검색하라
SELECT * FROM STUDENT s WHERE (s.MAJOR = '물리') AND (s.SYEAR = 3);

--4) 평점이 2.0에서 3.0사이인 학생을 검색하라
SELECT * FROM STUDENT s WHERE s.AVR BETWEEN 2.0 AND 3.0;

--5) 교수가 지정되지 않은 과목중에 학점이 3학점인 과목을 검색하라
SELECT * FROM COURSE c WHERE (c.PNO IS NULL )AND (c.ST_NUM =3);

--6) 화학과 관련된 과목중 학 점이 2학점 이하인 과목을 검색하라
SELECT * FROM COURSE c WHERE (c.CNAME LIKE '%화학%') AND (c.ST_NUM<=2);

--7) 화학과 정교수를 검색하라
SELECT * FROM PROFESSOR p WHERE (p."SECTION" = '화학') AND (p.ORDERS = '정교수');

--8) 물리학과 학생중에 성이 사마씨인 학생을 검색하라
SELECT * FROM STUDENT s WHERE (s.MAJOR = '물리') AND (s.SNAME LIKE '사마%');

--9) 성과 이름이 각각 1글자인 교수를 검색하라
SELECT * FROM PROFESSOR p WHERE (p.PNAME LIKE '__');










