package dao;

import java.util.List;

import metier.entities.Produit;
/*creation d'une interface on joue le role d'un concepteur donc on connait les diff operations que je dois definir dans mon app*/

public interface IProduitDao {
	public Produit save(Produit p); /*save: ajouter un produit + retourner produit 'verification'*/
	public List<Produit> produitsParMC(String mc); /*recherche des produits par mot clé */
	public Produit getProduit (Long id); /*consulter un produit par son id*/
	public Produit update(Produit p);/*mise a jour*/
	public void deleteProduit(Long id);/*supp un produit*/
	
}
