/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class Ve {
    private String maVe,maCB,maKH,maNV;
    private String loaiGhe, loaiVe;
    private int giaVe;

    public Ve() {
    }

    public Ve(String maVe, String maCB, String maKH, String maNV, String loaiVe, int giaVe, String loaiGhe) {
        this.maVe = maVe;
        this.maCB = maCB;
        this.maKH = maKH;
        this.maNV = maNV;
        this.loaiGhe = loaiGhe;
        this.loaiVe = loaiVe;
        this.giaVe = giaVe;
    }

   

    public String getMaVe() {
        return maVe;
    }

    public void setMaVe(String maVe) {
        this.maVe = maVe;
    }

    public String getLoaiGhe() {
        return loaiGhe;
    }

    public void setLoaiGhe(String loaiGhe) {
        this.loaiGhe = loaiGhe;
    }

    public String getLoaiVe() {
        return loaiVe;
    }

    public void setLoaiVe(String loaiVe) {
        this.loaiVe = loaiVe;
    }

    public int getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(int giaVe) {
        this.giaVe = giaVe;
    }

    public String getMaCB() {
        return maCB;
    }

    public void setMaCB(String maCB) {
        this.maCB = maCB;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    
    
    
}
