package com.baeldung.hexagonal.architecture.application.port.outgoing;

import com.baeldung.hexagonal.architecture.application.domain.Car;

import java.util.Optional;

public interface LoadCarPort {
    Optional<Car> load(Long id);
}
