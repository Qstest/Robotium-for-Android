package com.bangfubao.test;

import junit.framework.AssertionFailedError;

public class Billing_Detail extends BaseClass {
	
	public void testBilling_Detail(){
		boolean expected = true ;
		this.clickByStringId("iv_detail", 3000);
		
		if(solo.searchText("���-��ֵ")){
			solo.clickOnView(solo.getText("���-��ֵ"));
			solo.takeScreenshot("�˵�����-��֤");
			solo.sleep(1000);
			boolean actual = solo.searchText("���׺ţ�",0,true,true);
			assertEquals("��ȡ�˵��б�ʧ�ܣ�", actual, expected);
		}else{
			throw new AssertionFailedError("�޼�¼��");
		}
		
		}
		
	

}
