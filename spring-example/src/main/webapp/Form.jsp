<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <div>
        <h1>POST</h1>
        <form action="add_products">
            <input type="text" name="name" />
            <input type="text" name="age" />
            <input type="submit" />
        </form>
    </div>
    <div>
        <h1>GET</h1>
        <form action="get_products">
            <input name="id" type="text" />
            <input type="submit" />
        </form>
        ${list.name} - ${list.age}
    </div>
</body>
</html>