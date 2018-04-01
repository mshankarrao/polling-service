package net.technocart.repository;

import net.technocart.domain.Coordinates;
import org.springframework.data.repository.CrudRepository;

public interface PollingRepository extends CrudRepository<Coordinates, String> {
}
