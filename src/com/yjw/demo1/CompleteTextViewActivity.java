package com.yjw.demo1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

/**
 * AutoCompleteTextView��MultiAutoCompleteTextView��ʹ��Demo
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
		 * AutoCompleteTextView��
		 * 1�����ܣ���̬ƥ����������ݣ���ٶ��������棺�������ı�ʱ���Ը���������ʾƥ���������Ϣ
		 * 2���������ԣ�android:completionThreshold = "2"---������������ַ�ʱ�Զ�ƥ��
		 * 3��ʵ�ֲ���
		 * ��һ������ʼ���ؼ�
		 * �ڶ�������Ҫһ��������
		 * ����������ʼ������Դ--����Դȥƥ���ı������������
		 * ���Ĳ�����adapter�뵱ǰAutoCompleteTextView��
		 */
		autoTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, 
				android.R.layout.simple_list_item_1, res);
		autoTextView.setAdapter(adapter);
		
		/*
		 * MultiAutoCompleteTextView��
		 * 1�����ܣ���֧�ֶ��ֵ���ڶ�����������£����ֱ��÷ָ����ֿ���������ÿ��ֵѡ�е�ʱ���ٳ�����ֵʱ���Զ�ȥƥ�䣬�����ڷ����ŷ��ʼ�ʱѡ����ϵ���������͵���
		 * 2���������ԣ�android:completionThreshold = "2"---������������ַ�ʱ�Զ�ƥ��
		 * 3�����÷ָ�����mtxt.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
		 * 4��ʵ�ֲ��裺
		 * ��һ������ʼ���ؼ�
		 * �ڶ�������Ҫһ��������
		 * ����������ʼ������Դ
		 * ���Ĳ�����adpter��ؼ���
		 * ���岽�����÷ָ���
		 */
		mulAutoTextView = (MultiAutoCompleteTextView) findViewById(R.id.multiAutoCompleteTextView1);
		mulAutoTextView.setAdapter(adapter);
		mulAutoTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
	}
}
