class BetterThing{

  public void work(int i) throws Exception{
    if(i < 10 || i > 20){
      throw new Exception("Value out of range: "+i);
    }else{
      System.out.println("Work done:"+(i+1));
    }
  }
}
