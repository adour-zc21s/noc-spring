package com.adour.noc.model;

import jakarta.persistence.*;
import lombok.Data;

/*
 * @author {Open Class Programming}
 * Abdur Rahman Wahid - X-Sari
 * +62 813 8522 9903
 * Created 08/06/2026 - 16:22
 */
@Data
@Entity
@Table(name = "crms")
public class Crm {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String title;
    @Column
    private String name;
    @Column
    private String hp;
    @Column
    private String typeKendaraan;
    @Column
    private String address;
}
