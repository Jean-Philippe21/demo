# demo
**TP 2**

**Etage 1**
 génération de l'application sur Spring

**Etage 2**

**Etage 3**

**Etage 4**

**Etage 5**

    Web : La dépendance spring-web contient des utilitaires Web 
    spécifiques communs pour les environnements Servlet et Portlet
    JPA : est une interface de programmation Java permettant aux 
    développeurs d'organiser des données relationnelles dans des 
    applications utilisant la plateforme Java.
    Hibernate:est un framework open source gérant la persistance des 
    objets en base de données relationnelle. Il fait le lien entre les 
    données dans l'application Spring et la structure relationnelle des 
    données dans la base de données
    H2 : est un système de gestion de base de données relationnelles 
    écrit en Java. En l'occurence, il est utilisé pour avoir une 
    instance de la base de donnée en mémoire.
    DevTools : permettent aux développeurs Web de tester et de déboguer
    leur code.
    Thymeleaf : est un moteur de template pouvant générer du 
    XML/XHTML/HTML5. Il est utilisé dans un environnement web pour la 
    génération de vue pour les applications web basées sur le modèle MVC.

**Etage 6**

**Etage 7**

**Etage 8**

**Etage 9**

**Etape 10**

**Etape 11**

**Etape 12**

**Etape 13**

    1. l'url d'appel "/greeting" est paramétré dans l'annotation @GetMapping du 
    controller greeting. 
    2. L'HTML à afficher est choisi dans le return du controller
    3. On envoi le nom à qui nous disons bonjour a la vue avec la méthode addAttribute de
    l'objet Model

**Etape 14**

   

**Etape 15**

**Etape 16**

**Etape 17**
 
  Il y a la nouvelle table "Address" qui apparait dans l'arborescence a gauche de la page h2 
  
**Etape 18**

 Grace à l'annotation @Entity, hibernate detecte la classe et fait automatiquement le lien entre les données réelles contenu dans la base éphémère et les propriétés de la classe "Address".
 D'ou l'apparition de la nouvelle classe.
 
**Etape 20**

 Oui tout le contenu de la base de donnée est visible avec le select
 
**Etape 23**

 L'annotation @Autowired permet d'éviter d'utiliser les setters et getters. IL permet également a 
 Spring de lier automatiquement les propriétés avec leurs setters et leurs getters respectifs

**Etape 30**
 Pour ajouter Bootstrap au projet il faut l'inclure dans les dependances
 en faisant : '<dependency>
                    <groupId>org.webjars</groupId>
                    <artifactId>bootstrap</artifactId>
                    <version>3.3.6</version>
                </dependency>'

**TP 4**

**Etape 6**
  
   1. Non il ne faut pas de clé pour appeler l'api MeteoConcept mais plutot un "token" qui est créer par nous même depuis notre compte utilisateur
   2. Le debut de toutes les urls d'appels "GET"  est :
        https://api.meteo-concept.com/api/
    Ensuite on a la "forecast/daily?" pour préciser qu'il s'agit d'une recherche d'information meteo d'une ville.
    Ensuite le 'token' et enfin de "insee" avec un "int" contenant le numero insee de la commune.
   3. Méthode HTTP utiliser : uniquement le 'GET'
   4. On les passe dans l'url de la requete
   5. a. La valeur de la température est dans l'attribut temp2m de l'objet "forecast-hour-" 
   5. b. Pour afficher la prévision météo du lieu visé par les coordonnées GPS, on a besoin de l'attribut "forecast" contenu dans la réponse de l'api de Meteo-Concept
