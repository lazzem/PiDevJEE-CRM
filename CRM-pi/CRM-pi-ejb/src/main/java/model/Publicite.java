package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Publicites database table.
 * 
 */
@Entity
@Table(name="Publicites")
@NamedQuery(name="Publicite.findAll", query="SELECT p FROM Publicite p")
public class Publicite implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IdPublicite")
	private int idPublicite;

	@Column(name="Description")
	private Object description;

	@Column(name="IdProduct")
	private int idProduct;

	@Column(name="Image")
	private Object image;

	@Column(name="Titre")
	private Object titre;

	//bi-directional many-to-one association to Produit
	@ManyToOne
	@JoinColumn(name="Produits_Id_produit")
	private Produit produit;

	public Publicite() {
	}

	public int getIdPublicite() {
		return this.idPublicite;
	}

	public void setIdPublicite(int idPublicite) {
		this.idPublicite = idPublicite;
	}

	public Object getDescription() {
		return this.description;
	}

	public void setDescription(Object description) {
		this.description = description;
	}

	public int getIdProduct() {
		return this.idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public Object getImage() {
		return this.image;
	}

	public void setImage(Object image) {
		this.image = image;
	}

	public Object getTitre() {
		return this.titre;
	}

	public void setTitre(Object titre) {
		this.titre = titre;
	}

	public Produit getProduit() {
		return this.produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

}