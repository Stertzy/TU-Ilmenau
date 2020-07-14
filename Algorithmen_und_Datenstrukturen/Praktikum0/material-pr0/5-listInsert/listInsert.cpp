#include <iostream>
using namespace std;

struct List {
    int data;
    List* next;
    ~List() {
        delete next;
    }
};

int main()
{
    /* TODO */
}