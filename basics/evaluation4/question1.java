package evaluation4;

public class question1 {
    public static void main(String[] args) {

        int data1 = 100;
        int data2 = 200;
        int data3 = 300;

        try {
            data1 = 100;
            data2 = 200;
            data3 = 300;
            System.out.println("Read the data: " + data1 + ", " + data2 + ", " + data3);
            throw new Exception("Error thrown ");

        } catch (Exception e) {
            System.out.println("Error occurred in reading the data:  " + e.getMessage());
        }

        try {
            data1 = 1900;
            data2 = 900;
            System.out.println("Writing the data: " + data1 + ", " + data2);
            throw new Exception("Error thrown ");

        } catch (Exception e) {
            System.out.println("Error occurred in Writing the data:  " + e.getMessage());
        }
    }
}

// Q.1 wap related to reading and writing data from DB.
