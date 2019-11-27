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
	@OneToMany(mappedBy="pack1")
	private List<PacksProduit> packsProduits1;

	//bi-directional many-to-one association to PacksProduit
	@OneToMany(mappedBy="pack2")
	private List<PacksProduit> packsProduits2;

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

	public List<PacksProduit> getPacksProduits1() {
		return this.packsProduits1;
	}

	public void setPacksProduits1(List<PacksProduit> packsProduits1) {
		this.packsProduits1 = packsProduits1;
	}

	public PacksProduit addPacksProduits1(PacksProduit packsProduits1) {
		getPacksProduits1().add(packsProduits1);
		packsProduits1.setPack1(this);

		return packsProduits1;
	}

	public PacksProduit removePacksProduits1(PacksProduit packsProduits1) {
		getPacksProduits1().remove(packsProduits1);
		packsProduits1.setPack1(null);

		return packsProduits1;
	}

	public List<PacksProduit> getPacksProduits2() {
		return this.packsProduits2;
	}

	public void setPacksProduits2(List<PacksProduit> packsProduits2) {
		this.packsProduits2 = packsProduits2;
	}

	public PacksProduit addPacksProduits2(PacksProduit packsProduits2) {
		getPacksProduits2().add(packsProduits2);
		packsProduits2.setPack2(this);

		return packsProduits2;
	}

	public PacksProduit removePacksProduits2(PacksProduit packsProduits2) {
		getPacksProduits2().remove(packsProduits2);
		packsProduits2.setPack2(null);

		return packsProduits2;
	}

}