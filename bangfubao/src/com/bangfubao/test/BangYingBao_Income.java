package com.bangfubao.test;

import android.util.Log;

public class BangYingBao_Income extends BaseClass{
	
public void testBangYingBao_Income() throws Exception{
		
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
		solo.clickOnText("��ӯ��");
		this.clickByStringId("rb_transfer_in_byb", 1);
		this.enterValueById("edt_bofrechargeMoney","100", 1);
		this.clickByStringId("btn_bof_chengeoverIn", 1);
		this.clickByStringId("edt_payPwd", 1);
		this.enterPayPwdHw();
		this.clickByStringId("btn_commit_pay", 1);
		this.clickByStringId("btn_next", 2);
		// �������ֳɹ���Ľ��
		b = a - 100;
		// ת���ý��Ϊ�ַ���
		va = String.valueOf(b);
		Log.i(TAG, va);
		values = this.getValue("textView4");
		value = values.split("\\.");
		Log.i(TAG, value[0]);
		assertEquals(value[0], va);
		
		
	}

}
