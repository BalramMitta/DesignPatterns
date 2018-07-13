package builder;

public class Person {
    private String firstname;
    private String middlename;
    private  String lastname;
    private Integer age;

    public Person(String firstname, String middlename, String lastname, Integer age) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.age = age;
    }
    public Person(PersonBuilder pb){
      setFirstname(pb.firstname);
      setLastname(pb.lastname);
      setMiddlename(pb.middlename);
      setAge(pb.age);
    }
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Person : "+firstname+" "+" "+middlename+" "+lastname;
    }
    public static class PersonBuilder{

        private String firstname;
        private String middlename;
        private  String lastname;
        private Integer age;



        public PersonBuilder setFirstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public PersonBuilder setMiddlename(String middlename) {
            this.middlename = middlename;
            return this;
        }

        public PersonBuilder setLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public PersonBuilder setAge(Integer age) {
            this.age = age;
            return this;
        }
        public Person build(){
            return new Person(this);
        }
    }
}
