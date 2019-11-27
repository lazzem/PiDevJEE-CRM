package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the BoutiqueProduit database table.
 * 
 */
@Entity
@NamedQuery(name="BoutiqueProduit.findAll", query="SELECT b FROM BoutiqueProduit b")
public class BoutiqueProduit implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BoutiqueProduitPK id;

	//bi-directional many-to-one association to Boutique
	@ManyToOne
	@JoinColumn(name="Id_boutique")
	private Boutique boutique;

	//bi-directional many-to-one association to Produit
	@ManyToOne
	@JoinColumn(name="Id_produit")
	private Produit produit;

	public BoutiqueProduit() {
	}

	public BoutiqueProduitPK getId() {
		return this.id;
	}

	public void setId(BoutiqueProduitPK id) {
		this.id = id;
	}

	public Boutique getBoutique() {
		return this.boutique;
	}

	public void setBoutique(Boutique boutique) {
		this.boutique = boutique;
	}

	public Produit getProduit() {
		return this.produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

}