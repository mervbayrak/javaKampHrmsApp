package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.SystemEmployeeService;
import kodlamaio.Hrms.dataAccess.abstracts.SystemEmployeeDao;
import kodlamaio.Hrms.entities.concretes.SystemEmployee;

@Service
public class SystemEmployeeManager implements SystemEmployeeService {
	private SystemEmployeeDao systemEmployeeDao;

	@Autowired
	public SystemEmployeeManager(SystemEmployeeDao systemEmployeeDao) {
		super();
		this.systemEmployeeDao = systemEmployeeDao;
	}

	@Override
	public List<SystemEmployee> getAll() {
		return this.systemEmployeeDao.findAll();
	}

}
