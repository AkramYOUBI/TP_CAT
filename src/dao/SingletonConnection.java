package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/*la creation de cette classe est pour but d'assurer qu'on doit creer un seule cnx qlq soit le nombre de requetes ou d'utilisateur
 * et pour economiser les resource au nv du serveur et la b.d*/

public class SingletonConnection {
	private static Connection connection;
	static {
		/*quand une classe est chargé en memoire le 1er bloc qui s'éxecute c'est le bloc static aussi pour creer un objt une seule fois*/
		
		try {
			Class.forName("com.mysql.jdbc.Driver"); /*pour creer une cnx il faut charger le pilot jdbc*/
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/DB_CATAL","root","AkramYOUBI1997"); 
		} catch (Exception e) { /*si le pilot n'existe pas*/
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getConnection() { /*get connection car elle est private*/
		return connection;
	}
}
