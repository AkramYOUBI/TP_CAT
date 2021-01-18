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
      <!-- <li class="nav-item">
        <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Delete Product</a>
      </li> -->
    </ul>
  </div>
  <form action="chercher.do" method="get">
  <label>Mot Clé</label>
  <input type="text" name="motCle" value="${model.motCle }"/>
    <button class="btn btn-primary">Chercher</button>
  </form>
  <table class="table table-striped">
  <tr>
  <th>ID</th><th>DESIGNATION</th><th>PRIX</th><th>QANTITE</th>
  </tr>
  <c:forEach items="${model.produits}" var="p">
  <tr>
  	<td>${p.id}</td>
  	<td>${p.designation}</td>
  	<td>${p.prix}</td>
  	<td>${p.quantite}</td>
  </tr>
  </c:forEach>
  </table>
</div>
</div>
</body>
</html>







