package com.yjw.demo1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.ToggleButton;

/**
 * ToggleButton实现控制灯光开关的Demo
 * @author Orange
 *
 */
public class ToggleButtonActivity extends Activity {
	/*
	 * 一、ToggleButton 1、ToggleButton介绍：有选中和未选中两种状态，分别显示不同的文本； 2、属性
	 * android:checked="true"对应显示android:textOn=" "中的文本，
	 * android:checked="false"对应显示textOff=" "中的文本，
	 * 通过ToggleButton操纵其他控件，来显示（切换）不同的状态。
	 * 
	 * 二、实现思路 使用ToggleButton按钮实现开关效果----来切换其他控件的状态：
	 * 1、xml文件中配置一个ToggleButton和一个ImageView 
	 * 2、Java文件中对控件进行初始化
	 * 3、给ToggleButton对象配置监听器 
	 * 4、onCheckedChanged(CompoundButton buttonView,booleanisChecked)
	 * 通过判断ToggleButton对象的状态,再通过ImageView对象.setBackgroundResource改变ImageView的背景图
	 */
	private ToggleButton toggleButton;
	private ImageView imageView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_togglebutton);
		
		toggleButton = (ToggleButton) findViewById(R.id.toggleButton1);
		imageView = (ImageView) findViewById(R.id.imageView1);
		toggleButton.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				imageView.setBackgroundResource(isChecked?R.drawable.on:R.drawable.off);
			}
		});
	}
}
