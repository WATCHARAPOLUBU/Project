package com.example.piyanat_thyzee.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayAdapter<String> adapter;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list =(ListView) findViewById(R.id.listview);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent Go = new Intent(MainActivity.this,Key.class);
                startActivity(Go);
            }
        });
        listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(new NewbookAdapter(getApplicationContext()));
    }

    public class NewbookAdapter extends BaseAdapter{
        public Context mContext;
        public LayoutInflater mInflater;
        public NewbookAdapter(Context context){
            mContext = context;
            mInflater = LayoutInflater.from(mContext);
        }

        @Override
        public int getCount() {
            return 20;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View convertview, ViewGroup viewGroup) {
            if (convertview == null){
                convertview = mInflater.inflate(R.layout.activity_item1,null);

            }else {

            }
            return convertview;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.setting){
            Intent setting = new Intent(this,Main.class);
            startActivity(setting);
            return  true;
        }
        return super.onOptionsItemSelected(item);
    }
}
