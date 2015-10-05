package com.example.artests.l14paint;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

/**
 * Created by artests on 02.10.2015.
 */
public class Draw2D extends View {
    private Paint mPaint=new Paint();
    private Bitmap mBitmap;
    public Draw2D(Context context) {
        super(context);
        mBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.kot);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //Style filling
        mPaint.setStyle(Paint.Style.FILL);

        //Paint over white color
        mPaint.setColor(Color.WHITE);
        canvas.drawPaint(mPaint);

        //Draw yellow circle
        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.YELLOW);
        canvas.drawCircle(650,30,25,mPaint);

        //Draw green rectangle
        mPaint.setColor(Color.GREEN);
        canvas.drawRect(20,650,700,680,mPaint);

        //Draw text
        mPaint.setColor(Color.BLUE);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setAntiAlias(true);
        mPaint.setTextSize(32);
        canvas.drawText(getResources().getString(R.string.grass_for_cats),30,648,mPaint);


        //Text angle
        int x=510;
        int y=190;
        mPaint.setColor(Color.GRAY);
        mPaint.setTextSize(27);
        String str2rotate=getResources().getString(R.string.sun_beam);

        //Create the bounding rectangle for italic text
        //Rotate the canvas in the middle of text
        canvas.rotate(-45,x,y);

        //Draw text
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawText(str2rotate,x,y,mPaint);

        //Restore the canvas
        canvas.restore();

        //Put image
        canvas.drawBitmap(mBitmap,450,530,mPaint);
    }
}
