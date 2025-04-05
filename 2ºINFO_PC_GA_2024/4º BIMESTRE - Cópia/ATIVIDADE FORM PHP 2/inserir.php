<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="utf-8">
		<title>Inserir</title>
	</head>
	<body>
		<form method="post">
			Montadora:<input type="text" name="montadora" /><br /><br />
			Modelo:<input type="text" name="modelo" /><br /><br />
			Cor:<input type="text" name="cor" /><br /><br />
			Ano:<input type="text" name="ano" /><br /><br />
			<input type="submit" name="bt_gravar" value="Gravar" />
		</form>
		<?php
		
	/*A função include() do PHP tem como objetivo incluir (como o próprio nome diz) 
        um arquivo dentro do outro quando acessado. */	
		include_once('connect.php');
		
	/*A função isset() verifica se uma variável foi definida corretamente. Esta função retornará true (verdadeiro) 
	    quando uma variável existir e false (falso) quando uma variável não existir */
		if(isset($_POST['bt_gravar'])){
			$montadora = $_POST['montadora'];	
			$modelo = $_POST['modelo'];
			$cor = $_POST['cor'];
			$ano = $_POST['ano'];
			
			$sql = "INSERT INTO clientes (codigo, montadora, modelo, cor, ano) 
			    	                 VALUES (NULL,'$montadora','$modelo','$cor','$ano')";
			
			if (mysqli_query($conn, $sql)) {
			  echo "Novo registro inserido com sucesso <br /><br />";
			} else {
			  echo "Error: " . $sql . "<br>" . $conn->error . "<br />";
		    }			
		}			
		?>	
		<br /><br />
        <button onclick = "document.location='index.html'" > Voltar </button>	
	</body>
</html>