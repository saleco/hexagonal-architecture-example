package com.baeldung.hexagonalarchitecture.application.port.outgoing;

import com.baeldung.hexagonalarchitecture.application.domain.Car;

import java.util.Optional;

public interface LoadCarPort {
    Optional<Car> load(Long id);
}
