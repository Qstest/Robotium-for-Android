package com.bangfubao.test;

public class Billing_WithdrawQuery extends BaseClass{
	
	public void testBilling_WithdrawQuery(){
		boolean expected = true ;
		this.clickByStringId("iv_detail", 3000);
		this.clickByStringId("btn_withdraw_inquiry", 3000);
		solo.takeScreenshot("���ֲ�ѯ-��֤");
		solo.sleep(1000);
		boolean actual = solo.searchText("���-����",0,true,true);
		assertEquals("���ֲ�ѯ�б���ʾʧ�ܣ�", actual, expected);
		
	}

}
