package com.bangfubao.test;

import android.util.Log;
import android.widget.TextView;

public class Transfer_Account extends BaseClass {

	public void testTransfer_Account() throws Exception {
		int a;
		int b;
		String[] value;
		String values;
		String va;
		solo.sleep(3000);
		// ��ȡ�˺Ž��
		values = this.getValue("textView4");
		// ��ӡ��ǰ���
		Log.i(TAG, values);
		// �ָ�С����ȡ����
		value = values.split("\\.");
		a = Integer.parseInt(value[0].trim());
		solo.searchText("�˻��ܶ�");
		solo.sleep(3);
		solo.clickOnText("�˻�ת��");
		this.clickByStringId("btn_transfer_to_account", 1);
		this.enterValueById("input_transfer_account", "ab046099heyou@ab-insurance.com", 1);
		this.enterValueById("input_transfer_money","10", 1);
		this.clickByStringId("btn_transfer_next", 1);
		solo.clickOnScreen(774, 657);
		solo.sleep(3000);
		this.clickByStringId("edt_payPwd", 1);
		this.enterPayPwdHw();
		this.clickByStringId("btn_commit_pay", 2);
		this.clickByStringId("btn_finish", 1);
		// �������ֳɹ���Ľ��
		b = a - 10;
		// ת���ý��Ϊ�ַ���
		va = String.valueOf(b);
		Log.i(TAG, va);
		values = this.getValue("textView4");
		value = values.split("\\.");
		Log.i(TAG, value[0]);
		assertEquals(value[0], va);
	    

	 }
}
