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
	private int complaintID;

	@Column(name="Clossing_date")
	private Object clossing_date;

	@Column(name="Creation_date")
	private Timestamp creation_date;

	@Column(name="Description")
	private Object description;

	@Column(name="Etat")
	private boolean etat;

	@Column(name="Image")
	private Object image;

	@Column(name="Objet")
	private Object objet;

	@Column(name="Processing_date")
	private Object processing_date;

	@Column(name="Responsable")
	private Object responsable;

	//bi-directional many-to-one association to TypeRec
	@ManyToOne
	@JoinColumn(name="Id_type")
	private TypeRec typeRec;

	public Complaint() {
	}

	public int getComplaintID() {
		return this.complaintID;
	}

	public void setComplaintID(int complaintID) {
		this.complaintID = complaintID;
	}

	public Object getClossing_date() {
		return this.clossing_date;
	}

	public void setClossing_date(Object clossing_date) {
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

	public boolean getEtat() {
		return this.etat;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}

	public Object getImage() {
		return this.image;
	}

	public void setImage(Object image) {
		this.image = image;
	}

	public Object getObjet() {
		return this.objet;
	}

	public void setObjet(Object objet) {
		this.objet = objet;
	}

	public Object getProcessing_date() {
		return this.processing_date;
	}

	public void setProcessing_date(Object processing_date) {
		this.processing_date = processing_date;
	}

	public Object getResponsable() {
		return this.responsable;
	}

	public void setResponsable(Object responsable) {
		this.responsable = responsable;
	}

	public TypeRec getTypeRec() {
		return this.typeRec;
	}

	public void setTypeRec(TypeRec typeRec) {
		this.typeRec = typeRec;
	}

}