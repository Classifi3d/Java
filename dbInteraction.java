# --------------------------------------------------------------------------------- #
#                                   dbInteraction                                   #
# --------------------------------------------------------------------------------- #

# ------------------------------ Person.java class -------------------------------- #
package dbInteraction;

public class Person {
    private String name;
    private String surename;
    private String email;
    private String password;
    private  int userID;
    public Person(){
        setName("");
        setSurename("");
        setEmail("");
        setPassword("");
        setUserID(0);
    }
    public Person(String name,String surename,String email,String password,int userID){
        setName(name);
        setSurename(surename);
        setEmail(email);
        setPassword(password);
        setUserID(userID);
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurename(String surename) {
        this.surename = surename;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public void setUserID(int userID){
        this.userID=userID;
    }
    public String getName(){
        return this.name;
    }
    public String getSurename(){
        return this.surename;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPassword(){
        return this.password;
    }
    public int getUserID(){
        return this.userID;
    }


}

# ------------------- AuthenticationInterface.java interface ---------------------- #

package dbInteraction;

public interface AuthenticationInterface {
    //public Person[] personArray =new Person[]{Person(admin,...),Person(dbAdmin...),Person(superAdmin...)};
    Person[] createUser(Person person);
    Person[] deleteUser(Person person);
    Person[] login(Person person);
}

# ------------------ VerifyPerson.java abstract class  ---------------------------- #

package dbInteraction;
import java.util.regex.Pattern;

public abstract class VerifyPerson extends Person{
    public boolean checkName(){
        String nameFormat = "[a-zA-Z\\- ]{1,50}";
        return Pattern.matches(nameFormat,this.getName());
    }
    public boolean checkSurename(){
        String nameFormat = "[a-zA-Z\\- ]{1,50}";
        return Pattern.matches(nameFormat,this.getSurename());
    }
    public boolean checkEmail(){
        String emailFormat = "[a-zA-Z._]*@[a-zA-Z.]*.[a-zA-Z]{2,5}";
        return Pattern.matches(emailFormat,this.getEmail());
    }
    abstract public boolean checkPassword();
    abstract public boolean checkUserID();

}


