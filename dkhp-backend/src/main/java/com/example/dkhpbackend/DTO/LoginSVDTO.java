package com.example.dkhpbackend.DTO;

public class LoginSVDTO {
    private String maSinhVien;
    private String passwordsv;

    public LoginSVDTO(String maSinhVien, String passwordsv) {
        this.maSinhVien = maSinhVien;
        this.passwordsv = passwordsv;
    }

    public LoginSVDTO() {
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getPasswordsv() {
        return passwordsv;
    }

    public void setPasswordsv(String passwordsv) {
        this.passwordsv = passwordsv;
    }
}
