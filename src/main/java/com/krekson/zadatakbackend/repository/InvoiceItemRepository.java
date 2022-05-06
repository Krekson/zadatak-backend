package com.krekson.zadatakbackend.repository;

import com.krekson.zadatakbackend.entity.InvoiceItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceItemRepository extends JpaRepository<InvoiceItem, Integer> {
    void deleteInvoiceItemById(Integer id);

    @Query(value = "select max(id) from invoice_item", nativeQuery = true)
    public Integer findMaxId();

    @Query(value = "select * from invoice_item where invoice_id = ?1", nativeQuery = true)
    public List<InvoiceItem> findAllInvoiceItems(Integer invoiceId);

    @Modifying
    @Query(value = "delete from invoice_item where invoice_id = ?1", nativeQuery = true)
    public void deleteAllInvoiceItems(Integer invoiceId);
}
