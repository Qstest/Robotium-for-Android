package com.bangfubao.test;

public class Billing_TransferQuery_PayoutQuery extends BaseClass {
	
	public void testBilling_TransferQuery_PayoutQuery(){
		boolean expected = true ;
		this.clickByStringId("iv_detail", 3000);
		this.clickByStringId("btn_transfer_query", 3000);
		this.clickByStringId("btn_search_transfer_pay", 3000);
		solo.takeScreenshot("�˻������ѯ-��֤");
		solo.sleep(1000);
		boolean actual = solo.searchText("�˻������ѯ",0,true,true);
		assertEquals("�˻������ѯ�б���ʾʧ�ܣ�", actual, expected);
		
	}

}
