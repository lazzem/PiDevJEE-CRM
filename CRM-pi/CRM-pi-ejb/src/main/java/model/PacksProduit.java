package model;

import java.io.Serializable;
import javax.persistence.*;


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
	@ManyToOne
	@JoinColumn(name="Packs_IdPack")
	private Pack pack;

	//bi-directional many-to-one association to Produit
	@ManyToOne
	@JoinColumn(name="Produit_Id_produit")
	private Produit produit;

	public PacksProduit() {
	}

	public PacksProduitPK getId() {
		return this.id;
	}

	public void setId(PacksProduitPK id) {
		this.id = id;
	}

	public Pack getPack() {
		return this.pack;
	}

	public void setPack(Pack pack) {
		this.pack = pack;
	}

	public Produit getProduit() {
		return this.produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

}