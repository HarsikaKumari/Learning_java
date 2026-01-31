package CA3;

    class Person {
        protected String name;
        protected int age;
    
        public Person() {
            this.name = "";
            this.age = 0;
        }
    
        public void enterDetails(String name, int age) {
            this.name = name;
            this.age = age;
        }
    
        public void displayDetails() {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }
    
    class Student extends Person {
        private static int nextId = 1;
        private int studentId;
    
        public Student() {
            super();
            this.studentId = nextId++;
        }
    
        public void enterStudentDetails(String name, int age) {
            enterDetails(name, age);
        }
    
        public void updateStudentDetails(String name, int age) {
            enterDetails(name, age);
        }
    
        public void displayStudentDetails() {
            displayDetails();
            System.out.println("Student ID: " + studentId);
        }
    }
    
    class Employee extends Person {
        private static int nextEmpId = 1;
        private int employeeId;
    
        public Employee() {
            super();
            this.employeeId = nextEmpId++;
        }
    
        public void enterEmployeeDetails(String name, int age) {
            enterDetails(name, age);
        }
    
        public void updateEmployeeDetails(String name, int age) {
            enterDetails(name, age);
        }
    
        public void displayEmployeeDetails() {
            displayDetails();
            System.out.println("Employee ID: " + employeeId);
        }
    }
    
    public class inheritance {
        public static void main(String[] args) {
            Student student = new Student();
            student.enterStudentDetails("Ankit", 20);
            student.updateStudentDetails("Ankit kumar.", 21);
            student.displayStudentDetails();
    
            Employee employee = new Employee();
            employee.enterEmployeeDetails("Aditya", 30);
            employee.updateEmployeeDetails("Aditya kumar.", 31);
            employee.displayEmployeeDetails();
        }
    }
