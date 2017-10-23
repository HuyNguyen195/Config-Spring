<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<body>
	<h2>Hello World!</h2>
	<form:form action="/SpringHibernateJPA/add" >
      Company Name:<input type="text" name="companyName"> <br/>
      <input type="submit" value="Submit"/>
  </form:form>
</body>

</html>
