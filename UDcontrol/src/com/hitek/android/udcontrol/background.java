package com.hitek.android.udcontrol;

import com.hitek.android.udcontrol.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.os.Handler;
import android.util.Log;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.content.Intent;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.LinearLayout;


public class background extends View{
		
		public background(Context context){
			super(context);
			//setBackgroundColor(Color.BLACK);
			setBackgroundColor(Color.WHITE);
		}
		
		protected void onDraw(Canvas canvas){
			Paint paint = new Paint();
			paint.setAntiAlias(true);
			paint.setStyle(Paint.Style.STROKE);
			/*paint.setColor(Color.argb(255, 0, 0, 255));*/
			//paint.setColor(Color.WHITE);
			paint.setColor(Color.BLACK);
			paint.setTextSize(24);
			
			int x=0;
			int y=0;
			int start=11;
			int endx=1350;
			int valy=61;
			int totaly=0;
			int texty=5;
			int usbnumber=1;
			int usbstart=22;
			String usb;
			
			for(y=0; y<6; y++){
				totaly=(valy*y);
				canvas.drawRect(new Rect(start, (totaly+start), endx, (totaly+valy)), paint);
				canvas.drawText("USB",usbstart , (totaly+valy-texty), paint);
				usb=usbnumber+"";
				canvas.drawText(usb,usbstart+(24*2) , (totaly+valy-texty), paint);
				usbnumber+=1;

			}
			
		}		
	}	
