#ifndef MOVIE_H
#define MOVIE_H

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

#endif
