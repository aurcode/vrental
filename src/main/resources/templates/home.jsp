<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org">
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css">
        <title>Vrental</title>
    </head>
    <body>
        <div class="text-center">
            <h1 >Bienvenidos a Vrental</h1>
            <h3>La mejor pagina para alquilar tus vehiculos</h3>
        </div>
        <div class="table-responsive">
            <table class="table">
                <thead>
                <tr>
                    <th>plateNumber</th>
                    <th>Type</th>
                    <th>Price</th>
                </tr>
                </thead>
                <tbody>
                    <tr th:each="vehicle: ${vehicles}">
                        <td th:text="${vehicle.plateNumber}"></td>
                        <td th:text="${vehicle.idVehicleType.type}"></td>
                        <td th:text="${vehicle.idVehiclePrice.price_per_day}"></td>
                    </tr>
                </tbody>
            </table>
        </div>
    </body>
</html>