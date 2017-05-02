package com.example.mk.gridview;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class Gridview extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Íø¸ñÊÓÍ¼");
        GridView gv = (GridView) findViewById(R.id.grid_view);
        gv.setAdapter(new ImageAdapter(this));

    }

    public class ImageAdapter extends BaseAdapter {
        // ¶¨ÒåContext
        private Context mContext;

        public ImageAdapter(Context c) {
            mContext = c;
        }

        // Í¼Æ¬µÄÒýÓÃ ¶¨ÒåÕûÐÍÊý×é ¼´Í¼Æ¬Ô´
        private Integer[] mThumbIds = { R.drawable.grid_view_01,
                R.drawable.grid_view_02, R.drawable.grid_view_03,
                R.drawable.grid_view_04, R.drawable.grid_view_05,
                R.drawable.grid_view_06, R.drawable.grid_view_07,
                R.drawable.grid_view_08, R.drawable.grid_view_09,
                R.drawable.grid_view_10, R.drawable.grid_view_11,
                R.drawable.grid_view_12, R.drawable.grid_view_13,
                R.drawable.grid_view_14, R.drawable.grid_view_15,
                R.drawable.sample_1, R.drawable.sample_2, R.drawable.sample_3,
                R.drawable.sample_4, R.drawable.sample_5, R.drawable.sample_6,
                R.drawable.sample_7 };

        // »ñÈ¡Í¼Æ¬µÄ¸öÊý
        public int getCount() {
            return mThumbIds.length;
        }

        // »ñÈ¡Í¼Æ¬ÔÚ¿âÖÐµÄÎ»ÖÃ
        public Object getItem(int arg0) {
            // TODO Auto-generated method stub
            return null;
        }

        // »ñÈ¡Í¼Æ¬ID
        @Override
        public long getItemId(int arg0) {
            // TODO Auto-generated method stub
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView;
            if (convertView == null) { // if it's not recycled, initialize some
                // attributes
                imageView = new ImageView(mContext);
                imageView.setLayoutParams(new GridView.LayoutParams(250, 250));
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setPadding(8, 8, 8, 8);
            } else {
                imageView = (ImageView) convertView;
            }

            imageView.setImageResource(mThumbIds[position]);
            return imageView;
        }

    }
}