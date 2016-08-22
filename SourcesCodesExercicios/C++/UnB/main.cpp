#include <iostream>
#include "Aluno.cpp"

using namespace std;

int main() {
  string i;
  cin >> i;
  Aluno aluno("stroinmg");

  cout << "aluno ira = \t" << aluno.getIra() << endl;

  return 0;
}
