package com.yjw.demo1;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class ButtonListener extends Activity implements OnClickListener{

	private Button myButton1;
	private Button myButton2;
	private Button myButton3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_button);

		// findViewById:����һ��View����
		myButton1 = (Button) findViewById(R.id.myBtn1);
		/*
		 * �����¼�ʵ�ַ�ʽ :1�������ڲ��ࣻ 2���ⲿ��ʵ�֣� 3���ӿڷ�ʽʵ��
		 */
		myButton1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Log.i("tag","������ʵ��");
			}
		});

		myButton2 = (Button) findViewById(R.id.myBtn2);
		myButton2.setOnClickListener(new MyOnclickListener(){
			@Override
			public void onClick(View v) {
				// ���ø����onClick()����
				super.onClick(v);
				Toast.makeText(ButtonListener.this, "�ⲿ��ʵ��", 1).show();
			}
		});
		
		myButton3 = (Button) findViewById(R.id.myBtn3);
		myButton3.setOnClickListener(this);
	}


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Log.i("tag","�ӿڷ�ʽʵ��");
	}

}

class MyOnclickListener implements OnClickListener {

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Log.i("tag", "�ⲿ��ʵ��");
		//�ı�͸����
		v.setAlpha(0.5f);
	}
}
