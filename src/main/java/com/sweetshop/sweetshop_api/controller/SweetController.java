package com.sweetshop.sweetshop_api.controller;

import com.sweetshop.sweetshop_api.entity.Sweet;
import com.sweetshop.sweetshop_api.service.SweetService;
import org.springframework.web.bind.annotation.*;
import java.math.BigDecimal;

import java.util.List;

@RestController
@RequestMapping("/api/sweets")
public class SweetController {

    private final SweetService sweetService;

    @GetMapping("/search")
    public List<Sweet> search(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String category,
            @RequestParam(required = false) BigDecimal minPrice,
            @RequestParam(required = false) BigDecimal maxPrice
    ) {
        return sweetService.searchSweets(name, category, minPrice, maxPrice);
    }

    public SweetController(SweetService sweetService) {
        this.sweetService = sweetService;
    }

    @PostMapping
    public Sweet addSweet(@RequestBody Sweet sweet) {
        return sweetService.addSweet(sweet);
    }

    @GetMapping
    public List<Sweet> getAllSweets() {
        return sweetService.getAllSweets();
    }

    @PutMapping("/{id}")
    public Sweet updateSweet(@PathVariable Long id, @RequestBody Sweet sweet) {
        return sweetService.updateSweet(id, sweet);
    }

    @DeleteMapping("/{id}")
    public void deleteSweet(@PathVariable Long id) {
        sweetService.deleteSweet(id);
    }

    @PostMapping("/{id}/purchase")
    public Sweet purchase(@PathVariable Long id) {
        return sweetService.purchaseSweet(id);
    }

    @PostMapping("/{id}/restock")
    public Sweet restock(@PathVariable Long id,
                         @RequestParam int quantity) {
        return sweetService.restockSweet(id, quantity);
    }
}
