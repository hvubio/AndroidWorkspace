package com.itinhand.tygiahoidoai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.itinhand.adapter.TyGiaAdapter;
import com.itinhand.model.TyGia;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvTyGia;
    ArrayList<TyGia>dsTyGia;
    TyGiaAdapter tyGiaAdapter;

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
        lvTyGia= (ListView) findViewById(R.id.lvTyGia);

        dsTyGia=new ArrayList<>();
        dsTyGia.add(new TyGia("UK",12369,45879,65879,59687,R.drawable.uk));
        dsTyGia.add(new TyGia("EA",15963,15632,15968,15986,R.drawable.ea));
        dsTyGia.add(new TyGia("US",15933,15652,15967,15689,R.drawable.us));

        tyGiaAdapter=new TyGiaAdapter(MainActivity.this,R.layout.item,dsTyGia);

        lvTyGia.setAdapter(tyGiaAdapter);




    }
}
