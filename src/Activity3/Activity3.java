package Activity3;

public class Activity3 {

    public static void main(String[] args){
        Employee employee1 = new Employee();
        employee1.setEmployeeId(1);
        employee1.setAge(37);
        employee1.setName("John Doe");

        System.out.println(employee1.name);
    }
}


// Create a simple class with private fields and setters and getters
// to represent a user [id, name, age, dob, gender]