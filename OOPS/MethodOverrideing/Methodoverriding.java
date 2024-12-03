
class math{
    int x;
    int y;
    public void calculate(int x,int y){  
        System.out.println(x+y);
    }
} 
class math2 extends math{
       int z;
       int x;
       public void  calculate(int x,int z){  //method overriding
        System.out.println(x+z);
    }
}

public class Methodoverriding {

    public static void main(String[] args) {
        math2 d= new math2();
        d.calculate(12,12);
        
    }
}