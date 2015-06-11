package com.yjw.demo1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

/**
 * AutoCompleteTextView、MultiAutoCompleteTextView的使用Demo
 * @author Orange
 *
 */
public class CompleteTextViewActivity extends Activity{
	
	private AutoCompleteTextView autoTextView;
	private String[] res = {"puning1","puning2","puning3","jieyang1","jieyang2","chaoshan"};
	
	private MultiAutoCompleteTextView mulAutoTextView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_complete);
		
		/*
		 * AutoCompleteTextView：
		 * 1、功能：动态匹配输入的内容，如百度搜索引擎：当输入文本时可以根据内容显示匹配的热门信息
		 * 2、独特属性：android:completionThreshold = "2"---设置输入多少字符时自动匹配
		 * 3、实现步骤
		 * 第一步：初始化控件
		 * 第二步：需要一个适配器
		 * 第三步：初始化数据源--数据源去匹配文本框输入的内容
		 * 第四步：将adapter与当前AutoCompleteTextView绑定
		 */
		autoTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, 
				android.R.layout.simple_list_item_1, res);
		autoTextView.setAdapter(adapter);
		
		/*
		 * MultiAutoCompleteTextView：
		 * 1、功能：可支持多个值（在多次输入的情况下），分别用分隔符分开，并且在每个值选中的时候再出输入值时会自动去匹配，可用在发短信发邮件时选择联系人这种类型当中
		 * 2、独特属性：android:completionThreshold = "2"---设置输入多少字符时自动匹配
		 * 3、设置分隔符：mtxt.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
		 * 4、实现步骤：
		 * 第一步：初始化控件
		 * 第二步：需要一个适配器
		 * 第三步：初始化数据源
		 * 第四步：将adpter与控件绑定
		 * 第五步：设置分隔符
		 */
		mulAutoTextView = (MultiAutoCompleteTextView) findViewById(R.id.multiAutoCompleteTextView1);
		mulAutoTextView.setAdapter(adapter);
		mulAutoTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
	}
}
