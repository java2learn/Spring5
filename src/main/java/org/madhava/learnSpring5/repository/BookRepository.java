package org.madhava.learnSpring5.repository;

import org.madhava.learnSpring5.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
