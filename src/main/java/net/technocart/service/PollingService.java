package net.technocart.service;

import net.technocart.domain.Coordinates;
import net.technocart.repository.PollingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.logging.Logger;

@Component
public class PollingService {

    @Autowired
    private PollingRepository pollingRepository;

    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public Optional<Coordinates> saveCoordinates(Coordinates coordinates) {
        LOGGER.info(coordinates.toString());
        pollingRepository.save(coordinates);
        Optional<Coordinates> resultCoordinates = pollingRepository.findById(coordinates.getVehicleCode());
        return resultCoordinates;

    }
}
