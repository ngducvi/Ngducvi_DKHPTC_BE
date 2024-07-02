package com.example.dkhpbackend.service.impl;

import com.example.dkhpbackend.DTO.LoginDTO;
import com.example.dkhpbackend.DTO.NhanVienDTO;
import com.example.dkhpbackend.entity.NhanVien;
import com.example.dkhpbackend.payload.response.LoginResponse;
import com.example.dkhpbackend.repository.NhanVienRepository;
import com.example.dkhpbackend.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NhanVienIMPL implements NhanVienService {
    @Autowired
    private NhanVienRepository nhanVienRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String addNhanVien(NhanVienDTO nhanVienDTO) {
        NhanVien nhanVien = new NhanVien(
                nhanVienDTO.getMaNhanVien(),
                this.passwordEncoder.encode(nhanVienDTO.getPasswordnv()),
                nhanVienDTO.getHoTen(),
                nhanVienDTO.getNgaySinh(),
                nhanVienDTO.getDiaChi()
        );
        nhanVienRepo.save(nhanVien);
        return nhanVien.getHoTen();
    }

    @Override
    public LoginResponse loginNhanVien(LoginDTO loginDTO) {
        NhanVien nhanVien = nhanVienRepo.findByMaNhanVien(loginDTO.getMaNhanVien());
        if (nhanVien != null) {
            String password = loginDTO.getPasswordnv();
            String encodedPassword = nhanVien.getPasswordnv();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<NhanVien> optionalNhanVien = nhanVienRepo.findOneByMaNhanVienAndPasswordnv(loginDTO.getMaNhanVien(), encodedPassword);
                if (optionalNhanVien.isPresent()) {
                    return new LoginResponse("Login Success", true);
                } else {
                    return new LoginResponse("Login Failed", false);
                }
            } else {
                return new LoginResponse("Password Not Match", false);
            }
        } else {
            return new LoginResponse("Username not exists", false);
        }
    }

    @Override
    public List<NhanVien> getAll() {
        return nhanVienRepo.findAll();
    }

    @Override
    public NhanVien getNhanVienByMaNhanVien(String maNhanVien) {
        return nhanVienRepo.findById(maNhanVien)
                .orElseThrow(()-> new RuntimeException("Nhan vien not found"));
    }
}
