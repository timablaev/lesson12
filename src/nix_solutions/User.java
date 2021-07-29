package nix_solutions;

import java.util.HashMap;

public class User implements Comparable{
    Integer age;
    String name;

    public User(Integer age, String name) {
        this.age = age;
        this.name = name;
    }


    @Override
    public boolean equals (Object obj){
        User user = (User) obj;
        if (name.equalsIgnoreCase(user.name))
            return true;
         return false;
    }
    @Override
    public int hashCode (){
        if (this.name.length() %2 == 0)
            return 1;
        else
            return 3;
    }

    @Override
    public String toString() {
        return  name;
    }

    @Override
    public int compareTo(Object age) {
        User entry = (User) age;
        int result = ((User) age).compareTo(entry.age);
        if (result !=0)
            return result;



            return 0;
    }


}
