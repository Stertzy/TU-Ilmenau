#include<iostream>
#include<vector>
using namespace std;

/*****************************************************
* Folgende Variablen werden von der vorgegebenen
* DFS-Implementierung initialisiert.
* Greifen Sie auf diese Informationen zu,
* wenn es ihnen nützlich erscheint.
*****************************************************/
int n, m; // Anzahl Knoten und Kanten.
vector<vector<int>> G;  //gerichteter Graph als Adjazenzliste
vector<int> dfsNum, finNum; // dfsNum[v] ∈ {0,…,n-1} ist dfs-Nummer von v ∈ {0,…,n-1}
vector<pair<int,int>> T, B, F, C; // Klassifizierte Kanten

/*****************************************************
* ↑↑↑ Datenstrukturen für DFS ↑↑↑
* ↓↓↓ Callback-Funktionen     ↓↓↓
*****************************************************/

void preDFS() {
    /* actions directly before DFS() */
}
void dfsVisit(const int v) {
    /* preorder actions at node v */
}
void finVisit(const int v) {
    /* postorder actions at node v */
}
void postDFS() {
    /* actions directly after DFS() */
}

/*****************************************************
* ↑↑↑ Callback-Funktionen   ↑↑↑
* ↓↓↓ vorimplementierte DFS ↓↓↓
*****************************************************/

// next free dfs/fin number
int dfsCount, finCount;

void dfs(const int v) {
    /* preorder actions */
    dfsNum[v] = dfsCount++;
    dfsVisit(v);
    /* examine all outgoing edges (v, w)
     * G[v]" contains all direct successors of node v */
    for(int w : G[v]) {
        if(dfsNum[w] == -1) {
            T.push_back({v, w});
            dfs(w);
        }
        else if(finNum[w] == -1) {
            B.push_back({v, w});
        }
        else if(dfsNum[v] < dfsNum[w]) {
            F.push_back({v, w});
        }
        else {
            C.push_back({v, w});
        }
    }
    /* postorder actions */
    finNum[v] = finCount++;
    finVisit(v);
}

/* full DFS */
void DFS() {
    /* initialization */
    dfsNum = finNum = vector<int>(n,-1);
    dfsCount = finCount = 0;
    T = B = F = C = {};
    /* global loop of "full DFS" */
    for(int v = 0; v < n; ++v) {
        if(dfsNum[v] == -1) {
            dfs(v); /* local dfs call for "new" nodes */
        }
    }
}

/* main method */
int main() {
    while(cin >> n) {
        /* read current line of input file and create directed graph G */
        cin >> m;
        G.clear(); G.resize(n,{});
        for(int i = 0; i < m; ++i) {
            char _; int u; int w;
            cin >> _ >> u >> _ >> w >> _;
            G[u].push_back(w);
        }
        /* perform full DFS on G */
        preDFS();
        DFS();
        postDFS();
    }
}
