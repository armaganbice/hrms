package abice.hrms.entities.concretes;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


  @Data 
  @Entity
  @Table(name="positions")
  
  @ApiModel(value = "Positions Api model documentation", description = "Model")
  public class Position {
		
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    @ApiModelProperty(value = "Unique id field of position object")
    private int id;
   
	@Column(name="name")
	@ApiModelProperty(value = "Name field of position object")
    private String name;
    
    public Position() {
	}
    
	public Position(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
