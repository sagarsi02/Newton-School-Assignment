static void SumAndMean(int arr[],int N){
    //Enter your code here
  int sum = 0;
  for(int i=0; i<N; i++){
      sum += arr[i];
  }
  int mean = sum/N;
  System.out.println(sum + " " + mean);
    
}