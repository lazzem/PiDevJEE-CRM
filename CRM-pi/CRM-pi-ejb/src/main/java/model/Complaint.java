package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the Complaints database table.
 * 
 */
@Entity
@Table(name="Complaints")
@NamedQuery(name="Complaint.findAll", query="SELECT c FROM Complaint c")
public class Complaint implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ComplaintID")
	private String complaintID;

	@Column(name="Clossing_date")
	private Timestamp clossing_date;

	@Column(name="Creation_date")
	private Timestamp creation_date;

	@Column(name="Description")
	private Object description;

	@Column(name="Processing_date")
	private Timestamp processing_date;

	@Column(name="Type")
	private Object type;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="IdUser")
	private User user;

	public Complaint() {
	}

	public String getComplaintID() {
		return this.complaintID;
	}

	public void setComplaintID(String complaintID) {
		this.complaintID = complaintID;
	}

	public Timestamp getClossing_date() {
		return this.clossing_date;
	}

	public void setClossing_date(Timestamp clossing_date) {
		this.clossing_date = clossing_date;
	}

	public Timestamp getCreation_date() {
		return this.creation_date;
	}

	public void setCreation_date(Timestamp creation_date) {
		this.creation_date = creation_date;
	}

	public Object getDescription() {
		return this.description;
	}

	public void setDescription(Object description) {
		this.description = description;
	}

	public Timestamp getProcessing_date() {
		return this.processing_date;
	}

	public void setProcessing_date(Timestamp processing_date) {
		this.processing_date = processing_date;
	}

	public Object getType() {
		return this.type;
	}

	public void setType(Object type) {
		this.type = type;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}