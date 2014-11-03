package envers.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.envers.Audited;

@Entity
@Audited
public class TVSet {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String manufacturer;
	private String modelYear;
	private long udid;

	public TVSet() {
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModelYear() {
		return modelYear;
	}

	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}

	public long getUdid() {
		return udid;
	}

	public void setUdid(long udid) {
		this.udid = udid;
	}

}
