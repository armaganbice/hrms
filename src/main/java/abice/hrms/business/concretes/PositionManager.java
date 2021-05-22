package abice.hrms.business.concretes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import abice.hrms.business.absracts.PositionService;
import abice.hrms.dataAccess.abstracts.PositionDao;
import abice.hrms.entities.concretes.Position;

@Service
public class PositionManager implements PositionService{
	PositionDao positionDao;

	@Autowired
	public PositionManager(PositionDao positionDao) {
		super();
		this.positionDao=positionDao;
	}

	@Override
	public List<Position> getAll() {
		return positionDao.findAll();
	}
	
	

}
