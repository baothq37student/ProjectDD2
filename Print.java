package com.example.doannhom.DataModels;


import java.io.Serializable;

public class Print implements Serializable {
    private  String sanpham;
    private  String khachhang;
    private  String hoten;
    private String diachi;
    private int hinh;

    private String tensanpham;
    private int giasanpham;
    private String ngaysanpham;

    public Print() {
    }

    public Print(String sanpham, String khachhang, String hoten, String diachi, int hinh, String tensanpham, int giasanpham, String ngaysanpham) {
        this.sanpham = sanpham;
        this.khachhang = khachhang;
        this.hoten = hoten;
        this.diachi = diachi;
        this.hinh = hinh;
        this.tensanpham = tensanpham;
        this.giasanpham = giasanpham;
        this.ngaysanpham = ngaysanpham;
    }

    public String getSanpham() {
        return sanpham;
    }

    public void setSanpham(String sanpham) {
        this.sanpham = sanpham;
    }

    public String getKhachhang() {
        return khachhang;
    }

    public void setKhachhang(String khachhang) {
        this.khachhang = khachhang;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public String getTensanpham() {
        return tensanpham;
    }

    public void setTensanpham(String tensanpham) {
        this.tensanpham = tensanpham;
    }

    public int getGiasanpham() {
        return giasanpham;
    }

    public void setGiasanpham(int giasanpham) {
        this.giasanpham = giasanpham;
    }

    public String getNgaysanpham() {
        return ngaysanpham;
    }

    public void setNgaysanpham(String ngaysanpham) {
        this.ngaysanpham = ngaysanpham;
    }
}
