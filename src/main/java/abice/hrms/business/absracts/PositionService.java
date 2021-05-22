package abice.hrms.business.absracts;

import java.util.List;

import org.springframework.stereotype.Service;

import abice.hrms.entities.concretes.Position;

public interface PositionService {

	List<Position> getAll();
}
