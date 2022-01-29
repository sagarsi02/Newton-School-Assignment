static boolean check_Palindrome(String str,int s, int e){ 
    //enter your code here
    int n = str.length();
    if (n == 0){
        return true;
    }

    return isPalRec(str, 0, n - 1);
}

static boolean isPalRec(String str,int s, int e){
    if (s == e){
        return true;
    }
    if ((str.charAt(s)) != (str.charAt(e))){
        return false;
    }
    if (s < e + 1){
        return isPalRec(str, s + 1, e - 1);
    }
    return true;
}