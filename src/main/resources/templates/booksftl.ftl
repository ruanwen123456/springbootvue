<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>图书列表</title>
</head>
<body>
    <table border="1">
        <tr>
            <td>图书编号</td>
            <td>图书名称</td>
            <td>图书作者</td>
        </tr>
            <#list books as book>
                <tr>
                    <td>${book.id}</td>
                    <td>${book.name}</td>
                    <td>${book.author}</td>
                </tr>
            </#list>
    </table>
</body>
</html>