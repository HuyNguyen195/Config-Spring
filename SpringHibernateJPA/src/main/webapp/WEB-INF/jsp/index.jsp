<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h2>Company</h2>
	<ul>
		<c:forEach var="list" items="${listCompany}">
			<li>${list.getCompanyName()}</li>
		</c:forEach>
	</ul>
</body>
	

</html>
