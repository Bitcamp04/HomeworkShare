--1) 송강 교수가 강의하는 과목을 검색한다
SELECT PNAME
      ,SECTION
    FROM PROFESSOR
    WHERE PNAME='송강';

--2) 화학 관련 과목을 강의하는 교수의 명단을 검색한다
SELECT P.PNAME
      ,P.SECTION
      ,C.CNAME
    FROM PROFESSOR P
    JOIN COURSE C
    ON C.CNO = P.CNO
    WHERE SECTION='화학';

--3) 학점이 2학점인 과목과 이를 강의하는 교수를 검색한다
SELECT P.PNAME
      ,C.ST_NUM
      ,C.CNAME
    FROM PROFESSOR P
    JOIN COURSE C
    ON C.CNO = P.CNO
    WHERE ST_NUM IN (1);
--4) 화학과 교수가 강의하는 과목을 검색한다


--5) 화학과 1학년 학생의 기말고사 성적을 검색한다


--6) 일반화학 과목의 기말고사 점수를 검색한다


--7) 화학과 1학년 학생의 일반화학 기말고사 점수를 검색한다


--8) 화학과 1학년 학생이 수강하는 과목을 검색한다


--9) 유기화학 과목의 평가점수가 F인 학생의 명단을 검색한다


