
-- �º� ���ƿ� ���̺� ����

Create table MV_LIKE(
    MV_LIKE_NUM number not null primary key,    -- ���ƿ� ��ȣ
    MV_ID number not null,                      -- �º� ��ȣ
    M_NUM number not null,                       -- ȸ�� ��ȣ
    MV_LIKE_CNT number not null                  -- ���ƿ�
    MV_UNLIKE_CNT number not null, 				 -- ���ƿ� �ٽô�����
    );