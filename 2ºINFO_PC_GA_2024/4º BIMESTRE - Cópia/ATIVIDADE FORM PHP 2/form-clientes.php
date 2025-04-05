<!DOCTYPE html>
    <html lang="pt-BR">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <h1>Formulário - Clientes</h1>
        <form action="inserir.php" method="get">
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
                Usuário: <br>
                <input type="text" name="usuario">
            </label>

            <label>
                Senha: <br>
                <input type="password" name="senha">
            </label>
            <label>
                <input type="checkbox">
                Eu declaro que li e aceito os termos de uso.
            </label>
            <br><br>
            <label>
                <button>Fazer Cadastro</button>
            </label>
            </fieldset>
        </form>
        <?php
		
	/*A função include() do PHP tem como objetivo incluir (como o próprio nome diz) 
        um arquivo dentro do outro quando acessado. */	
		include_once('connect.php');
		
	/*A função isset() verifica se uma variável foi definida corretamente. Esta função retornará true (verdadeiro) 
	    quando uma variável existir e false (falso) quando uma variável não existir */
		if(isset($_POST['bt_gravar'])){
			$nome = $_POST['nome'];	
			$endereco = $_POST['endereco'];
			$cpf = $_POST['cpf'];
			$usuario = $_POST['usuario'];
            $usuario = $_POST['senha'];
			
			$sql = "INSERT INTO clientes (codigo, nome, endereco, cpf, usuario, senha) 
			    	                 VALUES (NULL,'$nome','$endereco','$cpf','$usuario','$senha')";
			
			if (mysqli_query($conn, $sql)) {
			  echo "Novo registro inserido com sucesso <br /><br />";
			} else {
			  echo "Error: " . $sql . "<br>" . $conn->error . "<br />";
		    }			
		}			
		?>	
        
        <div id="seta">
            <a href="index.html"><img src="img/seta.png" alt="" style="margin-left: 900px; margin-top: -1000px; width: 300px; height: 300px ;"></a>
        </div>
    </body>
</html>