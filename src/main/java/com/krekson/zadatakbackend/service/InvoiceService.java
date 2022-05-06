package com.krekson.zadatakbackend.service;

import com.krekson.zadatakbackend.entity.Invoice;
import com.krekson.zadatakbackend.entity.Partner;
import com.krekson.zadatakbackend.repository.InvoiceRepository;
import com.krekson.zadatakbackend.repository.PartnerRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
public class InvoiceService {
    private final InvoiceRepository invoiceRepository;
    private final PartnerRepository partnerRepository;

    public InvoiceService(InvoiceRepository invoiceRepository, PartnerRepository partnerRepository) {
        this.invoiceRepository = invoiceRepository;
        this.partnerRepository = partnerRepository;
    }

    @Transactional
    public Invoice createInvoice(Invoice invoice) {
        invoice.setId(null == invoiceRepository.findMaxId()? 1 : invoiceRepository.findMaxId() + 1);
        invoice.setTotal((float) 0);
        try {
            Partner partner = partnerRepository.findPartnerById(invoice.getId());
            invoice.setPartnerName(partner.getName());
        } catch (Exception ignored) {}
        return invoiceRepository.save(invoice);
    }

    public List<Invoice> readInvoices() {
        return invoiceRepository.findAll();
    }

    public Invoice readInvoice(Integer id) {
        Invoice invoice = null;
        try {
            invoice = invoiceRepository.findInvoiceById(id);
        } catch (Exception ignored){}
        return invoice;
    }

    @Transactional
    public Invoice updateInvoice(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

    @Transactional
    public void deleteInvoice(Integer id) {
        invoiceRepository.deleteInvoiceById(id);
    }
}
