package CA3;

import java.util.Scanner;

public class CgpaCalc {
    private int englishMarks;
    private int mathsMarks;
    private int scienceMarks;
    private int hindiMarks;

    public CgpaCalc(int englishMarks, int mathsMarks, int scienceMarks, int hindiMarks) {
        this.englishMarks = englishMarks;
        this.mathsMarks = mathsMarks;
        this.scienceMarks = scienceMarks;
        this.hindiMarks = hindiMarks;
    }

    public int getTotal() {
        return this.englishMarks + this.mathsMarks + this.scienceMarks + this.hindiMarks;
    }

    public double getCgpa() {
        return ((getTotal() / 400.0) * 100)/9.5;
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks for English:");
        int englishMarks = scanner.nextInt();

        System.out.println("Enter marks for Maths:");
        int mathsMarks = scanner.nextInt();

        System.out.println("Enter marks for Science:");
        int scienceMarks = scanner.nextInt();

        System.out.println("Enter marks for Hindi:");
        int hindiMarks = scanner.nextInt();

        CgpaCalc cgpaCalc = new CgpaCalc(englishMarks, mathsMarks, scienceMarks, hindiMarks);
        System.out.println("The CGPA of the student is: " + cgpaCalc.getCgpa());

        // scanner.close();
    }
}
