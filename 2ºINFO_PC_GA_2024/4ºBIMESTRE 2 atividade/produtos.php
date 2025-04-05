<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Clientes</title>
    <link rel="stylesheet" href="css/formularios.css">
</head>
<body>
    <div id="formprodutos">
    <h1>Formulário - Produtos</h1>
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
                    <option value="1">Mouse</option>
                    <option value="2">Teclado</option>
                    <option value="3">Monitor</option>
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
    </div>

    <?php
        include_once('connect.php');
        
        if (isset($_POST['bt_gravar'])) {
            $nome = $_POST['nome'];    
            $descricao = $_POST['descricao'];
            $categoria = $_POST['categoria'];
            
            $sql = "INSERT INTO produtos (idproduto, nome, descricao, categoria) 
                    VALUES (NULL, '$nome', '$descricao', '$categoria')";
            
            if (mysqli_query($conn, $sql)) {
                echo "Novo registro inserido com sucesso <br /><br />";
            } else {
                echo "Error: " . $sql . "<br>" . $conn->error . "<br />";
            }
        }
    ?>

    <div id="seta">
        <a href="index.html"><img src="img/voltar.png" alt="" style="margin-left: 10px; margin-top: 20px; width: 250px; height: 250px ;"></a>
    </div>
</body>
</html>