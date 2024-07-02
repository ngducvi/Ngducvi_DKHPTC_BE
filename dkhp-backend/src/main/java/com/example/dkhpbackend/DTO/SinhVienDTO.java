package com.example.dkhpbackend.DTO;

import java.util.Date;

public class SinhVienDTO {
    private String maSinhVien;
    private String hoTen;
    private String gmail;
    private String passwordsv;
    private String hoKhauThuongTru;
    private String maKhuVuc;
    private String soCCCD;
    private String soDienThoai;
    private Date ngaySinh;
    private String diaChi;
    private String gioiTinh;
    private String bacDaoTao;
    private String lopHoc;
    private String loaiHinhDaoTao;
    private String maChuyenNganh;
    private String maTrangThai;
    private String maTonGiao;
    private String maDanToc;

    public SinhVienDTO(String maSinhVien, String hoTen, String gmail, String passwordsv, String hoKhauThuongTru, String maKhuVuc, String soCCCD, String soDienThoai, Date ngaySinh, String diaChi, String gioiTinh, String bacDaoTao, String lopHoc, String loaiHinhDaoTao, String maChuyenNganh, String maTrangThai, String maTonGiao, String maDanToc) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.gmail = gmail;
        this.passwordsv = passwordsv;
        this.hoKhauThuongTru = hoKhauThuongTru;
        this.maKhuVuc = maKhuVuc;
        this.soCCCD = soCCCD;
        this.soDienThoai = soDienThoai;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.bacDaoTao = bacDaoTao;
        this.lopHoc = lopHoc;
        this.loaiHinhDaoTao = loaiHinhDaoTao;
        this.maChuyenNganh = maChuyenNganh;
        this.maTrangThai = maTrangThai;
        this.maTonGiao = maTonGiao;
        this.maDanToc = maDanToc;
    }

    public SinhVienDTO() {
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getPasswordsv() {
        return passwordsv;
    }

    public void setPasswordsv(String passwordsv) {
        this.passwordsv = passwordsv;
    }

    public String getHoKhauThuongTru() {
        return hoKhauThuongTru;
    }

    public void setHoKhauThuongTru(String hoKhauThuongTru) {
        this.hoKhauThuongTru = hoKhauThuongTru;
    }

    public String getMaKhuVuc() {
        return maKhuVuc;
    }

    public void setMaKhuVuc(String maKhuVuc) {
        this.maKhuVuc = maKhuVuc;
    }

    public String getSoCCCD() {
        return soCCCD;
    }

    public void setSoCCCD(String soCCCD) {
        this.soCCCD = soCCCD;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
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

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getBacDaoTao() {
        return bacDaoTao;
    }

    public void setBacDaoTao(String bacDaoTao) {
        this.bacDaoTao = bacDaoTao;
    }

    public String getLopHoc() {
        return lopHoc;
    }

    public void setLopHoc(String lopHoc) {
        this.lopHoc = lopHoc;
    }

    public String getLoaiHinhDaoTao() {
        return loaiHinhDaoTao;
    }

    public void setLoaiHinhDaoTao(String loaiHinhDaoTao) {
        this.loaiHinhDaoTao = loaiHinhDaoTao;
    }

    public String getMaChuyenNganh() {
        return maChuyenNganh;
    }

    public void setMaChuyenNganh(String maChuyenNganh) {
        this.maChuyenNganh = maChuyenNganh;
    }

    public String getMaTrangThai() {
        return maTrangThai;
    }

    public void setMaTrangThai(String maTrangThai) {
        this.maTrangThai = maTrangThai;
    }

    public String getMaTonGiao() {
        return maTonGiao;
    }

    public void setMaTonGiao(String maTonGiao) {
        this.maTonGiao = maTonGiao;
    }

    public String getMaDanToc() {
        return maDanToc;
    }

    public void setMaDanToc(String maDanToc) {
        this.maDanToc = maDanToc;
    }
}
