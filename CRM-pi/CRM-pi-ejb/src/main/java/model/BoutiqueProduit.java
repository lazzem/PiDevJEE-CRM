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
	private Boutique boutique1;

	//bi-directional many-to-one association to Produit
	@ManyToOne
	@JoinColumn(name="Id_produit")
	private Produit produit1;

	//bi-directional many-to-one association to Boutique
	@ManyToOne
	@JoinColumn(name="Id_boutique")
	private Boutique boutique2;

	//bi-directional many-to-one association to Produit
	@ManyToOne
	@JoinColumn(name="Id_produit")
	private Produit produit2;

	public BoutiqueProduit() {
	}

	public BoutiqueProduitPK getId() {
		return this.id;
	}

	public void setId(BoutiqueProduitPK id) {
		this.id = id;
	}

	public Boutique getBoutique1() {
		return this.boutique1;
	}

	public void setBoutique1(Boutique boutique1) {
		this.boutique1 = boutique1;
	}

	public Produit getProduit1() {
		return this.produit1;
	}

	public void setProduit1(Produit produit1) {
		this.produit1 = produit1;
	}

	public Boutique getBoutique2() {
		return this.boutique2;
	}

	public void setBoutique2(Boutique boutique2) {
		this.boutique2 = boutique2;
	}

	public Produit getProduit2() {
		return this.produit2;
	}

	public void setProduit2(Produit produit2) {
		this.produit2 = produit2;
	}

}