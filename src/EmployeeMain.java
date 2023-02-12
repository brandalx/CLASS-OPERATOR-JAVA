public class EmployeeMain {
    public static void main(String[] args) {
        Employees e1 = new Employees("James Griffin", "36256796" ,"Professor");
        Employees e2 = new Employees(e1);
        Employees e3 = new Employees("Emily blunt", "12549656", "Actress");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}
