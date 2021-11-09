public class Driver{
  public static void main(String[] args) {
    Thing a = new Thing();
    BetterThing b = new BetterThing();

    //Code with no error handling
    for(int i = 0 ; i < 30; i++){
      a.work(i);
    }

    //code that stops after 1 error
    for(int i = 0 ; i < 30; i++){
      try{ //code that might have an Exception
        b.work(i);
      }catch(Exception e){ //what to do if there is an Exception
        e.printStackTrace();//show the error
        System.exit(1);//exit the program. Try commenting this out!
      }
    }
    try{ //code that might have an Exception
      for(int i = 0 ; i < 30; i++){
        b.work(i);
      }
    }catch(Exception e){ //what to do if there is an Exception
      e.printStackTrace();
      System.exit(1);//do not continue the program
    }
  }

}
