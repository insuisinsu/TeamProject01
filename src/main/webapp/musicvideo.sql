


Create table MUSICVIDEO (
  MV_ID number not null primary key, 				-- 뮤비 번호
  MV_NAME varchar2(50) not null,					-- 노래 제목
  MV_SINGER varchar2(50) not null,					-- 가수
  MV_ALBUM varchar2(50) not null,					-- 앨범
  MV_URL varchar2(500) not null,					-- 뮤비 URL
  MV_IMGURL varchar2(500) not null,					-- 이미지 URL
  MV_RDATE DATE not null,							-- 발매일
  MV_LYRICS VARCHAR2(4000) not null,				-- 가사
  THEME_ID number not null							-- 테마번호 (1: 댄스 2: 발라드 3: pop 4: 랩/힙합 5: 인디 6: 트로트 7: R&B)
);

select * from musicvideo;

insert into musicvideo
values (1,'LOVE DIVE','IVE','LOVE DIVE', 'https://www.youtube.com/embed/Y8JFxS1HlDo' ,
'https://file.mk.co.kr/meet/neds/2022/03/image_readmed_2022_286881_16486171754992122.jpg', '2022-05-01',
'왔구나 2022년이
딱 들어맞아 돌아올 타이밍이
아다리가 아주 좋아요
머리에 포마드 다시 바르고 싸이 빙의
INTRO부터 딱 각이 나와
청진기 대면 진단이 나와
제대로 조짐 대박 조짐
쪼그라든 간땡이야 부어라

20대에는 20대가 타깃
30대에도 20대가 타깃
40 하고도 절반이 지나버린
이번 앨범도 20대가 타깃
사실은 나 꼰대 맞아
라떼는 이런 게 찢었단다
롱런의 비결을 내게 물어보신다면
딱 하나 존나 버텨 임마

그래 나 22년 차
너가 신나면 나도 신나 타고난 광대 팔자
잘해 나 주제 파악
가오 잡으면 가오 잡을수록 가오가 안 나

9INTRODUCTION
(Hey! Everybody!)
9INTRODUCTION (Hey!)
In In Introduction
(Hey! Everybody!)
9INTRODUCTION (Hey!)
(From P NATION~!)

새 됐다가 챔피언
연예인이다 Right Now
Gentle 하게 강남스타일
잘했네 잘했네 잘했어
나팔바지의 DADDY
New Face I LUV IT
Celeb 그리고 That That
잘했네 잘했네 잘했어

뭔 놈의 앨범을 5년 만에 내
올림픽보다 더 오랜만이네
대박에 환상에 환장에 환자야
좆뺑이까네
나이를 요란하게 처먹었네
주둥아리 오래도 써먹었네
고민 번뇌 장고 끝에
9집으로 빈집을 터네

얼라들 마음 어른들은 몰라
어른들 마음 얼라들은 몰라
나 어른의 나이에 얼라짓 하기에
X Y M Z 같이 놀아
싸이월드 싸이버거
검색어를 셋이 나눠 먹어
각성해서 나 각성했어
각설하고 쎗바닥 열중쉬어

그래 나 22년 차
너가 신나면 나도 신나 타고난 광대 팔자
잘해 나 주제 파악
가오 잡으면 가오 잡을수록 가오가 안 나

9INTRODUCTION
(Hey! Everybody!)
9INTRODUCTION (Hey!)
In In Introduction
(Hey! Everybody!)
9INTRODUCTION (Hey!)
(From P NATION~!)

새 됐다가 챔피언
연예인이다 Right Now
Gentle 하게 강남스타일
잘했네 잘했네 잘했어
나팔바지의 DADDY
New Face I LUV IT
Celeb 그리고 That That
잘했네 잘했네 잘했어
존나게 잘했어
9INTRODUCTION',1);

commit;