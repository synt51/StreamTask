public class Student {

    private int id;
    private String name;
    private String postalCode;
    private int age;

    public Student (int id, String name, String postalCode, int age){
        this.id = id;
        this. name = name;
        this.postalCode = postalCode;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Name: " + name +
                ", Postal Code: " + postalCode +
                ", Age: " + age;
    }
}
