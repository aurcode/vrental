<!DOCTYPE html>
<html lang="es">
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css">
        <title>Lista de tipos de licencia</title>
    </head>
    <body>
        <div class="text-center">
            <h1 >Lista de tipos de licencia</h1>
        </div>
        <div class="table-responsive">
            <table class="table">
                <thead>
                <tr>
                    <th>id</th>
                    <th>Tipo</th>
                    <th>Modificar</th>
                    <th>Eliminar</th>
                    <th>Deleted</th>
                </tr>
                </thead>
                <tbody>
                    <tr th:each="licensetype: ${licensetypes}">
                        <td th:text="${licensetype.id}"></td>
                        <td th:text="${licensetype.type}"></td>
                        <td><form action="#" th:action="@{/licensetypes/edit/{id}(id=${licensetype.id})}">
                            <button class="btn btn-warning" type="submit">Editar</button>
                        </form></td>
                        <td><form action="#" th:action="@{/licensetypes/delete/{id}(id=${licensetype.id})}">
                            <button class="btn btn-danger" type="submit">Eliminar</button>
                        </form></td>
                        <td th:text="${licensetype.deleted}"></td>
                    </tr>
                </tbody>
            </table>
            <a class="btn btn-primary" href="/licensetypes/new" role="button">Agregar un nuevo tipo de licencia</a>
            <a class="btn btn-secondary" href="/" role="button">Regresar</a>
        </div>
    </body>
</html>