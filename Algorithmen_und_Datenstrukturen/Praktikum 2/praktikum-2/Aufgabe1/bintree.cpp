#include <iostream>
using namespace std;

int livingTrees = 0;
struct Tree {
    Tree *left;
    int key;
    Tree *right;
    Tree(Tree *l, int k, Tree *r) : left(l), key(k), right(r) {
        ++livingTrees;
    }
    ~Tree() {
        delete left; delete right;
        --livingTrees;
    }
};

ostream& operator<<(ostream& out, const Tree *T) {
    if (!T)
        return out << "-";
    else
        return out << "(" << T->left << "," << T->key << "," << T->right << ")";
}

Tree *insert(Tree *T, const int key) {
    /*
     * Verwendung:
     * Tree *T = nullptr; // T == -
     * T = insert(T, 2);  // T == (-,2,-)
     * T = insert(T, 4);  // T == (-,2,(-,4,-))
     */
    /* TODO */
}

Tree *extractMin(Tree *T, int& minKey) {
    /*
     * Verwendung:
     * Tree *T = new Tree{nullptr,2,new Tree{nullptr,4,nullptr}}; // T == (-,2,(-,4,-))
     * int k; // k == undefiniert
     * T = extractMin(T, k); // T == (-,4,-), k == 2
     */
    /* TODO */
}

Tree *erase(Tree *T, const int key) {
    /*
     * Verwendung:
     * Tree *T = new Tree{nullptr,2,new Tree{nullptr,4,nullptr}}; // T == (-,2,(-,4,-))
     * T = erase(T, 4); // T == (-,2,-)
     */
    /* TODO */
}

bool lookup(const Tree *T, const int key) {
    /*
     * Verwendung:
     * Tree *T = new Tree{nullptr,2,nullptr}; // T == (-,2,-)
     * bool b = lookup(T, 4); // T == (-,2,-), b == false
     */
    /* TODO */
}

int main() {
    char c; int key;
    Tree *T = nullptr;
    while(cin >> c >> key) {
        /* TODO */
    }
    delete T; T = nullptr;
}
