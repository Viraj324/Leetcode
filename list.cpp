#include <iostream>
#include <list>

using namespace std;

void display(list<int> &lst){
    list<int> :: iterator iter;
    for (iter = lst.begin(); iter!=lst.end();iter++) {
        cout<<*iter<<" ";
    }
    cout<<endl;
}
int main()
{
    list<int> list1; //list of zero length
    list1.push_back(5);
    list1.push_back(7);
    list1.push_back(3);
    list1.push_back(34);
    list1.push_back(8);
    display(list1);

    
    /*
    **Removing the elements from an list
    list1.pop_back();
    list1.pop_back(); //Removes the last elements
    list.pop_front(); //Removes the front most elements
    list.remove(9); // Removes the value 9 from the given list save time
    
    
    /*list<int> :: iterator iter = list1.begin();
    cout<<*iter<<endl;
    iter++;
    cout<<*iter<<endl;*/
    
    //Sorting the elements in the list
    //list1.sort();

    
    list<int> list2(3); //list of size 7
    list<int> :: iterator iter = list2.begin();
    *iter = 3;
    iter++;
    *iter = 4;
    iter++;
    *iter = 5;
    iter++;
    display(list2);
    
    //Merging of 2 sorted list
    list1.sort();
    list2.sort();
    list1.merge(list2);
    cout<<"List 1 after merging Sorted list"<<endl;
    display(list1);
    
    //Merging of 2 list
    list1.merge(list2);
    cout<<"List 1 after merging"<<endl;
    display(list1);
    
    //Reversing the list
    list1.reverse();
    cout<<"List 1 after reversing the list.."<<endl;
    display(list1);
    
    
    
    return 0;
}
