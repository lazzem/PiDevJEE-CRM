package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the BoutiqueProduit database table.
 * 
 */
@Embeddable
public class BoutiqueProduitPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="Id_produit", insertable=false, updatable=false)
	private int id_produit;

	@Column(name="Id_boutique", insertable=false, updatable=false)
	private int id_boutique;

	public BoutiqueProduitPK() {
	}
	public int getId_produit() {
		return this.id_produit;
	}
	public void setId_produit(int id_produit) {
		this.id_produit = id_produit;
	}
	public int getId_boutique() {
		return this.id_boutique;
	}
	public void setId_boutique(int id_boutique) {
		this.id_boutique = id_boutique;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof BoutiqueProduitPK)) {
			return false;
		}
		BoutiqueProduitPK castOther = (BoutiqueProduitPK)other;
		return 
			(this.id_produit == castOther.id_produit)
			&& (this.id_boutique == castOther.id_boutique);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.id_produit;
		hash = hash * prime + this.id_boutique;
		
		return hash;
	}
}