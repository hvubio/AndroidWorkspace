package com.itinhand.model;

import java.io.Serializable;

/**
 * Created by evilmoon on 28/07/16.
 */
public class NhanVien implements Serializable {

    private int maNhanVien;
    private String tenNhanVien;
    private String thuBatDauCongTac;
    private int soNgayCongTacDuKien;

    public NhanVien() {
    }

    public NhanVien(int maNhanVien, String tenNhanVien,
                    String thuBatDauCongTac, int soNgayCongTacDuKien) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.thuBatDauCongTac = thuBatDauCongTac;
        this.soNgayCongTacDuKien = soNgayCongTacDuKien;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getThuBatDauCongTac() {
        return thuBatDauCongTac;
    }

    public void setThuBatDauCongTac(String thuBatDauCongTac) {
        this.thuBatDauCongTac = thuBatDauCongTac;
    }

    public int getSoNgayCongTacDuKien() {
        return soNgayCongTacDuKien;
    }

    public void setSoNgayCongTacDuKien(int soNgayCongTacDuKien) {
        this.soNgayCongTacDuKien = soNgayCongTacDuKien;
    }

    @Override
    public String toString() {
        return this.tenNhanVien+
                "\n Bắt đầu đi công tác vào thứ "+this.thuBatDauCongTac+
                "\n Số ngày dự kiến công tác là " + this.soNgayCongTacDuKien;
    }
}
