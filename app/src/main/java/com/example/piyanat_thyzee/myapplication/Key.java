package com.example.piyanat_thyzee.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Key extends AppCompatActivity {

    Button btnmap ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_key);

        Button btnmap = (Button) findViewById(R.id.btnmap);
        btnmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Go = new Intent(Key.this,Map.class);
                startActivity(Go);
            }
        });
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
