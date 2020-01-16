package com.example.a9.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a9.R;
import com.example.a9.entity.AccountItem;

import java.util.List;


public class OutlayRecycleViewAdapter extends BaseAdapter {
    private List<AccountItem> mItems;
    private LayoutInflater mInflater;

    public OutlayRecycleViewAdapter(List<AccountItem> mItems, Activity context) {
        this.mItems = mItems;
        mInflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mItems.size();
    }

    @Override
    public Object getItem(int position) {
        return mItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return this.mItems.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=mInflater.inflate(R.layout.recyclerview_item,null);
        TextView tvCategory=(TextView)view.findViewById(R.id.textViewCategory);
        TextView tvRemark=(TextView)view.findViewById(R.id.textViewRemark);
        TextView tvMoney=(TextView)view.findViewById(R.id.textViewMoney);
        TextView tvDate=(TextView)view.findViewById(R.id.textViewDate);
        ImageView imageView=(ImageView)view.findViewById(R.id.imageViewIcon);
        AccountItem item=mItems.get(position);
        tvCategory.setText(item.getCategory());
        tvRemark.setText(item.getRemark());
        tvMoney.setText(String.valueOf(item.getMoney()));
        tvDate.setText(item.getDate());
        int icon=R.drawable.baby_icon;
        if(icon>0){
            imageView.setImageResource(icon);
        }
        return view;
    }
}

//
//public class OutlayRecycleViewAdapter extends RecyclerView.Adapter<OutlayRecycleViewAdapter.OutlayItemViewHolder> {
//    private List<AccountItem>mItems;
//    private final LayoutInflater mLayoutInflater;
//
//    public OutlayRecycleViewAdapter(Activity context, List<AccountItem> mItems) {
//        mLayoutInflater=LayoutInflater.from(context);
//        this.mItems = mItems;
//    }
//
//    @NonNull
//    @Override
//    public OutlayItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
//        OutlayItemViewHolder h=new OutlayItemViewHolder(mLayoutInflater.inflate(R.layout.recyclerview_item ,viewGroup,false ));
//        return h;
//    }
//
//    public void onBindViewHolder(@NonNull OutlayItemViewHolder outlayItemViewHolder , int i) {
//        AccountItem item=this.mItems.get(i);
//        outlayItemViewHolder.tvCategory.setText(item.getCategory());
//        outlayItemViewHolder.tvRemark.setText(item.getRemark());
//        outlayItemViewHolder.tvMoney.setText(String.valueOf(item.getMoney()));
//        outlayItemViewHolder.tvDate.setText(item.getDate());
//        int icon=R.drawable.baby_icon;
//        if(icon>0){
//            outlayItemViewHolder.imageView.setImageResource(icon);
//        }
//    }
//
//    @Override
//    public int getItemCount() {
//        return mItems==null?0:mItems.size();
//    }
//
//    public class OutlayItemViewHolder extends RecyclerView.ViewHolder{
//        TextView tvCategory;
//        TextView tvRemark;
//        TextView tvMoney;
//        TextView tvDate;
//        ImageView imageView;
//        public OutlayItemViewHolder(@NonNull View itemView) {
//            super(itemView);
//            tvCategory=(TextView) itemView.findViewById(R.id.textViewCategory);
//            tvRemark=(TextView) itemView.findViewById(R.id.textViewRemark);
//            tvDate=(TextView) itemView.findViewById(R.id.textViewDate);
//            imageView=(ImageView) itemView.findViewById(R.id.imageViewIcon);
//            tvMoney=(TextView) itemView.findViewById(R.id.textViewMoney);
//
//        }
//    }
//
//}
