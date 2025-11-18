class SimCard {
   String s = "No-SimCard";
   SimCard getName(){
    return new SimCard();
   }
}
class Jio extends SimCard{
   String s = "Jio";
   @Override
   Jio getName(){
    System.out.println("Jio-class");
    return new Jio();
   }
}

class Mobile{
   void call(SimCard sim){
    System.out.println((sim.getName()).s);
   }
   public static void main(String[] args){
    Mobile samsung = new Mobile();
    samsung.call(new Jio());
   }
}
