#include "Pessoa.hpp"

class Aluno: public Pessoa
{
  Aluno(string matricula, string nome, int ira){
    this->matricula = matricula ;
    this->nome = nome ;
    this->ira = ira ;
  }
  Aluno(int ira){
    this->ira = ira ;
  }
  string getNome(){
    return this->nome;
  }
  int getIra(){
    return this->ira;
  }
};
