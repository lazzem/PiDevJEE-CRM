package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Paniers database table.
 * 
 */
@Entity
@Table(name="Paniers")
@NamedQuery(name="Panier.findAll", query="SELECT p FROM Panier p")
public class Panier implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IdPanier")
	private int idPanier;

	@Column(name="Quantite")
	private int quantite;

	//bi-directional many-to-one association to Produit
	@ManyToOne
	@JoinColumn(name="IdProduit")
	private Produit produit;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="IdUser")
	private User user;

	public Panier() {
	}

	public int getIdPanier() {
		return this.idPanier;
	}

	public void setIdPanier(int idPanier) {
		this.idPanier = idPanier;
	}

	public int getQuantite() {
		return this.quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
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