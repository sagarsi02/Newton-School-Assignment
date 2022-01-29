static int  Multiply_by_recursion(int M, int N) { 
    //Enter your code here
    if ((M == 0) || (N == 0)){
      return 0;
    }
    else{
      return (M + Multiply_by_recursion(M, N - 1));
    }
  }