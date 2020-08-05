package com.example.doannhom.GiaoDien;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.doannhom.DataModels.ImportDonHang;
import com.example.doannhom.DataModels.ImportSanPham;
import com.example.doannhom.DataModels.ImportThongTinDonHang;
import com.example.doannhom.R;

public class MainActivity extends AppCompatActivity {
    Button btnDonHang;
    Button btnThongTin;
    Button btnSanPham;
    Button btnKhacHang;
    ImageView img ;
    AnimationDrawable animationDrawable = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        setControl();
        setEvent();
        img.setBackgroundResource(R.drawable.chuyendongsach);
        animationDrawable = (AnimationDrawable) img.getBackground();
        animationDrawable.start();
    }

    private void setEvent() {
        btnKhacHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ImportSanPham.class);
                startActivity(intent);
            }
        });
        
        btnDonHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ImportDonHang.class);
                startActivity(intent);
            }
        });
        btnThongTin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ImportThongTinDonHang.class);
                startActivity(intent);
            }
        });
    }

    private void setControl() {
        btnKhacHang = findViewById(R.id.btnKhachHang);
        btnDonHang = findViewById(R.id.btnDonHang);
        btnThongTin = findViewById(R.id.btnThongTin);
        btnSanPham = findViewById(R.id.btnSanPham);
        img  = findViewById(R.id.imgviewrundraw);
    }
}