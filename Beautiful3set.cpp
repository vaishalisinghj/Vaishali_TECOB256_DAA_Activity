#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int n;cin>>n;
    
    int pairCount = 0;
    vector <int> x_y_zPairsOrdered;
    int y=0,z=0,x=0;
    if(n%3==0){
        y=(2*n)/3 ; 
    }
    else if(n%3==1){
        y=(2*n - 2) /3 ;
    }
    else{//n%3==2
        y=( 2*n-1 )/3;
    }
    
    //bottom diagonal from left to right
    do{
        x=n-y-z;
        x_y_zPairsOrdered.push_back(x);
        x_y_zPairsOrdered.push_back(y);
        x_y_zPairsOrdered.push_back(z);
        y-=1;
        z+=2;
        pairCount++;
    }while(y+z <= n);
    
    //upper diagonal from left to right
    z=-1;
    for(;y >= 0;y--){
        z+=2;
        x=n-z-y;
        pairCount++;
        x_y_zPairsOrdered.push_back(x);
        x_y_zPairsOrdered.push_back(y);
        x_y_zPairsOrdered.push_back(z);
    }
    
    
    //output:
    cout<<pairCount<<endl;
    for(int i = 0; i < pairCount; i++){
        cout<<x_y_zPairsOrdered[i*3]<<" ";
        cout<<x_y_zPairsOrdered[i*3+1]<<" ";
        cout<<x_y_zPairsOrdered[i*3+2]<<" ";
        cout<<endl;
    }
    
}
