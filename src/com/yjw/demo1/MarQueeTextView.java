package com.yjw.demo1;

import android.app.Activity;
import android.os.Bundle;

/**
 * 使用TextView实现跑马灯效果
 * 
 * @author Orange
 * 
 */
public class MarQueeTextView extends Activity {

	/*
	 * 实现方案：
	 * 1.在layout里面设置三个属性（ellipsize、focusable、focusableInTouchMode）还要设置singleline ；
	 * 2.自定义一个textview（首先实现三个构造函数，然后重载一个他的isFocused方法并且return true）；
	 * 3.让textview使用我们自定义的控件，在他前面--包名+类名
	 * 
	 * 第一步：android:focusable="true" android:focusableInTouchMode="true"
	 * android:singleLine="true" android:ellipsize="marquee"
	 * 
	 * 第二步: 自定义一个继承TextView的类
	 * 
	 * android:ellipsize=”start”—–省略号显示在开头 "...pedia"
	 * android:ellipsize=”end”——省略号显示在结尾 "encyc..."
	 * android:ellipsize=”middle”—-省略号显示在中间 "en...dia"
	 * 
	 * android:ellipsize=”marquee”–以横向滚动方式显示(需获得当前焦点)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_marquee);
	}
}
