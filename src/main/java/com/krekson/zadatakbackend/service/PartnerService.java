package com.krekson.zadatakbackend.service;

import com.krekson.zadatakbackend.entity.Partner;
import com.krekson.zadatakbackend.repository.PartnerRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PartnerService {
    private final PartnerRepository partnerRepository;

    public PartnerService(PartnerRepository partnerRepository) {
        this.partnerRepository = partnerRepository;
    }

    public List<Partner> readPartners() {
        return partnerRepository.findAll();
    }

    public Partner readPartner(Integer id) {
        Partner partner = null;
        try {
            partner = partnerRepository.findPartnerById(id);
        } catch (Exception ignored){}
        return partner;
    }
}
