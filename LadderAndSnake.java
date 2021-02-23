public class LadderAndSnake

{
   private void play()
{
  int count=0;
  int position=0;

  while(position!=100)
  {
      int dice=(int) (Math.floor(Math.random()*10 % 6 + 1));
      System.out.println("Rolling the dice :" +dice);




      int diceCheck=(int)(Math.random()* dice % 3);

       System.out.println("Dice Check is :"+diceCheck);

     if(diceCheck==0)
  {
        System.out.println("player is in same position");
         count=count+1;
      System.out.println("position of player is"+position);

  }

     else if(diceCheck==1)

 {

      System.out.println("player move head");

      position=position+dice;


      System.out.println("current position of player is:"+position);

       count=count+1;

}
       else if(diceCheck==2)
{    

       System.out.println("player move behind");
       position=position-dice;
       System.out.println("current position of player is:"+position);
       if(position<0)

 {  
          position=0;
        System.out.println("position statst initial point i.e zero");
              
      }
       count=count+1;
}

      else 

      {
           System.out.println("game finish");
       }
          if(position > 100 && position > 0)

       {
             position=position-dice;

           count=count+1;
     }
      System.out.println("Number of dice rolling :"+count);

}

}


  public static void main(String args[])

{

   System.out.println("starting with 0 position");

   LadderAndSnake s=new LadderAndSnake();

   s.play();
}
}
        

