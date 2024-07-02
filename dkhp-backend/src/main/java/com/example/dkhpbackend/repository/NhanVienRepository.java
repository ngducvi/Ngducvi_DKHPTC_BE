package com.example.dkhpbackend.repository;

import com.example.dkhpbackend.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@EnableJpaRepositories
public interface NhanVienRepository extends JpaRepository<NhanVien, String> {
    Optional<NhanVien> findOneByMaNhanVienAndPasswordnv(String maNhanVien, String passwordnv);
    NhanVien findByMaNhanVien(String maNhanVien);
}
