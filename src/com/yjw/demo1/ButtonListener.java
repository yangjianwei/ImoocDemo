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

		// findViewById:返回一个View对象
		myButton1 = (Button) findViewById(R.id.myBtn1);
		/*
		 * 监听事件实现方式 :1、匿名内部类； 2、外部类实现； 3、接口方式实现
		 */
		myButton1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Log.i("tag","匿名类实现");
			}
		});

		myButton2 = (Button) findViewById(R.id.myBtn2);
		myButton2.setOnClickListener(new MyOnclickListener(){
			@Override
			public void onClick(View v) {
				// 调用父类的onClick()方法
				super.onClick(v);
				Toast.makeText(ButtonListener.this, "外部类实现", 1).show();
			}
		});
		
		myButton3 = (Button) findViewById(R.id.myBtn3);
		myButton3.setOnClickListener(this);
	}


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Log.i("tag","接口方式实现");
	}

}

class MyOnclickListener implements OnClickListener {

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Log.i("tag", "外部类实现");
		//改变透明度
		v.setAlpha(0.5f);
	}
}
