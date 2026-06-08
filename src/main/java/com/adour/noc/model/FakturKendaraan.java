package com.adour.noc.model;

import jakarta.persistence.*;
import lombok.Data;

/*
 * @author {Open Class Programming}
 * Abdur Rahman Wahid - X-Sari
 * +62 813 8522 9903
 * Created 04/06/2026 - 17:17
 */
@Data
@Entity
@Table(name = "faktur_kendaraans")
public class FakturKendaraan {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    @Column
    private String cabang;
    @Column
    private String nama;
    @Column
    private String address;

}
