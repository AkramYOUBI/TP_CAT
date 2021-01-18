package dao;


import java.util.List;

import metier.entities.Produit;

public class TesteDao {

	public static void main(String[] args) {
		ProduitDaoImpl dao=new ProduitDaoImpl();
		Produit p1=dao.save(new Produit("SonyVaio",1950,800));
		Produit p2=dao.save(new Produit("HP Pavilion Gaming",2020,900));
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println("Chercher des produits ");
		List<Produit> prods=dao.produitsParMC("%H%");
		for (Produit p: prods) {
			System.out.println(p.toString());
		}
		

	}

}
