Programacion en JAVA
ACTIVIDAD #3: 

Resumen breve de las clases
***** Clase Card: Representa una sola carta de poker y sus atributos
* palo (“Tréboles”, “Corazones”, “Picas”, “Diamantes”)
* color (“Rojo” o “Negro” según el palo)
* valor (“2”–“10”, “A”, “J”, “Q”, “K”)
* Incluye toString() para imprimir en formato “Palo,Color,Valor”.
***** Clase Deck: Gestiona el mazo completo de 52 cartas usando dos listas (List<Card>):
* mazoCartas: cartas disponibles.
* cartasUsadas: cartas ya extraídas.
* inicializarMazo(): crea las 52 cartas con color correcto.
Métodos:
* shuffle(): mezcla y muestra “Se mezcló el Deck.”
* head(): muestra/retira la primera carta y muestra cuántas quedan.
* pick(): elige/retira una carta aleatoria y muestra cuántas quedan.
* hand(): reparte 5 cartas (cada una en su línea) y muestra cuántas quedan.
***** Clase ProgramaPrincipal (main):
* Instancia Deck, lo mezcla y ejemplifica head(), pick(), hand().
* Al final, imprime el número de cartas restantes.
