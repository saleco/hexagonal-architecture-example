package com.baeldung.hexagonalarchitecture.adapters.persistence;

import com.baeldung.hexagonalarchitecture.application.domain.Car;
import org.springframework.data.repository.CrudRepository;

public interface SpringDataCarRepository extends CrudRepository<Car, Long> {
}
