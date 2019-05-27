<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
	
		<meta charset="UTF-8">
		<title>Page contact</title>
		
	</head>
	
	
	<body>
	
		<h1>Page de contact</h1>
		
		<form method="post" action="/accueil">
		
			<label for="pseudo" >Pseudo : </label><input type="text" id="pseudo" name="pseudo" placeholder="seb" />
			<label for="pass" >Mot de passe : </label><input type="password" id="pass" name="pass" placeholder="123 n'est definitivement pas un mot de passe sécurisé !" />
			
			
			<input type="submit" value="Envoyer"/>
		
		</form>
	
	</body>
	
</html>