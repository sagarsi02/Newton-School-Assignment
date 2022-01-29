static int Power(int n,int p){
    // Your code here
    if(p == 0){
          return 1;
    }
    else{
          return n * Power(n, p - 1); 
    }
}