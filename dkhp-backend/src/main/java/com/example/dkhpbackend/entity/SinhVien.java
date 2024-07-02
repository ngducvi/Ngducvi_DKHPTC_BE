package com.example.dkhpbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "SinhVien")
public class SinhVien {
    @Id
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

    @ManyToOne
    @JoinColumn(name = "maChuyenNganh")
    private ChuyenNganh chuyenNganh;


    @ManyToOne
    @JoinColumn(name = "maTrangThai")
    private TrangThaiHocTap trangThaiHocTap;

    @ManyToOne
    @JoinColumn(name = "maTonGiao")
    private TonGiao tonGiao;

    @ManyToOne
    @JoinColumn(name = "maDanToc")
    private DanToc danToc;

    public SinhVien(String maSinhVien, String hoTen, String gmail, String passwordsv, String hoKhauThuongTru, String maKhuVuc, String soCCCD, String soDienThoai, Date ngaySinh, String diaChi, String gioiTinh, String bacDaoTao, String lopHoc, String loaiHinhDaoTao) {
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
    }
}
