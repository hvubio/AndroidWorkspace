package com.itinhand.hoclistviewnangcao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.itinhand.adapter.DanhBaAdapter;
import com.itinhand.model.DanhBa;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvDanhBa;
    ArrayList<DanhBa>dsDanhBa;
    DanhBaAdapter danhBaAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControlls();
        addEvents();
    }

    private void addEvents() {
    }

    private void addControlls() {
        lvDanhBa= (ListView) findViewById(R.id.lvDanhBa);

        dsDanhBa = new ArrayList<>();
        dsDanhBa.add(new DanhBa(1,"Nguyễn Văn An","09012365874"));
        dsDanhBa.add(new DanhBa(2,"Trần Thị Be","0123698742"));
        dsDanhBa.add(new DanhBa(3,"Lê Thị Se","0905687123"));


        danhBaAdapter=new DanhBaAdapter(MainActivity.this,R.layout.item,dsDanhBa);

        lvDanhBa.setAdapter(danhBaAdapter);
    }
}
