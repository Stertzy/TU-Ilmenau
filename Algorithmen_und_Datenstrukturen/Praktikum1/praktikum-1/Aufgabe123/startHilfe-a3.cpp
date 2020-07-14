#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int maxsum(const vector<int>& A) {
  /* Schritt 0: Trivialitätstest */
    // [...]
  
  /* Schritt 1: Teile: */
  int m = A.size()/2;
  const vector<int> Aleft (A.begin()  , A.begin()+m);
  const vector<int> Aright(A.begin()+m, A.end());
  
  /* Schritt 2: Rekursion */
  const int r1 = maxsum(Aleft);
  const int r2 = maxsum(Aright);
  
  /* Schritt 3: Kombiniere */
    // [...]
}

int main() {
  int size;
  while(cin >> size) {
    vector<int> v(size);
    for(int& x : v) cin >> x;
    cout << maxsum(v) << endl;
  }
}
