package com.bangfubao.test;

public class BonusShop_Manager extends BaseClass{
	 
	public void testBonusShop_Manager(){
		boolean expected = true ;
		solo.clickOnText("�����̳�");
		solo.sleep(3000);
		solo.takeScreenshot("�����̳�-��֤");
		solo.sleep(1000);
		boolean actual = solo.searchText("�����̳�");
		assertEquals("���̳�ʧ�ܣ�", actual, expected);
		
	}

}
