package com.robomq.assignment3;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

 

public class Election {

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        HashSet<ElectionParties> electionlist=new HashSet<ElectionParties>();
        electionlist.add(new ElectionParties(1,"BJP","12-09-2018","Jaipur","xyz", "10-11-2018"));
        electionlist.add(new ElectionParties(2,"Congress","12-09-2018","Jaipur","xyz", "09-12-2018"));
        electionlist.add(new ElectionParties(3,"AAP","12-09-2019","Jaipur","xyz", "15-12-2019"));
        electionlist.add(new ElectionParties(4,"BSP","15-05-2018","Jaipur","xyz", "10-11-2018"));
        electionlist.add(new ElectionParties(5,"JDU","2-05-2018","Jaipur","xyz", "18-11-2018"));
        electionlist.add(new ElectionParties(3,"AAP","12-05-2018","Jaipur","xyz", "15-12-2019"));
        
        
        ArrayList<ElectionParties> newlist=new ArrayList<ElectionParties>();
        System.out.println(electionlist);
        List<String> arrlist = new ArrayList<String>();
        ArrayList<String> commonDate=new ArrayList<String>();
        
        
        for(ElectionParties e :electionlist)
            {
                
            //System.out.println("eeeee"+arrlist.contains(e.getDate()));
            if(arrlist.contains(e.getDate())) {
                System.out.println("These are the parties that have same date");
                //System.out.println("\n " +e);
                commonDate.add(e.getDate());
                //System.out.println("heyy"+e.getDate());
                System.out.println("byyy"+commonDate);
                }
            arrlist.add(e.getDate());
            
                
            }
        
    
    for(ElectionParties e1 :electionlist)
    {
        if(commonDate.contains(e1.getDate()))
        {
            System.out.println(e1);
        }
    }
    }
}