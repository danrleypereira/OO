#ifndef ALUNO_HPP
#define ALUNO_HPP
#include "Pessoa.hpp"
#include <iostream>
#include <string>

using namespace std;

class Aluno : public Pessoa
{
private:
  string ira;

public:
  Aluno(string ira);
  virtual string  getNome();
  string getIra();
  virtual void setNome(string nome);
  virtual void setMatricula(string matricula);
  virtual string getMatricula();
};

#endif
