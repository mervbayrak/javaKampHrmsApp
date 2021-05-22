package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.entities.concretes.Position;

public interface PositionService {
	List<Position> getAll();
}
