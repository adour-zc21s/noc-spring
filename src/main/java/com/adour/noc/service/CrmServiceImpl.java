package com.adour.noc.service;

import com.adour.noc.model.Crm;
import com.adour.noc.repository.CrmRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * @author {Open Class Programming}
 * Abdur Rahman Wahid - X-Sari
 * +62 813 8522 9903
 * Created 08/06/2026 - 16:32
 */
@Service
@AllArgsConstructor
public class CrmServiceImpl implements CrmService{
    private final CrmRepository crmRepository;
    @Override
    public List<Crm> cariSemua() {
        return crmRepository.findAll();
    }

    @Override
    public Crm createCrm(Crm crm) {
        return crmRepository.save(crm);
    }

    @Override
    public Crm updateCrm(Crm crm) {
        Crm existingCrm = crmRepository.findById(crm.getId()).get();
        existingCrm.setName(crm.getName());
        existingCrm.setHp(crm.getHp());
        existingCrm.setAddress(crm.getAddress());
        return crmRepository.save(existingCrm);
    }

    @Override
    public void hapusCrmById(Integer id) {
        crmRepository.deleteById(id);
    }
}
