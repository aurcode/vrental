<!DOCTYPE html>
<html lang="es">
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css">
    <title>Editor de tipos de licencia</title>
</head>
<body>
<div class="text-center">
    <h1>Editor de tipos de licencia</h1>
    <p>Puedes actualizar los datos actuales:</p>
</div>
<div class="container">
    <div class="row">
        <div class="col">
            <form action="#" th:action="@{/licensetypes/edit/{id}(id=${licensetype.id})}" th:object="${licensetype}" method="post">
                <div class="form-group">
                    <label for="type">Tipo</label>
                    <input type="text" class="form-control"
                           th:field="*{type}" id="type" required="true">
                    <p class="alert alert-danger" th:if="${#fields.hasErrors('type')}" th:errors="*{type}"></p>
                </div>
                <tr>
                    <button class="btn btn-success" type="submit">Actualizar</button>
                    <a class="btn btn-warning" href="/licensetypes/" role="button">No actualizar</a>
                </tr>

            </form>
        </div>
    </div>
</div>
</body>
</html>