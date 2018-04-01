package net.technocart.controller;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import net.technocart.domain.Coordinates;
import net.technocart.domain.Message;
import net.technocart.service.PollingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PollingController {

    @Autowired
    private PollingService pollingService;

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Message greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Message(counter.incrementAndGet(),
                            String.format(template, name));
    }

    @RequestMapping(value = "/request", method = RequestMethod.GET)
    public String getStatus(@RequestParam(value = "id")int id) {
        return "UP "+id;
    }


    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    public Optional<Coordinates> saveCoordinates(@RequestBody Coordinates coordinates) {
        return pollingService.saveCoordinates(coordinates);
    }

}
