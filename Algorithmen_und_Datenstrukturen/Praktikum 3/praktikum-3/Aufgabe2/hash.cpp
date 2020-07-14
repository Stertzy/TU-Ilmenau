#include<iostream>
#include<vector>
#include<iterator>
using namespace std;

template<class T>
ostream& operator<<(ostream& out, const vector<T>& v) {
    out << '(';
    if(!v.empty()) {
        copy (v.begin(), v.end() - 1, ostream_iterator<T>(out, ","));
        out << v.back();
    }
    return out << ')';
}

const string EMPTY   = "",  /* kommen nie als Schlüssel vor */
             DELETED = "-";

vector<string> table;

const int p = 16777259;
const vector<uint64_t> a = {
    5902272, 7629265, 5333771,12383661,11774175,
    9802969,12640503, 3201625,16072600, 3335533,
    5101852,    3440,13405035,12903727,13147288,
    1825828,16182670,12801869, 8007159, 2376172,
};

int  linHash(const string &s) { /* TODO */ }
void insert (const string &s) { /* TODO */ }
void _delete(const string &s) { /* TODO */ }
bool lookup (const string &s) { /* TODO */ }

int main() {
    /* erzeuge Tabelle der Groesse 2, jeder Eintrag ist EMPTY */
    table.resize(2,EMPTY);
    
    char c; string s;
    while(cin >> c >> s) {
        switch (c) {
            case 'h': cout << "h(" << s << ") = " << linHash(s) << endl; break;
            case 'i': insert(s); break;
            case 'd': _delete(s); break;
            case 'l': cout << lookup(s) << endl; break;
            case 'p': cout << table << endl; break;
        }
    }
}