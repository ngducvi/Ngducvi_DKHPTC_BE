package com.example.dkhpbackend.service;

import com.example.dkhpbackend.entity.LopHocPhanDaDangKy;

public interface EmailService {
    void sendEmail(String toEmail, String subject, String content);
}
