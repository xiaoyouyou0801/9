package com.example.a9.fragment;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.a9.R;
import com.example.a9.adapter.AccountItemAdapter;
import com.example.a9.entity.AccountItem;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class OutlayFragment extends Fragment {


//    public OutlayFragment() {
//        // Required empty public constructor
//    }
//
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_outlay, container, false);
//    }
View mRootView;
    ListView listView;
    public OutlayFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mRootView=inflater.inflate(R.layout.fragment_outlay, container, false);
        initView();
        return mRootView;
    }

    private void initView() {
        listView=(ListView) mRootView.findViewById(R.id.listView2);
        refresh();
    }

    private void refresh() {
        List<AccountItem> outlayAccountList=getTestData();
        AccountItemAdapter adapter=new AccountItemAdapter(outlayAccountList,getActivity());
        listView.setAdapter(adapter);
//        TextView textViewIncomeSummary=(TextView)mRootView.findViewById(R.id.textViewIncomeSummary);
//        textViewIncomeSummary.setText("10000");
    }

    private List<AccountItem> getTestData(){
        List<AccountItem> result=new ArrayList<AccountItem>();
        for(int i=0;i<5;i++){
            AccountItem item=new AccountItem();
            item.setId(i);
            item.setRemark("柜机"+i);
            item.setCategory("柜机"+i);
            result.add(item);
        }
        return result;
    }



}


//
//import android.os.Bundle;
//
//import androidx.fragment.app.Fragment;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import com.example.a9.R;
//import com.example.a9.adapter.OutlayRecycleViewAdapter;
//import com.example.a9.entity.AccountItem;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * A simple {@link Fragment} subclass.
// */
//public class OutlayFragment extends Fragment {
//
//    private View mRootView;
//    private RecyclerView mRecyclerView;
//    public OutlayFragment() {
//        // Required empty public constructor
//    }
//
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        mRootView=inflater.inflate(R.layout.fragment_outlay, container, false);
//        initView();
//        return mRootView;
//    }
//
//    private void initView() {
//        refresh();
//    }
//
//    private void refresh() {
//        List<AccountItem> outlayAccount= getTextData();
//        mRecyclerView=mRootView.findViewById(R.id.recyclerView);
//        mRecyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
//        mRecyclerView.setAdapter(new OutlayRecycleViewAdapter(this.getActivity(),outlayAccount));
//        TextView textViewOutlaySummary=mRootView.findViewById(R.id.textViewOutlaySummary);
//        textViewOutlaySummary.setText("2000");
//    }
//
//    private List<AccountItem> getTextData() {
//        List<AccountItem> result=new ArrayList<>();
//        for(int i=0;i<=5;i++){
//            AccountItem item=new AccountItem();
//            item.setId(i);
//            item.setCategory("食物");
//            item.setMoney(100*i);
//            item.setDate("201"+i);
//            result.add(item);
//        }
//        return result;
//    }
//
//}
