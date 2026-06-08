package com.adour.noc.controller;

import com.adour.noc.model.FakturKendaraan;
import com.adour.noc.service.FakturKendaraanService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
 * @author {Open Class Programming}
 * Abdur Rahman Wahid - X-Sari
 * +62 813 8522 9903
 * Created 05/06/2026 - 9:01..
 */
@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")
public class FakturController {

    private FakturKendaraanService fakturKendaraanService;
    // http://localhost8081/api/v1
    @GetMapping
    public ResponseEntity<List<FakturKendaraan>> cariSemua(){
        // Cari ke data ke db
        List<FakturKendaraan> fakturList = fakturKendaraanService.findAll();
        // Response hasil pencarian
        return new ResponseEntity<>(fakturList, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<FakturKendaraan> simpanFaktur(@RequestBody FakturKendaraan faktur){
        // Save
        FakturKendaraan newFaktur = fakturKendaraanService.createFaktur(faktur);
        // Response data is saved
        return new ResponseEntity<>(newFaktur, HttpStatus.OK);
    }
    @PutMapping("{id}")
    public ResponseEntity<FakturKendaraan> perbarui(@PathVariable("id") Integer fakturId,@RequestBody FakturKendaraan faktur){
        faktur.setId(fakturId);
        FakturKendaraan perbaruiFakturKendaraan = fakturKendaraanService.update(faktur);
        return new ResponseEntity<>(perbaruiFakturKendaraan, HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> hapusFakturById(@PathVariable("id") Integer fakturId){
        // Proses hapus data by id
        fakturKendaraanService.deleteKendaraanById(fakturId);
        // Response data is deleted by id
        return new ResponseEntity<>("Faktur berhasil di hapus",  HttpStatus.OK);
    }

}
