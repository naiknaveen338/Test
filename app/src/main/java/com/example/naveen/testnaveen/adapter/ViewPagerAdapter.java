package com.example.naveen.testnaveen.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.naveen.testnaveen.R;

/**
 * Created by Naveen on 5/3/2017.
 */
public class ViewPagerAdapter extends PagerAdapter {

    private Context context;
    String[] subdescription;
    String[] description;
    String[] rank;
    int[] flag;
    LayoutInflater inflater;


    public ViewPagerAdapter(Context context, String[] description, int[] flag,String[] subdescription) {
        this.context = context;
        this.description = description;
        this.flag = flag;
        this.subdescription=subdescription;
    }
    @Override
    public int getCount() {
        return description.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((FrameLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        // Declare Variables
        TextView descriptionn,subdescriptionn;
        ImageView imgflag;

        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.pager_item, container,
                false);

        // Locate the TextViews in viewpager_item.xml
        descriptionn = (TextView) itemView.findViewById(R.id.ranklabel);
        subdescriptionn = (TextView) itemView.findViewById(R.id.ranklabe2);

        // Capture position and set to the TextViews
        descriptionn.setText(description[position]);
        subdescriptionn.setText(subdescription[position]);

        // Locate the ImageView in viewpager_item.xml
        imgflag = (ImageView) itemView.findViewById(R.id.flag);
        // Capture position and set to the ImageView
        imgflag.setImageResource(flag[position]);

        // Add viewpager_item.xml to ViewPager
        ((ViewPager) container).addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        // Remove viewpager_item.xml from ViewPager
        ((ViewPager) container).removeView((FrameLayout) object);
    }
}
