<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="utf-8">	
		<title>Listar</title>
	</head>
	<body>
		<?php
       /*A função include() do PHP tem como objetivo incluir (como o próprio nome diz) 
        um arquivo dentro do outro quando acessado. */			
	 	include('connect.php');
		
		// <table> inicio da tabela que contera os valores exibidos
		echo "<table> 
					<tr> 
						<td>nome</td>
						<td>endereco</td>
						<td>cpf</td>
						<td>usuario</td>
						<td>senha</td>
					</tr>";
					
		$sql = "SELECT * FROM cliente";			
		$result = $conn->query($sql); 
		
		if ($result->num_rows > 0) { /* função num_rows()verifica se há mais de zero linhas 
                               retornadas. */			
			while($linha = $result->fetch_assoc()) {/* Função fetch_assoc()coloca todos os 
				   resultados em uma matriz associativa pela qual podemos fazer um loop */
						
				echo "
							<td>$linha[nome]</td>
							<td>$linha[endereco]</td>
							<td>$linha[cpf]</td>
							<td>$linha[usuario]</td>
							<td>$linha[senha]</td>
						</tr>";
				
				
				 }
				// Fim da tabela 
				echo "</table>";
		}
		?>
		<br /><br />
        <button onclick = "document.location='index.html'" > Voltar </button>	
	</body>
</html>


