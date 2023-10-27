/*
Program that will show how to access
memory of a given object by putting an '&'
in front.

Each element in a list has its own memory
address, address of array itself reprezent
the first element in the array
*/


#include <iostream>


int main() {
    int list[] = {1, 2, 3, 4};
    std::cout 
        << "Element 0: "
        << list[0]
        << " Its memeory: "
        << &list[0] 
        << std::endl;
    
    list[0] = 300;
    std::cout
        << "Element 0: "
        << list[0]
        << " Its memory: "
        << &list[0]
        << std::endl;
    int length = sizeof(list) / sizeof(list[0]);

    // for (int i = 0; i < 4; i++) {
    //     std::cout 
    //     << "Array: " << list 
    //     << " Element: " << list[i] 
    //     << " Memory: " << &list[i] 
    //     << std::endl;
    // }

    return 0;
}