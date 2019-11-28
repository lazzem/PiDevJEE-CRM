package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the Devis database table.
 * 
 */
@Entity
@Table(name="Devis")
@NamedQuery(name="Devi.findAll", query="SELECT d FROM Devi d")
public class Devi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IdDevis")
	private int idDevis;

	@Column(name="DateDevis")
	private Timestamp dateDevis;

	@Column(name="Description")
	private Object description;

	@Column(name="IdUser")
	private int idUser;

	@Column(name="PrixTotal")
	private float prixTotal;

	@Column(name="Status")
	private Object status;

	//bi-directional many-to-one association to Produit
	@ManyToOne
	@JoinColumn(name="IdProduit")
	private Produit produit;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="Users_UserID")
	private User user;

	public Devi() {
	}

	public int getIdDevis() {
		return this.idDevis;
	}

	public void setIdDevis(int idDevis) {
		this.idDevis = idDevis;
	}

	public Timestamp getDateDevis() {
		return this.dateDevis;
	}

	public void setDateDevis(Timestamp dateDevis) {
		this.dateDevis = dateDevis;
	}

	public Object getDescription() {
		return this.description;
	}

	public void setDescription(Object description) {
		this.description = description;
	}

	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public float getPrixTotal() {
		return this.prixTotal;
	}

	public void setPrixTotal(float prixTotal) {
		this.prixTotal = prixTotal;
	}

	public Object getStatus() {
		return this.status;
	}

	public void setStatus(Object status) {
		this.status = status;
	}

	public Produit getProduit() {
		return this.produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}