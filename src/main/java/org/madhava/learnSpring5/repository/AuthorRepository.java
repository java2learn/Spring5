package org.madhava.learnSpring5.repository;

import org.madhava.learnSpring5.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
