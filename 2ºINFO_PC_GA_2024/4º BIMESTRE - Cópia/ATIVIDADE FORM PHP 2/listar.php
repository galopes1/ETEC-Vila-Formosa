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
						<td>Código</td>
						<td>Montadora</td>
						<td>Modelo</td>
						<td>Cor</td>
						<td>Ano</td>
					</tr>";
					
		$sql = "SELECT * FROM tb_veiculos";			
		$result = $conn->query($sql); 
		
		if ($result->num_rows > 0) { /* função num_rows()verifica se há mais de zero linhas 
                               retornadas. */			
			while($linha = $result->fetch_assoc()) {/* Função fetch_assoc()coloca todos os 
				   resultados em uma matriz associativa pela qual podemos fazer um loop */
						
				echo "
							<td>$linha[codigo]</td>
							<td>$linha[montadora]</td>
							<td>$linha[modelo]</td>
							<td>$linha[cor]</td>
							<td>$linha[ano]</td>
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


