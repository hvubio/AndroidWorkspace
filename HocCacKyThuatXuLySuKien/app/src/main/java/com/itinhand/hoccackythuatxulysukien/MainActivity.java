package com.itinhand.hoccackythuatxulysukien;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnLongClickListener {

    EditText txtA, txtB;

    Button btnTru;
    Button btnNhan, btnChia;
    Button btnAn;

    View.OnClickListener suKienChiaSe = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        addControls(); //hàm tao ra cac control gan tu view
        addEvents(); // hàm tạo ra các sự kiện, luôn nằm sau addControls()
    }

    private void addEvents() {
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyPhepTru();
            }
        });
        suKienChiaSe=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()== R.id.btnNhan)
                {
                    xuLyPhepNhan();
                }
                else if (v.getId()== R.id.btnChia)
                {
                    xuLyPhepChia();
                }

            }
        };
        btnNhan.setOnClickListener(suKienChiaSe); // gán sukienchiase va su kien lick cua btnNhan
        btnChia.setOnClickListener(suKienChiaSe); // gán sukienchiase va su kien lick cua btnChia

        btnAn.setOnLongClickListener(this);
        // viet onlick sẽ bị lỗi vì màn hình này chỉ cho phép longclick
        // btnAn.setOnClickListener(this);
    }

    private void xuLyPhepChia() {
        int a=Integer.parseInt(txtA.getText().toString());
        int b = Integer.parseInt(txtB.getText().toString());
        int c = a/b;
        Toast.makeText(MainActivity.this,"Chia của a và b="+c,Toast.LENGTH_LONG).show();
    }

    private void xuLyPhepNhan() {
        int a=Integer.parseInt(txtA.getText().toString());
        int b = Integer.parseInt(txtB.getText().toString());
        int c = a*b;
        Toast.makeText(MainActivity.this,"Nhân của a và b="+c,Toast.LENGTH_LONG).show();
    }

    private void xuLyPhepTru() {
        int a=Integer.parseInt(txtA.getText().toString());
        int b = Integer.parseInt(txtB.getText().toString());
        int c = a-b;
        Toast.makeText(MainActivity.this,"Trừ là ="+c,Toast.LENGTH_LONG).show();
    }

    private void addControls() {
        txtA= (EditText) findViewById(R.id.txtA); //gán txtA vào txtA trên view cua activity_main
        txtB= (EditText) findViewById(R.id.txtB);// gán txtA vào txtA trên view của activity_man
        btnTru = (Button) findViewById(R.id.btnTru);
        btnNhan = (Button) findViewById(R.id.btnNhan);
        btnChia = (Button) findViewById(R.id.btnChia);
        btnAn = (Button) findViewById(R.id.btnAn);
    }

    public void xuLyPhepCong(View v)
    {
        int a=Integer.parseInt(txtA.getText().toString());
        int b = Integer.parseInt(txtB.getText().toString());
        int c = a +b;
        Toast.makeText(MainActivity.this,"Tổng của a và b="+c,Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onLongClick(View v) {
        if(v.getId()==R.id.btnAn){
            btnAn.setVisibility(v.INVISIBLE);
        }
        return false;
    }

    public void xuLyDoiManHinhKhac(View v)
    {
        Button btnMoi = new Button(MainActivity.this){
            @Override
            public boolean performClick() {
                setContentView(R.layout.activity_main);

                addControls(); //hàm tao ra cac control gan tu view
                addEvents(); // hàm tạo ra các sự kiện, luôn nằm sau addControls()
                return super.performClick();

            }
        };

        btnMoi.setText("Quay về");
        btnMoi.setWidth(200);
        btnMoi.setHeight(200);

        setContentView(btnMoi);
    }
}
