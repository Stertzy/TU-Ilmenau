#include "encode.h"

/*
 * Die nachfolgenden Variablen/Datenstrukturen könnten für Sie nützlich sein.
 * - "n" ist die Anzahl unterschiedlicher ASCII-Zeichen in der Eingabe.
 *   Für 0 <= i < n ist "label[i]" das i-te tatsächlich vorkommende ASCII-
 *   Zeichen. Dieses kommt "p[i]" mal in der Eingabe vor.
 * 	 Die tatsächlich vorkommenden ASCII-Zeichen sind dabei wie gewünscht
 *   angeordnet:
 *     p[0] <= p[1] <= p[2] <= ... <= p[n-1]
 *   und
 *     wenn p[i] = p[i+1], dann label[i] < label[i+1].
 * - "labelIndex" ist die Umkehrung von "label", d.h. für ein in der Eingabe
 *   vorkommendes ASCII-Zeichen c gilt "label[labelIndex[c]] == c" und es kommt
 *   "p[labelIndex[c]]" mal in der Eingabe vor.
 * - "pred" und "mark" sind die Ausgaben des Huffman-Algorithmus.
 *   Sie enthalten "nodes" viele Einträge - die Anzahl Knoten des zugehörigen
 *   optimalen Codierungsbaums.
 */
// Folgendes können Sie mittels "input.countChars(n, labelIndex, label, p)"
// bestimmen lassen:
unsigned int n; 			// Anzahl verschiedener ASCII-Zeichen in der Eingabe = Anzahl Blätter
vector<int> labelIndex; 	// labelIndex[c] = Index des Blattes mit Beschriftung (ASCII-Zeichen) c
vector<char> label; 		// label[i] = Beschriftung (ASCII-Zeichen) des Blattes mit Index i
vector<unsigned int> p;		// p[i] = absolute Häufigkeiten (>0) des ASCII-Zeichens des Blattes mit Index i
// Folgendes müssen Sie manuell bestimmen:
unsigned int nodes; 		// Anzahl Knoten (des Huffman-Baums)
vector<unsigned int> pred; 	// Vorgänger-Array
vector<bool> mark; 			// Markierungs-Array: false = 0 = links, true = 1 = rechts

/*
 * Implementieren Sie den Algorithmus von Huffman aus der Vorlesung.
 * 
 * Verwenden Sie n, labelIndex, label und p als (global gegebene) Eingabe.
 * Bestimmen Sie nodes, pred und mark als (global verfügbare) Ausgabe.
 * 
 * Hinweise:
 * - Achten Sie darauf, dass die Indizierung in C++ bei 0 beginnt,
 *   in den Vorlesungsfolien hingegen bei 1.
 * - Vergessen Sie nicht, die Größe von p (mittels "p.resize(nodes)",
 * 	 wenn Sie "nodes" zuvor passend bestimmt haben) anzupassen,
 * 	 damit Sie die Häufigkeiten der Kunstbuchstaben zwischenspeichern können.
 * - Wenn Sie die Häufigkeiten in p mittels input.countChars(...) bestimmt haben
 *   und sich treu an den Pseudocode aus der Vorlesung halten, erreichen Sie das
 *   folgende erwünschte Verhalten automatisch:
 *     Immer dann, wenn (Kunst-)Buchstaben die gleiche Häufigkeit haben, soll
 *     zunächst derjenige (Kunst-)Buchstabe mit kleinstem Index gewählt werden,
 *     d.h., der in den Tabellen p/pred/mark am weitesten vorne/links steht.
 */
void huffman() {
	/* TODO */
}

/*
 * Diese Methode ist der Startpunkt für Ihre Implementierung. Lesen Sie den
 * "ASCIIStream input" Stück für Stück aus und erzeugen Sie währenddessen die
 * in der Aufgabenstellung beschriebene gewünschte Ausgabe.
 * 
 * Verwenden Sie dazu "input.countChars(...)" und Ihre Implementierungen von
 * "huffman()". Die Inhalte von label/p/pred/mark können Sie mittels "cout"
 * ausgeben.
 */
void run() {
	// zähle ASCII-Zeichen, berechne "n", "labelIndex", "label", "p"
	input.countChars(n, labelIndex, label, p);
	// berechne "nodes", pred", "mark" (Huffman-Algorithmus)
	huffman();
	// Ausgabe der Ergebnisse
	cout << "label:" << label << endl
		 << "p:" << p << endl
		 << "pred:" << pred << endl
		 << "mark:" << mark << endl;
}