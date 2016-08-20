#ifndef PESSOA_HPP
#define PESSOA_HPP
#include <string>

using namespace std;

class Pessoa
{
  public:
    virtual void setMatricula() = 0;//pure virtual
    virtual void setNome() = 0;
    virtual string getNome(string nome) = 0;
    virtual string getMatricula(string matricula) = 0;
};

#endif
