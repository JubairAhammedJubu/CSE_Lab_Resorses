

public class Customer {
   String name;
    
    public Customer(String name) {
        this.name= name;
    }

    
    public void greet() {
        System.out.println("Hello!!");
    }

    
    public void greet(String name) {
        System.out.println("Hello " + name + "!");
    }


    void purchase(String i1, String i2, String i3) {
        System.out.println(name + ", you purchased 3 items:");
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        }

    void purchase(String i1) {
        System.out.println(name + ", you purchased 1 items:");
        System.out.println(i1);
    
      }

      
  }

         

