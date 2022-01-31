public int fibonacci(int i){
  if(i>2){
    return fibonacci(i-1)+fibonacci(i-2);
  }
  else if(i==2){
    return 1;
  }
  else{
    return 0;
  }
}
