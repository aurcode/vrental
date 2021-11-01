<!DOCTYPE html>
<html lang="es">
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css">
    <title>Lista de clientes</title>
</head>
<body>
<div class="text-center">
    <h1>Editor de clientes</h1>
</div>
<div class="table-responsive">
    <table class="table">
        <tbody>
            <td th:text="${client.id}"></td>
            <td th:text="${client.username}"></td>
            <td th:text="${client.fisrtName}"></td>
            <td th:text="${client.lastName}"></td>
            <td th:text="${client.phone}"></td>
            <td th:text="${client.address}"></td>
        </tr>
        </tbody>
    </table>
    <form action="#" th:action="@{${id}}" method="delete"><input type="submit" value="Deleteeeeee"></form>
</div>
</body>
</html>