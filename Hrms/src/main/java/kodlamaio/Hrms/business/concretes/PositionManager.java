package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.PositionService;
import kodlamaio.Hrms.dataAccess.abstracts.PositionDao;
import kodlamaio.Hrms.entities.concretes.Position;

@Service
public class PositionManager implements PositionService {
	private PositionDao positionDao;

	@Autowired
	public PositionManager(PositionDao positionDao) {
		super();
		this.positionDao = positionDao;
	}

	@Override
	public List<Position> getAll() {
		return this.positionDao.findAll();
	}

}
