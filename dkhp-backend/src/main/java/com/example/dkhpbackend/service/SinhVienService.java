package com.example.dkhpbackend.service;

import com.example.dkhpbackend.DTO.LoginDTO;
import com.example.dkhpbackend.DTO.LoginSVDTO;
import com.example.dkhpbackend.DTO.SinhVienDTO;
import com.example.dkhpbackend.entity.SinhVien;
import com.example.dkhpbackend.payload.response.LoginResponse;

import java.util.List;

public interface SinhVienService {
    public List<SinhVien> getAllSinhVien();
    SinhVien addSinhVien(SinhVien sinhVien);
    SinhVien updateSinhVien(String maSinhVien,SinhVien sinhVien);
    void deleteSinhVien(String maSinhVien);
    SinhVien getSinhVienByMaSinhVien(String maSinhVien);
    //
    String addSinhVien(SinhVienDTO sinhVienDTO);
    LoginResponse loginSinhVien(LoginSVDTO loginSVDTO);


}
