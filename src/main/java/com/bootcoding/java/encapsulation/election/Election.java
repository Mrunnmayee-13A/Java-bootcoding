package com.bootcoding.java.encapsulation.election;

import java.util.Date;

public class Election {
    private String eligibility;

    public String getEligibility() {
        return eligibility;
    }

    public void setEligibility(String eligibility) {
        this.eligibility = eligibility;
    }

    public Date getElectionDate() {
        return electionDate;
    }

    public void setElectionDate(Date electionDate) {
        this.electionDate = electionDate;
    }

    public Date getDateOfElectionResult() {
        return dateOfElectionResult;
    }

    public void setDateOfElectionResult(Date dateOfElectionResult) {
        this.dateOfElectionResult = dateOfElectionResult;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private Date electionDate;
    private Date dateOfElectionResult;
    private  String city;

}
