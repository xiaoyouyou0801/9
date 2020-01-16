package com.example.a9.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.example.a9.R;
import com.example.a9.adapter.AccountItemAdapter;
import com.example.a9.entity.AccountItem;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class IncomeFragment extends Fragment {

    View mRootView;
    ListView listView;
    public IncomeFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mRootView=inflater.inflate(R.layout.fragment_income, container, false);
        initView();
        return mRootView;
    }

    private void initView() {
        listView=(ListView) mRootView.findViewById(R.id.listView1);
        refresh();

    }

    private void refresh() {
        List<AccountItem> incomeAccountList=getTestData();
        AccountItemAdapter adapter=new AccountItemAdapter(incomeAccountList,getActivity());
        listView.setAdapter(adapter);
//        TextView textViewIncomeSummary=(TextView)mRootView.findViewById(R.id.textViewIncomeSummary);
//        textViewIncomeSummary.setText("10000");
    }

    private List<AccountItem> getTestData(){
        List<AccountItem> result=new ArrayList<AccountItem>();
        for(int i=0;i<5;i++){
            AccountItem item=new AccountItem();
            item.setId(i);
            item.setRemark("物品a");
            item.setCategory("柜机"+i);
            item.setMoney(i*100);
            item.setDate("10"+i);
            result.add(item);
        }
        return result;
    }

}
