package com.itinhand.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.itinhand.hoclistviewnangcao.R;
import com.itinhand.model.DanhBa;

import java.util.List;

/**
 * Created by evilmoon on 27/07/16.
 */
public class DanhBaAdapter extends ArrayAdapter<DanhBa> {

    // đối số 1: màn hình sữ dụng layout này (hiện thị giao diện)
    Activity context;
    // đối số 2: layout từng dòng muốn hiện thị ( làm theo ý khách hàng)
    int resource;
    // đối số 3: là nguồn dữ liệu muốn hiện thị.
    List<DanhBa> objects;

    public DanhBaAdapter(Activity context, int resource, List<DanhBa> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.objects=objects;

    }
    // hiệu chinh getView để tạo giao diện cho khách hàng

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // tạo 1 inflater từ LayoutInflater để vẽ từ file xml vào bộ nhớ để sử dụng
        // gán inflater vào màn hình giao diện cần hiện thị

        LayoutInflater inflater=this.context.getLayoutInflater();

        // truyền xml vào biến inflater tạo ra để tiến hành chuyển đổi vào memory

        View row=inflater.inflate(this.resource,null); // this.resourse cần truyền vào item.xml

        // gán các đối tượng cần hiện thị thuộc row(biến tạo của inflater)
        TextView txtTen = (TextView) row.findViewById(R.id.txtTen);
        TextView txtPhone = (TextView) row.findViewById(R.id.txtPhone);
        ImageButton btnCall= (ImageButton) row.findViewById(R.id.btnCall);
        ImageButton btnSms= (ImageButton) row.findViewById(R.id.btnSms);
        ImageButton btnDetail= (ImageButton) row.findViewById(R.id.btnDetail);

        // trả về vị trí danh bạ muốn vẽ len màn hình
        final DanhBa danhBa=this.objects.get(position);
        txtTen.setText(danhBa.getTen());
        txtPhone.setText(danhBa.getPhone());


        btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyXemChiTiet(danhBa);
            }
        });

        return row;
    }

    private void xuLyXemChiTiet(DanhBa danhBa) {
        Toast.makeText(this.context,"Bạn chọn:["+danhBa.getTen()+"]",Toast.LENGTH_LONG).show();
    }
}
