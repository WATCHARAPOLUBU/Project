package com.example.piyanat_thyzee.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Map extends AppCompatActivity {

    Button btnKey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        Button btnKey = (Button)findViewById(R.id.btnKey);
        btnKey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Ba = new Intent(Map.this,Key.class);
                startActivity(Ba);

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
