package com.bangfubao.test;

import android.util.Log;
import junit.framework.AssertionFailedError;

public class BangYingBao_Output extends BaseClass {
	
	public void testBangYingBao_Output() throws Exception{
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
		this.clickByStringId("rb_transfer_out_byb", 1);
		if(solo.searchText("���������ۼ�ת����������")){
			Log.i(TAG, "���������ۼ�ת����������");
			throw new AssertionFailedError("���������ۼ�ת����������");
		}else{
			this.enterValueById("edt_transfer_out_amount","100", 1);
		this.clickByStringId("btn_sure_transfer_out", 1);
		this.clickByStringId("edt_payPwd", 1);
		this.enterPayPwdHw();
		this.clickByStringId("btn_commit_pay", 2);
		this.clickByStringId("btn_finish", 2);
		// �������ֳɹ���Ľ��
		b = a + 100;
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
