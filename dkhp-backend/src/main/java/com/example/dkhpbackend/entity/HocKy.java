package com.example.dkhpbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "HocKy")
public class HocKy {
    @Id
    private String maHocKy;

    private String tenHocKy;
    @ManyToOne
    @JoinColumn(name = "maNamHoc")
    private NamHoc namHoc;

}
