package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the Users database table.
 * 
 */
@Entity
@Table(name="Users")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="UserID")
	private int userID;

	@Column(name="BirthDate")
	private Timestamp birthDate;

	@Column(name="CIN")
	private int cin;

	@Column(name="ConfirmPassword")
	private Object confirmPassword;

	@Column(name="Email")
	private Object email;

	@Column(name="Gender")
	private int gender;

	@Column(name="IsActive")
	private boolean isActive;

	@Column(name="LastName")
	private Object lastName;

	@Column(name="Name")
	private Object name;

	@Column(name="Password")
	private Object password;

	@Column(name="Phone")
	private int phone;

	@Column(name="Picture")
	private Object picture;

	@Column(name="Role")
	private Object role;

	@Column(name="SignUpDate")
	private Timestamp signUpDate;

	@Column(name="UserName")
	private Object userName;

	//bi-directional many-to-one association to Commande
	@OneToMany(mappedBy="user")
	private List<Commande> commandes;

	//bi-directional many-to-one association to Devi
	@OneToMany(mappedBy="user")
	private List<Devi> devis;

	//bi-directional many-to-one association to Newslettre
	@OneToMany(mappedBy="user")
	private List<Newslettre> newslettres;

	//bi-directional many-to-one association to Panier
	@OneToMany(mappedBy="user")
	private List<Panier> paniers;

	public User() {
	}

	public int getUserID() {
		return this.userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public Timestamp getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Timestamp birthDate) {
		this.birthDate = birthDate;
	}

	public int getCin() {
		return this.cin;
	}

	public void setCin(int cin) {
		this.cin = cin;
	}

	public Object getConfirmPassword() {
		return this.confirmPassword;
	}

	public void setConfirmPassword(Object confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public Object getEmail() {
		return this.email;
	}

	public void setEmail(Object email) {
		this.email = email;
	}

	public int getGender() {
		return this.gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Object getLastName() {
		return this.lastName;
	}

	public void setLastName(Object lastName) {
		this.lastName = lastName;
	}

	public Object getName() {
		return this.name;
	}

	public void setName(Object name) {
		this.name = name;
	}

	public Object getPassword() {
		return this.password;
	}

	public void setPassword(Object password) {
		this.password = password;
	}

	public int getPhone() {
		return this.phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public Object getPicture() {
		return this.picture;
	}

	public void setPicture(Object picture) {
		this.picture = picture;
	}

	public Object getRole() {
		return this.role;
	}

	public void setRole(Object role) {
		this.role = role;
	}

	public Timestamp getSignUpDate() {
		return this.signUpDate;
	}

	public void setSignUpDate(Timestamp signUpDate) {
		this.signUpDate = signUpDate;
	}

	public Object getUserName() {
		return this.userName;
	}

	public void setUserName(Object userName) {
		this.userName = userName;
	}

	public List<Commande> getCommandes() {
		return this.commandes;
	}

	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}

	public Commande addCommande(Commande commande) {
		getCommandes().add(commande);
		commande.setUser(this);

		return commande;
	}

	public Commande removeCommande(Commande commande) {
		getCommandes().remove(commande);
		commande.setUser(null);

		return commande;
	}

	public List<Devi> getDevis() {
		return this.devis;
	}

	public void setDevis(List<Devi> devis) {
		this.devis = devis;
	}

	public Devi addDevi(Devi devi) {
		getDevis().add(devi);
		devi.setUser(this);

		return devi;
	}

	public Devi removeDevi(Devi devi) {
		getDevis().remove(devi);
		devi.setUser(null);

		return devi;
	}

	public List<Newslettre> getNewslettres() {
		return this.newslettres;
	}

	public void setNewslettres(List<Newslettre> newslettres) {
		this.newslettres = newslettres;
	}

	public Newslettre addNewslettre(Newslettre newslettre) {
		getNewslettres().add(newslettre);
		newslettre.setUser(this);

		return newslettre;
	}

	public Newslettre removeNewslettre(Newslettre newslettre) {
		getNewslettres().remove(newslettre);
		newslettre.setUser(null);

		return newslettre;
	}

	public List<Panier> getPaniers() {
		return this.paniers;
	}

	public void setPaniers(List<Panier> paniers) {
		this.paniers = paniers;
	}

	public Panier addPanier(Panier panier) {
		getPaniers().add(panier);
		panier.setUser(this);

		return panier;
	}

	public Panier removePanier(Panier panier) {
		getPaniers().remove(panier);
		panier.setUser(null);

		return panier;
	}

}