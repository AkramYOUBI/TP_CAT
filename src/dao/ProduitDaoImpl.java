package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import metier.entities.Produit;

/*lors de l'implemetation on doit redefinire les methodes "@override"*/
public class ProduitDaoImpl implements IProduitDao {

	@Override
	public Produit save(Produit p) { /*pour enreg des produits on doit comm par une cnx puis prepare statment*/
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement("INSERT INTO PRODUITS (DESIGNATION,PRIX,QUANTITE) VALUES (?,?,?)");
			ps.setString(1, p.getDesignation());
			ps.setDouble(2, p.getPrix());
			ps.setInt(3, p.getQuantite());
			ps.executeUpdate();
			
			/*il faut recuperer le ID pour cela on fait un autre p.s*/
			PreparedStatement ps2= connection.prepareStatement("SELECT MAX(ID) AS MAX_ID FROM PRODUIT");
			ResultSet rs=ps2.executeQuery();
			if (rs.next()) {
				p.setId(rs.getLong("MAX_ID"));
			}/*afficher les ID apres l'enregistrement "MAX_ID" car il est auto incementer*/
			
			ps.close(); /*fermer l'objet prepare statement*/
			/*connection.close --- NON-- car la cnx est ouverte une seule fois !!*/
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return p;
	}

	@Override
	public List<Produit> produitsParMC(String mc) {
		List<Produit> produits=new ArrayList<Produit>(); /*creation d'une liste de produit*/
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement("SELECT * FROM PRODUITS WHERE DESIGNATION LIKE ?");
			ps.setString(1, mc);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Produit p=new Produit(); /*constructeur p.d*/
				p.setId(rs.getLong("ID"));
				p.setDesignation(rs.getString("DESIGNATION"));
				p.setPrix(rs.getDouble("PRIX"));
				p.setQuantite(rs.getInt("QUANTITE"));
				produits.add(p);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		return produits;
	}

	@Override
	public Produit getProduit(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produit update(Produit p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduit(Long id) {
		// TODO Auto-generated method stub
		
	}

}
