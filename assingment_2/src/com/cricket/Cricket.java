package com.cricket;

import java.util.ArrayList;
import java.util.Scanner;


public class Cricket {
    public static void main(String[] args) {
        ArrayList<Team> Teams = new ArrayList<Team>();
        Scanner sc = new Scanner(System.in);
        int No_of_teams;
        System.out.println("Enter the Number of Teams");
        No_of_teams = sc.nextInt();
        for (int i = 0; i < No_of_teams; i++)
        {
            Team t=new Team(i);
            Teams.add(t);
        }
        Match Match1=new Match();
        RandomG r=new RandomG();
        int next_match=0;
        do
        {
            int team1=r.generate_random_number(No_of_teams);
            int team2=r.generate_random_number(No_of_teams);
            while(team1==team2)
            {
                team2=r.generate_random_number(No_of_teams);
            }
            Match m=new Match();
            System.out.println("Team "+(team1+1)+" Team "+(team2+1)+" will play the Next Match");
            m.playing(Teams.get(team1),Teams.get(team2));
            System.out.println("Please enter 1 if you want to continue otherwise enter 0");
            next_match=sc.nextInt();
        }while(next_match==1);
    }
}