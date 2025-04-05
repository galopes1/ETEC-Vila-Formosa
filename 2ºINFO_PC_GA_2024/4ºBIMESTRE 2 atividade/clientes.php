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
    <div id="formclientes">
    <h1>Formulário - Clientes</h1>
    <form method="post">
        <fieldset>
            <legend>Cadastro</legend>
            <label>
                Nome Completo: <br>
                <input type="text" name="nome">
            </label>
            <label>
                Endereço: <br>
                <input type="text" name="endereco">
            </label>

            <label>
                CPF: <br>
                <input type="text" name="cpf">
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
            $endereco = $_POST['endereco'];
            $cpf = $_POST['cpf'];
            
            $sql = "INSERT INTO cliente (idcliente, nome, endereco, cpf) 
                    VALUES (NULL, '$nome', '$endereco', '$cpf')";
            
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
