# TD2
Exercice 1 :
1.	Le main affiche :
42 
42
24
24
24
24

2.	S’il est dans Fille, il a accès au meth() de la classe fille et au meth() de la classe mère. 


3.	Les méthodes statiques sont utilisées lorsque la méthode ne s'applique qu'à la classe elle-même et pas à ses instances.

42 
42

24
42	//Ici, on fait fille.printMeth(), qui n’existe pas dans la classe fille, donc on va la chercher dans la classe mère et dans la classe mère, la valeur de meth() est statique et vaut 42.

42	//Ici, on a 42 car la méthode est static donc à la compilation il regarde le type de l’objet
42	

Si on définit la méthode meth() comme static dans Mere et dans Fille :

Fille.printMeth() est défini dans la classe mère, quand on fait appelle à la méthode printMeth(), elle fait elle-même appelle à la méthode meth() de la classe mère, et on ne peut pas changer sa valeur. 

Pour Mere mereFille = new Fille(), on aura 42 car la méthode est static donc à la compilation il regarde le type de l’objet (à savoir Mere).



4.	Si meth est un champ du type int meth = 42 : on a les mêmes résultats que pour la question précédente. 
42
42

24
42

42
42

Exercice 2.
1.	Dans la classe fille, on rencontre des erreurs pour les méthodes h() et i() car elles existaient déjà dans la classe mère avec un type de retour différent. Pour redéfinir une méthode d’une classe mère dans une classe fille, on peut changer le corps de la méthode mais on ne peut pas modifier la signature de la méthode ni son type de retour.

Lorsqu’on redéfinit une méthode, la règle est la suivante : on peut ouvrir la visibilité et non la restreindre. 
L’erreur sur la méthode e() vient du fait qu’elle a été définie comme private dans la classe fille alors qu’elle est protected dans la classe mère. On a donc restreint sa visibilité dans la classe fille. 
A l’inverse, la méthode f() a été définie comme protected dans la classe fille et elle est private dans la classe mère. On a ouvert sa visibilité. 

Il y a également une erreur sur la méthode k() car l’exception était IOException dans la classe mère et est devenue Exception dans la classe fille. Cela est impossible, car l’exception IOException hérite de Exception et on ne peut que préciser une exception, on ne peut pas la modifier en une exception parente. 
On a également des erreurs de compilation lorsqu’on veut faire accéder un objet de type mère à la méthode miage() car elle n’est que définie dans la classe fille (donc pour les objets de type fille).
	

Les Exceptions retournées : il est possible de modifier la déclaration des exceptions renvoyées par la méthode, tant que l'on respecte celle de la méthode parente. Il est donc possible de :

- supprimer l'exception : en effet, en ne renvoyant pas d'exception, on respecte le contrat original, car le mot-clé throw signifie « la méthode peut renvoyer une exception », mais ce n'est pas une obligation ;
- spécialiser le type de l'exception : en indiquant par exemple une exception qui hérite de celle définie dans la signature de la méthode parente.

2.	OK

3.	Surcharge de méthode : on crée plusieurs constructeurs / méthode du même nom dans une même classe dont la signature varie. (On peut changer les paramètres de la fonction ou le type de retour)
Redéfinition de méthode : on redéfinit une méthode d’une classe mère dans une classe fille, sa signature reste la même mais les actions à effectuer diffèrent. 

Dans la classe mère on fait une surcharge de la méthode c().
Dans la classe fille on fait également une surcharge de la méthode c().
Dans la classe fille, on redéfinit les méthodes de la classe mère. 

