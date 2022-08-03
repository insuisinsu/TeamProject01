
-- 뮤비 좋아요 테이블 생성

Create table MV_LIKE(
    MV_LIKE_NUM number not null primary key,    -- 좋아요 번호
    MV_ID number not null,                      -- 뮤비 번호
    M_NUM number not null,                       -- 회원 번호
    MV_LIKE_CNT number not null                  -- 좋아요
    MV_UNLIKE_CNT number not null, 				 -- 좋아요 다시누를때
    );