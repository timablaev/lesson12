package nix_solutions;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, User> users = new HashMap<>();

        users.put(23, new User(23, "John"));
        users.put(35, new User(35, "Jack"));
        users.put(44, new User(44, "Peter"));



        System.out.println(users.equals(users));
        System.out.println(users.get(35).hashCode());


        System.out.println(users.keySet());
        System.out.println(users.values());
        System.out.println(users.entrySet());

        for (User user : users.values()){
            System.out.println(user.age);
            System.out.println(user.name);

        }
        for (User user1 : users.values()){
            System.out.println(user1.age.compareTo(44));

        }
        List<String> footballTeam = new LinkedList<>();
        footballTeam.add("Joe Gomes");
        footballTeam.add("Alisson Bekker");
        footballTeam.add("Virgil Van Djik");
        footballTeam.add("Trent Arnold");
        footballTeam.add("Andy Robertson");
        footballTeam.add("Fabinho");

        System.out.println(footballTeam.equals(4));
        System.out.println(footballTeam.get(3).hashCode());
        System.out.println(footballTeam.get(4));
        System.out.println(footballTeam.get(1).compareTo("Trent Arnold"));
        System.out.println(footballTeam.toString());


    }
}
