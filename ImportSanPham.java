package com.example.doannhom.DataModels;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.doannhom.Apdapter.KhachHangApdapter;
import com.example.doannhom.R;

import java.util.ArrayList;

public class ImportSanPham extends Activity implements SensorEventListener {

    ListView dsketqua;
    Button btnthem,btnThoat;

    KhachHangApdapter danhsachadapter;
    Spinner spnSanpham , spnKhachang ;

    ArrayList<Print> dssp;
    EditText edtHotenKH,edtDiachi;
    ArrayList <String> sanpham;
    ArrayAdapter<String> adaptermasanpham;
    ArrayList <String> khachhang;
    ArrayAdapter<String> adaptermakhachhang;


    private SensorManager sensorManager;
    Sensor sensor;
    boolean flag = true ;
    int index = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quanlykhachhang);
        setControll();
        setEvent();
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(sensor.TYPE_PROXIMITY);
        sensorManager.registerListener(this, sensor, sensorManager.SENSOR_DELAY_NORMAL);

    }
    private void setControll() {
        dsketqua = findViewById(R.id.listketqua);
        btnthem = findViewById(R.id.btnthem);
        btnThoat = findViewById(R.id.btnthoat);

        spnSanpham = findViewById(R.id.spinersanpham);//
        spnKhachang = findViewById(R.id.spinerkhachhang);//
        edtHotenKH = findViewById(R.id.edtHotenKh);
        edtDiachi = findViewById(R.id.edtDiachi);

    }
    private void setEvent() {
        khoitao();
        dssp = new ArrayList<>();
        danhsachadapter = new KhachHangApdapter(this,R.layout.khachhang_apdapter,dssp);
        dsketqua.setAdapter(danhsachadapter);
        btnthem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Print infor = new Print();
                String sanpham = spnSanpham.getSelectedItem().toString();
                String khachhang = spnKhachang.getSelectedItem().toString();
                String hoten = edtHotenKH.getText().toString();
                String diachi = edtDiachi.getText().toString();

                infor.setSanpham(sanpham);
                infor.setKhachhang(khachhang);
                infor.setHoten(hoten);
                infor.setDiachi(diachi);
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
        sanpham = new ArrayList<>();
        khachhang = new ArrayList<>();
        khachhang.add("KH01");
        khachhang.add("KH02");
        khachhang.add("KH03");
        khachhang.add("KH04");
        khachhang.add("KH05");
        adaptermakhachhang = new ArrayAdapter<>(this ,android.R.layout.simple_list_item_1,khachhang);
        spnKhachang.setAdapter(adaptermakhachhang);
        sanpham.add("SP01");
        sanpham.add("SP02");
        sanpham.add("SP03");
        sanpham.add("SP04");
        sanpham.add("SP05");
        adaptermasanpham= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,sanpham);
        spnSanpham.setAdapter(adaptermasanpham);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        if (event.values[0] < sensor.getMaximumRange()){
            getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
        }else
        {
            getWindow().getDecorView().setBackgroundColor(Color.GREEN);
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
