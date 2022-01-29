static int QueenAttack(int X, int Y, int P, int Q){
    //Enter your code here
        if(X==P||Y==Q||X-P == Y-Q||X+Y == P+Q){
            return 1;
        }
        else{
             return 0;
        }
    }