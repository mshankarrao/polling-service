package net.technocart.service;

import net.technocart.domain.Coordinates;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class PollingService {
    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public String log(Coordinates coordinates) {
        LOGGER.info(coordinates.toString());
        return coordinates.toString();

    }
}
