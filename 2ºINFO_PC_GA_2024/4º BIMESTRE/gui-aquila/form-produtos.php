<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Clientes</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <h1>Formulário - Clientes</h1>
    <form method="post">
        <fieldset>
            <legend>Informações do Produto</legend>
            <label>
                Nome do produto: <br>
                <input type="text" name="nome">
            </label>
            <label>
                Descrição: <br>
                <input type="text" name="descricao">
            </label>

            <label>
                Categoria: <br>
                <select name="categoria" required>
                    <option value="">Selecione uma categoria</option>
                    <option value="1">Categoria 01</option>
                    <option value="2">Categoria 02</option>
                    <option value="3">Categoria 03</option>
                </select>
            </label>
            <label>
                <input type="checkbox">
                Eu declaro que li e aceito os termos de uso.
            </label>
            <br><br>
            <label>
                <button name="bt_gravar">Fazer Cadastro</button>
            </label>
        </fieldset>
    </form>

    <?php
        include_once('connect.php');
        
        if (isset($_POST['bt_gravar'])) {
            $nome = $_POST['nome'];    
            $descricao = $_POST['descricao'];
            $categoria = $_POST['categoria'];
            
            $sql = "INSERT INTO produtos (codigo, nome, descricao, categoria) 
                    VALUES (NULL, '$nome', '$descricao', '$categoria')";
            
            if (mysqli_query($conn, $sql)) {
                echo "Novo registro inserido com sucesso <br /><br />";
            } else {
                echo "Error: " . $sql . "<br>" . $conn->error . "<br />";
            }
        }
    ?>

    <div id="seta">
        <a href="index.html"><img src="img/seta.png" alt="" style="margin-left: 900px; margin-top: -1000px; width: 300px; height: 300px ;"></a>
    </div>
</body>
</html>