package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the Avis database table.
 * 
 */
@Entity
@NamedQuery(name="Avis.findAll", query="SELECT a FROM Avis a")
public class Avis implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IdView")
	private int idView;

	@Column(name="Date")
	private Timestamp date;

	@Column(name="Description")
	private Object description;

	public Avis() {
	}

	public int getIdView() {
		return this.idView;
	}

	public void setIdView(int idView) {
		this.idView = idView;
	}

	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public Object getDescription() {
		return this.description;
	}

	public void setDescription(Object description) {
		this.description = description;
	}

}