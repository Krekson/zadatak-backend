package com.krekson.zadatakbackend.controller;

import com.krekson.zadatakbackend.entity.Item;
import com.krekson.zadatakbackend.service.ItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {
    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/read")
    public ResponseEntity<List<Item>> readItems() {
        return new ResponseEntity<>(itemService.readItems(), HttpStatus.OK);
    }

    @GetMapping("/read/{id}")
    public ResponseEntity<Item> readItem(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(itemService.readItem(id), HttpStatus.OK);
    }

    @GetMapping("/find/{name}")
    public ResponseEntity<Item> findItem(@PathVariable("name") String name) {
        return new ResponseEntity<>(itemService.readItemByName(name), HttpStatus.OK);
    }
}
