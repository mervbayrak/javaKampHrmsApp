package kodlamaio.Hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "employers")
public class Employer {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "compnay_name")
	private String companyName;
	@Column(name = "web_site")
	private String website;
	@Column(name = "phone_number")
	private String phoneNumber;
}
