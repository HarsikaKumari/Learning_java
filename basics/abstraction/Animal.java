interface animalFeat {
    public void sleep(); // interface method (does not have a body)
}

// pig "implements" the animal interface
class pig implements animalFeat {
    public void animalSound() {
        System.out.println("The pig says: Wee Wee");
    }
    
    public void sleep() {
        System.out.println("Zzzz");
    }
}

class Animal {
    public static void main(String[] args) {
        pig myPig = new pig(); // Create a pig object
        myPig.animalSound();
        myPig.sleep();
    }
}
