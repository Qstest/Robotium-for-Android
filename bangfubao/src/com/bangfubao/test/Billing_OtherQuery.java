package com.bangfubao.test;

public class Billing_OtherQuery extends BaseClass{
	
	public void testBilling_OtherQuery(){
		boolean expected = true ;
		this.clickByStringId("iv_detail", 3000);
		this.clickByStringId("btn_consumer_inquiries", 3000);
		this.clickByStringId("btn_search_other", 3000);
		solo.takeScreenshot("������ѯ-��֤");
		solo.sleep(1000);
		boolean actual = solo.searchText("�����˵�",0,true,true);
		assertEquals("������ѯ�б���ʾʧ�ܣ�", actual, expected);
		
	}

}
