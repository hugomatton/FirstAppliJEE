<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Bonjour</title>
    </head>
    <body>
    	<%@ include file="menu.jsp" %>
    	<p>Bonjour</p>
        <p>nom : ${ empty name ? '??' : name}</p>
        <p>age : ${ empty age ? '??' : age}</p>
        <p>nom tableau : ${ noms[0] }</p>
        <p>Les beans c'est genial</p>
        <p>auteur --> prenom: ${auteur.prenom } nom: ${auteur.nom }</p>
        <p>${auteur.actif ? "L'auteur est actif" : "L'auteur n'est pas actif" }</p>
        
    </body>
</html>