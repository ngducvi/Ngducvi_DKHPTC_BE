package com.example.dkhpbackend.repository;

import com.example.dkhpbackend.entity.SinhVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SinhVienRepository extends JpaRepository<SinhVien, String> {
    Optional<SinhVien> findOneByMaSinhVienAndPasswordsv(String maSinhVien, String passwordsv);
    SinhVien findByMaSinhVien(String maSinhVien);


}