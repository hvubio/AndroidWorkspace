package com.itinhand.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

import com.itinhand.hocspinner.R;
import com.itinhand.model.NhanVien;

import java.util.List;

/**
 * Created by evilmoon on 28/07/16.
 */
public class NhanVienAdapter extends ArrayAdapter<NhanVien> {

    Activity context;
    int resource;
    List<NhanVien> objects;

    public NhanVienAdapter(Activity context, int resource, List<NhanVien> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.objects=objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=this.context.getLayoutInflater();
        View row=inflater.inflate(this.resource,null);

        TextView txtTenNhanVien= (TextView) row.findViewById(R.id.txtTenNhanVien);
        TextView txtThuBatDauCT= (TextView) row.findViewById(R.id.txtThuBatDauCT);
        TextView txtSoNgayCT= (TextView) row.findViewById(R.id.txtSoNgayCT);

        NhanVien nhanVien=this.objects.get(position);
        txtTenNhanVien.setText(nhanVien.getTenNhanVien());
        txtThuBatDauCT.setText(nhanVien.getThuBatDauCongTac());
        txtSoNgayCT.setText(String.valueOf(nhanVien.getSoNgayCongTacDuKien()));

        return row;
    }
}
