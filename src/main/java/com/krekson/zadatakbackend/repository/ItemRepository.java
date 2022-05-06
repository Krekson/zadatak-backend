package com.krekson.zadatakbackend.repository;

import com.krekson.zadatakbackend.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
    Item findItemById(Integer id);

    @Query(value = "select * from item where name = ?1", nativeQuery = true)
    Item findItemByName(String name);
}
