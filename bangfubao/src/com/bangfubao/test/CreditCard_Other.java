package com.bangfubao.test;

import com.bangfubao.utils.tools;

import android.util.Log;
import junit.framework.AssertionFailedError;

public class CreditCard_Other extends BaseClass {
	public void testCreditCard_Other() throws Exception {

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
		solo.clickOnText("���ÿ�����");
		this.clickByStringId("tv_bankNM", 1);
		solo.clickOnText("��������");
		this.enterValueById("edt_bankNo", "6225758328709208", 1);
		this.enterValueById("edt_name", "������", 1);
		this.enterValueById("edt_payment", "10", 1);
		this.clickByStringId("btn_code", 30000);
		String vl = tools.getvalue("sb.txt");
		Log.i(TAG, vl);
		this.enterValueById("edt_code", vl, 1);
		this.clickByStringId("btn_submit", 1);
		if (solo.searchText("��֤��У������������Գ���3��")) {
			throw new AssertionFailedError("��֤��У������������Գ���3��");
		} else {
			this.clickByStringId("pay_password", 1);
			this.enterPayPwdHw();
			this.clickByStringId("btn_confirm", 1);
			this.clickByStringId("btn_finish", 2);
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

}
