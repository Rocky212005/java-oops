class mythr extends Thread{

    public mythr(String name){
        super(name);
    }
    public void run(){
        int i=6;
        while(i>0){

        
          System.out.println("the name is rocky");
          i--;
        }
    }



}

public class Thread_constructer {
    public static void main(String[] args) {
        mythr t1=new mythr("rocky");
        t1.start();
        System.out.println(t1.getName());
        System.out.println(t1.getState());
        
    }
    
}
