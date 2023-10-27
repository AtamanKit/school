#include <iostream>

struct Node {
    std::string data;
    Node* next;
};

class LinkedList {
    Node* head;
public:
    LinkedList() : head(nullptr) {}

    bool is_empty() {
        return head == nullptr;
    }

    void add(std::string data) {
        Node* new_node = new Node{data, nullptr};
        if (is_empty()) {
            head = new_node;
        } else {
            Node* current = head;
            while (current->next) {
                current = current->next;
            }
            current->next = new_node;
        }
    }

    void remove(std::string data) {
        if (is_empty()) {
            std::cout << "None of data provided matches elements in linked list\n";
            return;
        }
        if (head->data == data) {
            Node* temp = head;
            head = head->next;
            delete temp;
        } else {
            Node* current = head;
            Node* previous = nullptr;
            while (current) {
                if (current->data == data) {
                    previous->next = current->next;
                    delete current;
                    return;
                }
                previous = current;
                current = current->next;
            }
            std::cout << "None of data provided matches elements in linked list\n";
        }
    }

    void contain(std::string data) {
        Node* current = head;
        while (current) {
            if (current->data == data) {
                std::cout << data << " is contained in our linked list\n";
                return;
            }
            current = current->next;
        }
        std::cout << "None of data provided matches elements in linked list\n";
    }

    void display() {
        Node* current = head;
        std::cout << "LinkedList: ";
        while (current) {
            std::cout << current->data << " ";
            current = current->next;
        }
        std::cout << "\n";
    }
};

int main() {
    LinkedList linked_list;

    linked_list.add("Banana");
    linked_list.add("Orange");
    linked_list.add("Apple");
    linked_list.add("Cherry");

    linked_list.display();

    linked_list.remove("Apple");

    linked_list.display();

    linked_list.contain("Banana");

    return 0;
}
