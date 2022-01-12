package ru.denisov26.catsapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.denisov26.catsapi.entity.Cat;

public interface CatRepository extends JpaRepository<Cat, String> {
}
