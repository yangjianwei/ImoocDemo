package com.yjw.demo1;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * 实现跑马灯的辅助类
 * @author Orange
 *
 */
public class MarQueeTextViewInit extends TextView{

	public MarQueeTextViewInit(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}

	public MarQueeTextViewInit(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	public MarQueeTextViewInit(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isFocused() {
		// TODO Auto-generated method stub
		//isfocused让每个textview拿到焦点
		return true;
	}
}
