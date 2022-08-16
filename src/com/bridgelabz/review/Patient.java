package com.bridgelabz.review;

public class Patient {
    private final int patientPhoneno;
    private String patientName;
    private int patientAge;
    private String  patientcity;
    private final String patientstate;
    private String patientDepartment;


    Patient (String patientName, int patientAge, int patientPhoneno, String patientDepartment,String patientcity,String patientstate )
    {
        this.patientName= patientName;
        this.patientPhoneno = patientPhoneno;
        this.patientDepartment=patientDepartment;
        this.patientcity=patientcity;
        this.patientstate=patientstate;
        this.patientAge=patientAge;

    }

    public String getPatientDepartment()
    {return patientDepartment;
    }

    public String toString()
    {
        return (patientName+""+patientAge+""+patientDepartment+"" +patientstate+ ""+patientcity+""+patientPhoneno);

  }}