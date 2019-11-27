package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TypeRecs database table.
 * 
 */
@Entity
@Table(name="TypeRecs")
@NamedQuery(name="TypeRec.findAll", query="SELECT t FROM TypeRec t")
public class TypeRec implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id_type")
	private int id_type;

	@Column(name="type_nom")
	private Object typeNom;

	//bi-directional many-to-one association to Complaint
	@OneToMany(mappedBy="typeRec")
	private List<Complaint> complaints;

	public TypeRec() {
	}

	public int getId_type() {
		return this.id_type;
	}

	public void setId_type(int id_type) {
		this.id_type = id_type;
	}

	public Object getTypeNom() {
		return this.typeNom;
	}

	public void setTypeNom(Object typeNom) {
		this.typeNom = typeNom;
	}

	public List<Complaint> getComplaints() {
		return this.complaints;
	}

	public void setComplaints(List<Complaint> complaints) {
		this.complaints = complaints;
	}

	public Complaint addComplaint(Complaint complaint) {
		getComplaints().add(complaint);
		complaint.setTypeRec(this);

		return complaint;
	}

	public Complaint removeComplaint(Complaint complaint) {
		getComplaints().remove(complaint);
		complaint.setTypeRec(null);

		return complaint;
	}

}