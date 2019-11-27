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
	@OneToMany(mappedBy="produit1")
	private List<BoutiqueProduit> boutiqueProduits1;

	//bi-directional many-to-one association to Offre
	@OneToMany(mappedBy="produit")
	private List<Offre> offres;

	//bi-directional many-to-one association to PacksProduit
	@OneToMany(mappedBy="produit1")
	private List<PacksProduit> packsProduits1;

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

	//bi-directional many-to-one association to BoutiqueProduit
	@OneToMany(mappedBy="produit2")
	private List<BoutiqueProduit> boutiqueProduits2;

	//bi-directional many-to-one association to PacksProduit
	@OneToMany(mappedBy="produit2")
	private List<PacksProduit> packsProduits2;

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

	public List<BoutiqueProduit> getBoutiqueProduits1() {
		return this.boutiqueProduits1;
	}

	public void setBoutiqueProduits1(List<BoutiqueProduit> boutiqueProduits1) {
		this.boutiqueProduits1 = boutiqueProduits1;
	}

	public BoutiqueProduit addBoutiqueProduits1(BoutiqueProduit boutiqueProduits1) {
		getBoutiqueProduits1().add(boutiqueProduits1);
		boutiqueProduits1.setProduit1(this);

		return boutiqueProduits1;
	}

	public BoutiqueProduit removeBoutiqueProduits1(BoutiqueProduit boutiqueProduits1) {
		getBoutiqueProduits1().remove(boutiqueProduits1);
		boutiqueProduits1.setProduit1(null);

		return boutiqueProduits1;
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

	public List<PacksProduit> getPacksProduits1() {
		return this.packsProduits1;
	}

	public void setPacksProduits1(List<PacksProduit> packsProduits1) {
		this.packsProduits1 = packsProduits1;
	}

	public PacksProduit addPacksProduits1(PacksProduit packsProduits1) {
		getPacksProduits1().add(packsProduits1);
		packsProduits1.setProduit1(this);

		return packsProduits1;
	}

	public PacksProduit removePacksProduits1(PacksProduit packsProduits1) {
		getPacksProduits1().remove(packsProduits1);
		packsProduits1.setProduit1(null);

		return packsProduits1;
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

	public List<BoutiqueProduit> getBoutiqueProduits2() {
		return this.boutiqueProduits2;
	}

	public void setBoutiqueProduits2(List<BoutiqueProduit> boutiqueProduits2) {
		this.boutiqueProduits2 = boutiqueProduits2;
	}

	public BoutiqueProduit addBoutiqueProduits2(BoutiqueProduit boutiqueProduits2) {
		getBoutiqueProduits2().add(boutiqueProduits2);
		boutiqueProduits2.setProduit2(this);

		return boutiqueProduits2;
	}

	public BoutiqueProduit removeBoutiqueProduits2(BoutiqueProduit boutiqueProduits2) {
		getBoutiqueProduits2().remove(boutiqueProduits2);
		boutiqueProduits2.setProduit2(null);

		return boutiqueProduits2;
	}

	public List<PacksProduit> getPacksProduits2() {
		return this.packsProduits2;
	}

	public void setPacksProduits2(List<PacksProduit> packsProduits2) {
		this.packsProduits2 = packsProduits2;
	}

	public PacksProduit addPacksProduits2(PacksProduit packsProduits2) {
		getPacksProduits2().add(packsProduits2);
		packsProduits2.setProduit2(this);

		return packsProduits2;
	}

	public PacksProduit removePacksProduits2(PacksProduit packsProduits2) {
		getPacksProduits2().remove(packsProduits2);
		packsProduits2.setProduit2(null);

		return packsProduits2;
	}

}