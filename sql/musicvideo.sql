


-- �������� ���̺� ����
Create table MUSICVIDEO (
  MV_ID number primary key,				-- ��ȣ
  MV_NAME varchar2(50) not null,		-- ����
  MV_SINGER varchar2(50) not null,		-- ����
  MV_ALBUM varchar2(50) not null,		-- �ٹ��̸�
  MV_URL varchar2(500) not null,		-- �º� URL
  MV_IMGURL varchar2(500) not null,		-- �̹��� URL
  MV_RDATE DATE not null,			    -- �߸���
  MV_LYRICS VARCHAR2(4000) not null,	-- ����
  THEME_ID number not null			    -- �׸���ȣ (1: �� 2: �߶�� 3: pop 4: ��/���� 5: �ε� 6: Ʈ��Ʈ 7: R&B)
);


-- ���ƿ� ���̺� ����
Create table MV_LIKE(
    MV_LIKE_NUM number not null primary key,    -- ���ƿ� ��ȣ
    MV_ID number not null,                      -- �º� ��ȣ
    M_NUM number not null,                       -- ȸ�� ��ȣ
    MV_LIKE number not null                    -- ���ƿ�
    );

-- ������ ����
create SEQUENCE mv_seq;    
    
-- ���� 1�� 
insert into musicvideo
values (mv_seq.nextval, '����;���', 'WSG���ʺ� (4FIRE)', 'WSG���ʺ� 1��', 'https://www.youtube.com/embed/IAtzzjBKU1c', 
'https://image.genie.co.kr/Y/IMAGE/IMG_ALBUM/082/814/458/82814458_1657270030475_1_600x600.JPG/dims/resize/Q_80,0',
'2022-07-09','�ʸ� ���� ����߳� �� ������ �� �� �ؾ��� �� �ڲٸ� ������

�ð��� �� �ڲ� ������ ���� ����� �� ����� ���� �߾︸ ����

�� �Բ� ��� ���� ������ �ٽ� �����ٸ�

����;��� ����ߴ� �׶��� �ʿ�
�� �翡 �׸��� �� �� �ٶ� ���� ���� ����

���� ���Ҿ� �ʿ��� ���� �� �� ��
������ �ʾ������� ���� �� ����Ѵٰ� ����

���� ���������� ����������
����;���

���� ���������� ����������
�ʵ� �� �� ���⸦

�׶� ���� ��Ⱦ����� ����� �� �������� ��
�װ� ������ ����

�� ����ó�� ���ν� ���� �ٽ� �����ٸ�

����;��� ����ߴ� �׶��� �ʿ�
�� �翡 �׸��� �� �� �ٶ� ���� ���� ����

���� ���Ҿ� �ʿ��� ���� �� �� ��
������ �ʾ������� (�ʾ�������) ���� �� ����Ѵٰ�

�� �Ǵ� ���� �� ��ó��
�翬�� �� ���翡 �ӹ� �ٸ� �˾Ҿ� (�׻�)

�ִ� �� ����̶� �� �׶��� �� ���޾Ҿ�
�ϰ� ���� �Ŀ���

�� �ʿ��� �� �����ٰ� ���� �ູ�ߴٰ�
����� ������ �� �ϰ� ��

����;��� (����;���) �ʿ��� ��� ���� ��
���� ���� �ʾҴٰ� (���� �ʾҴٰ�) �ʵ� �� ��ٷȴٰ� ����

���� ���������� ����������
����;��� (Baby can you call me now)
���� ���������� ����������

�ʵ� �� �� ���⸦', 3);

commit;

DESC MUSICVIDEO;
drop table musicvideo;
drop table mv_like;

create SEQUENCE mv_seq;
drop SEQUENCE mv_seq;

select * from MV_LIKE;
select * from musicvideo;

-- ���� 2��
insert into musicvideo
values (mv_seq.nextval,'LOVE DIVE','IVE','LOVE DIVE', 'https://www.youtube.com/embed/Y8JFxS1HlDo' ,
'https://file.mk.co.kr/meet/neds/2022/03/image_readmed_2022_286881_16486171754992122.jpg', TO_DATE('2022-05-01','YYYY-MM-DD'),
'�װ� �� �ñ��� �װ� �ʵ� ��������
�̰Ÿ� ����� �Ѱ� �Ѵ� �̷� ����
���� �� ���� �̲����� ȣ���
���� �ʿ� �� �ΰ� ���� �˰���

Woo ������ �Ʒ���
Woo ���߰� �ִ� ��
Woo yeah It��s so bad It��s good
�� �� ���� �� ���߰ھ�

Narcissistic, my god I love it
���θ� ���� ��
�Ƹ��ٿ� � ���� �� ���� ����
(�� ���Է� �� �װԷ�)
�� ���� love dive

Woo lalalalalalala
Woo � �ͼ� love dive
Woo oh perfect sacrifice yeah
�� ���� love dive

������ �̷��� �˴ٰ��� ����
����̶�� �� �Ѽ����� �� �״�
���� ���� �� ������ Ȯ����
�� �� ���� ���� ���� ���� ��

Woo ������ �ð���
Woo 3�ʸ� �Ǵ� ��
Woo yeah It��s so bad It��s good
���ϸ� ���� �پ���

Narcissistic, my god I love it
���θ� ���� ��
�Ƹ��ٿ� � ���� �� ���� ����
(�� ���Է� �� �װԷ�)
�� ���� love dive

Woo lalalalalalala
Woo � �ͼ� love dive
Woo oh perfect sacrifice yeah
�� ���� love dive

�� ���� love dive
�� ���� love dive
�� ���� love dive
�� ���� love dive

Woo lalalalalalala
Woo � �ͼ� love dive
Woo oh perfect sacrifice yeah
�� ���� love dive',1);

-- ���� 3��
insert into musicvideo
values (mv_seq.nextval,'�׶� �� ���� �״�� (�ױױ�)','WSG���ʺ� (����G)','WSG���ʺ� 1��', 'https://www.youtube.com/embed/kZvzjX35KxY' ,
'https://image.genie.co.kr/Y/IMAGE/IMG_ALBUM/082/814/458/82814458_1657270030475_1_600x600.JPG/dims/resize/Q_80,0',  TO_DATE('2022-07-09','YYYY-MM-DD'),'�� ������? ������ ����� ���� ���� ���� �λ� ������
��� �ñ��� �� �ʹ� ���Ҵµ� �ݰ��� ��������

�������� ���� �� �� ���� �츮 ���ٽ����� �׶��� ������
���� �׷��Ե� �� ���� ���Ƽ� ���� ������� ����

�׸��� ��Ҹ� �׸��� �� �� ���̵� ��ٷȾ�',2);



commit;