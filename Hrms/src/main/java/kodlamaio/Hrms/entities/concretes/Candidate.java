package kodlamaio.Hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "candidates")
public class Candidate {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "fist_name")
	private String fistname;
	@Column(name = "last_name")
	private String lastname;
	@Column(name = "nationality_id")
	private String nationalityId;
	@Column(name = "birth_year")
	private short birthyear;

}
