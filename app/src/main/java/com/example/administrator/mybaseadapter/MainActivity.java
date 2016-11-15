package com.example.administrator.mybaseadapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Book> mList = new ArrayList<Book>();
    ListView mLv ;
    BaseAdapter<Book> mAdapter;
    int k = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLv = findView(R.id.lv);
        for(int i = 0 ; i < 50 ; i++) {
            Book book = new Book();
            k++;
            book.id = k;
            book.name = "name " + k;
            mList.add(book);
        }
        mAdapter = new MyAdapter(this);
        mAdapter.setData(mList);
        mLv.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();
    }


    public <T extends View> T findView(int viewId) {
        return  (T)findViewById(viewId);
    }

}
