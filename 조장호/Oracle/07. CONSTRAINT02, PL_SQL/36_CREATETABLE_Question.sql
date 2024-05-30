--1) 다음 구조를 갖는 테이블을 생성하세요.
--PRODUCT 테이블 - PNO NUMBER PK              : 제품번호
--                PNMAE VARCHAR2(50)          : 제품이름
--                PRI NUMBER                  : 제품단가
--PAYMENT 테이블 - MNO NUMBER PK              : 전표번호
--               PDATE DATE NOT NULL         : 판매일자
--                CNAME VARCHAR2(50) NOT NULL : 고객명
--                TOTAL NUMBER TOTAL > 0      : 총액
--PAYMENT_DETAIL - MNO NUMBER PK FK           : 전표번호
--                PNO NUMBER PK FK            : 제품번호
--                AMOUNT NUMBER NOT NULL      : 수량
--                PRICE NUMBER NOT NULL       : 단가
--                TOTAL_PRICE NUMBER NOT NULL TOTAL_PRICE > 0 : 금액

CREATE TABLE PRODUCT(
    PNO         NUMBER,
    PNAME       VARCHAR2(50),
    PRI         NUMBER,
    CONSTRAINT PK_PRODUCT_PNO PRIMARY KEY(PNO)
)
;

CREATE TABLE PAYMENT(
    MNO     NUMBER,
    PDATE   DATE    NOT NULL,
    CNAME   VARCHAR2(50)    NOT NULL,
    TOTAL   NUMBER  CHECK(TOTAL > 0),
    CONSTRAINT PK_PAYMENT_MNO PRIMARY KEY(MNO)
)
;

CREATE TABLE PAYMENT_DETAIL(
    MNO         NUMBER,
    PNO         NUMBER,
    AMOUNT      NUMBER  NOT NULL,
    PRICE       NUMBER  NOT NULL,
    TOTAL_PRICE NUMBER  NOT NULL CHECK(TOTAL_PRICE > 0),
    CONSTRAINT PK_PAYMENT_DETAIL_MNO_PNO PRIMARY KEY(MNO, PNO),
    CONSTRAINT FK_PAYMENT_DETAIL_MNO FOREIGN KEY(MNO)
        REFERENCES PAYMENT(MNO),
    CONSTRAINT FK_PAYMENT_DETAIL_PNO FOREIGN KEY(PNO)
        REFERENCES PRODUCT(PNO)
)
;