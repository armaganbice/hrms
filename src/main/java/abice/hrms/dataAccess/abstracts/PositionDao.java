package abice.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import abice.hrms.entities.concretes.Position;

public interface PositionDao extends JpaRepository<Position,Integer>
{

}
