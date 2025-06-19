package io.github.adil_jr.repository;

import io.github.adil_jr.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {}