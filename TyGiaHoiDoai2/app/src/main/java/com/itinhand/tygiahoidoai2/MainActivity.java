package com.itinhand.tygiahoidoai2;

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

        addControls();
        addEvents();
    }

    private void addEvents() {
    }

    private void addControls() {
        lvTyGia= (ListView) findViewById(R.id.lvTyGia);

        dsTyGia = new ArrayList<>();
        dsTyGia.add(new TyGia(1,"EA",19203,19206,19201,19204,R.drawable.ea));
        dsTyGia.add(new TyGia(2,"UK",29203,29206,29201,29204,R.drawable.uk));
        dsTyGia.add(new TyGia(3,"US",21203,21206,21201,21204,R.drawable.us));


        tyGiaAdapter =new TyGiaAdapter(MainActivity.this,R.layout.lotygia,dsTyGia);

        lvTyGia.setAdapter(tyGiaAdapter);

    }
}
