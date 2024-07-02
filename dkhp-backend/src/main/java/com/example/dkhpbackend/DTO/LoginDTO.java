package com.example.dkhpbackend.DTO;

public class LoginDTO {
    private String maNhanVien;
    private String passwordnv;

    // Constructors, getters, and setters
    public LoginDTO() {
    }

    public LoginDTO(String maNhanVien, String passwordnv) {
        this.maNhanVien = maNhanVien;
        this.passwordnv = passwordnv;
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
}
