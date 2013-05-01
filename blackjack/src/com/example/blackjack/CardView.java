package com.example.blackjack;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class CardView extends RelativeLayout {
	Paint mPaint = new Paint();
	public CardView(Context context) {
		this(context, null);
	}
	
	public CardView(Context context, AttributeSet attrs) {
		this(context, attrs, 0);
	}
	
	public CardView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}
	
	@Override
	public void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		mPaint.setColor(Color.RED);
		
	}

}
