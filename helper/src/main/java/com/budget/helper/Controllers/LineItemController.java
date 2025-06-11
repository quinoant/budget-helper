package com.budget.helper.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.budget.helper.Entities.LineItem;
import com.budget.helper.Repositiories.LineItemRepository;

import java.util.List;

@RestController
@RequestMapping("/items")
public class LineItemController {

    @Autowired
    private LineItemRepository itemRepository;

    @GetMapping
    public List<LineItem> getAllLineItems() {
        return itemRepository.findAll();
    }

    @GetMapping("/{id}")
    public LineItem get(@PathVariable("id") long id) {
        return itemRepository.getReferenceById(id);
    }

    @PostMapping
    public LineItem createUser(@RequestBody LineItem lineItem) {
        return itemRepository.save(lineItem);
    }
}
