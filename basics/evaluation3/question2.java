package evaluation3;

public class question2 {
    String name;
    int id;

    question2() {
        this.name = "unKnown";
        this.id = 0;
    }

    question2(String name) {
        this.name = name;
    }

    question2(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name; 
        // return id;
    }

    public int getId() {
        return id;
    }

    public static void main(String args[]) {
        question2 q1 = new question2();
        question2 q2 = new question2("harsika");
        question2 q3 = new question2("harsika", 20);

        System.out.println("q1 name = " + q1.getName() + " q1 id = " + q1.getId());
        System.out.println("q2 name = " + q2.getName() + " q2 id = " + q2.getId());
        System.out.println("q3 name = " + q3.getName() + " q3 id = " + q3.getId());
    }


}
