
#include<iostream>
#include<stdio.h>
#include<stdlib.h>

using namespace std;

struct Rectangle
{
        int lenght;
        int breadth;
};
    
int main()
{
    Rectangle *p;
    p=(struct Rectangle *)malloc(sizeof(struct Rectangle)); //type casting
    p= new Rectangle;
    
    p->lenght=15;
    p->breadth=7;
    
    cout<<p->lenght<<endl; //using arrow operator
    cout<<p->breadth<<endl; //using arrow operator
    
    return 0;
    
}
    
