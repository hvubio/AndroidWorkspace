package com.itinhand.hoclistviewcoban_dulieuthaydoi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> arrTen;
    ArrayAdapter<String> adapterTen;
    ListView lvTen;

    EditText txtTen;
    Button btnLuuDuLieu;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        addControls();
        addEvents();
    }

    private void addEvents() {
        btnLuuDuLieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyLuu();
            }
        });
    }

    private void xuLyLuu() {
        String ten = txtTen.getText().toString();
        arrTen.add(ten); //thêm dữ liệu nguồn
        adapterTen.notifyDataSetChanged(); //ra lệnh cho Listview cập nhật dữ liệu mới
        txtTen.setText("");
        txtTen.requestFocus();
    }

    private void addControls() {
        arrTen = new ArrayList<String>();
        adapterTen = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1,
                arrTen);
        lvTen = (ListView) findViewById(R.id.lvTen);
        lvTen.setAdapter(adapterTen);

        txtTen = (EditText) findViewById(R.id.txtTen);
        btnLuuDuLieu= (Button) findViewById(R.id.btnLuuDuLieu);
        
    }
}
