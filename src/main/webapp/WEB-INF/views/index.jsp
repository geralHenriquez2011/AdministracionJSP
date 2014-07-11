<%@ include file="/WEB-INF/views/include.jsp" %>
<html>
  <head><title>Hello :: Spring Application</title></head>
  <body>
    <h1>Hello - Spring Application</h1>
    <p>Greetings, it is now <c:out value="${now}"/>
    ${msg}
    </p>
    
    <p><fmt:message key="greeting"/> <c:out value="${usuarios.fecha}"/></p>
    
    <h3>Usuarios</h3>
    
    
    
  </body>
</html>