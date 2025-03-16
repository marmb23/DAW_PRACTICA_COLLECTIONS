## Justificacions a l'hora d'escriure el codi
En el desenvolupament d’aquest projecte, he pres diverses decisions clau per assegurar-me que el codi sigui clar, robust i fàcil de mantenir.
A continuació, es detallen algunes de les principals decisions que vaig prendre a l’hora d’escriure el codi.

### 1. **Ús de classes abstractes i herències per organitzar els productes**
Vaig decidir utilitzar una classe abstracta Producte per representar els productes comuns i després estendre-la per a classes 
més específiques com Alimentacio, Electronica i Textil. Això permet que el codi sigui més organitzat i flexible:

- La classe Producte defineix els atributs comuns a tots els productes, com el nom, el preu i el codi de barres.
- Les classes derivades (Alimentacio, Electronica, Textil) implementen els seus propis mètodes per calcular el preu final, 
- depenent de les característiques particulars de cada tipus de producte.

Aquesta organització facilita l’extensió del sistema en el futur, permetent afegir nous tipus de productes sense necessitat de canviar l’estructura existent del codi.

### 2. **Implementació d’un menú interactiu per a l’usuari**
El menú interactiu permet a l’usuari seleccionar el tipus de producte que vol introduir de forma clara i senzilla. Presentant a l’usuari opcions numerades
i permetent-li tornar enrere si cal, vaig millorar l’experiència de l’usuari, donant-li control sobre les decisions sense fer-lo sentir atrapat en un flux sense sortida.

### 3. **Ús de switch en lloc de múltiples condicionals**
Al mètode IntroduirProducte, vaig utilitzar un switch per gestionar els diferents tipus de productes a crear i les diferents opcions a fer. Fet que fa que el codi sigui més net i
fàcil de mantenir. L’ús d’un switch és més eficient quan es tenen múltiples opcions i fa que la lectura del codi sigui més intuïtiva. Això també facilita la futura extensió del sistema,
ja que es poden afegir nous tipus de productes simplement afegint nous casos al switch.

### 4. **Ús de try-catch per al maneig d’excepcions**
Vaig decidir utilitzar una classe abstracta Producte per representar els productes comuns i després estendre-la per a
classes més específiques com Alimentacio, Electronica i Textil. Això permet que el codi sigui més organitzat i flexible:
- La classe Producte defineix els atributs comuns a tots els productes, com el nom, el preu i el codi de barres. 
- Les classes derivades (Alimentacio, Electronica, Textil) implementen els seus propis mètodes per calcular el preu final, depenent de les característiques particulars de cada tipus de producte.
Aquesta organització facilita l’extensió del sistema en el futur, permetent afegir nous tipus de productes sense necessitat de canviar l’estructura existent del codi.

### 5. **Eliminació de la lògica de validació dins dels constructors**
Al principi, la validació d’entrades al constructor de cada classe estava una mica barrejada amb la lògica de creació de l’objecte. Tanmateix, vaig entendre
que aquesta lògica hauria d’estar en un lloc diferent (com el controlador) per mantenir el principi de responsabilitat única. En lloc de gestionar les excepcions dins dels constructors,
les excepcions es gestionen al controlador per proporcionar una millor experiència de l’usuari.

### 6. **Ús d'excepcions personalitzades**
Una de les decisions més importants va ser la creació i l’ús d’excepcions personalitzades. Aquestes excepcions s’encarreguen de validar les dades introduïdes
per l’usuari i garantir que es compleixin certs requisits. Per exemple:

- NegatiuException es llança quan el preu del producte és negatiu, la qual cosa és una validació essencial per evitar entrades incorrectes.
- LimitCaractersException s’utilitza per validar el nom del producte, el codi de barres i la composició tèxtil, assegurant que compleixin amb una longitud mínima i màxima.
- DataCaducitatException s’utilitza per verificar que la data de caducitat d’un producte no sigui anterior a la data actual, una validació lògica essencial per a productes peribles.

Aquestes excepcions personalitzades milloren la llegibilitat del codi i permeten capturar errors específics de manera clara, en comptes d’utilitzar excepcions genèriques.