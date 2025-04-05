<?php

$modelo = $_POST['modelo'];
$estoque = $_POST['estoque'];
$preco = $_POST['preco'];

$conexao = mysqli_connect('localhost','root','','locacao');
$sql = "insert auto automovel (modelo,estoque,preco) values ('$modelo','$estoque','$preco');";
mysqli_query($conexao,$sql);

echo("Ação realizada");
echo("<a href='cadautomovel.php'> Voltar </a>");