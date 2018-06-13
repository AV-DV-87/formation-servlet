# formation-servlet
Application simple permettant de démontrer l'utilisation de l'API J2EE Servlet

# Sujet 1
Créer une application Web avec une page unique permettant d'afficher votre pronostique du résultat du match France - Australie de la coupe du monde 2018.

Contraintes :
- L'application doit répondre sur l'URL : http://localhost:8080/monpronostique/france-australie
- Les sources du projet doivent comporter :
	- Un fichier de configuration Maven pom.xml avec
		- La version de java (source et target) 1.8
		- La dépendance vers l'API servlet v3.1.0
	- La structure de dossier 'src' nécessaire à Maven (main/java, main/resource, main/webapp)
	- Un descripteur d'application Web (web.xml) avec
		- Une seule servlet portant le nom 'PronoServlet'
	- La classe Java correspondant à la servlet demandée avec
		- La redéfinition de la méthode doGet() permettant d'afficher votre pronostique dans réponse HTTP
	