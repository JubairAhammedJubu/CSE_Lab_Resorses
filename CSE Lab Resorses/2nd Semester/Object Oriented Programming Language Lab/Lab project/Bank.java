class Bank {

    float getRateofInterest() {
        return 0;
    }
}

class SBI extends Bank {

    float getRateofInterest() {
        return 8.4f;
    }
}

class ICICI extends Bank {

    float getRateofInterest() {
        return 9.3f;
    }
}

class AXIS extends Bank {

    float getRateofInterest() {
        return 9.3f;
    }
}
 
class TestBank {
public static void main (String[]args){

    Bank b1 = new SBI();
    System.out.println(b1.getRateofInterest());

    Bank b2 = new ICICI();
    System.out.println(b2.getRateofInterest());

    Bank b3 = new AXIS();
    System.out.println(b3.getRateofInterest());
}
}


//Output :

