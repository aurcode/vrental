<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Creador de clientes</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<div class="text-center">
    <h1>Crear nuevo tipos de licencia</h1>
</div>

<div class="container">
    <div class="row">
        <div class="col">
            <form action="#" th:action="@{/licensetypes/new}" th:object="${licensetype}" method="post">
                <div class="form-group">
                    <label for="type">Tipo</label>
                    <input type="text" class="form-control"
                           th:field="*{type}" id="type" required="true">
                    <p class="alert alert-danger" th:if="${#fields.hasErrors('type')}" th:errors="*{type}"></p>
                </div>
                <tr>
                    <button class="btn btn-success" type="submit">Guardar</button>
                    <a class="btn btn-warning" href="/licensetypes/" role="button">No guardar</a>
                </tr>

            </form>
        </div>
    </div>
</div>
</body>
</html>