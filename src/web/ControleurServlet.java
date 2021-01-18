package web;

import java.io.IOException;

import java.util.List;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.IProduitDao;
import dao.ProduitDaoImpl;
import metier.entities.Produit;

public class ControleurServlet extends HttpServlet {
	private IProduitDao metier;
	
	@Override
	public void init() throws ServletException {
		metier= new ProduitDaoImpl();
		
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path=request.getServletPath();
		if (path.equals("/index.do")) {
			request.getRequestDispatcher("produits.jsp").forward(request, response);
		}
		else if (path.equals("/chercher.do")) {
			String motCle=request.getParameter("motCle"); /*Lire le mot clé*/
			ProduitModel model=new ProduitModel();
			model.setMotCle(motCle); /*stocker mot cle dans le model 'respect du MVC*/
			List<Produit> produits=metier.produitsParMC("%"+motCle+"%");
			model.setProduits(produits);/*stocker list de produit dans le model*/
			request.setAttribute("model", model);
			request.getRequestDispatcher("produits.jsp").forward(request, response);	
	}
		else if(path.contentEquals("/saisie.do")) {
			request.getRequestDispatcher("SaisieProduit.jsp").forward(request, response);
			
		}
		else if(path.equals("Confirmation.jsp")/*&&(request.getMethod().equals("post"))*/) {
			String des=request.getParameter("Designation");
			double prix=Double.parseDouble(request.getParameter("prix"));
			int quantite=Integer.parseInt(request.getParameter("quantite"));
			Produit pt=metier.save(new Produit(des, prix, quantite));
			request.setAttribute("produit", pt);
			/*request.getRequestDispatcher("Confirmation.jsp").forward(request, response);*/
		}
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response); /*pour eviter if else ... on appel doget*/
	}
}






