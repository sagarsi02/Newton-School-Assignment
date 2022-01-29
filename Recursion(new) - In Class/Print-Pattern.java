static void printPattern(int n,int curr, boolean flag){
    //Enter your code here
    System.out.print(curr + " ");
    if (flag == false && n == curr){
        return;
    }

    if (flag){
        if (curr - 5 > 0){
            printPattern(n, curr - 5, true);
        }
        else{
            printPattern(n, curr - 5, false);
        }
    }

    else{
        printPattern(n, curr + 5, false);
    }

}