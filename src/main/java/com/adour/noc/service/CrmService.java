package com.adour.noc.service;

import com.adour.noc.model.Crm;

import java.util.List;

/*
 * @author {Open Class Programming}
 * Abdur Rahman Wahid - X-Sari
 * +62 813 8522 9903
 * Created 08/06/2026 - 16:29
 */
public interface CrmService {
    List<Crm> cariSemua();
    Crm createCrm(Crm crm);
    Crm updateCrm(Crm crm);
    void hapusCrmById(Integer id);
}
