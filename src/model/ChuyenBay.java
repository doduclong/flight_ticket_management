/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class ChuyenBay {
    private String maCB,maMB;
    private String diemDi, diemDen;
    private Date ngayBay;
    private String gioBay;

    public ChuyenBay() {
    }

    public ChuyenBay(String maCB, String maMB, String diemDi, String diemDen, Date ngayBay, String gioBay) {
        this.maCB = maCB;
        this.maMB = maMB;
        this.diemDi = diemDi;
        this.diemDen = diemDen;
        this.ngayBay = ngayBay;
        this.gioBay = gioBay;
    }

    public String getMaMB() {
        return maMB;
    }

    public void setMaMB(String maMB) {
        this.maMB = maMB;
    }

    

    public String getMaCB() {
        return maCB;
    }

    public void setMaCB(String maCB) {
        this.maCB = maCB;
    }

    public String getDiemDi() {
        return diemDi;
    }

    public void setDiemDi(String diemDi) {
        this.diemDi = diemDi;
    }

    public String getDiemDen() {
        return diemDen;
    }

    public void setDiemDen(String diemDen) {
        this.diemDen = diemDen;
    }

    public Date getNgayBay() {
        return ngayBay;
    }

    public void setNgayBay(Date ngayBay) {
        this.ngayBay = ngayBay;
    }

    public String getGioBay() {
        return gioBay;
    }

    public void setGioBay(String gioBay) {
        this.gioBay = gioBay;
    }

    
    
    
}
