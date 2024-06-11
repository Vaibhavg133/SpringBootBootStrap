package com.example.Main.Repository;

import com.example.Main.Persistence.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book,Long> {
    List<Book> findByTitle(String title);
}
