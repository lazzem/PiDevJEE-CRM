package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Produits database table.
 * 
 */
@Entity
@Table(name="Produits")
@NamedQuery(name="Produit.findAll", query="SELECT p FROM Produit p")
public class Produit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id_produit")
	private int id_produit;

	@Column(name="Description")
	private Object description;

	@Column(name="IdPack")
	private int idPack;

	@Column(name="Image")
	private Object image;

	@Column(name="Libelle")
	private Object libelle;

	@Column(name="Nom")
	private Object nom;

	@Column(name="Price")
	private float price;

	@Column(name="Quantitee")
	private int quantitee;

	//bi-directional many-to-one association to BoutiqueProduit
	@OneToMany(mappedBy="produit")
	private List<BoutiqueProduit> boutiqueProduits;

	//bi-directional many-to-one association to Offre
	@OneToMany(mappedBy="produit")
	private List<Offre> offres;

	//bi-directional many-to-one association to PacksProduit
	@OneToMany(mappedBy="produit")
	private List<PacksProduit> packsProduits;

	//bi-directional many-to-one association to Panier
	@OneToMany(mappedBy="produit")
	private List<Panier> paniers;

	//bi-directional many-to-one association to Category
	@ManyToOne
	@JoinColumn(name="Id_categorie")
	private Category category;

	//bi-directional many-to-one association to Promotion
	@OneToMany(mappedBy="produit")
	private List<Promotion> promotions;

	//bi-directional many-to-one association to Publicite
	@OneToMany(mappedBy="produit")
	private List<Publicite> publicites;

	public Produit() {
	}

	public int getId_produit() {
		return this.id_produit;
	}

	public void setId_produit(int id_produit) {
		this.id_produit = id_produit;
	}

	public Object getDescription() {
		return this.description;
	}

	public void setDescription(Object description) {
		this.description = description;
	}

	public int getIdPack() {
		return this.idPack;
	}

	public void setIdPack(int idPack) {
		this.idPack = idPack;
	}

	public Object getImage() {
		return this.image;
	}

	public void setImage(Object image) {
		this.image = image;
	}

	public Object getLibelle() {
		return this.libelle;
	}

	public void setLibelle(Object libelle) {
		this.libelle = libelle;
	}

	public Object getNom() {
		return this.nom;
	}

	public void setNom(Object nom) {
		this.nom = nom;
	}

	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantitee() {
		return this.quantitee;
	}

	public void setQuantitee(int quantitee) {
		this.quantitee = quantitee;
	}

	public List<BoutiqueProduit> getBoutiqueProduits() {
		return this.boutiqueProduits;
	}

	public void setBoutiqueProduits(List<BoutiqueProduit> boutiqueProduits) {
		this.boutiqueProduits = boutiqueProduits;
	}

	public BoutiqueProduit addBoutiqueProduit(BoutiqueProduit boutiqueProduit) {
		getBoutiqueProduits().add(boutiqueProduit);
		boutiqueProduit.setProduit(this);

		return boutiqueProduit;
	}

	public BoutiqueProduit removeBoutiqueProduit(BoutiqueProduit boutiqueProduit) {
		getBoutiqueProduits().remove(boutiqueProduit);
		boutiqueProduit.setProduit(null);

		return boutiqueProduit;
	}

	public List<Offre> getOffres() {
		return this.offres;
	}

	public void setOffres(List<Offre> offres) {
		this.offres = offres;
	}

	public Offre addOffre(Offre offre) {
		getOffres().add(offre);
		offre.setProduit(this);

		return offre;
	}

	public Offre removeOffre(Offre offre) {
		getOffres().remove(offre);
		offre.setProduit(null);

		return offre;
	}

	public List<PacksProduit> getPacksProduits() {
		return this.packsProduits;
	}

	public void setPacksProduits(List<PacksProduit> packsProduits) {
		this.packsProduits = packsProduits;
	}

	public PacksProduit addPacksProduit(PacksProduit packsProduit) {
		getPacksProduits().add(packsProduit);
		packsProduit.setProduit(this);

		return packsProduit;
	}

	public PacksProduit removePacksProduit(PacksProduit packsProduit) {
		getPacksProduits().remove(packsProduit);
		packsProduit.setProduit(null);

		return packsProduit;
	}

	public List<Panier> getPaniers() {
		return this.paniers;
	}

	public void setPaniers(List<Panier> paniers) {
		this.paniers = paniers;
	}

	public Panier addPanier(Panier panier) {
		getPaniers().add(panier);
		panier.setProduit(this);

		return panier;
	}

	public Panier removePanier(Panier panier) {
		getPaniers().remove(panier);
		panier.setProduit(null);

		return panier;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<Promotion> getPromotions() {
		return this.promotions;
	}

	public void setPromotions(List<Promotion> promotions) {
		this.promotions = promotions;
	}

	public Promotion addPromotion(Promotion promotion) {
		getPromotions().add(promotion);
		promotion.setProduit(this);

		return promotion;
	}

	public Promotion removePromotion(Promotion promotion) {
		getPromotions().remove(promotion);
		promotion.setProduit(null);

		return promotion;
	}

	public List<Publicite> getPublicites() {
		return this.publicites;
	}

	public void setPublicites(List<Publicite> publicites) {
		this.publicites = publicites;
	}

	public Publicite addPublicite(Publicite publicite) {
		getPublicites().add(publicite);
		publicite.setProduit(this);

		return publicite;
	}

	public Publicite removePublicite(Publicite publicite) {
		getPublicites().remove(publicite);
		publicite.setProduit(null);

		return publicite;
	}

}