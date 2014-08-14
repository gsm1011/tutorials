#include <iostream> 
#include <cmath>

bool isPrime(long long num); 
int main() {
  int T; 
  long long N, m; 
    
  std::cin >> T; 
  for(int i = 0; i < T; i++) {
    std::cin >> N; 
    m = N; 
    while(true) { 
      if((N % m == 0) && (isPrime(m))) {
	std::cout << m << std::endl; 
	break; 
      }
      m--;
    }
  }
}
bool isPrime(long long num) {
  if (num < 2) return false;
  if (num == 2) return true; 
  if (num % 2 == 0) return false; 
    
  long long x = sqrt(num); 
  for(long long i = 2; i <= x; i++) {
    if(num % i == 0) return false; 
  }
  return true; 
}
