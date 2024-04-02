package record1;
/*
Bazı durumlarda thread güvenliği (thread-safe), cache de veri tutarlılığı
test kolaylığı vb sebeplerle immutable(değiştirilemez) classlar tanımlamak isteyebiliriz.
 */
public class EmployeeImmutable {
    private final String firstname;
    private final String lastname;
    private final String email;

    //param const


    public EmployeeImmutable(String firstname, String lastname, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    //getter : read-only
    //setter : final olduğu için, değiştirilemesin diye setter metotlarını yazmıyoruz.
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    //toString


    @Override
    public String toString() {
        return "EmployeeImmutable{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
