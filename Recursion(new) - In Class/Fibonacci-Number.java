static long  Fibonacci(long  n){ 
    //Enter your code here
    if(n == 0){
		return 0;
	}
	if(n == 1 || n == 2){
		return 1;
	}
	return Fibonacci(n-2) + Fibonacci(n-1);
}