package abice.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import abice.hrms.business.absracts.PositionService;
import abice.hrms.entities.concretes.Position;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/positions")
@Api(value = "Position Api documentation")
public class PositionsController {
	
	PositionService positionService;

	@Autowired
	public PositionsController(PositionService positionService) {
		super();
		this.positionService = positionService;
	}
	
	@GetMapping("/getall")
	@ApiOperation(value = "Position list method")
	public List<Position> getAll()
	{
		return positionService.getAll();
	}

	
	

}
