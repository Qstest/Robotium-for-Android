package com.bangfubao.test;

import android.util.Log;

public class Billing_SpendingQuery  extends BaseClass{

	public void testBilling_SpendingQuery(){
		boolean expected = true ;
		this.clickByStringId("iv_detail", 3000);
		this.clickByStringId("btn_consumer_inquiries", 3000);
		this.clickByStringId("btn_search_consume", 3000);
		solo.takeScreenshot("���Ѳ�ѯ-��֤");
		solo.sleep(1000);
		boolean actual = solo.searchText("���Ѳ�ѯ",0,true,true);
		assertEquals("���Ѳ�ѯ�б���ʾʧ�ܣ�", actual, expected);
		
	}
}
