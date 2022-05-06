package com.krekson.zadatakbackend.repository;

import com.krekson.zadatakbackend.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {
    Invoice findInvoiceById(Integer id);
    void deleteInvoiceById(Integer id);

    @Query(value = "select max(id) from invoice", nativeQuery = true)
    public Integer findMaxId();
}
