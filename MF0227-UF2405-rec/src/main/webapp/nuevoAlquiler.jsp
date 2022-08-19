<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<jsp:include page="plantillas/cabecera.jsp"></jsp:include>

 <h1>Alta de vehiculo</h1>
    <form action=""method="post">
        <div>Régimen del vehículo:</div>
        <div>
            <input type="radio"id="alquiler" name="regimendelvehiculo" checked>
            <label for="alquiler">Alquiler</label>
            
            <input type="radio"id="leasing" name="regimendelvehiculo">
            <label for="leasing">Leasing</label>
            
        </div>
        <div>
            <label for="matricula">Matricula:</label>
            <input type="text"name="matricula"id="matricula">
        </div>
        
        
        <div>
            <label for="tipo">Tipo Vehículo:</label>
            <select name="tipo" id="tipo">
                <option value="turismo">Turismo</option>
                <option value="furgoneta">Furgoneta</option>
                <option value="camion">Camión</option>
            </select>
        </div>
        <div>Maletero techo:</div>
        <div>
            <input type="radio"id="si" name="maleterodetecho" >
            <label for="si">Si</label>
            
            <input type="radio"id="no" name="regimendelvehiculo"checked>
            <label for="no">No</label>

        </div>
        <div>
            <label for="preciodia">Precio/Dia:</label>
            <input type="text"name="preciodia"id="preciodia">
        </div>
        <div>
            <label for="numDias">Num Dias:</label>
            <input type="number"id="numDias" name="numDias" value="1" step="1" min="1">
        </div>
        <div>
            <input type="submit" value="Alquilar">
        </div>

        

    </form>
    


<jsp:include page="plantillas/pie.jsp"></jsp:include>