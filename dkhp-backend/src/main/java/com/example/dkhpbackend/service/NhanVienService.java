package com.example.dkhpbackend.service;

import com.example.dkhpbackend.DTO.LoginDTO;
import com.example.dkhpbackend.DTO.NhanVienDTO;
import com.example.dkhpbackend.entity.NhanVien;
import com.example.dkhpbackend.entity.SinhVien;
import com.example.dkhpbackend.payload.response.LoginResponse;

import java.util.List;

public interface NhanVienService {
    String addNhanVien(NhanVienDTO nhanVienDTO);
    LoginResponse loginNhanVien(LoginDTO loginDTO);
    List<NhanVien> getAll();
    NhanVien getNhanVienByMaNhanVien(String maNhanVien);
}
