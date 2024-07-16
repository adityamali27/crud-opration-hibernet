package crud.dataoptation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Student {
	@Id
	@GeneratedValue
	private int sid ;
	@Column(nullable = false)
	private String name;
	private String address;
	private double per;
	private String gender;

}
