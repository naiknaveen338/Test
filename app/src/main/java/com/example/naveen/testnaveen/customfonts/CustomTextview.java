package com.example.naveen.testnaveen.customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Naveen on 5/3/2017.
 */
public class CustomTextview extends TextView {
    public CustomTextview(Context context) {
        super(context);
        init();
    }

    public CustomTextview(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomTextview(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/MavenPro-Regular.ttf");
            setTypeface(tf);
        }
    }
}
