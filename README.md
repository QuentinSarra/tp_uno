# tp_uno Quentin Sarrazin


Q1 : Il existe une infinité de règles pour jouer au Uno ainsi le nombre de variante de Uno est infini. Dans le cas de mon feature model, il y a 4 règles avec 2 variantes, il y 2 autres règles avec 4 variantes et 1 règle qui possède 2 variantes et une de ces variantes possède elle aussi 2 variantes. Le calcul est 2^4x4^2x2^2 = 1024. Le nombre de variantes est de 1024.


Q4 : Pour écrire un générateur de Uno, il suffirait de créer un programme qui possède en entrée les règles choisies et crée un fichier texte à partir des règles chosies. On peut, par exemple, utiliser un Json qui respecte le schéma Json de la Q3 et à l'aide du compilateur DSL de la Q2, on pourra crée les règles Uno spécifiées dans le Json.


Q5 : Il suffit d'implémenter un programme pour qu'il réalise la transformation entre notre écriture dsl et Json. Nous pouvons créer un fonction dans le dsl qui a pour but de traduire le language dsl en Json.
