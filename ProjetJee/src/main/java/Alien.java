package main.java;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Ali_table")
public class Alien {
	@Id
	private int ieei;
	private String messg;

	public int getIi() {
		return ieei;
	}

	public void setIi(int ii) {
		this.ieei = ii;
	}

	public String getMessg() {
		return messg;
	}

	public void setMessg(String messg) {
		this.messg = messg;
	}

}
