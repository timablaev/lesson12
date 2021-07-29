package nix_solutions;

import java.util.Objects;

public class FootballTeam implements Comparable{
   String players;

   public FootballTeam (String players){
       this.players = players;
   }

    @Override
    public String toString() {
        return players.toString();
    }

    @Override
    public boolean equals(Object obj) {
        FootballTeam footballTeam = (FootballTeam) obj;
        if (players.equalsIgnoreCase(footballTeam.players))
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        if (this.players.length() %2 == 0)
        return 13;
        else
        return 69;
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
