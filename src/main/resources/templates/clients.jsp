<!DOCTYPE html>
<html lang="es">
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css">
        <title>Lista de clientes</title>
    </head>
    <body>
        <div class="text-center">
            <h1 >Lista de clientes</h1>
        </div>
        <div class="table-responsive">
            <table class="table">
                <thead>
                <tr>
                    <th>id</th>
                    <th>username</th>
                    <th>fisrt_name</th>
                    <th>last_name</th>
                    <th>phone</th>
                    <th>address</th>
                    <th>Modificar</th>
                    <th>Eliminar</th>
                </tr>
                </thead>
                <tbody>
                    <tr th:each="client: ${clients}">
                        <td th:text="${client.id}"></td>
                        <td th:text="${client.username}"></td>
                        <td th:text="${client.fisrtName}"></td>
                        <td th:text="${client.lastName}"></td>
                        <td th:text="${client.phone}"></td>
                        <td th:text="${client.address}"></td>
                        <td><a class="btn btn-warning" th:href="${client.id}" role="button">Editar</a></td>
                        <a th:href="@{/order/details/{${client.id}}}">
                        <td><form action="#" th:action="@{/clients/(${client.id})}" method="delete">
                            <button type="submit">Eliminar</button>
                        </form></td>
                    </tr>
                </tbody>
            </table>
            <a class="btn btn-primary" href="/clients/profile" role="button">Agregar nuevo cliente</a>
        </div>
    </body>
</html>