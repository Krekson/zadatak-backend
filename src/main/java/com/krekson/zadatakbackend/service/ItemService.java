package com.krekson.zadatakbackend.service;

import com.krekson.zadatakbackend.entity.Item;
import com.krekson.zadatakbackend.repository.ItemRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ItemService {
    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> readItems() {
        return itemRepository.findAll();
    }

    public Item readItem(Integer id) {
        Item item = null;
        try {
            item = itemRepository.findItemById(id);
        } catch (Exception ignored){}
        return item;
    }

    public Item readItemByName(String name) {
        Item item = null;
        try {
            item = itemRepository.findItemByName(name);
        } catch (Exception ignored){}
        return item;
    }
}
