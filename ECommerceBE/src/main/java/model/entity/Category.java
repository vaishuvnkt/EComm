package model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import javax.validation.constraints.Pattern;

@Entity
public class Category {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cId;
	
	@Size(min=3,max=30,message="Should contain Minimum 3 Characters. Should not exceed 30 characters")
	private String cName;
	
	@Pattern(regexp = "[a-z][0-9][0-9][0-9]")
	private String cType;

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcType() {
		return cType;
	}

	public void setcType(String cType) {
		this.cType = cType;
	}

	public Category(String cName, String cType) {
		this.cName = cName;
		this.cType = cType;
	}

	public Category() {
	}

}
