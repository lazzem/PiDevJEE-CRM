package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the PacksProduits database table.
 * 
 */
@Entity
@Table(name="PacksProduits")
@NamedQuery(name="PacksProduit.findAll", query="SELECT p FROM PacksProduit p")
public class PacksProduit implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PacksProduitPK id;

	//bi-directional many-to-one association to Pack
	@OneToMany(mappedBy="packsProduit")
	private List<Pack> packs;

	//bi-directional many-to-one association to Produit
	@OneToMany(mappedBy="packsProduit")
	private List<Produit> produits;

	public PacksProduit() {
	}

	public PacksProduitPK getId() {
		return this.id;
	}

	public void setId(PacksProduitPK id) {
		this.id = id;
	}

	public List<Pack> getPacks() {
		return this.packs;
	}

	public void setPacks(List<Pack> packs) {
		this.packs = packs;
	}

	public Pack addPack(Pack pack) {
		getPacks().add(pack);
		pack.setPacksProduit(this);

		return pack;
	}

	public Pack removePack(Pack pack) {
		getPacks().remove(pack);
		pack.setPacksProduit(null);

		return pack;
	}

	public List<Produit> getProduits() {
		return this.produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}

	public Produit addProduit(Produit produit) {
		getProduits().add(produit);
		produit.setPacksProduit(this);

		return produit;
	}

	public Produit removeProduit(Produit produit) {
		getProduits().remove(produit);
		produit.setPacksProduit(null);

		return produit;
	}

}