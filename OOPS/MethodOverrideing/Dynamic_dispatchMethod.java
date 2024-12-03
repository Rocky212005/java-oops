 
 class Phone{
    public void on(){
        System.out.println("phone oning...");
    }

    public void showtime(){
        System.out.println("turning on...");
    }
 }

 class Smartphone extends Phone{
    public void on(){
        System.out.println("turnning on smart phone");
    }
    public void music(){
        System.out.println("play music");
    }
 }







public class Dynamic_dispatchMethod {

    public static void main(String[] args) {
//     Phone obj=new Phone(); //this allowed

        Phone obj2=  new Smartphone(); // yes this is allowed but only which function are used there name is same this is called dynamic dispatch

        obj2.on(); //this function excuted only chiled class fun not perent class funtion
        //obj2.music()-> this function not excuted because this fun not define in perent class
        

        
    }
}