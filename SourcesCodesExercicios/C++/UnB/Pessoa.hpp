#ifndef PESSOA_HPP
#define PESSOA_HPP
#include <string>
class People
{
  public:
    virtual void setMatricula();
    virtual void setNome();
    virtual string getNome(string nome);
    virtual string getMatricula(string matricula);
  protected:
    string matricula;
    string nome;

}
