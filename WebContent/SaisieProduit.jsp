<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <title>Insert title here</title>
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
  <form action="Confirmation.jsp" method="post">
  
  <div class="form-group">
  <label class="control-label">Désignation</label>
  <input type="text" name="designation" class="form-control"/>
  <span></span>
  </div>
  
  <div class="form-group">
  <label class="control-label">Prix</label>
  <input type="text" name="prix" class="form-control"/>
  <span></span>
  </div>
  
  <div class="form-group">
  <label class="control-label">Quantité</label>
  <input type="text" name="quantité" class="form-control"/>
  <span></span>
  </div>
  
  <div>
  
  <button type="submit" class="btn btn-primary">Save</button>
  </div>
  
  </form>
  
</div>
</div>
</body>
</html>







