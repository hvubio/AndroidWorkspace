package com.itinhand.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.itinhand.model.TyGia;
import com.itinhand.tygiahoidoai.R;

import java.util.List;

/**
 * Created by evilmoon on 27/07/16.
 */
public class TyGiaAdapter extends ArrayAdapter<TyGia> {

    Activity context;
    int resource;
    List<TyGia> objects;

    public TyGiaAdapter(Activity context, int resource, List<TyGia> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.objects=objects;
    }
    // hiệu chỉnh giao diện hiện thị

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=this.context.getLayoutInflater();
        View row=inflater.inflate(this.resource,null);

        TextView txtBanTM= (TextView) row.findViewById(R.id.txtBanTM);
        TextView txtMuaTM= (TextView) row.findViewById(R.id.txtMuaTM);
        TextView txtBanCK= (TextView) row.findViewById(R.id.txtBanCK);
        TextView txtMuaCK= (TextView) row.findViewById(R.id.txtMuaCK);
        TextView txtManuoc= (TextView) row.findViewById(R.id.txtManuoc);
        ImageView imgHinhnuoc= (ImageView) row.findViewById(R.id.imgHinhnuoc);

        // bắt đầu gán từ đối tượng lên màn hình
        //vị trì con trỏ đầu tiên
        TyGia tyGia=this.objects.get(position);
        txtMuaTM.setText(String.valueOf(tyGia.getMuaTM()));
        txtBanTM.setText(String.valueOf(tyGia.getBanTM()));
        txtMuaCK.setText(String.valueOf(tyGia.getMuaCK()));
        txtBanCK.setText(String.valueOf(tyGia.getBanCK()));
        txtManuoc.setText(String.valueOf(tyGia.getMaNuoc()));

       imgHinhnuoc.setImageResource(tyGia.getHinhNuoc());

        return row;
    }
}
