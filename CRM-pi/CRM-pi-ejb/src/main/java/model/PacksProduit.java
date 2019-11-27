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
	private Pack pack1;

	//bi-directional many-to-one association to Produit
	@ManyToOne
	@JoinColumn(name="Produit_Id_produit")
	private Produit produit1;

	//bi-directional many-to-one association to Pack
	@ManyToOne
	@JoinColumn(name="Packs_IdPack")
	private Pack pack2;

	//bi-directional many-to-one association to Produit
	@ManyToOne
	@JoinColumn(name="Produit_Id_produit")
	private Produit produit2;

	public PacksProduit() {
	}

	public PacksProduitPK getId() {
		return this.id;
	}

	public void setId(PacksProduitPK id) {
		this.id = id;
	}

	public Pack getPack1() {
		return this.pack1;
	}

	public void setPack1(Pack pack1) {
		this.pack1 = pack1;
	}

	public Produit getProduit1() {
		return this.produit1;
	}

	public void setProduit1(Produit produit1) {
		this.produit1 = produit1;
	}

	public Pack getPack2() {
		return this.pack2;
	}

	public void setPack2(Pack pack2) {
		this.pack2 = pack2;
	}

	public Produit getProduit2() {
		return this.produit2;
	}

	public void setProduit2(Produit produit2) {
		this.produit2 = produit2;
	}

}