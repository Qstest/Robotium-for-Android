package com.bangfubao.test;

import android.util.Log;
import com.bangfubao.utils.*;

public class Recharge extends BaseClass {
	
	public void testRecharge() throws Exception {

		String values;
		solo.sleep(3000);
		// ��ȡ�˺Ž��
		values = this.getValue("textView4");
		// ��ӡ��ǰ���
		Log.i(TAG, values);
		solo.searchText("�˻��ܶ�");
		solo.sleep(3);
		solo.clickOnText("�˻���ֵ");
		this.clickByStringId("text_bank_name", 1);
		this.enterValueById("edt_amt","10.01", 1);
		this.clickByStringId("edt_pass", 1);
		this.enterPayPwdHw();
		this.clickByStringId("btn_next", 1);
		this.clickByStringId("btn_code", 60000);
		solo.waitForText("��֤���ѷ��ͣ�10��������Ч");
		String vl = tools.getvalue("sb.txt");
		Log.i(TAG, vl);
		this.enterValueById("edt_smscode",vl, 1);
		this.clickByStringId("btn_ok", 5000);
		solo.getCurrentActivity();
		this.clickByStringId("btn_finish", 1000);
		solo.waitForText("��ֵ������,���ע���仯!");
		

	}

}
