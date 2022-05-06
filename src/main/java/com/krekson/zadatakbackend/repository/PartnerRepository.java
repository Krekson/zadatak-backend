package com.krekson.zadatakbackend.repository;

import com.krekson.zadatakbackend.entity.Partner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartnerRepository extends JpaRepository<Partner, Integer> {
    Partner findPartnerById(Integer id);
}
