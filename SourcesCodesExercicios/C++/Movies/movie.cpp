#include <iostream>

using namespace std;

//classe filme
class Movie
{
  public:
    char* getName()
    {
      return this->title;
    }
    int getYear()
    {
      return this->year;
    }
    char* getDirector()
    {
      return this->directorName;
    }
    int getStars()
    {
      return this->numberOfStars;
    }
  private:
    char[] title;
    int year;
    char[] directorName;
    int numberOfStars;
};

int main(void)
{
  Movie movie;
  cout << "Insira o numero correspondente:\n(1)Adicionar\n(2)Remover\n";
  int choice;
  cin >> choice;
  switch (choice) {
    case 1:
      cout << "Qual é o nome do filme?\n";
      cin >> movie.title;
    case 2:

  }


  return 0;
}
