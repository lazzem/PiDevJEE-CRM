package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Newslettres database table.
 * 
 */
@Entity
@Table(name="Newslettres")
@NamedQuery(name="Newslettre.findAll", query="SELECT n FROM Newslettre n")
public class Newslettre implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IdNewslettre")
	private int idNewslettre;

	@Column(name="IdUser")
	private int idUser;

	@Column(name="MailUser")
	private String mailUser;

	@Column(name="PhoneUser")
	private int phoneUser;
	
	@Column(name="status")
	private boolean status;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="Userr_UserID")
	private User user;

	public Newslettre() {
	}

	public int getIdNewslettre() {
		return this.idNewslettre;
	}

	public void setIdNewslettre(int idNewslettre) {
		this.idNewslettre = idNewslettre;
	}
	
	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}


	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public Object getMailUser() {
		return this.mailUser;
	}

	public void setMailUser(String mailUser) {
		this.mailUser = mailUser;
	}

	public int getPhoneUser() {
		return this.phoneUser;
	}

	public void setPhoneUser(int phoneUser) {
		this.phoneUser = phoneUser;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}