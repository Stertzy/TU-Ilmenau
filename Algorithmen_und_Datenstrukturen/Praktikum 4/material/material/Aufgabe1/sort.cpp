#include<iostream>
#include<vector>
#include<utility>
#include<random>
using namespace std;

// Container für die zu sortierenden Daten
vector<string> A;

void r_qsort(const int l, const int r) {
    /* TODO: sortiere Bereich A[l..r-1] */
}

// Hauptschleife
int main() {
    int n;
    while(cin >> n) {
        /* Größe von A anpassen (ohne Initialisierung der Einträge) */
        A.resize(n);
        for (string &s : A) {
            cin >> s;
        }
        r_qsort(0,n);
        for (string &s : A) {
            cout <<  s << " ";
        }
        cout << endl;
    }
}
