//package com.example.dkhpbackend.service.impl;
//
//import com.example.dkhpbackend.service.EmailService;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.stereotype.Service;
//
//@Service
//public class EmailServiceImpl implements EmailService {
//
//    private final JavaMailSender javaMailSender;
//
//    public EmailServiceImpl(JavaMailSender javaMailSender) {
//        this.javaMailSender = javaMailSender;
//    }
//
//    @Override
//    public void sendEmail(String toEmail, String subject, String content) {
//        SimpleMailMessage message = new SimpleMailMessage();
//        message.setTo(toEmail);
//        message.setSubject(subject);
//        message.setText(content);
//        javaMailSender.send(message);
//    }
//}
