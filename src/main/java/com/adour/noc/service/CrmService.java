package com.adour.noc.service;

import com.adour.noc.model.Crm;
import com.adour.noc.model.CrmDTO;

import java.util.List;

/*
 * @author {Open Class Programming}
 * Abdur Rahman Wahid - X-Sari
 * +62 813 8522 9903
 * Created 08/06/2026 - 16:29
 */
public interface CrmService {
    CrmDTO createCrm(CrmDTO crmDTO);
    CrmDTO getCrmById(Integer id);
    List<CrmDTO> cariSemua();
    CrmDTO updateCrm(Integer id, CrmDTO updateCrmDto);
    void hapusCrmById(Integer id);




}
