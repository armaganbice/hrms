package abice.hrms.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import abice.hrms.business.absracts.UserService;
import abice.hrms.dataAccess.abstracts.UserDao;
import abice.hrms.entities.concretes.User;

@Service
public class UserManager implements UserService {
	
	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao)
	{
		this.userDao=userDao;
	}

	@Override
	public List<User> getAll() {
		return userDao.findAll();
	}

	@Override
	public Optional<User> getById(int id) {
		return userDao.findById(id);
	}

}
