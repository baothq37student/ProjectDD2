package com.example.doannhom.Apdapter;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.doannhom.DataModels.Print;
import com.example.doannhom.R;

import java.util.ArrayList;

public class DonHangActivity extends ArrayAdapter<Print> {
    Context context;
    int resource;
    ArrayList<Print> dsdonhang;
    int index = -1;

    public int getIndex() {
        return index;
    }

    public DonHangActivity(Context context, int resource, ArrayList<Print> dsdonhang) {
        super(context, resource, dsdonhang);
        this.context = context;
        this.resource = resource;
        this.dsdonhang = dsdonhang;
    }

    @Override
    public int getCount() {
        return dsdonhang.size();
    }

    @Override
    public Print getItem(int index) {
        return super.getItem(index);
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.donhang_activity, parent, false);

        TextView tvTensanpham = convertView.findViewById(R.id.tvTensanpham);
        TextView tvGiasanpham = convertView.findViewById(R.id.tvGiasanpham);
        TextView tvNgaysanpham = convertView.findViewById(R.id.tvNgay);
        ImageView imghinhanh = convertView.findViewById(R.id.imghinhanh);
        ImageButton btnxoa = convertView.findViewById(R.id.imgbtnxoa);
        Button btnThoat = convertView.findViewById(R.id.btnthoat);
        ImageButton btnedit = convertView.findViewById(R.id.imgbtnchinhsua);


        final Print infor = dsdonhang.get(position);

        tvTensanpham.setText("TenSP: "+infor.getTensanpham());
        tvGiasanpham.setText("GiaSP: "+infor.getGiasanpham()+"");
        tvNgaysanpham.setText("Ngay: "+infor.getNgaysanpham());
        String khachhang = infor.getKhachhang();

        btnxoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dsdonhang.remove(position);
                notifyDataSetChanged();
            }
        });

        btnedit.setOnClickListener(new View.OnClickListener() {
            Print infor = dsdonhang.get(position);
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ChinhSuaKhachHangActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("TenSP", infor.getTensanpham());
                bundle.putString("Gia", String.valueOf(infor.getGiasanpham()));
                bundle.putString("Ngay", infor.getNgaysanpham());
                intent.putExtras(bundle);
                context.startActivity(intent);
            }
        });
        return convertView;
    }
}