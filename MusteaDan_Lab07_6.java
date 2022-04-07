//Mustea Dumitru-Dan Lab07_6
import java.util.*;
import java.util.stream.Collectors;


public class MusteaDan_Lab07_6 {
    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList<Employee> listEmployee = new LinkedList<Employee>();
        System.out.println("Insert the number of employees you wish to add");
        int n=integerRead();
        for(int i=0;i<n;i++){
            Employee aux = new Employee();
            System.out.println("Insert the name");
            aux.setName(keyboard.next());
            System.out.println("Insert the age");
            aux.setAge(integerRead());
            System.out.println("Insert the salary");
            aux.setSalary(integerRead());
            listEmployee.add(aux);
        }


        //ascending order by name
        Collections.sort(listEmployee,new EmployeeNameComparator());
        System.out.println("====== first display ======");
        for(Employee element: listEmployee){
		    System.out.println(element.getName()+
                            " "+element.getAge()+
                            " "+element.getSalary()
                            );
        }System.out.println();

        //descending order by age
        //Collections.sort(listEmployee,new EmployeeAgeComparator());
        Comparator<Employee> reverseAgeComparator = (h1, h2) -> h2.getAge()-h1.getAge();
        List<Employee>reversedAgedEmployees = listEmployee.stream().sorted(reverseAgeComparator).collect(Collectors.toList());
        System.out.println("====== second display ======");
        for(Employee element: reversedAgedEmployees){
		    System.out.println(element.getName()+
                            " "+element.getAge()+
                            " "+element.getSalary()
                            );
        }System.out.println();

        //ascending order by name descending by salary
        Collections.sort(listEmployee,new EmployeeAgeAndNameComparator());
        System.out.println("====== third display ======");
        for(Employee element: listEmployee){
		    System.out.println(element.getName()+
                            " "+element.getAge()+
                            " "+element.getSalary()
                            );
        }System.out.println();

    }


    public static int integerRead(){
        int n;
        try{
            n=keyboard.nextInt(); 
            return n;
        }catch(Exception E){
            System.out.println("Wrong type of number");
            return 1;
        }
    }

}

class EmployeeAgeComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee a,Employee b){
        return b.getAge()-a.getAge();

    }
}

class EmployeeNameComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee a,Employee b){
        return a.getName().compareTo(b.getName());
    }
}

class EmployeeAgeAndNameComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee a,Employee b){
        if(a.getName().compareTo(b.getName())<0){
            return -1;
        }else if(a.getName().compareTo(b.getName())>0){
            return 1;
        }else{
            return b.getSalary()-a.getSalary();
        }


    }
}



class Employee{
    private String name;
    private int age;
    private int salary;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public int getSalary(){
        return this.salary;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }

}
