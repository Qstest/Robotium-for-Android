package com.bangfubao.test;

public class Login extends BaseClass {
	
	public void testLogin() throws Exception {
		solo.searchText("�˻��ܶ�");
		solo.sleep(3);
		solo.clickOnText("����");
		this.clickByStringId("btn_psw_manager",1000);
		if(solo.searchText("������������")){
			this.clickByStringId("switch1",1000);
			this.clickByStringId("pay_password",1000);
			this.enterPwdHw();
			this.clickByStringId("confirm",1000);
		}else{
			solo.goBack();
			solo.clickOnText("�˻�����");
			solo.clickOnButton("��ȫ�˳�");
			solo.clickOnButton("ȷ��");
		}
		

	}

}
