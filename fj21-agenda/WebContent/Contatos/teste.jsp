  <!DOCTYPE html>
  <html>
  <head>
  <meta charset="UTF-8">
  <title>Validando formulários com JQuery Validation</title>
  <!-- Inclusão do jQuery-->
  <script src="http://code.jquery.com/jquery-1.11.1.js"></script>
  <!-- Inclusão do Plugin jQuery Validation-->
  <script src="http://jqueryvalidation.org/files/dist/jquery.validate.js"></script>
  
  <script>
  $("#formComentario").validate();
  </script>
  </head>
  <body>
   
  <form id="formComentario" method="post" action="">
    <fieldset>
      <legend>Por favor preencha o nome, e-mail e comentário</legend>
      <p>
        <label for="cnome">Nome (obrigatório, pelo menos 2 caracteres)</label>
        <input type="text" id="cnome" name="nome" required minlength="2">
      </p>
      <p>
        <label for="cemail">E-mail (obrigatório)</label> 
        <input type="email" id="cemail" name="email" required >
      </p>
      <p>
        <label for="ccomentario">Seu comentário (obrigatório)</label>
        <textarea id="ccomentario" name="comentario" required ></textarea>
      </p>
      <p>
        <input type="submit" value="Enviar">
      </p>
    </fieldset>
  </form>
  <!-- Inclusão das validações com o Plugin jQuery Validation-->

  </body>
  </html> 