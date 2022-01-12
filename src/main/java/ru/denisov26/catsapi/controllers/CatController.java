package ru.denisov26.catsapi.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.denisov26.catsapi.dto.CatDto;
import ru.denisov26.catsapi.entity.Cat;
import ru.denisov26.catsapi.services.CatService;

@RestController
@RequestMapping("cats")
@RequiredArgsConstructor
public class CatController {
    private final CatService catService;

    @GetMapping
    public Iterable<Cat> findAll() {
        return catService.getAll();
    }

    @PostMapping
    public Cat save(@RequestBody CatDto catDto) {
        return catService.createCat(catDto);
    }
}
