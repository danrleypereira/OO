#include <iostream>
template<class genType, int size = 50>//tipos genericos
class genClass {
  public:
    genType array[size];
};

template<class changeType1, class changeType2 >
void change(changeType1& e11, changeType2& e12)
{
  changeType1 tmp = e11;
  changeType2 aux = e12;
  e11 = aux;
  e12 = tmp;
}

int main(void){
  genClass<int> intobject1; //usa tamanho padrão
  genClass<float, 123> floatObject;

  std::cout << "tamanho do array" << sizeof(intobject1.array)/sizeof(*intobject1.array) << std::endl;
  std::cout << "tamanho do array float:\t" << sizeof(floatObject.array)/sizeof(*floatObject.array) << std::endl;

  floatObject.array[122] = 23.45;
  std::cout << "float[122] = " << floatObject.array[122] << std::endl;
  std::cout << "int[1] = "<< intobject1.array[1] << std::endl;

  change(intobject1.array[1], floatObject.array[122]);

  std::cout << "float[122] = " << floatObject.array[122] << std::endl;
  std::cout << "int[1] = "<< intobject1.array[1] << std::endl;

  return 0;
}
