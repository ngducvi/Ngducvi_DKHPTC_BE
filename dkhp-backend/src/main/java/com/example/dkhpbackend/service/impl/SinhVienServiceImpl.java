package com.example.dkhpbackend.service.impl;

import com.example.dkhpbackend.DTO.LoginDTO;
import com.example.dkhpbackend.DTO.LoginSVDTO;
import com.example.dkhpbackend.DTO.SinhVienDTO;
import com.example.dkhpbackend.entity.SinhVien;
import com.example.dkhpbackend.payload.response.LoginResponse;
import com.example.dkhpbackend.repository.SinhVienRepository;
import com.example.dkhpbackend.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SinhVienServiceImpl implements SinhVienService {
    @Autowired
    private SinhVienRepository sinhVienRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public List<SinhVien> getAllSinhVien() {
        return sinhVienRepository.findAll();
    }

    @Override
    public SinhVien addSinhVien(SinhVien sinhVien) {
        return sinhVienRepository.save(sinhVien);
    }

    @Override
    public SinhVien updateSinhVien(String maSinhVien, SinhVien sinhVien) {
        SinhVien existingSinhVien = sinhVienRepository.findById(maSinhVien)
                .orElseThrow(() -> new RuntimeException("SinhVien not found"));

        // Cập nhật thông tin sinh viên
        existingSinhVien.setHoTen(sinhVien.getHoTen());
        existingSinhVien.setGmail(sinhVien.getGmail());
        // Cập nhật các trường khác

        return sinhVienRepository.save(existingSinhVien);
    }

    @Override
    public void deleteSinhVien(String maSinhVien) {
        sinhVienRepository.deleteById(maSinhVien);

    }

    @Override
    public SinhVien getSinhVienByMaSinhVien(String maSinhVien) {
        return sinhVienRepository.findById(maSinhVien)
                .orElseThrow(() -> new RuntimeException("SinhVien not found"));
    }

    @Override
    public String addSinhVien(SinhVienDTO sinhVienDTO) {
        SinhVien sinhVien = new SinhVien(
                sinhVienDTO.getMaSinhVien(),
                sinhVienDTO.getHoTen(),
                sinhVienDTO.getGmail(),
                this.passwordEncoder.encode(sinhVienDTO.getPasswordsv()),
                sinhVienDTO.getHoKhauThuongTru(),
                sinhVienDTO.getMaKhuVuc(),
                sinhVienDTO.getSoCCCD(),
                sinhVienDTO.getSoDienThoai(),
                sinhVienDTO.getNgaySinh(),
                sinhVienDTO.getDiaChi(),
                sinhVienDTO.getGioiTinh(),
                sinhVienDTO.getBacDaoTao(),
                sinhVienDTO.getLopHoc(),
                sinhVienDTO.getLoaiHinhDaoTao()
        );
        sinhVienRepository.save(sinhVien);
        return sinhVien.getHoTen();
    }

    @Override
    public LoginResponse loginSinhVien(LoginSVDTO loginSVDTO) {
        SinhVien sinhVien = sinhVienRepository.findByMaSinhVien(loginSVDTO.getMaSinhVien());
        if (sinhVien != null) {
            String password = loginSVDTO.getPasswordsv();
            String encodedPassword = sinhVien.getPasswordsv();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<SinhVien> optionalSinhVien = sinhVienRepository.findOneByMaSinhVienAndPasswordsv(loginSVDTO.getMaSinhVien(), encodedPassword);
                if (optionalSinhVien.isPresent()) {
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


}

