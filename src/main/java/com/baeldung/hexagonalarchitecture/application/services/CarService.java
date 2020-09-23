package com.baeldung.hexagonalarchitecture.application.services;

import com.baeldung.hexagonalarchitecture.application.domain.Car;
import com.baeldung.hexagonalarchitecture.application.port.incoming.RentCarUseCase;
import com.baeldung.hexagonalarchitecture.application.port.incoming.ReturnRentalUseCase;
import com.baeldung.hexagonalarchitecture.application.port.outgoing.LoadCarPort;
import com.baeldung.hexagonalarchitecture.application.port.outgoing.SaveCarPort;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class CarService implements RentCarUseCase, ReturnRentalUseCase {

    private LoadCarPort loadCarPort;
    private SaveCarPort saveCarPort;

    public CarService(LoadCarPort loadCarPort, SaveCarPort saveCarPort) {
        this.loadCarPort = loadCarPort;
        this.saveCarPort = saveCarPort;
    }

    @Override
    public boolean rent(Long id) {
        Car car = loadCarPort.load(id).orElseThrow(NoSuchElementException::new);

        boolean hasRent = car.rent();

        if(hasRent) {
            saveCarPort.save(car);
        }

        return hasRent;
    }

    @Override
    public boolean returnRental(Long id) {
        Car car = loadCarPort.load(id).orElseThrow(NoSuchElementException::new);

        boolean hasReturned = car.returnRental();

        if(hasReturned) {
            saveCarPort.save(car);
        }

        return hasReturned;
    }
}
