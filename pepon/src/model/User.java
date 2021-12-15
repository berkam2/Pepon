package model;

public class User {

	//attibuts
	private String nom,	prenom, email, mot_passe;
	private int id_statut, id_user;
	
	//constructor
	public User(String nom, String prenom, String email, String mot_passe) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.mot_passe = mot_passe;
	}

	public User(String nom, String prenom, String email, String mot_passe, int id_statut) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.mot_passe = mot_passe;
		this.id_statut = id_statut;
	}
	
	public User(String nom, String prenom, String email, String mot_passe, int id_statut, int id_user) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.mot_passe = mot_passe;
		this.id_statut = id_statut;
		this.id_user = id_user;
	}

	//getter
	public int getId_user() {
		return id_user;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getEmail() {
		return email;
	}

	public String getMot_passe() {
		return mot_passe;
	}

	public int getId_statut() {
		return id_statut;
	}

}
