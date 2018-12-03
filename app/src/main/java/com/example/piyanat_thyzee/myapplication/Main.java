package com.example.piyanat_thyzee.myapplication;

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
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;

public class Main extends AppCompatActivity {
    GridView gridView;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        GridView grid = (GridView) findViewById(R.id.Grid);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent Go = new Intent(Main.this,Key.class);
                startActivity(Go);
            }
        });
        gridView = (GridView) findViewById(R.id.Grid);
        gridView.setAdapter(new Main.NewbookAdapter(getApplicationContext()));

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
            return 6;
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
                convertview = mInflater.inflate(R.layout.item2,null);

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
