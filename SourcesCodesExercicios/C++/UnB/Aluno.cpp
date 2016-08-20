#include <string>
#include "Aluno.hpp"

using namespace std;

Aluno::Aluno(string matricula, string nome, int ira){
  this->matricula = matricula ;
  this->nome = nome ;
  this->ira = ira ;
}

Aluno::Aluno(int ira){
  this->ira = ira ;
}

string Aluno::getNome(){
  return this->nome;
}

int Aluno::getIra(){
  return this->ira;
}
