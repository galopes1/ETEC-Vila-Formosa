<?php
$host = 'localhost'; 
$dbname = 'formularios'; 
$user = 'root'; 
$password = ''; 

try {
    $pdo = new PDO("mysql:host=$host;dbname=$dbname", $user, $password);
    $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
} catch (PDOException $e) {
    die("Erro ao conectar ao banco de dados: " . $e->getMessage());
}

if (isset($_POST['limpar_clientes'])) {
    $stmt = $pdo->prepare("DELETE FROM cliente");

    if ($stmt->execute()) {
        echo "Todos os clientes foram excluídos com sucesso.";
    } else {
        echo "Erro ao excluir clientes.";
    }
}

if (isset($_POST['limpar_produtos'])) {
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
    <form method="POST" action="limpar.php">
        <p>Tem certeza que deseja excluir todos os clientes?</p>
        <button type="submit" name="limpar_clientes">Excluir Todos os Clientes</button>
    </form>

    <h2>Excluir Todos os Produtos</h2>
    <form method="POST" action="limpar.php">
        <p>Tem certeza que deseja excluir todos os produtos?</p>
        <button type="submit" name="limpar_produtos">Excluir Todos os Produtos</button>
    </form>

    <br>

    <a href="index.html">Voltar</a>
</body>
</html>
