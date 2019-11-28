package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Villes database table.
 * 
 */
@Entity
@Table(name="Villes")
@NamedQuery(name="Ville.findAll", query="SELECT v FROM Ville v")
public class Ville implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id_ville")
	private int id_ville;

	@Column(name="Ville_nom")
	private Object ville_nom;

	//bi-directional many-to-one association to Boutique
	@OneToMany(mappedBy="ville")
	private List<Boutique> boutiques;

	public Ville() {
	}

	public int getId_ville() {
		return this.id_ville;
	}

	public void setId_ville(int id_ville) {
		this.id_ville = id_ville;
	}

	public Object getVille_nom() {
		return this.ville_nom;
	}

	public void setVille_nom(Object ville_nom) {
		this.ville_nom = ville_nom;
	}

	public List<Boutique> getBoutiques() {
		return this.boutiques;
	}

	public void setBoutiques(List<Boutique> boutiques) {
		this.boutiques = boutiques;
	}

	public Boutique addBoutique(Boutique boutique) {
		getBoutiques().add(boutique);
		boutique.setVille(this);

		return boutique;
	}

	public Boutique removeBoutique(Boutique boutique) {
		getBoutiques().remove(boutique);
		boutique.setVille(null);

		return boutique;
	}

}