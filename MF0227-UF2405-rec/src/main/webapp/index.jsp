<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page import="modelo.Alquiler"%>
<%@page import="dao.AlquilerDAOMySQL" %> 
<%@page import="dao.AlquilerDAO"%>
<%@page import="java.util.List" %>
<jsp:include page="/plantillas/cabecera.jsp"></jsp:include>

<h1>Datos del alquiler</h1>
<% 

AlquilerDAO alquilerDAO = new AlquilerDAOMySQL();
List<Alquiler> lista = alquilerDAO.getListaAlquileres();
   if (lista==null) {
%>
<h2>No hay datos de alquileres registrados</h2>
<% } else {%>
<table class="estilo-tabla">
	<tr>
		<th>Regimen</th>
		<th>Matrícula</th>
		<th>Tipo Vehículo</th>
		<th>Maletero Techo</th>
		<th>Precio/dia</th>
		<th>Num. Días</th>
	</tr>
	<% 
		for (Alquiler a:lista) {
			%>
			<tr>
				<td> <% if (a.isAlquiler()) { %> Alquiler <% }else {%> Leasing <%} %></td>
				<td><%=a.getMatricula() %></td>
				<td><%=a.getTipoVehiculo() %></td>
				<td> <% if (a.isAlquiler()) { %> Si <% }else {%> No <%} %></td>
				<td><%=a.getPrecioDia() %></td>
				<td><%=a.getNumDias() %></td>
			</tr>
			<%
		}
}
	%>
	
</table>


<jsp:include page="/plantillas/pie.jsp"></jsp:include>