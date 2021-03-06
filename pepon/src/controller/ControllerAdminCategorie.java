package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import model.Categorie;
import model.User;
import net.proteanit.sql.DbUtils;

public class ControllerAdminCategorie {
	
	//Appel de la connection
	//Connection connect = GetConnection.getConnectionMac();
	Connection connect = GetConnection.getConnectionWindows();
	
	public void afficherTable(JTable table) {
		
		try {
			//recuperation des info de  table categorie
			PreparedStatement sql = connect.prepareStatement("SELECT * FROM categorie");
			// Conversion de la requete en tableau d'objets
			ResultSet rs =sql.executeQuery();
			
			table.setModel(DbUtils.resultSetToTableModel(rs));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// Veriifer si la categorie est deja dans la table
	public boolean catExist(String cat) {
		Boolean msg = false;
		try {
			PreparedStatement sql = connect.prepareStatement("SELECT * FROM categorie WHERE libelle = ?");
			
			sql.setString(1, cat);
			
			ResultSet rs = sql.executeQuery();
			
			if(!rs.next()) {
				msg = true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}
	
	//Methode pour ajouter une categorie 
	public void ajouter(Categorie cat) {
		
		try {
			PreparedStatement sql = connect.prepareStatement("INSERT INTO categorie (libelle) VALUES (?)");
			sql.setString(1, cat.getLibelle());
		
			sql.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//Activer le bouton Ajouter quant'il tous les champs sont saisis pour plus de securite
	
	public void activerBtnAjouter( JTextField libel,JButton btn) {
		String nom_saisie = libel.getText();
		
		if((!nom_saisie.isEmpty())) {
			btn.setEnabled(true);
		}else {
			btn.setEnabled(false);
		}
	}
	
	//Methode pour modifier une categorie 
	
	public void modifier( String libel,String id) {
		try {
			PreparedStatement sql = connect.prepareStatement("UPDATE categorie set libelle= ? where id_categorie =?");
			sql.setString(1, libel);
			sql.setString(2, id);
			
			
			sql.executeUpdate();
			JOptionPane.showMessageDialog(null, "La cat???gorie "+ libel +" a ???t??? bien modifi???e." );
		} catch (SQLException event) {
			// TODO Auto-generated catch block
			event.printStackTrace();
		}
		
	}
	
	//Methode pour supprimer une categorie 
	
	public void supprimer(String id) {
		try {
			PreparedStatement sql = connect.prepareStatement("delete from categorie where id_categorie =?");
			
			sql.setString(1,id);
			
			sql.executeUpdate();
			JOptionPane.showMessageDialog(null,"La cat???gorie qui a id n??? "+ id +" a ???t??? bienn supprim???e." );
		} catch (SQLException event) {
			// TODO Auto-generated catch block
			event.printStackTrace();
		}
		
	}
	
	//Methode pour chercher une categorie par id
	public void findById(String id, JTextField libel) {
		try { 
			PreparedStatement sql = connect.prepareStatement("SELECT  libelle  FROM categorie WHERE id_categorie = ?");
			
			sql.setNString(1, id);
			
			ResultSet rs = sql.executeQuery();
			
			if(rs.next()) {
				//String id = rs.getString(1);
				String libelle = rs.getString(1);
				
			
				libel.setText(libelle);
				
			}else {
				libel.setText("");
				
			}
			
		} catch (SQLException event) {
			// TODO Auto-generated catch block
			event.printStackTrace();
		}
	}
	
	
}
