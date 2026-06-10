package com.adour.noc.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * @author {Open Class Programming}
 * Abdur Rahman Wahid - X-Sari
 * +62 813 8522 9903
 * Created 08/06/2026 - 16:22
 */
@Data
@Entity
@Table(name = "crms")
@NoArgsConstructor
@AllArgsConstructor
public class Crm {
    @Id
    // GenerationType.IDENTITY is autoincrement
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String title;
    @Column
    private String name;
    @Column
    private String hp;
    @Column
    private String type_kendaraan;
    @Column
    private String address;
}
