package com.itinhand.hoclistviewconban_dulieucodinh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.sql.Array;

public class MainActivity extends AppCompatActivity {

    String []arrThu; //tạo nguồn dữ liệu
    ArrayAdapter<String>adapterThu;
    ListView lvThu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addEvents() {
        lvThu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"Bạn chọn ["+arrThu[position]+"]",
                        Toast.LENGTH_LONG).show();
            }
        });
    }

    private void addControls() {
        arrThu=getResources().getStringArray(R.array.arrThu);
        adapterThu= new ArrayAdapter<String>(
                MainActivity.this,android.R.layout.simple_list_item_1,arrThu);
        lvThu= (ListView) findViewById(R.id.lvThu);
        lvThu.setAdapter(adapterThu);
    }
}
