package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {
    Paint paint = new Paint();
    Paint paint1 = new Paint();
    Path path = new Path();
    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        paint.setStyle(Paint.Style.STROKE);
        path.lineTo(0, 200);
        path.moveTo(0, 200);
        path.lineTo(300, 200);

        paint1.setStyle(Paint.Style.FILL);
        paint1.setColor(Color.GREEN);
        canvas.drawRect(100,100, 200, 200, paint1);
    }
}
