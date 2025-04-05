<?php
	$servername = "localhost";
	$username = "root";
	$password = "";
	$dbname = "formularios";
   
	$conn = mysqli_connect($servername, $username, $password, $dbname);

	if (!$conn) { 
	  die("Falha de Conexão: " . mysqli_connect_error());
	}
		
	function fechar(){	
	  $conn->close();
	  echo "Conexão Encerrada";
	}  
?>
