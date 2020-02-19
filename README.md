# In-Place-Algorithmus

Die Implementierung der Teilung erfolgt als In-place-Algorithmus: 

Die Elemente werden nicht in zusätzlichen Speicher kopiert, sondern nur innerhalb der Liste vertauscht. Dafür wird ein Verfahren verwendet, das als Teilen oder auch Partitionieren bezeichnet wird. Danach sind die beiden Teillisten gleich in der richtigen Position. Sobald die Teillisten in sich sortiert wurden, ist die Sortierung der Gesamtliste beendet.

Der folgende Pseudocode illustriert die Arbeitsweise des Algorithmus, wobei daten die zu sortierende Liste mit n Elementen ist.

Bei jedem Aufruf von sort() gibt links den Index des ersten Elements in der Teilliste an und rechts den des letzten. Beim ersten Aufruf (oberste Rekursionsebene) ist 
links = 0 und rechts = n-1. 
Die übergebene Liste wird dabei rekursiv immer weiter geteilt, bis sie nur noch einen Wert enthält.


funktion sort(links, rechts)
     falls links < rechts dann
         teiler:= teile(links, rechts)
         sort(links, teiler-1)
         sort(teiler+1, rechts)
     ende
ende


Die folgende Implementierung der Funktion teile teilt das Feld so, dass sich das Pivotelement an seiner endgültigen Position befindet und alle kleineren Elemente davor stehen, während alle größeren danach kommen:

funktion teile(links, rechts)
     i:= links
     // Starte mit j links vom Pivotelement
     j:= rechts - 1
     pivot:= daten[rechts]

     wiederhole

         // Suche von links ein Element, welches größer oder gleich dem Pivotelement ist
         wiederhole solange i < rechts und daten[i] < pivot
             i:= i + 1
         ende

         // Suche von rechts ein Element, welches kleiner als das Pivotelement ist
         wiederhole solange j > links und daten[j] ≥ pivot
             j:= j - 1
         ende
         
 
         falls i < j dann
             tausche daten[i] mit daten[j]
         ende

     solange i < j // solange i an j nicht vorbeigelaufen ist 

     // Tausche Pivotelement (daten[rechts]) mit neuer endgültiger Position (daten[i])
     // und gib die neue Position des Pivotelements zurück, beende Durchlauf
     tausche daten[i] mit daten[rechts]
     antworte i
ende


Nach der Wahl des Pivotelementes wird zunächst ein Element vom Anfang der Liste beginnend gesucht (Index i), welches größer als das Pivotelement ist. Entsprechend wird vom Ende der Liste beginnend ein Element kleiner als das Pivotelement gesucht (Index j). Die beiden Elemente werden dann vertauscht und landen damit in der jeweils richtigen Teilliste. Dann werden die beiden Suchvorgänge von den erreichten Positionen fortgesetzt, bis sich die untere und obere Suche treffen; dort ist die Grenze zwischen den beiden Teillisten.
