package com.adour.noc.service;

import com.adour.noc.model.FakturKendaraan;

import java.util.List;

/*
 * @author {Open Class Programming}
 * Abdur Rahman Wahid - X-Sari
 * +62 813 8522 9903
 * Created 05/06/2026 - 8:46
 */
public interface FakturKendaraanService {
    List<FakturKendaraan> findAll();
    FakturKendaraan createFaktur(FakturKendaraan faktur);
    FakturKendaraan update(FakturKendaraan faktur);
    void deleteKendaraanById(Integer id);
}
