static boolean isPalindrome(int N){
    // your code here
    int temp = N;
    int rev = 0;
    int rem;
    while(temp != 0){
       rem = temp%10;
       rev = rev*10+rem;
       temp = temp/10;
    }
    if(N == rev){
       return true;
    }
    else{
       return false;
    }
}