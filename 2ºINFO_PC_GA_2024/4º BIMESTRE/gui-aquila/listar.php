<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="utf-8">
    <title>Listar</title>
</head>
<body>
    <?php
    include('connect.php');
    

    echo "<h2>Lista de Clientes</h2>";
    echo "<table border='1'>
            <tr>
                <th>Nome</th>
                <th>Endereço</th>
                <th>CPF</th>
                <th>Usuário</th>
                <th>Senha</th>
            </tr>";
    

    $sql = "SELECT * FROM cliente"; 
    $result = $conn->query($sql); 
    
    if ($result->num_rows > 0) {

        while($linha = $result->fetch_assoc()) {
            echo "<tr>
                    <td>{$linha['nome']}</td>
                    <td>{$linha['endereco']}</td>
                    <td>{$linha['cpf']}</td>
                    <td>{$linha['usuario']}</td>
                    <td>{$linha['senha']}</td>
                  </tr>";
        }
    } else {
        echo "<tr><td colspan='5'>Nenhum cliente encontrado</td></tr>";
    }
    echo "</table>";

    echo "<h2>Lista de Produtos</h2>";
    echo "<table border='1'>
            <tr>
                <th>Nome</th>
                <th>Descrição</th>
                <th>Categoria</th>
            </tr>";
    

    $sql = "SELECT nome, descricao, categoria FROM produtos"; 
    $result = $conn->query($sql); 
    
    if ($result->num_rows > 0) {

        while($linha = $result->fetch_assoc()) {
            echo "<tr>
                    <td>{$linha['nome']}</td>
                    <td>{$linha['descricao']}</td>
                    <td>{$linha['categoria']}</td>
                  </tr>";
        }
    } else {
        echo "<tr><td colspan='3'>Nenhum produto encontrado</td></tr>";
    }
    echo "</table>";
    ?>

    <br /><br />
    <button onclick="document.location='index.html'">Voltar</button>
</body>
</html>
