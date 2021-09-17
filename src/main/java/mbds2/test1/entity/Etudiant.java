package mbds2.test1.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="ETUDIANT")

public class Etudiant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ID ;
	private String firstname;
	private String surname;
	private String Speciality;
	private Date birthday ;
	
	
	
	
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSpeciality() {
		return Speciality;
	}

	public void setSpeciality(String speciality) {
		Speciality = speciality;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	} 
	

}
