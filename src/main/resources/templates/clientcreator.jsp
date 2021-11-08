<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Creador de clientes</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<div class="text-center">
    <h1>Crear nuevo cliente</h1>
</div>
<div class="container">
    <div class="row">
        <div class="col">
            <form action="#" th:action="@{/clients/new}" th:object="${client}" method="post">
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
                    <a class="btn btn-warning" href="/clients/" role="button">No guardar</a>
                </tr>

            </form>
        </div>
    </div>
</div>
</body>
</html>