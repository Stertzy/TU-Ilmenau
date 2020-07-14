#include <iostream>
using namespace std;

int livingTrees = 0; // zählt die im Speicher liegenden Tree-Instanzen
struct Tree {
    // Ein Tree (Knoten eines binären Suchbaums) besteht aus drei Komponenten:
    // ein Zeiger left auf den linken Unterbaum, ein Eintrag key,
    // ein Zeiger right auf den rechten Unterbaum
    Tree *left;
    int key;
    Tree *right;
    // Konstruktor: wird bei der Erzeugung
    //              (per new Tree{...,...,...};) aufgerufen
    Tree(Tree *l, int k, Tree *r) : left(l), key(k), right(r) {
        ++livingTrees;
    }
    //Destruktor: wird aufgerufen, kurz bevor der zugehörige Speicher
    //            (per delete) freigegeben wird
    ~Tree() {
        // löscht zunächst die beiden Unterbäume (rekursiv)
        delete left; delete right; 
        --livingTrees;
    }
};

// Ist t vom Typ Tree* (Zeiger auf Tree), können Sie dank dieser Methode einfach
// "cout << t << endl" verwenden, um den Binärbaum korrekt formatiert auszugeben
ostream& operator<<(ostream& out, const Tree *T) {
    if (!T)
        return out << "-";
    else
        return out << "(" << T->left << "," << T->key << "," << T->right << ")";
}

int main() {
    // new erzeugt, delete löscht:
    {
        int local = 42;
        Tree *t = new Tree{nullptr, local, nullptr};
        cout << t << endl; // (-,42,-)
        cout << t->key << endl; // 42
        delete t; t = nullptr;
    }
    cout << livingTrees << endl; // 0
    {
        Tree *t = new Tree{nullptr, 23, nullptr};
        cout << t << endl; // (-,23,-)
        // delete t; t = nullptr;
    }
    cout << livingTrees << endl; // 1!
    // Wir können den Speicher nicht mehr freigeben,
    // da wir keinen Zeiger mehr darauf haben!
    getchar();

    livingTrees = 0; // damit Zählung ab jetzt wieder passt
    // Manuelles Anhängen eines Unterbaums, Löschen des gesamten (Unter-)Baums:
    {
        Tree *t = new Tree{new Tree{nullptr, 13, nullptr},
                           42,
                           new Tree{nullptr, 37, nullptr}};
        cout << t << endl; // ((-,13,-),42,(-,37,-))

        t->left->right = new Tree{nullptr, 23, nullptr};
        cout << t << endl; // ((-,13,(-,23,-)),42,(-,37,-))
        cout << livingTrees << endl; // 4
        
        // Unterbaum ab Eintrag 13 löschen
        // Zeiger muss manuell auf nullptr gesetzt werden!
        delete t->left; t->left = nullptr; 
        cout << t << endl; // (-,42,(-,37,-))
        cout << livingTrees << endl; // 2

        delete t; t = nullptr; // löscht den gesamten Baum
        cout << t << endl; // -
        cout << livingTrees << endl; // 0
    }
    getchar();
    
    // Löschen eines einzelnen Knotens
    {
        Tree *t = new Tree{new Tree{nullptr, 13, new Tree{nullptr, 23, nullptr}}, 42, new Tree{nullptr, 37, nullptr}};
        cout << t << endl; // ((-,13,(-,23,-)),42,(-,37,-))
        cout << livingTrees << endl; // 4

        // Knoten mit Eintrag 13 löschen, dessen Unterbaum umhängen
        {
            Tree *s = t->left->right;
            t->left->right = nullptr;
            delete t->left;
            t->left = s;
        }
        cout << t << endl; // ((-,23,-),42,(-,37,-))
        cout << livingTrees << endl; // 3

        delete t; t = nullptr; // löscht gesamten Baum
        cout << t << endl; // -
        cout << livingTrees << endl; // 0
    }
    getchar();
}