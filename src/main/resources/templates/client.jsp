<!DOCTYPE html>
<html lang="es">
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css">
    <title>Editor de clientes</title>
</head>
<body>
<div class="text-center">
    <h1>Editor de clientes</h1>
    <p>Puedes actualizar los datos actuales:</p>
</div>
<div class="container">
    <div class="row">
        <div class="col">
            <form action="#" th:action="@{/clients/edit/{id}(id=${client.id})}" th:object="${client}" method="post">
                <div class="form-group">
                    <label for="username">Username</label>
                    <input type="text" class="form-control"
                           th:field="*{username}" id="username" required="true">
                    <p class="alert alert-danger" th:if="${#fields.hasErrors('username')}" th:errors="*{username}"></p>
                </div>
                <div class="form-group">
                    <label for="fisrtName">Nombre(s)</label>
                    <input type="text" class="form-control"
                           th:field="*{fisrtName}" id="fisrtName" required="true">
                    <p class="alert alert-danger" th:if="${#fields.hasErrors('fisrtName')}" th:errors="*{fisrtName}"></p>
                </div>
                <div class="form-group">
                    <label for="lastName">Apellido(s)</label>
                    <input type="text" class="form-control"
                           th:field="*{lastName}" id="lastName">
                    <p class="alert alert-danger" th:if="${#fields.hasErrors('lastName')}" th:errors="*{lastName}"></p>
                </div>
                <div class="form-group">
                    <label for="phone">Número telefonico</label>
                    <input type="text" class="form-control"
                           th:field="*{phone}" id="phone" required="true">
                    <p class="alert alert-danger" th:if="${#fields.hasErrors('phone')}" th:errors="*{phone}"></p>
                </div>
                <div class="form-group">
                    <label for="address">Dirreción(s)</label>
                    <input type="text" class="form-control"
                           th:field="*{address}" id="address" required="true">
                    <p class="alert alert-danger" th:if="${#fields.hasErrors('address')}" th:errors="*{address}"></p>
                </div>
                <tr>
                    <button class="btn btn-success" type="submit">Guardar</button>
                </tr>

            </form>
        </div>
    </div>
</div>
</body>
</html>