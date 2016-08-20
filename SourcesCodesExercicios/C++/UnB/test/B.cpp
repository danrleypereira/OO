#pragma once
#include "A.cpp"
#include <iostream>

class B: public A {
public:
	void hello() {
	  std::cout << this->abc << std::endl;
	}

	void hue() {
		std::cout << "bbrbrbrbr\n";
	}
};


