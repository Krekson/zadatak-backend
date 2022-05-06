package com.krekson.zadatakbackend.service;

import com.krekson.zadatakbackend.entity.InvoiceItem;
import com.krekson.zadatakbackend.repository.InvoiceItemRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class InvoiceItemService {
    private final InvoiceItemRepository invoiceItemRepository;
    private final ItemService itemService;

    public InvoiceItemService(InvoiceItemRepository invoiceItemRepository, ItemService itemService) {
        this.invoiceItemRepository = invoiceItemRepository;
        this.itemService = itemService;
    }

    @Transactional
    public InvoiceItem createInvoiceItem(InvoiceItem invoiceItem) {
        /*Item item;
        try {
            item = itemService.readItem(invoiceItem.getItemId());
        } catch (Exception ignored) {}*/
        invoiceItem.setId(null == invoiceItemRepository.findMaxId()? 1 : invoiceItemRepository.findMaxId() + 1);
        return invoiceItemRepository.save(invoiceItem);
    }

    public List<InvoiceItem> readInvoiceItems(Integer invoiceId) {
        return invoiceItemRepository.findAllInvoiceItems(invoiceId);
    }

    @Transactional
    public void deleteInvoiceItem(Integer id) {
        invoiceItemRepository.deleteInvoiceItemById(id);
    }

    @Transactional
    public void deleteAllInvoiceItems(Integer invoiceId) {
        invoiceItemRepository.deleteAllInvoiceItems(invoiceId);
    }
}
