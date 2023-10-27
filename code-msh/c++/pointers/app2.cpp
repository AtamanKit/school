/*
A program to see the differnce between
reference semantics and value semantins

reference semantics (Python, Java) when objects
like lists and arrays 'b = [20, 30, 40]', 'a = b'
'b' and 'a' are both referincing '[20, 30, 40]' object
so 'a[0] = 99', 'b[0]' also will be 99

In C++ by creating vector 'b = {20, 25, 30, 45}'
'a' = 'b', 'a' became another object in memory by modifying
'a[0] = 99', 'a' modifies 'a = [99, 25, 30, 45]', 'b' stays
the same: 'b = [20, 25, 30, 45]' 

To make references in C++ will try to use pointers
*/

#include <iostream>
#include <vector>

int main() {
// Version with no pointers where 'b' and 'a' are different
    std::vector<int> b = {20, 25, 30, 45};
    std::vector<int> a = b;

    a[0] = 99;

    for (int i: b) {
        std::cout << i << " ";
    }

    std::cout << std::endl;

    for (int i: a) {
        std::cout << i << " ";
    }

    std::cout << std::endl;

// Version with references by implying pointers
    std::cout << std::endl;
    std::cout << "Version with pointers:" << std::endl;

    std::vector<int> cc = {20, 25, 30, 34};
    std::vector<int>* bb = &cc;
    std::vector<int>* aa = bb;

    (*aa)[0] = 99;

    for (int i: (*bb)) {
        std::cout << i << " ";
    };

    std::cout << std::endl;

    for (int i: (*aa)) {
        std::cout << i << " ";
    };

    std::cout << std::endl;
}