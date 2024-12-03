/*
 * runable interface using create a thread=use impliment runable and define function 
 *  now creating object in main class each object of interface creata a paticuler thread 
 * ex=>
 */

 class MyThread1 implements Runnable{
         @Override
            public void run(){
                for(int i=0;i<12;i++){
                    System.out.println("this is thread 1");
                }
            }

 }
 class MyThread2 implements Runnable{
    @Override
       public void run(){
           for(int i=0;i<12;i++){
               System.out.println("this is thread 2");
           }
       }

}








public class Runable_interface {
    public static void main(String[] args) {

        //creating obj
        MyThread1 obj1=new MyThread1();
        //creating thread for obj1
        Thread t1= new Thread(obj1);

         // creating obj2
        MyThread2 obj2=new MyThread2();
        // creating thread for obj2
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();


        
    }
}
