package inheritance;

class city {
    void funCity () {
        System.out.println("Function of city class is called");
    }
}

class state extends city {
    void funState () {
        System.out.println("Function of state class is called");
    }
}

class country extends state {
    void funCountry () {
        System.out.println("Function of country class is called");
    }
}

public class multiLevelInheritance {
    public static void main(String[] args) {
        
        country cnt = new country();
    
        cnt.funCity();
        cnt.funState();
        cnt.funCountry();
    }
}
