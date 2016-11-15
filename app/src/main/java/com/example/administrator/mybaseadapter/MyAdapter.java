package com.example.administrator.mybaseadapter;

import android.content.Context;
import android.widget.TextView;

/**
 * Created by pengsihai@yy.com on 2016/11/15.
 */

public class MyAdapter extends BaseAdapter {

    public MyAdapter(Context context) {
        super(context);
    }


    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    @Override
    public int getItemLayoutId(int getItemViewType) {
        return R.layout.item_layout;
    }

    @Override
    public void handleItem(int itemViewType, int position, Object item, ViewHolder holder, boolean isRecycle) {
        TextView leftTv = holder.get(R.id.left_tv, TextView.class);
        TextView righTv = holder.get(R.id.right_tv, TextView.class);
        Book book = (Book) item;
        leftTv.setText(book.id + "");
        righTv.setText(book.name);
    }


}
