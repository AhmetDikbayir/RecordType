package record1;

public class Runner {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Jack", "Sparrow", "jack.mail.com");

        System.out.println(employee1);

        //uygulamanın herhangi bir yerinde email bilgisini değiştirmek istersem
        employee1.setEmail("jack@gmail.com");
        System.out.println("emaili değişen çalışan : " + employee1);

        //bazı durumlarda bir kere değerlerini belirledikten sonra fieldları
        //bir daha değiştirilmeyen objelere ihtiyaç duyabiliriz.

        //Immutable Class
        EmployeeImmutable emp = new EmployeeImmutable("Harry", "Potter", "harry@mail.com");

        System.out.println(emp);

        //uygulamanın herhangi bir yerinde mail bilgisini değiştirmek istersem
        //emp.setEmail("...");
        System.out.println(emp.getFirstname());

        EmployeeImmutable emp2 = new EmployeeImmutable("Harry", "Potter", "harry@mail.com");

        System.out.println("double equal ile : " + (emp == emp2)); //false
        System.out.println("equals ile : " + emp.equals(emp2)); //false




    }
}
