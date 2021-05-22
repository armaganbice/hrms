package abice.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import abice.hrms.entities.concretes.User;

public interface UserDao extends JpaRepository<User,Integer>{

}
