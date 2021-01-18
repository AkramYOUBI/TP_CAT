<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <title>Confirmation</title>
 <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
</head>
<body>
<div class="container col-md-offset-1">
	<div class="card text-center">
  <div class="card-header">
    <ul class="nav nav-pills card-header-pills">
      <li class="nav-item">
        <a class="nav-link active" href="index.do">Produits</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="saisie.do">Saisie Des Produits</a>
      </li>
      <li class="nav-item">
        <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Delete Product</a>
      </li>
    </ul>
  </div>
  
  
  
 <div class="form-group">
 <label>ID:</label>
 <label>${produit.id}</label>
 </div>
 <div class="form-group">
 <label>Designation:</label>
 <label> ${produit.designation}</label>
 </div>
 	<div class="form-group">
 	<label>Prix:</label>
	 <label>${produit.prix}</label>
 	</div>
  	<div class="form-group">
 	<label>Quantite:</label>
 	<label>${produit.quantite}</label>
 </div>
</div>
</div>
</body>
</html>







