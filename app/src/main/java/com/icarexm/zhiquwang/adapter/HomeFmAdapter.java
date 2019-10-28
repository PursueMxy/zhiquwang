package com.icarexm.zhiquwang.adapter;

import android.content.Context;
import android.widget.TextView;

import com.icarexm.zhiquwang.R;
import com.zhouyou.recyclerview.adapter.HelperRecyclerViewAdapter;
import com.zhouyou.recyclerview.adapter.HelperRecyclerViewHolder;

public class HomeFmAdapter extends HelperRecyclerViewAdapter<String> {
    public Context context;

    public HomeFmAdapter(Context context) {
        super(context, R.layout.list_home_fm);
        this.context=context;
    }


    @Override
    protected void HelperBindData(HelperRecyclerViewHolder viewHolder, final int position,String item) {

    }
}
