package com.itinhand.hocimagebuttonvaimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    RadioButton radHienThiHinhNha, radHienThiHinhNguoi;
    ImageButton btnThoat;
    ImageView imgHinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addEvents() {
        radHienThiHinhNguoi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    imgHinh.setImageResource(R.drawable.user);
                }
            }
        });
        radHienThiHinhNha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    imgHinh.setImageResource(R.drawable.folder_home);
                }
            }
        });
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }



    private void addControls() {
        radHienThiHinhNha = (RadioButton) findViewById(R.id.radHienThiHinhNha);
        radHienThiHinhNguoi = (RadioButton) findViewById(R.id.radHienThiHinhNguoi);
        imgHinh = (ImageView) findViewById(R.id.imgHinh);
        btnThoat = (ImageButton) findViewById(R.id.btnThoat);
    }
}
