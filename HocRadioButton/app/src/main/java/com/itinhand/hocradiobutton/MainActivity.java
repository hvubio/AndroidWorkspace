package com.itinhand.hocradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    RadioButton radRatTuyetVoi, radTuyetVoi, radTamChapNhan, radKhongTotLam;
    Button btnBinhChon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvens();
    }

    private void addEvens() {
        btnBinhChon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyBinhChon();
            }
        });
    }

    private void xuLyBinhChon() {
        String s="";
        if(radRatTuyetVoi.isChecked()){
            s=radRatTuyetVoi.getText().toString();
        }
        else if (radTuyetVoi.isChecked()){
            s=radTuyetVoi.getText().toString();
        }
        else if (radTamChapNhan.isChecked()){
            s=radTamChapNhan.getText().toString();
        }
        else if (radKhongTotLam.isChecked()){
            s=radKhongTotLam.getText().toString();
        }
        Toast.makeText(MainActivity.this,"Bạn đã chọn "+s,Toast.LENGTH_LONG).show();
    }


    private void addControls() {
        radRatTuyetVoi = (RadioButton) findViewById(R.id.radRatTuyetVoi);
        radTuyetVoi = (RadioButton) findViewById(R.id.radTuyetVoi);
        radTamChapNhan = (RadioButton) findViewById(R.id.radTamChapNhan);
        radKhongTotLam = (RadioButton) findViewById(R.id.radKhongTotLam);
        btnBinhChon= (Button) findViewById(R.id.btnBinhChon);
    }
}
