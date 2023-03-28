<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="en">
<head>

  <title>Jeu de dès</title>

</head>
<body>
<div class="container">
  <form method="post" action="">
    <fieldset>
      <legend>Inscription</legend>
      <p>Entrer vos informations pour s'inscrire sur le site</p>
      <label for="nom">NOM:<span class="requis">*</span></label>
      <input type="text" id="nom" name="nom" value="" size="20" maxlength="60" /><br />
      <label for="prenom">PRENOM<span class="requis">*</span></label>
      <input type="text" id="prenom" name="prenom" value="" size="20" maxlength="60" /> <br />
      <label for="motdepasse">Mot De Passe <span class="requis">*</span> </label>
      <input type="password" id="motdepasse" name="password" value="" size="20" maxlength="20" /><br />
      <label for="nom">Nom d'Utilisateur</label> <input type="text" id="nomutilisateur" name=login value="" size="20" maxlength="20" /> <br />
      <input type="submit" value="Inscription" class="btn-primary" /> <br />
    </fieldset>
  </form>
</div>
</body>
</html>