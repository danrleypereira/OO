#include <iostream>
#include "Aluno.cpp"

using namespace std;

int main() {
  int i;
  cin >> i;
  Aluno aluno(i);

  cout << "aluno ira = \t" << aluno.getIra() << endl;

  return 0;
}
