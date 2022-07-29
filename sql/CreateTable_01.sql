-- 초기 테이블 세팅

-- 멤버
create table MEMBER(
    M_NUM number not null primary key,
    M_ID varchar2(30) not null,
    M_PW varchar2(30) not null,
    M_EMAIL varchar2(100) not null,
    M_PHONE varchar2(20) not null,
    M_BIRTH date not null,
    M_GENDER varchar(10) not null,
    M_RDATE date default sysdate not null,
    M_ADD1 varchar2(50) not null,
    M_ADD2 varchar2(50) not null,
    M_ADD3 varchar2(50) not null,
    M_SFANME varchar2(100),
    M_OFNAME varchar2(100),
    M_ROLE varchar2(2)
);

-- 테마
create table theme(
    theme_id number not null primary key,
    theme_name varchar2(20) not null
);

-- 뮤직비디오
-- 테마 테이블 필요
Create table MUSICVIDEO (
  MV_ID number not null primary key, 	
  MV_NAME varchar2(50) not null,
  MV_SINGER varchar2(50) not null,
  MV_ALBUM varchar2(50) not null,
  MV_URL varchar2(500) not null,
  MV_IMGURL varchar2(500) not null,
  MV_RDATE DATE not null,
  MV_LYRICS VARCHAR2(4000) not null,
  THEME_ID number not null,
  foreign key (THEME_ID)REFERENCES THEME (THEME_ID)
);

-- 뮤직비디오 댓글
-- 멤버, 뮤직비디오 테이블 필요
create table REPLY_MV(
    REMV_ID number not null primary key,
    REMV_CONTENT varchar2(2000),
    REMV_RDATE date default sysdate not null,
    MV_ID number not null,
    M_NUM number not null,
    foreign key (MV_ID) REFERENCES MUSICVIDEO (MV_ID),
    foreign key (M_NUM) REFERENCES MEMBER (M_NUM)
);


