#include <iostream>
#include <vector>
#include <map>
#include <string>
#include <algorithm>
#include <set>
#include <cassert>
using namespace std;

struct Node{
  Node* next;
  Node* prev;
  int value;
  int key;
  Node(Node* p, Node* n, int k, int val):prev(p),next(n),key(k),value(val){};
  Node(int k, int val):prev(NULL),next(NULL),key(k),value(val){};
};

class Cache{

protected:
  map<int,Node*> mp; //map the key to the node in the linked list
  int cp;  //capacity
  Node* tail; // double linked list tail pointer
  Node* head; // double linked list head pointer
  virtual void set(int, int) = 0; //set function
  virtual int get(int) = 0; //get function

public:
  Node* getHead() const { return head; } 

};
ostream& operator<<(ostream& os, const Cache& c) {
  Node* n = c.getHead();
  while (n) {
    os << n->key << "," << n->value << " ";
    n = n->next; 
  }
  os << endl;
  
  return os; 
  
}
class LRUCache : public Cache {
private:

public:
  LRUCache(int cap) {
    cp = cap;
    head = NULL;
    tail = NULL;
  }
  void set(int k, int v) {
    // check if the key already exists in the cache.
    if (mp.find(k) != mp.end()) {
      mp[k]->value = v; 
      return;
    }

    if (mp.size() < cp) {

      // key doesn't exist, create a new one and put to the front. 
      Node* n = new Node(NULL, head, k, v);
      if (head) head->prev = n;
      if (!tail) tail = n; 
      n->next = head; 
      head = n;
      mp[k] = n;
	
    } else {

      // replace the last element.
      if (!tail) cerr << "Error: tail is NULL." << endl;

      tail->key = k;
      tail->value = v;
      if (NULL == head->next) return; 

      head->prev = tail;
      tail->next = head;
      head = tail;
      tail = head->prev;
      tail->next = NULL; 
      head->prev = NULL;

      mp[k] = head;
	
    }
  }
  
  int get(int k) {
    if (mp.find(k) != mp.end()) {

      // cout << mp[k]->key << " " << mp[k]->value << endl;
      if (head == mp[k]) return head->value; 

      Node *n = mp[k];
      if (n == tail) {

	head->prev = tail;
	tail->next = head;
	head = tail;
	tail = head->prev;
	tail->next = NULL;
	head->prev = NULL;
	
      } else {
	
	if (n->prev) n->prev->next = n->next;
	if (n->next) n->next->prev = n->prev;
	head->prev = n;
	n->next = head;
	head = n;
	head->prev = NULL; 

      }

      return mp[k]->value;
    }
    return -1;
  }
};

// int main() {
//   int n=1, capacity=2,i;
//   LRUCache l(capacity);
//   cout << l.get(3) << endl;
//   cout << l.get(19) << endl;
//   cout << l.get(8) << endl;
//   l.set(1, 1195);
//   l.set(5, 1404);
//   cout << l; 
//   cout << l.get(6) << endl;
//   l.set(15, 1020);
//   l.set(7, 1010);
//   cout << l; 
//   cout << l.get(8) << endl;
//   l.set(7, 1628);
//   l.set(16, 1498);
//   cout << l; 
//   cout << l.get(11) << endl;
//   cout << l.get(14) << endl;
//   cout << l.get(19) << endl; 

//   return 0;
// }

int main() {
  int n, capacity,i;
  cin >> n >> capacity;
  LRUCache l(capacity);
  for(i=0;i<n;i++) {
    string command;
    cin >> command;
    //cout << command << " "; 
    if(command == "get") {
      int key;
      cin >> key;
      //cout << key << endl;
      cout << l.get(key) << endl;

      //cout << l; 
    }
    else if(command == "set") {
      int key, value;
      cin >> key >> value;
      //cout << key << " " << value << endl; 
      l.set(key,value);

      //cout << l; 
    }
  }
  return 0;
}
