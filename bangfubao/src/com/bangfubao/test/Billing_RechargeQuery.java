package com.bangfubao.test;

public class Billing_RechargeQuery extends BaseClass {
	
	public void testBilling_RechargeQuery(){
		boolean expected = true ;
		this.clickByStringId("iv_detail", 3000);
		solo.takeScreenshot("�˵�-��֤");
		solo.sleep(1000);
		boolean actual = solo.searchText("���׳ɹ�",0,true,true);
		assertEquals("��ȡ�˵��б�ʧ�ܣ�", actual, expected);
		
	}

}
