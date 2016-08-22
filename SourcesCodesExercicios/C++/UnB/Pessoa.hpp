#ifndef PESSOA_HPP
#define PESSOA_HPP
#include <string>

using namespace std;

class Pessoa
{
  protected:
    string matricula;
    string nome;
  public:
    virtual void setMatricula(){};
    virtual void setNome(){};
    virtual string getNome(string nome){};
    virtual string getMatricula(string matricula){};
};

#endif
