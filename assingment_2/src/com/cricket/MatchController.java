package com.cricket;

public class MatchController {
    void play(Team t1,Team t2)
    {
        int balls=120;
        int count=0,score=0;
        int wickets=0;
        RandomG r=new RandomG();
        while(count<balls&&wickets<10)
        {
            int tu=r.generate_random_number(8);
            if(tu==8)
            {
                wickets++;
            }
            else
            {
                score+=tu;
            }
            count++;
        }
        t1.wickets=wickets;
        t1.score=score;
        wickets=0;
        score=0;
        count=0;
        while(count<balls&&wickets<10)
        {
            int tu=r.generate_random_number(8);
            if(tu==8)
            {
                wickets++;
            }
            else
            {
                score+=tu;
            }
            if(score>t1.score)
                break;
            count++;
        }
        t2.wickets=wickets;
        t2.score=score;
        System.out.println("Team "+ t1.Team_Id +" Scored "+t1.score );
        System.out.println("Team "+ t2.Team_Id +" Scored "+t2.score );
        if(t1.score>t2.score)
        {
            System.out.println("Team"+(t1.Team_Id+1) +" Wins");
        }
        else if(t1.score<t2.score)
        {
            System.out.println("Team"+(t2.Team_Id+1) +" Wins");
        }
        else
            System.out.println("Match tied");
    }
}
