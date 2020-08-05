package com.example.doannhom.DataModels;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.example.doannhom.R;

public class ImportThongTinDonHang extends Activity {
    TextView txtSP, txtSach, txtGia, txtNSX;
    Button btnthoat;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thongtindonhang);
        setControll();
        setEvent();
    }

    private void setEvent() {
        btnthoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void setControll() {
        txtSP = findViewById(R.id.txtSP);
        txtSach = findViewById(R.id.txtSach);
        txtGia = findViewById(R.id.txtGia);
        txtNSX = findViewById(R.id.txtNSX);

        btnthoat = findViewById(R.id.btnthoat);
    }
}
