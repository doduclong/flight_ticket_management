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
public class MayBay {
    private String maMB;
    private String tenMB, hangMB;
    private int soGhe;

    public MayBay() {
    }

    public MayBay(String maMB, String tenMB, String hangMB, int soGhe) {
        this.maMB = maMB;
        this.tenMB = tenMB;
        this.hangMB = hangMB;
        this.soGhe = soGhe;
    }

    public String getMaMB() {
        return maMB;
    }

    public void setMaMB(String maMB) {
        this.maMB = maMB;
    }

    public String getTenMB() {
        return tenMB;
    }

    public void setTenMB(String tenMB) {
        this.tenMB = tenMB;
    }

    public String getHangMB() {
        return hangMB;
    }

    public void setHangMB(String hangMB) {
        this.hangMB = hangMB;
    }

    public int getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(int soGhe) {
        this.soGhe = soGhe;
    }

    
    
}
