package com.bangfubao.test;

public class BangYingBao_Manager extends BaseClass {
	
	public void testBangYingBao_Manager(){
		boolean expected = true ;
		this.clickByStringId("iv_house", 1000);
		this.clickByStringId("btn_my_financing", 3000);
		solo.takeScreenshot("��ӯ��-��֤");
		solo.sleep(1000);
		boolean actual = solo.searchText("��ӯ��");
		assertEquals("�����ӯ��ʧ�ܣ�", actual, expected);
		
	}

}
