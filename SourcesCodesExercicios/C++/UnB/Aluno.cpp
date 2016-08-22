#include <string>
#include "Aluno.hpp"

using namespace std;

Aluno::Aluno(string ira){
  this->ira = ira;
}

string Aluno::getNome(){
  return this->nome;
}

string Aluno::getIra(){
  return this->ira;
}

void Aluno::setNome(string nome){
  this->nome = nome;
}

void Aluno::setMatricula(string matricula){
  this->matricula = matricula;
}

string Aluno::getMatricula(){
  return this->matricula;
}
