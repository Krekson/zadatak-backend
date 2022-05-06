package com.krekson.zadatakbackend.controller;

import com.krekson.zadatakbackend.entity.Partner;
import com.krekson.zadatakbackend.service.PartnerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/partner")
public class PartnerController {
    private final PartnerService partnerService;

    public PartnerController(PartnerService partnerService) {
        this.partnerService = partnerService;
    }

    @GetMapping("/read")
    public ResponseEntity<List<Partner>> readPartners() {
        return new ResponseEntity<>(partnerService.readPartners(), HttpStatus.OK);
    }
}
