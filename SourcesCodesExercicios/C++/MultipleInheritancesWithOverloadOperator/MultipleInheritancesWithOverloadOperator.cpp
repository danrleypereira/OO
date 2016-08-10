#include <iostream>

using namespace std;

// Classes de formas básicas
class Shape
{
	public:
		void setWidth(int w)
		{
			width = w;
		}
		void setHeight(int height)
		{
			this->height = height;
		}

	protected:
		int width;
		int height;
};

// Classe custo de pintura
class PaintCost
{
	public:
		int getCost(int area)
		{
			return area * 70;
		}
};

//Classe derivada
class Rectangle: public Shape, public PaintCost
{
	public:
		int getArea(){
		return width * height;
	}

	// Overload + operator to add two Rectangle objects.
Rectangle operator+(const Rectangle& b)
{
	 Rectangle rectangle;
	 rectangle.width = this->width + b.width;
	 rectangle.height = this->height + b.height;
	 return rectangle;
}
};

int main(void)
{
	Rectangle Rect1, Rect2, Rect3;
	int area, h, w;
	cout << "Insira altura e largura do Rect1\n";
	cin >> w;
	cin >> h;
	Rect1.setWidth(w);
	Rect1.setHeight(h);

	cout << "Insira altura e largura do Rect2\n";
	cin >> w;
	cin >> h;
	Rect2.setWidth(w);
	Rect2.setHeight(h);

	Rect3 = Rect1 + Rect2;

	//Mostra a area do objeto
	cout << "Area: \n\t" << "1->" << Rect1.getArea() << "\n\t2->" << Rect2.getArea() << endl;

	//Mostra o custo de Pintura
	cout << "Custo de pintura: \n\t" << "1->" << Rect1.getCost(Rect1.getArea()) << "\n\t2->" << Rect2.getCost(Rect2.getArea()) << endl;

	//Mostra a area total do objeto
	cout << "Total area: \n\t" << "1->" << Rect3.getArea() << endl;

	//Mostra o custo de pintura total
	cout << "Custo de pintura Total: \n\t" << Rect3.getCost(Rect3.getArea()) << endl;

	return 0;
}
