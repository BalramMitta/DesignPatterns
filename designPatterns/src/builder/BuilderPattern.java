package builder;

public class BuilderPattern{
    public static void main(String[] args){
    Person person1=new Person("rahul","ali","shetty",9);
    Person person2=new Person("john","is","great",9);
        System.out.println(person1);
        System.out.println(person2);

        Person person3= new Person.PersonBuilder().setFirstname("john").setMiddlename("not").setLastname("friut").setAge(7).build();

        System.out.println(person3);


        }
}
