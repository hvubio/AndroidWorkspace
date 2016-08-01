package com.itinhand.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.itinhand.model.TyGia;
import com.itinhand.tygiahoidoai2.R;

import java.util.List;

/**
 * Created by evilmoon on 28/07/16.
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

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=this.context.getLayoutInflater();
        View row=inflater.inflate(this.resource,null);

        TextView maNuoc= (TextView) row.findViewById(R.id.txtManuoc);
        TextView muaTm= (TextView) row.findViewById(R.id.txtMuatm);
        TextView banTm= (TextView) row.findViewById(R.id.txtBantm);
        TextView muaCk= (TextView) row.findViewById(R.id.txtMuack);
        TextView banCk= (TextView) row.findViewById(R.id.txtBanck);
        ImageView imgHinhnuoc= (ImageView) row.findViewById(R.id.imgHinhnuoc);

        TyGia tyGia=this.objects.get(position);
        maNuoc.setText(tyGia.getMaNuoc());
        muaTm.setText(Integer.toString(tyGia.getMuaTM()));
        banTm.setText(String.valueOf(tyGia.getBanTM()));
        muaCk.setText(String.valueOf(tyGia.getMuaCK()));
        banCk.setText(String.valueOf(tyGia.getBanCK()));
        imgHinhnuoc.setImageResource(tyGia.getHinhNuoc());


        return row;
    }
}
