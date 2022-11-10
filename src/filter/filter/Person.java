package filter.filter;

/**
 * @author wei.song
 * @since 2022-11-10 17:34
 */
public class Person {

    private final String name;
    private final String gender;
    private final String maritalStatus;

    public Person(String name, String gender, String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

}
