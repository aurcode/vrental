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
                    <th>Deleted</th>
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
                        <td><form action="#" th:action="@{/clients/edit/{id}(id=${client.id})}">
                            <button class="btn btn-warning" type="submit">Editar</button>
                        </form></td>
                        <td><form action="#" th:action="@{/clients/delete/{id}(id=${client.id})}">
                            <button class="btn btn-danger" type="submit">Eliminar</button>
                        </form></td>
                        <td th:text="${client.deleted}"></td>
                    </tr>
                </tbody>
            </table>
            <a class="btn btn-primary" href="/clients/new" role="button">Agregar nuevo cliente</a>
            <a class="btn btn-secondary" href="/" role="button">Regresar</a>
        </div>
    </body>
</html>