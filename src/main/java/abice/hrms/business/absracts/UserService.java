package abice.hrms.business.absracts;

import java.util.List;
import java.util.Optional;

import abice.hrms.entities.concretes.User;

public interface UserService {
	List<User> getAll();
    Optional<User> getById(int id);
}
