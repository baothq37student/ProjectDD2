package com.example.doannhom.DataModels;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;


import com.example.doannhom.Apdapter.DonHangActivity;
import com.example.doannhom.R;

import java.util.ArrayList;

public class ImportDonHang extends AppCompatActivity {
    ListView dsketqua;
    Button btnthem,btnThoat;
    DonHangActivity danhsachadapter;
    EditText edtTensanpham, edtGia, edtNgay;
    ArrayList<Print> dssp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quanlydonhang);
        setControll();
        setEvent();
    }

    private void setControll() {
        dsketqua = findViewById(R.id.listketqua);
        btnthem = findViewById(R.id.btnthem);
        btnThoat = findViewById(R.id.btnthoat);

        edtTensanpham = findViewById(R.id.edtTensanpham);//
        edtGia = findViewById(R.id.edtGia);//
        edtNgay = findViewById(R.id.edtNgay);
    }
    private void setEvent(){
        khoitao();
        dssp = new ArrayList<>();
        danhsachadapter = new DonHangActivity(this,R.layout.donhang_activity,dssp);
        dsketqua.setAdapter(danhsachadapter);
        btnthem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Print infor = new Print();
                String tensanpham = edtTensanpham.getText().toString();
                int gia = Integer.parseInt(edtGia.getText().toString());
                String ngay = edtNgay.getText().toString();

                infor.setTensanpham(tensanpham);
                infor.setGiasanpham(gia);
                infor.setNgaysanpham(ngay);
                dssp.add(infor);
                danhsachadapter.notifyDataSetChanged();
            }
        });
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        dsketqua.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),position+"",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void khoitao() {
    }
}