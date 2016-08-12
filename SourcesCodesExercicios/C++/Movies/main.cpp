#include <iostream>
#include <string>
#include <vector>
#include "Movie.hpp"

using namespace std;
//classe filme
class Movie
{
  public:
    string getTitle()
    {
      return this->title;
    }
    void setTitle(string title)
    {
      this->title = title;
    }
    int getYear()
    {
      return this->year;
    }
    string getDirector()
    {
      return this->directorName;
    }
    int getStars()
    {
      return this->numberOfStars;
    }
    Movie(string str)
    {
      this->title = str;
    }
  private:
    string title;
    int year;
    string directorName;
    int numberOfStars;
};

Movie Add()
{
  // system("clear");
  string aux;
  cout << "Qual é o nome do filme?\n";
  cin.ignore();
  getline(cin, aux);
  return Movie(aux);
}

void listAll(vector<Movie> movieList);

int main(void)
{
  vector<Movie> movieList;
  int choice;
  do{
    cout << "Insira o numero correspondente:\n(1)Adicionar\n(2)Remover\n";
    cout << "(3)Listar\n(Qualquer outro caractere)Sair\n";
    cin >> choice;
    string aux;
    switch (choice){
      case 1:
        movieList.push_back(Add());
        break;
      case 2:
        int choice;
        cout << "Qual o numero do filme que quer remover?";
        cin >> choice;
        movieList.erase( (movieList.begin()) + (choice-1) );
        break;
      case 3:
        listAll(movieList);
        break;
      default:
        break;
    };
  }while(choice != 0);

  return 0;
}

void listAll(vector<Movie> movieList)
{
  // system("clear");
  for(unsigned i = 0; i < movieList.size(); ++i)
  {
    cout << (1+i) << "->Nome do filme:\t" << movieList.at(i).getTitle() << "\n";
  };
}
