package com.itinhand.hoccheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox chkAndroid, chkWindowsPhone, chkIOS;
    Button btnChon;
    TextView txtMonHoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addEvents() {

        btnChon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyChonMonHoc();
            }
        });
    }

    private void xuLyChonMonHoc() {
        String s="";
        if(chkAndroid.isChecked()){
            s+=chkAndroid.getText().toString()+"\n";
        }
        if(chkWindowsPhone.isChecked()){
            s+=chkWindowsPhone.getText().toString()+"\n";
        }
        if(chkIOS.isChecked())
        {
            s+=chkIOS.getText().toString();
        }
        txtMonHoc.setText(s);
    }

    private void addControls() {
        chkAndroid = (CheckBox) findViewById(R.id.chkAndroid);
        chkWindowsPhone = (CheckBox) findViewById(R.id.chkLapTrinhWindowsPhone);
        chkIOS = (CheckBox) findViewById(R.id.chkIOS);
        btnChon = (Button) findViewById(R.id.btnChon);
        txtMonHoc = (TextView) findViewById(R.id.txtMonHoc);

    }
}
