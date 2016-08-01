package com.itinhand.hocautocompletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtTen;

    AutoCompleteTextView autoTinhThanh;
    String []arrTinhThanh;
    ArrayAdapter<String>adapterTinhThanh;

    Button btnXacNhan;
    TextView txtThongTin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }


    private void addEvents() {
        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyXacNhan();
            }
        });
    }

    private void xuLyXacNhan() {
        String s=txtTen.getText().toString()+"\n"+autoTinhThanh.getText().toString();
        txtThongTin.setText(s);
    }
    private void addControls() {
        txtTen= (EditText) findViewById(R.id.txtTen);
        btnXacNhan= (Button) findViewById(R.id.btnXacNhan);
        txtThongTin= (TextView) findViewById(R.id.txtThongTin);
        autoTinhThanh= (AutoCompleteTextView) findViewById(R.id.autoNoiSinh);

        //gán dữ liệu tỉnh thành từ nguồn string.xml và nguồn
        arrTinhThanh=getResources().getStringArray(R.array.arrTinhThanh);
        adapterTinhThanh=new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1,
                arrTinhThanh);
        autoTinhThanh.setAdapter(adapterTinhThanh);


    }

}
