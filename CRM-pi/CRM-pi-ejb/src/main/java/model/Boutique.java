package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Boutiques database table.
 * 
 */
@Entity
@Table(name="Boutiques")
@NamedQuery(name="Boutique.findAll", query="SELECT b FROM Boutique b")
public class Boutique implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id_boutique")
	private int id_boutique;

	@Column(name="Ascisse_X")
	private float ascisse_X;

	@Column(name="Email")
	private Object email;

	@Column(name="Heure_fermeture")
	private String heure_fermeture;

	@Column(name="Heure_ouverture")
	private String heure_ouverture;

	@Column(name="Nom")
	private Object nom;

	@Column(name="Ordonné_Y")
	private float ordonné_Y;

	@Column(name="Phone")
	private Object phone;

	@Column(name="Service")
	private Object service;

	@Column(name="Zone")
	private Object zone;

	//bi-directional many-to-one association to BoutiqueProduit
	@OneToMany(mappedBy="boutique1")
	private List<BoutiqueProduit> boutiqueProduits1;

	//bi-directional many-to-one association to Ville
	@ManyToOne
	@JoinColumn(name="Id_ville")
	private Ville ville;

	//bi-directional many-to-one association to BoutiqueProduit
	@OneToMany(mappedBy="boutique2")
	private List<BoutiqueProduit> boutiqueProduits2;

	public Boutique() {
	}

	public int getId_boutique() {
		return this.id_boutique;
	}

	public void setId_boutique(int id_boutique) {
		this.id_boutique = id_boutique;
	}

	public float getAscisse_X() {
		return this.ascisse_X;
	}

	public void setAscisse_X(float ascisse_X) {
		this.ascisse_X = ascisse_X;
	}

	public Object getEmail() {
		return this.email;
	}

	public void setEmail(Object email) {
		this.email = email;
	}

	public String getHeure_fermeture() {
		return this.heure_fermeture;
	}

	public void setHeure_fermeture(String heure_fermeture) {
		this.heure_fermeture = heure_fermeture;
	}

	public String getHeure_ouverture() {
		return this.heure_ouverture;
	}

	public void setHeure_ouverture(String heure_ouverture) {
		this.heure_ouverture = heure_ouverture;
	}

	public Object getNom() {
		return this.nom;
	}

	public void setNom(Object nom) {
		this.nom = nom;
	}

	public float getOrdonné_Y() {
		return this.ordonné_Y;
	}

	public void setOrdonné_Y(float ordonné_Y) {
		this.ordonné_Y = ordonné_Y;
	}

	public Object getPhone() {
		return this.phone;
	}

	public void setPhone(Object phone) {
		this.phone = phone;
	}

	public Object getService() {
		return this.service;
	}

	public void setService(Object service) {
		this.service = service;
	}

	public Object getZone() {
		return this.zone;
	}

	public void setZone(Object zone) {
		this.zone = zone;
	}

	public List<BoutiqueProduit> getBoutiqueProduits1() {
		return this.boutiqueProduits1;
	}

	public void setBoutiqueProduits1(List<BoutiqueProduit> boutiqueProduits1) {
		this.boutiqueProduits1 = boutiqueProduits1;
	}

	public BoutiqueProduit addBoutiqueProduits1(BoutiqueProduit boutiqueProduits1) {
		getBoutiqueProduits1().add(boutiqueProduits1);
		boutiqueProduits1.setBoutique1(this);

		return boutiqueProduits1;
	}

	public BoutiqueProduit removeBoutiqueProduits1(BoutiqueProduit boutiqueProduits1) {
		getBoutiqueProduits1().remove(boutiqueProduits1);
		boutiqueProduits1.setBoutique1(null);

		return boutiqueProduits1;
	}

	public Ville getVille() {
		return this.ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

	public List<BoutiqueProduit> getBoutiqueProduits2() {
		return this.boutiqueProduits2;
	}

	public void setBoutiqueProduits2(List<BoutiqueProduit> boutiqueProduits2) {
		this.boutiqueProduits2 = boutiqueProduits2;
	}

	public BoutiqueProduit addBoutiqueProduits2(BoutiqueProduit boutiqueProduits2) {
		getBoutiqueProduits2().add(boutiqueProduits2);
		boutiqueProduits2.setBoutique2(this);

		return boutiqueProduits2;
	}

	public BoutiqueProduit removeBoutiqueProduits2(BoutiqueProduit boutiqueProduits2) {
		getBoutiqueProduits2().remove(boutiqueProduits2);
		boutiqueProduits2.setBoutique2(null);

		return boutiqueProduits2;
	}

}