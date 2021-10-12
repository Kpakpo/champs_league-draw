import java.util.ArrayList;

public class uclDraw_Management {

    public static void main(String[] args) {
        ArrayList<Team> pot = new ArrayList<Team>();
        Team Chelsea = new Team("Chelsea", 2, "England");
        pot.add(Chelsea);

        System.out.println(Chelsea.getName());
    }


}
