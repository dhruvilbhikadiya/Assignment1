package com.cricket;

public class Match {
    void playing(Team t1,Team t2)
    {   RandomG r=new RandomG();
        int toss=r.generate_random_number(2);
        int t1_guess=r.generate_random_number(2);
        MatchController m1=new MatchController();
        if(t1_guess==toss)
        {
            System.out.print("Team "+(t1.Team_Id+1) +" won the toss");
            int turn=r.generate_random_number(2);
            if(turn==0)
            {
                System.out.println(" And decide to Bat first");
                m1.play(t1,t2);
            }
            else
            {   System.out.println(" And decide to Bowl first");
                m1.play(t2,t1);
            }
        }
        else
        {   System.out.print("Team "+(t2.Team_Id+1) +" won the toss");
            int turn=r.generate_random_number(2);
            if(turn==0)
            {   System.out.println(" And decide to Bat first");
                m1.play(t2,t1);
            }
            else
            {   System.out.println(" And decide to Bowl first");
               m1.play(t1,t2);
            }

        }
    }
}
