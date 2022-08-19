<%@page import="java.util.List"%>
<%@page import="dao.AlquilerDAOMySQL"%>
<%@page import="dao.AlquilerDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="modelo.Alquiler"%>
<jsp:include page="plantillas/cabecera.jsp"></jsp:include>

<%
	
	String regimendelvehiculo = request.getParameter("regimendelvehiculo");
	Boolean alquiler=false, leasing=false;
	if (regimendelvehiculo.equals("alquiler")) {
		alquiler=true;
	}
	if (regimendelvehiculo.equals("leasing")) {
		leasing=true;
	}
	String matricula = request.getParameter("matricula");
	String tipo= request.getParameter("tipo");
	String maletero= request.getParameter("maletero");
	Boolean si=false, no=false;
	if (maletero.equals("si")) {
		si=true;
	}

	if (maletero.equals("no")) {
		no=true;
	}
	String precio = request.getParameter("precio");
	double precioDia = Double.parseDouble("precio");
	String num_dias = request.getParameter("num_dias");
	int numDias = Integer.parseInt("num_dias");
	
	
	
			
	
	
	int calcularImporte = Integer.parseInt(request.getParameter("calcularImporte"));
	Alquiler a = new Alquiler( alquiler, matricula,tipo, maletero, precioDia,numDias);
	
	AlquilerDAO alquilerDAO = new AlquilerDAOMySQL();
	alquilerDAO.insertarAlquiler(a);

%>

	<ul>
		<li>Regimen:  <%=regimendelvehiculo %> </li>
		<li>Matricula: <%=matricula %></li>
		<li>Tipo Vehiculo: <%=tipo %></li>
		<li>Maletero: <%=maletero %></li>
		<li>Precio/dia: <%=precioDia %></li>
		<li>Num.dias: <%=numDias %></li>
		<li>Precio total: <%=calcularImporte %></li>
	</ul>

<a href="index.jsp">Volver</a>

<jsp:include page="plantillas/pie.jsp"></jsp:include>