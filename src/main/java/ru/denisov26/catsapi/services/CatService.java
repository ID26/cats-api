package ru.denisov26.catsapi.services;

import lombok.RequiredArgsConstructor;
import org.hibernate.id.UUIDGenerator;
import org.springframework.stereotype.Service;
import ru.denisov26.catsapi.dto.CatDto;
import ru.denisov26.catsapi.entity.Cat;
import ru.denisov26.catsapi.repository.CatRepository;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CatService {
    private final CatRepository catRepository;

    public Cat createCat(CatDto catDto) {
        Cat cat = new Cat()
                .setId(UUID.randomUUID().toString())
                .setName(catDto.getName())
                .setBirthDay(catDto.getBirthDay())
                .setCreatedAt(LocalDateTime.now());
        return catRepository.save(cat);
    }

    public Iterable<Cat> getAll() {
        return catRepository.findAll();
    }
}
