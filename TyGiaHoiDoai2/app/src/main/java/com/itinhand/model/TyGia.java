package com.itinhand.model;

import java.io.Serializable;

/**
 * Created by evilmoon on 28/07/16.
 */
public class TyGia implements Serializable {

    private int maTyGia;
    private String maNuoc;
    private int banTM;
    private int muaTM;
    private int banCK;
    private int muaCK;
    private int hinhNuoc;

    public TyGia(int maTyGia, String maNuoc, int banTM, int muaTM, int banCK, int muaCK, int hinhNuoc) {
        this.maTyGia = maTyGia;
        this.maNuoc = maNuoc;
        this.banTM = banTM;
        this.muaTM = muaTM;
        this.banCK = banCK;
        this.muaCK = muaCK;
        this.hinhNuoc = hinhNuoc;
    }

    public TyGia() {
    }

    public int getMaTyGia() {
        return maTyGia;
    }

    public void setMaTyGia(int maTyGia) {
        this.maTyGia = maTyGia;
    }

    public String getMaNuoc() {
        return maNuoc;
    }

    public void setMaNuoc(String maNuoc) {
        this.maNuoc = maNuoc;
    }

    public int getBanTM() {
        return banTM;
    }

    public void setBanTM(int banTM) {
        this.banTM = banTM;
    }

    public int getMuaTM() {
        return muaTM;
    }

    public void setMuaTM(int muaTM) {
        this.muaTM = muaTM;
    }

    public int getBanCK() {
        return banCK;
    }

    public void setBanCK(int banCK) {
        this.banCK = banCK;
    }

    public int getMuaCK() {
        return muaCK;
    }

    public void setMuaCK(int muaCK) {
        this.muaCK = muaCK;
    }

    public int getHinhNuoc() {
        return hinhNuoc;
    }

    public void setHinhNuoc(int hinhNuoc) {
        this.hinhNuoc = hinhNuoc;
    }
}
