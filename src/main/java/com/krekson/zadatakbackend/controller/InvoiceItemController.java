package com.krekson.zadatakbackend.controller;

import com.krekson.zadatakbackend.entity.Invoice;
import com.krekson.zadatakbackend.entity.InvoiceItem;
import com.krekson.zadatakbackend.service.InvoiceItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/invoice_item")
public class InvoiceItemController {
    private final InvoiceItemService invoiceItemService;

    public InvoiceItemController(InvoiceItemService invoiceItemService) {
        this.invoiceItemService = invoiceItemService;
    }

    @PostMapping("/create")
    public ResponseEntity<InvoiceItem> createEntity(@RequestBody InvoiceItem invoiceItem) {
        return new ResponseEntity<>(invoiceItemService.createInvoiceItem(invoiceItem), HttpStatus.CREATED);
    }

    @GetMapping("/read/{invoiceId}")
    public ResponseEntity<List<InvoiceItem>> readInvoiceItems(@PathVariable("invoiceId") Integer invoiceId) {
        return new ResponseEntity<>(invoiceItemService.readInvoiceItems(invoiceId), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Invoice> deleteInvoiceItem(@PathVariable("id") Integer id) {
        invoiceItemService.deleteInvoiceItem(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/deleteAll/{invoiceId}")
    public ResponseEntity<Invoice> deleteAllInvoiceItems(@PathVariable("invoiceId") Integer invoiceId) {
        invoiceItemService.deleteAllInvoiceItems(invoiceId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
