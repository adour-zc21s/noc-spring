package com.adour.noc.controller;

import com.adour.noc.model.Crm;
import com.adour.noc.service.CrmService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 * @author {Open Class Programming}
 * Abdur Rahman Wahid - X-Sari
 * +62 813 8522 9903
 * Created 08/06/2026 - 16:41
 */
@RestController
@AllArgsConstructor
@RequestMapping("/api/crm/v1")
public class CrmController {
    private CrmService crmService;
    // http://localhost8081/api/crm/v1
    @GetMapping
    public ResponseEntity<List<Crm>> cariSemua(){
        // Cari ke data ke db
        List<Crm> listCrm = crmService.cariSemua();
        // Response hasil pencarian
        return new ResponseEntity<>(listCrm, HttpStatus.OK);
    }
}
