package com.bangfubao.test;


import android.util.Log;

public class Withdraw extends BaseClass {
	

	public void  testWithdraw() throws Exception {
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
		solo.clickOnText("�˻�����");
		this.clickByStringId("text_bank_name", 1);
		this.enterValueById("input_withdraw_money", "10", 1);
		this.clickByStringId("btn_withdraw_next", 1);
		this.clickByStringId("edt_payPwd", 2);
		this.enterPayPwdHw();
		this.clickByStringId("btn_commit_pay", 2);
		solo.searchText("10.00Ԫ");
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
