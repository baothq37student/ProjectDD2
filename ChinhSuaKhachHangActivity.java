package com.example.doannhom.Apdapter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import com.example.doannhom.R;

public class ChinhSuaKhachHangActivity extends Activity {
    EditText edtKhachhang ,edtSanpham,edtHotenKh,edtDiachi;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chinhsuakhachhang_activity);
        setControll();
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        edtKhachhang.setText("MaKH : "+bundle.getString("KH"));
        edtSanpham.setText("MaSP: "+bundle.getString("SP"));
        edtHotenKh.setText("Họ Tên : "+bundle.getString("HoTen"));
        edtDiachi.setText("Địa Chỉ : "+bundle.getString("DiaChi")+"");
        setEvent();
    }
    private void setEvent() {
    }

    private void setControll() {
    }
}
