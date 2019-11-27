package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the Packs database table.
 * 
 */
@Entity
@Table(name="Packs")
@NamedQuery(name="Pack.findAll", query="SELECT p FROM Pack p")
public class Pack implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IdPack")
	private int idPack;

	@Column(name="DateDebut")
	private Timestamp dateDebut;

	@Column(name="DateFin")
	private Timestamp dateFin;

	@Column(name="Description")
	private Object description;

	@Column(name="IdProduit")
	private int idProduit;

	@Column(name="Image")
	private Object image;

	@Column(name="Prix")
	private float prix;

	@Column(name="Titre")
	private Object titre;

	//bi-directional many-to-one association to PacksProduit
	@OneToMany(mappedBy="pack")
	private List<PacksProduit> packsProduits;

	public Pack() {
	}

	public int getIdPack() {
		return this.idPack;
	}

	public void setIdPack(int idPack) {
		this.idPack = idPack;
	}

	public Timestamp getDateDebut() {
		return this.dateDebut;
	}

	public void setDateDebut(Timestamp dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Timestamp getDateFin() {
		return this.dateFin;
	}

	public void setDateFin(Timestamp dateFin) {
		this.dateFin = dateFin;
	}

	public Object getDescription() {
		return this.description;
	}

	public void setDescription(Object description) {
		this.description = description;
	}

	public int getIdProduit() {
		return this.idProduit;
	}

	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}

	public Object getImage() {
		return this.image;
	}

	public void setImage(Object image) {
		this.image = image;
	}

	public float getPrix() {
		return this.prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public Object getTitre() {
		return this.titre;
	}

	public void setTitre(Object titre) {
		this.titre = titre;
	}

	public List<PacksProduit> getPacksProduits() {
		return this.packsProduits;
	}

	public void setPacksProduits(List<PacksProduit> packsProduits) {
		this.packsProduits = packsProduits;
	}

	public PacksProduit addPacksProduit(PacksProduit packsProduit) {
		getPacksProduits().add(packsProduit);
		packsProduit.setPack(this);

		return packsProduit;
	}

	public PacksProduit removePacksProduit(PacksProduit packsProduit) {
		getPacksProduits().remove(packsProduit);
		packsProduit.setPack(null);

		return packsProduit;
	}

}