package com.itheima.gooviewtest;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

/**
 * Created by sszz on 2016/12/14.
 */

public class MyRlv extends RecyclerView {
	public MyRlv(Context context) {
		super(context);
	}

	public MyRlv(Context context, @Nullable AttributeSet attrs) {
		super(context, attrs);
	}

	public MyRlv(Context context, @Nullable AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	@Override
	public boolean onInterceptTouchEvent(MotionEvent e) {
		boolean intercept = super.onInterceptTouchEvent(e);
		//Log.i("test","intercept:"+intercept);
		return intercept;
	}
}
