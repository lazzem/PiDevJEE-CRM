package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Stocks database table.
 * 
 */
@Entity
@Table(name="Stocks")
@NamedQuery(name="Stock.findAll", query="SELECT s FROM Stock s")
public class Stock implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id_stock")
	private int id_stock;

	@Column(name="Stock_produit")
	private int stock_produit;

	//bi-directional many-to-one association to Boutique
	@ManyToOne
	@JoinColumn(name="Id_boutique")
	private Boutique boutique;

	//bi-directional many-to-one association to Produit
	@ManyToOne
	@JoinColumn(name="Id_produit")
	private Produit produit;

	public Stock() {
	}

	public int getId_stock() {
		return this.id_stock;
	}

	public void setId_stock(int id_stock) {
		this.id_stock = id_stock;
	}

	public int getStock_produit() {
		return this.stock_produit;
	}

	public void setStock_produit(int stock_produit) {
		this.stock_produit = stock_produit;
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