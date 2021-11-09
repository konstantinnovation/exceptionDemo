class Thing{

  public void work(int i){
    if(i < 10 || i > 20){
      System.out.println("Error in work!");
    }else{
      System.out.println("Work done:"+(i+1));
    }
  }
}
