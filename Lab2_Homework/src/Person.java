import java.util.Objects;

/**
 * Clasa Person reprezinta o persoana, care poate fi un student sau un profesor.
 */
public class Person {
    protected String name; // Numele persoanei
    protected String surname; // Prenumele persoanei
    protected String dateOfBirth; // Data nasterii persoanei

    /**
     * Constructorul clasei Person.
     *
     * @param name Numele persoanei
     * @param surname Prenumele persoanei
     * @param dateOfBirth Data nasterii persoanei
     */
    public Person(String name, String surname, String dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }



    /**
     *
     * @param name Numele persoanei
     */
    void setName(String name) {this.name = name;}

    /**
     *
     * @param surname Prenumele persoanei
     */
    void setSurname(String surname) {this.surname = surname;}

    /**
     *
     * @param dateOfBirth Data nasterii persoanei
     */
    void setDateOfBirth(String dateOfBirth) {this.dateOfBirth = dateOfBirth;}

    /**
     *
     * @return Numele persoanei
     */
    public String getName() {return name;}

    /**
     *
     * @return Prenumele persoanei
     */
    public String getSurname() {return surname;}

    /**
     *
     * @return Data nasterii persoanei
     */
    public String getDateOfBirth() {return dateOfBirth;}

    /**
     * Suprascrierea metodei equals pentru a compara doua obiecte Person.
     *
     * @param obj Obiectul cu care se face comparatia
     * @return true daca cele doua obiecte sunt egale, altfel false
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(dateOfBirth, person.dateOfBirth);
    }
}