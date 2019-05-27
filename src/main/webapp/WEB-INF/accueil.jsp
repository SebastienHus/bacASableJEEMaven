<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>


<!DOCTYPE html>

<html>

	<head>
	
		<meta charset="UTF-8">
		<link rel="stylesheet" type="text/css" href="asset/css/style.css">
		<title>Accueil</title>
	
	</head>
	
	
	<body>
	
		<h1>Hello World</h1>
		
		<p>Paragraphe</p>
		
		<p>${messageTransmis} ${name} ${pseudoTransmis}</p>
		
		<nav>
		
			<a href="/inscription" title="Inscription" >Inscription</a>
			
			<a  href="/auteur" title="A propos de l'auteur" >A propos de l'auteur</a>
		
		</nav>
		
		
		<p>${book.author}</p>
		<p>${book.title}</p>
		
		<p>${bookList}</p>
		<p>${bookList[0].author}</p>
		
		<%-- equivalent d un sysout en taglit --%>
		<c:out value="<p> je suis un paragraphe.</p>" escapeXml="false" />
		
		<ul>
		<c:forEach items="${bookList}" var ="book">
		
			<li><c:out value="${book.author}"></c:out></li>
			
		</c:forEach>
		</ul>
		
	
	</body>
	
</html>