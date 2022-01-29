static int calculator(char ch, int a, int b){
    // your code here
    int result = 0;
    if(ch == '+'){
        return a+b;
    }
    else if(ch == '-'){
        return a-b;
    }
    else if(ch == '*'){
        return a*b;
    }
    else if(ch == '/'){
        return + a/b;
    }
    return 0;
}