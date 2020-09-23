package com.baeldung.hexagonal.architecture.application.port.incoming;

public interface RentCarUseCase {
    boolean rent(Long id);
}
