#include <iostream>
#include <string>
#include "Aluno.cpp"

using namespace std;

int main( void ){
  int i;
  cin >> i << endl;
  Aluno aluno(i);

  std::cout << "aluno ira = \t" << aluno.getIra() << std::endl;

  return 0;
}
