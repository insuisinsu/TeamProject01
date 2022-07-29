


Create table MUSICVIDEO (
  MV_ID number not null primary key, 				-- �º� ��ȣ
  MV_NAME varchar2(50) not null,					-- �뷡 ����
  MV_SINGER varchar2(50) not null,					-- ����
  MV_ALBUM varchar2(50) not null,					-- �ٹ�
  MV_URL varchar2(500) not null,					-- �º� URL
  MV_IMGURL varchar2(500) not null,					-- �̹��� URL
  MV_RDATE DATE not null,							-- �߸���
  MV_LYRICS VARCHAR2(4000) not null,				-- ����
  THEME_ID number not null							-- �׸���ȣ (1: �� 2: �߶�� 3: pop 4: ��/���� 5: �ε� 6: Ʈ��Ʈ 7: R&B)
);

select * from musicvideo;

insert into musicvideo
values (1,'LOVE DIVE','IVE','LOVE DIVE', 'https://www.youtube.com/embed/Y8JFxS1HlDo' ,
'https://file.mk.co.kr/meet/neds/2022/03/image_readmed_2022_286881_16486171754992122.jpg', '2022-05-01',
'�Ա��� 2022����
�� ���¾� ���ƿ� Ÿ�̹���
�ƴٸ��� ���� ���ƿ�
�Ӹ��� ������ �ٽ� �ٸ��� ���� ����
INTRO���� �� ���� ����
û���� ��� ������ ����
����� ���� ��� ����
�ɱ׶�� �����̾� �ξ��

20�뿡�� 20�밡 Ÿ��
30�뿡�� 20�밡 Ÿ��
40 �ϰ� ������ ��������
�̹� �ٹ��� 20�밡 Ÿ��
����� �� ���� �¾�
�󶼴� �̷� �� �����ܴ�
�շ��� ����� ���� ����Ŵٸ�
�� �ϳ� ���� ���� �Ӹ�

�׷� �� 22�� ��
�ʰ� �ų��� ���� �ų� Ÿ�� ���� ����
���� �� ���� �ľ�
���� ������ ���� �������� ������ �� ��

9INTRODUCTION
(Hey! Everybody!)
9INTRODUCTION (Hey!)
In In Introduction
(Hey! Everybody!)
9INTRODUCTION (Hey!)
(From P NATION~!)

�� �ƴٰ� è�Ǿ�
�������̴� Right Now
Gentle �ϰ� ������Ÿ��
���߳� ���߳� ���߾�
���ȹ����� DADDY
New Face I LUV IT
Celeb �׸��� That That
���߳� ���߳� ���߾�

�� ���� �ٹ��� 5�� ���� ��
�ø��Ⱥ��� �� �������̳�
��ڿ� ȯ�� ȯ�忡 ȯ�ھ�
�����̱��
���̸� ����ϰ� ó�Ծ���
�ֵվƸ� ������ ��Ծ���
��� ���� ��� ����
9������ ������ �ͳ�

���� ���� ����� ����
��� ���� ������ ����
�� ��� ���̿� ����� �ϱ⿡
X Y M Z ���� ���
���̿��� ���̹���
�˻�� ���� ���� �Ծ�
�����ؼ� �� �����߾�
�����ϰ� ���ٴ� ���߽���

�׷� �� 22�� ��
�ʰ� �ų��� ���� �ų� Ÿ�� ���� ����
���� �� ���� �ľ�
���� ������ ���� �������� ������ �� ��

9INTRODUCTION
(Hey! Everybody!)
9INTRODUCTION (Hey!)
In In Introduction
(Hey! Everybody!)
9INTRODUCTION (Hey!)
(From P NATION~!)

�� �ƴٰ� è�Ǿ�
�������̴� Right Now
Gentle �ϰ� ������Ÿ��
���߳� ���߳� ���߾�
���ȹ����� DADDY
New Face I LUV IT
Celeb �׸��� That That
���߳� ���߳� ���߾�
������ ���߾�
9INTRODUCTION',1);

commit;