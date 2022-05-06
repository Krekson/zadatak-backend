package com.krekson.zadatakbackend.controller;

import com.krekson.zadatakbackend.entity.Invoice;
import com.krekson.zadatakbackend.service.InvoiceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {
    private final InvoiceService invoiceService;

    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @PostMapping("/create")
    public ResponseEntity<Invoice> createEntity(@RequestBody Invoice invoice) {
        return new ResponseEntity<>(invoiceService.createInvoice(invoice), HttpStatus.CREATED);
    }

    @GetMapping("/read")
    public ResponseEntity<List<Invoice>> readInvoices() {
        return new ResponseEntity<>(invoiceService.readInvoices(), HttpStatus.OK);
    }

    @GetMapping("/read/{id}")
    public ResponseEntity<Invoice> readInvoice(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(invoiceService.readInvoice(id), HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Invoice> updateInvoice(@RequestBody Invoice invoice) {
        return new ResponseEntity<>(invoiceService.updateInvoice(invoice), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Invoice> deleteInvoice(@PathVariable("id") Integer id) {
        invoiceService.deleteInvoice(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
