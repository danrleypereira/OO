#ifndef ALUNO_HPP
#define ALUNO_HPP
#include "Pessoa.hpp"
#include <string>

using namespace std;

class Aluno: public Pessoa
{
private:
  int ira;

public:
  // Aluno(string matricula, string nome, int ira);
  Aluno(int ira);
  // string getNome();
  int getIra();
  // void setNome(std::string nome);
  // void setMatricula(std::string matricula);
  // string getMatricula();
};

#endif
