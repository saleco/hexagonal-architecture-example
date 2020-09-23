package com.baeldung.hexagonalarchitecture.application.port.outgoing;

import com.baeldung.hexagonalarchitecture.application.domain.Car;

public interface SaveCarPort {
    void save(Car car);
}
