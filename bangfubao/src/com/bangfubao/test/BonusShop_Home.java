package com.bangfubao.test;

public class BonusShop_Home extends BaseClass {
	
	public void testBonusShop_Home(){
		boolean expected = true ;
		this.clickByStringId("iv_house", 1000);
		this.clickByStringId("ry_Integral", 1000);
		this.clickByStringId("tv_exchange", 2000);
		solo.takeScreenshot("�����̳�-��֤");
		solo.sleep(1000);
		boolean actual = solo.searchText("�����̳�");
		assertEquals("���̳�ʧ�ܣ�", actual, expected);
		
	}

}
