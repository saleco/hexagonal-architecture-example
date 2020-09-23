package com.baeldung.hexagonal.architecture.application.port.outgoing;

import com.baeldung.hexagonal.architecture.application.domain.Car;

public interface SaveCarPort {
    void save(Car car);
}
