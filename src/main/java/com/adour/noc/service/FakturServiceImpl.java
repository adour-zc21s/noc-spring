package com.adour.noc.service;

import com.adour.noc.model.FakturKendaraan;
import com.adour.noc.repository.FakturKendaraanRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * @author {Open Class Programming}
 * Abdur Rahman Wahid - X-Sari
 * +62 813 8522 9903
 * Created 05/06/2026 - 8:50
 */
@Service
@AllArgsConstructor
public class FakturServiceImpl implements FakturKendaraanService{

    private final FakturKendaraanRepository fakturKendaraanRepository;

    @Override
    public List<FakturKendaraan> findAll() {
        return fakturKendaraanRepository.findAll();
    }

    @Override
    public FakturKendaraan createFaktur(FakturKendaraan faktur) {
        return fakturKendaraanRepository.save(faktur);
    }

    @Override
    public FakturKendaraan update(FakturKendaraan faktur) {
        FakturKendaraan existingFaktur = fakturKendaraanRepository.findById(faktur.getId()).get();
        existingFaktur.setCabang(faktur.getCabang());
        existingFaktur.setNama(faktur.getNama());
        existingFaktur.setAddress(faktur.getAddress());
        return fakturKendaraanRepository.save(existingFaktur);
    }

    @Override
    public void deleteKendaraanById(Integer id) {
        fakturKendaraanRepository.deleteById(id);
    }
}
