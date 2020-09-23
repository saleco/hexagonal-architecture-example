package com.baeldung.hexagonal.architecture.adapters.persistence;

import com.baeldung.hexagonal.architecture.application.domain.Car;
import org.springframework.data.repository.CrudRepository;

public interface SpringDataCarRepository extends CrudRepository<Car, Long> {
}
