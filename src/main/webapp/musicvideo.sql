


-- 뮤직비디오 테이블 생성
Create table MUSICVIDEO (
  MV_ID number primary key,				-- 번호
  MV_NAME varchar2(50) not null,		-- 제목
  MV_SINGER varchar2(50) not null,		-- 가수
  MV_ALBUM varchar2(50) not null,		-- 앨범이름
  MV_URL varchar2(500) not null,		-- 뮤비 URL
  MV_IMGURL varchar2(500) not null,		-- 이미지 URL
  MV_RDATE DATE not null,			    -- 발매일
  MV_LYRICS VARCHAR2(4000) not null,	-- 가사
  THEME_ID number not null			    -- 테마번호 (1: 댄스 2: 발라드 3: pop 4: 랩/힙합 5: 인디 6: 트로트 7: R&B)
);


-- 좋아요 테이블 생성
Create table MV_LIKE(
    MV_LIKE_NUM number not null primary key,    -- 좋아요 번호
    MV_ID number not null,                      -- 뮤비 번호
    M_NUM number not null,                       -- 회원 번호
    MV_LIKE number not null                    -- 좋아요
    );

-- 시퀀스 생성
create SEQUENCE mv_seq;    
    
-- 더미 1번 
insert into musicvideo
values (mv_seq.nextval, '보고싶었어', 'WSG워너비 (4FIRE)', 'WSG워너비 1집', 'https://www.youtube.com/embed/IAtzzjBKU1c', 
'https://image.genie.co.kr/Y/IMAGE/IMG_ALBUM/082/814/458/82814458_1657270030475_1_600x600.JPG/dims/resize/Q_80,0',
'2022-07-09','너를 정말 사랑했나 봐 아직도 널 못 잊었나 봐 자꾸만 생각나

시간은 왜 자꾸 나에게 아픈 기억은 다 지우고 좋은 추억만 남아

우 함께 울고 웃던 계절에 다시 만난다면

보고싶었어 사랑했던 그때의 너와
니 곁에 그리고 나 널 바라만 봐도 눈물 나게

마냥 좋았어 너에게 못다 한 그 말
조금은 늦었겠지만 아직 널 사랑한다고 말야

라라라 라라라라랄랄라 라라라라랄랄라
보고싶었어

라라라 라라라라랄랄라 라라라라랄랄라
너도 내 맘 같기를

그땐 정말 어렸었나봐 사랑을 잘 몰랐었나 봐
그게 마음이 아파

우 오늘처럼 눈부신 날에 다시 만난다면

보고싶었어 사랑했던 그때의 너와
니 곁에 그리고 나 널 바라만 봐도 눈물 나게

마냥 좋았어 너에게 못다 한 그 말
조금은 늦었겠지만 (늦었겠지만) 아직 널 사랑한다고

꽃 피는 봄이 온 것처럼
당연한 듯 내곁에 머물 줄만 알았어 (항상)

주는 게 사랑이란 걸 그때야 난 깨달았어
니가 떠난 후에야

나 너에게 참 고마웠다고 벅차 행복했다고
사랑을 가르쳐 준 니가 참

보고싶었어 (보고싶었어) 너에게 듣고 싶은 말
아직 늦지 않았다고 (늦지 않았다고) 너도 날 기다렸다고 말야

라라라 라라라라랄랄라 라라라라랄랄라
보고싶었어 (Baby can you call me now)
라라라 라라라라랄랄라 라라라라랄랄라

너도 내 맘 같기를', 3);

commit;

DESC MUSICVIDEO;
drop table musicvideo;
drop table mv_like;

create SEQUENCE mv_seq;
drop SEQUENCE mv_seq;

select * from MV_LIKE;
select * from musicvideo;

-- 더미 2번
insert into musicvideo
values (mv_seq.nextval,'LOVE DIVE','IVE','LOVE DIVE', 'https://www.youtube.com/embed/Y8JFxS1HlDo' ,
'https://file.mk.co.kr/meet/neds/2022/03/image_readmed_2022_286881_16486171754992122.jpg', TO_DATE('2022-05-01','YYYY-MM-DD'),
'네가 참 궁금해 그건 너도 마찬가지
이거면 충분해 쫓고 쫓는 이런 놀이
참을 수 없는 이끌림과 호기심
묘한 너와 나 두고 보면 알겠지

Woo 눈동자 아래로
Woo 감추고 있는 거
Woo yeah It’s so bad It’s good
난 그 맘을 좀 봐야겠어

Narcissistic, my god I love it
서로를 비춘 밤
아름다운 까만 눈빛 더 빠져 깊이
(넌 내게로 난 네게로)
숨 참고 love dive

Woo lalalalalalala
Woo 어서 와서 love dive
Woo oh perfect sacrifice yeah
숨 참고 love dive

마음은 이렇게 알다가도 모르지
사랑이라는 건 한순간에 필 테니
직접 들어와 두 눈으로 확인해
내 맘 가장 깊은 데로 오면 돼

Woo 망설일 시간은
Woo 3초면 되는 걸
Woo yeah It’s so bad It’s good
원하면 감히 뛰어들어

Narcissistic, my god I love it
서로를 비춘 밤
아름다운 까만 눈빛 더 빠져 깊이
(넌 내게로 난 네게로)
숨 참고 love dive

Woo lalalalalalala
Woo 어서 와서 love dive
Woo oh perfect sacrifice yeah
숨 참고 love dive

숨 참고 love dive
숨 참고 love dive
숨 참고 love dive
숨 참고 love dive

Woo lalalalalalala
Woo 어서 와서 love dive
Woo oh perfect sacrifice yeah
숨 참고 love dive',1);

-- 더미 3번
insert into musicvideo
values (mv_seq.nextval,'그때 그 순간 그대로 (그그그)','WSG워너비 (가야G)','WSG워너비 1집', 'https://www.youtube.com/embed/kZvzjX35KxY' ,
'https://image.genie.co.kr/Y/IMAGE/IMG_ALBUM/082/814/458/82814458_1657270030475_1_600x600.JPG/dims/resize/Q_80,0',  TO_DATE('2022-07-09','YYYY-MM-DD'),'잘 지냈지? 조금은 어색해 요즘 좋아 보여 인사 나누며
사실 궁금한 게 너무 많았는데 반가움에 멍해졌죠

생각보다 오래 된 것 같은 우리 수다스럽던 그때가 생각나
뭐가 그렇게도 할 말이 많아서 밤을 지새우곤 했죠

그리운 목소리 그리던 얼굴 참 많이도 기다렸어',2);



commit;