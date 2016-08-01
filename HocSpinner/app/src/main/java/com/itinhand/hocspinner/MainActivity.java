package com.itinhand.hocspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import com.itinhand.adapter.NhanVienAdapter;
import com.itinhand.model.NhanVien;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText txtTen, txtsoNgay;
    Button btnXacNhan;

    Spinner spThu;
    ArrayList<String>dsThu;
    ArrayAdapter<String> adapterThu;

    ListView lvBangCongTac;
    ArrayList<NhanVien>dsNhanVien;
    NhanVienAdapter nhanVienAdapter;

    int lastSelect = -1;


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

        spThu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"Bạn đã chọn: ["+dsThu.get(position)+"]",
                        Toast.LENGTH_LONG).show();
                lastSelect=position;

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void xuLyXacNhan() {
        if (lastSelect==-1)
        {
            Toast.makeText(this,"Bạn chưa chọn thứ bắt đầu",Toast.LENGTH_LONG).show();
            return;
        }
        int maNhanVien=+1;
        NhanVien nv = new NhanVien();
        nv.setTenNhanVien(txtTen.getText().toString());
        nv.setThuBatDauCongTac(dsThu.get(lastSelect));
        nv.setSoNgayCongTacDuKien(Integer.valueOf(txtsoNgay.getText().toString()));
        //thêm dữ liệu vào ArrayList dsNhanVien từ biến nv

        /*dsNhanVien.add(new NhanVien(maNhanVien,nv.getTenNhanVien(),nv.getThuBatDauCongTac(),
                nv.getSoNgayCongTacDuKien()));*/
        dsNhanVien.add(nv);
        nhanVienAdapter.notifyDataSetChanged();// cập nhật lại ListView


        txtTen.setText("");
        txtTen.requestFocus();
        //spThu.setSelection(0);
        txtsoNgay.setText("");


        Toast.makeText(MainActivity.this,"Đã cập nhật thành công",Toast.LENGTH_LONG).show();

    }

    private void addControls() {
        txtTen= (EditText) findViewById(R.id.txtTen);
        txtsoNgay = (EditText) findViewById(R.id.txtSoNgay);
        btnXacNhan= (Button) findViewById(R.id.btnXacNhan);

        spThu= (Spinner) findViewById(R.id.spThu);
        dsThu=new ArrayList<>();
        dsThu.add("Thứ 2");
        dsThu.add("Thứ 3");
        dsThu.add("Thứ 4");
        dsThu.add("Thứ 5");
        dsThu.add("Thứ 6");
        dsThu.add("Thứ 7");
        dsThu.add("Chủ nhật");

        adapterThu=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_item,
                dsThu);

        // set them layout khi xổ spinner ra.
        adapterThu.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spThu.setAdapter(adapterThu);

        //khai báo list view, tạo dữ liệu và gán layout riêng
        lvBangCongTac= (ListView) findViewById(R.id.lvBangCongTac);
        dsNhanVien=new ArrayList<>();
        nhanVienAdapter = new NhanVienAdapter(
                MainActivity.this,
                R.layout.lonhanviencongtac,
                dsNhanVien);
        lvBangCongTac.setAdapter(nhanVienAdapter);




    }
}
