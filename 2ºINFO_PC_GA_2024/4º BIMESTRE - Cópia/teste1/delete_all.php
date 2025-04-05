<?php
// Conexão com o banco de dados
$host = 'localhost'; // ou o endereço do seu servidor
$dbname = 'formularios'; // nome do banco de dados
$user = 'root'; // usuário do banco de dados
$password = ''; // senha do banco de dados

try {
    $pdo = new PDO("mysql:host=$host;dbname=$dbname", $user, $password);
    $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
} catch (PDOException $e) {
    die("Erro ao conectar ao banco de dados: " . $e->getMessage());
}

// Verifica se o formulário foi enviado para deletar todos os clientes
if (isset($_POST['delete_all_clientes'])) {
    $stmt = $pdo->prepare("DELETE FROM cliente");

    if ($stmt->execute()) {
        echo "Todos os clientes foram excluídos com sucesso.";
    } else {
        echo "Erro ao excluir clientes.";
    }
}

// Verifica se o formulário foi enviado para deletar todos os produtos
if (isset($_POST['delete_all_produtos'])) {
    $stmt = $pdo->prepare("DELETE FROM produtos");

    if ($stmt->execute()) {
        echo "Todos os produtos foram excluídos com sucesso.";
    } else {
        echo "Erro ao excluir produtos.";
    }
}
?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Excluir Todos os Dados</title>
</head>
<body>
    <h1>Excluir Todos os Dados</h1>
    
    <h2>Excluir Todos os Clientes</h2>
    <form method="POST" action="delete_all.php">
        <p>Tem certeza que deseja excluir todos os clientes?</p>
        <button type="submit" name="delete_all_clientes">Excluir Todos os Clientes</button>
    </form>

    <h2>Excluir Todos os Produtos</h2>
    <form method="POST" action="delete_all.php">
        <p>Tem certeza que deseja excluir todos os produtos?</p>
        <button type="submit" name="delete_all_produtos">Excluir Todos os Produtos</button>
    </form>

    <br>

    <a href="index.html">Voltar</a>
</body>
</html>
