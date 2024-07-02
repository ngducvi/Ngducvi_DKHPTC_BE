package com.example.dkhpbackend.controller;

import com.example.dkhpbackend.DTO.LoginDTO;
import com.example.dkhpbackend.DTO.NhanVienDTO;
import com.example.dkhpbackend.entity.NhanVien;
import com.example.dkhpbackend.payload.response.LoginResponse;
import com.example.dkhpbackend.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/nhanvien")
public class NhanVienController {
    @Autowired
    private NhanVienService nhanVienService;

    @PostMapping(path = "/save")
    public String saveNhanVien(@RequestBody NhanVienDTO nhanVienDTO) {
        String id = nhanVienService.addNhanVien(nhanVienDTO);
        return "Hello " + id;
    }

    @PostMapping(path = "/login")
    public ResponseEntity<?> loginNhanVien(@RequestBody LoginDTO loginDTO) {
        LoginResponse loginResponse = nhanVienService.loginNhanVien(loginDTO);
        return ResponseEntity.ok(loginResponse);
    }

    @GetMapping
    public List<NhanVien> getAll() {
        return nhanVienService.getAll();
    }
    @GetMapping("/{maNhanVien}")
    public ResponseEntity<NhanVien> getNhanVienByMaNhanVien(@PathVariable String maNhanVien){
        NhanVien nhanVien = nhanVienService.getNhanVienByMaNhanVien(maNhanVien);
        return ResponseEntity.ok(nhanVien);
    }
}
