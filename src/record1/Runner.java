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

        //equals metodu object classının metodu dolayısıyla equals metodu override edilmezse double == ile kontrol eder.
        //string class equals ı override etmiş ondan dolayı sadece değerlere bakıyor.

        //peki immutable employee classını daha az boiler plate (basma kalıp)
        //kodlarla oluşturamaz mıyız?

        //Cevap : Java 14 ile birlikte eklenen Record özelliği ile yapabiliriz.


        EmployeeRecord emp3=new EmployeeRecord("Ali","Can","mail@mail.com");
        System.out.println("Record employee : "+emp3);

        System.out.println("çalışan ismi : "+emp3.firstname());

        //emp3.setLastname("Han");--> default olarak immutable, read-only

        EmployeeRecord emp4=new EmployeeRecord("Ali","Can","mail@mail.com");

        System.out.println(" == "+(emp3==emp4));//false
        System.out.println(" equals "+(emp3.equals(emp4)));//true



    }
}
