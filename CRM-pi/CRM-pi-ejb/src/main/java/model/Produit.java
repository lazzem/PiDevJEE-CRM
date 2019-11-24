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

	//bi-directional many-to-one association to Offre
	@OneToMany(mappedBy="produit")
	private List<Offre> offres;

	//bi-directional many-to-one association to Panier
	@OneToMany(mappedBy="produit")
	private List<Panier> paniers;

	//bi-directional many-to-one association to Boutique
	@ManyToOne
	@JoinColumn(name="Id_boutique")
	private Boutique boutique;

	//bi-directional many-to-one association to Category
	@ManyToOne
	@JoinColumn(name="Id_categorie")
	private Category category;

	//bi-directional many-to-one association to FicheTechnique_Mobile
	@ManyToOne
	@JoinColumn(name="Id_fichemobile")
	private FicheTechnique_Mobile ficheTechniqueMobile;

	//bi-directional many-to-many association to Pack
	@ManyToMany
	@JoinTable(
		name="PacksProduits"
		, joinColumns={
			@JoinColumn(name="Produit_Id_produit")
			}
		, inverseJoinColumns={
			@JoinColumn(name="Packs_IdPack")
			}
		)
	private List<Pack> packs;

	//bi-directional many-to-one association to Promotion
	@OneToMany(mappedBy="produit")
	private List<Promotion> promotions;

	//bi-directional many-to-one association to Publicite
	@OneToMany(mappedBy="produit")
	private List<Publicite> publicites;

	//bi-directional many-to-one association to PacksProduit
	@ManyToOne
	@JoinColumn(name="Id_produit", referencedColumnName="Produit_Id_produit")
	private PacksProduit packsProduit;

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

	public Boutique getBoutique() {
		return this.boutique;
	}

	public void setBoutique(Boutique boutique) {
		this.boutique = boutique;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public FicheTechnique_Mobile getFicheTechniqueMobile() {
		return this.ficheTechniqueMobile;
	}

	public void setFicheTechniqueMobile(FicheTechnique_Mobile ficheTechniqueMobile) {
		this.ficheTechniqueMobile = ficheTechniqueMobile;
	}

	public List<Pack> getPacks() {
		return this.packs;
	}

	public void setPacks(List<Pack> packs) {
		this.packs = packs;
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

	public PacksProduit getPacksProduit() {
		return this.packsProduit;
	}

	public void setPacksProduit(PacksProduit packsProduit) {
		this.packsProduit = packsProduit;
	}

}