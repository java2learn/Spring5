package org.madhava.learnSpring5.repository;

import org.madhava.learnSpring5.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PubRepository extends CrudRepository<Publisher, Long> {
}
