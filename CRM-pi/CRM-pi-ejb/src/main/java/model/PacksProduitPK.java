package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the PacksProduits database table.
 * 
 */
@Embeddable
public class PacksProduitPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="Packs_IdPack", insertable=false, updatable=false)
	private int packs_IdPack;

	@Column(name="Produit_Id_produit", insertable=false, updatable=false)
	private int produit_Id_produit;

	public PacksProduitPK() {
	}
	public int getPacks_IdPack() {
		return this.packs_IdPack;
	}
	public void setPacks_IdPack(int packs_IdPack) {
		this.packs_IdPack = packs_IdPack;
	}
	public int getProduit_Id_produit() {
		return this.produit_Id_produit;
	}
	public void setProduit_Id_produit(int produit_Id_produit) {
		this.produit_Id_produit = produit_Id_produit;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PacksProduitPK)) {
			return false;
		}
		PacksProduitPK castOther = (PacksProduitPK)other;
		return 
			(this.packs_IdPack == castOther.packs_IdPack)
			&& (this.produit_Id_produit == castOther.produit_Id_produit);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.packs_IdPack;
		hash = hash * prime + this.produit_Id_produit;
		
		return hash;
	}
}