package com.robomq.assignment3;

public class ElectionParties {
    private int electionid;
    private String name;
    private String date;
    private String district;
    private String constituency;
    private String countingdate;
    
    public ElectionParties(int electionid, String name, String date, String district, String constituency,
            String countingdate) {
        super();
        this.electionid = electionid;
        this.name = name;
        this.date = date;
        this.district = district;
        this.constituency = constituency;
        this.countingdate = countingdate;
    }
    public synchronized int getElectionid() {
        return electionid;
    }
    public synchronized void setElectionid(int electionid) {
        this.electionid = electionid;
    }
    public synchronized String getName() {
        return name;
    }
    public synchronized void setName(String name) {
        this.name = name;
    }
    public synchronized String getDate() {
        return date;
    }
    public synchronized void setDate(String date) {
        this.date = date;
    }
    public synchronized String getDistrict() {
        return district;
    }
    public synchronized void setDistrict(String district) {
        this.district = district;
    }
    public synchronized String getConstituency() {
        return constituency;
    }
    public synchronized void setConstituency(String constituency) {
        this.constituency = constituency;
    }
    public synchronized String getCountingdate() {
        return countingdate;
    }
    public synchronized void setCountingdate(String countingdate) {
        this.countingdate = countingdate;
    }
    @Override
    public String toString() {
        return "\n ElectionParties [electionid=" + electionid + ", name=" + name + ", date=" + date + ", district="
                + district + ", constituency=" + constituency + ", countingdate=" + countingdate + "]";
    }
    public int hashCode(){
        //System.out.println("In Hashcode method   "+ name.hashCode());
        return name.hashCode();
                
    }
    public boolean equals(Object o) { 
        //System.out.println("In equals method");
        boolean flag =  false;
        if (o instanceof ElectionParties)
        {
            ElectionParties e = (ElectionParties)o;
            if (e.name==this.name)
                flag =  true;
        }
        return flag;
    }
     
}