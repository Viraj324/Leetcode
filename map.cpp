// Online C++ compiler to run C++ program online
#include <iostream>
#include <map>
#include <string>

using namespace std;

//Map is an associative array

int main() {
    // Write C++ code here
    map<string ,int> marksMap;
    marksMap["Viraj"] = 95;
    marksMap["Harry"] = 59;
    marksMap["Ram"]  = 89;
    marksMap.insert({{"Raj", 67}, {"Rajaram ",89}}); //To insert an elemet in an array 
    map<string ,int> :: iterator iter;
    for(iter = marksMap.begin();iter!= marksMap.end();iter++){
        std::cout << (*iter).first <<" "<<(*iter).second << std::endl; // output Viraj  95
    }
    
    cout<<"The size is : "<<marksMap.size()<<endl;
    cout<<"The Max size is : "<<marksMap.max_size()<<endl;
    cout<<"The empty return value is : "<<marksMap.empty()<<endl;
    

    return 0;
}
