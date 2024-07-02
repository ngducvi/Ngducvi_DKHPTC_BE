package com.example.dkhpbackend.DTO;

import java.util.Date;

public class NhanVienDTO {
    private String maNhanVien;
    private String passwordnv;
    private String hoTen;
    private Date ngaySinh;
    private String diaChi;

    // Constructors, getters, and setters
    public NhanVienDTO() {
    }

    public NhanVienDTO(String maNhanVien, String passwordnv, String hoTen, Date ngaySinh, String diaChi) {
        this.maNhanVien = maNhanVien;
        this.passwordnv = passwordnv;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getPasswordnv() {
        return passwordnv;
    }

    public void setPasswordnv(String passwordnv) {
        this.passwordnv = passwordnv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
