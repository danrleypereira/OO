#include <iostream>
#include <string>
#include <vector>
#include "Movie.hpp"
#include <thread>
#include <cstdlib>


using namespace std;
//classe filme
class Movie
{
  public:
    Movie(string title = "default", int year = 2016, string directorName = "unknown", int numberOfStars = 1){
      this->title = title;
      this->year = year;
      this->directorName = directorName;
      this->numberOfStars = numberOfStars;
    }
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
    // Movie(string str)
    // {
    //   this->title = str;
    // }
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

void sortByName(vector<Movie> list, int inicio, int fim)
{
  int i, j, meio;
  string pivo=NULL, aux=NULL;

  i = inicio;
  j = fim;

  meio = (int) ((i + j) / 2);
  pivo = list.at(meio).getTitle();

  do{
     while (list.at(i).getTitle() < pivo) i = i + 1;
     while (list.at(j).getTitle() > pivo) j = j - 1;

     if(i <= j){
        aux = list.at(i).getTitle();
        list.at(i).getTitle() = list.at(j).getTitle();
        list.at(j).getTitle() = aux;
        i = i + 1;
        j = j - 1;
     }
  }while(j > i);

  if(inicio < j) sortByName(list, inicio, j);
  if(i < fim) sortByName(list, i, fim);
}

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
    thread t1 = thread(sortByName(movieList, 0, (movieList.size() - 1)));
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
