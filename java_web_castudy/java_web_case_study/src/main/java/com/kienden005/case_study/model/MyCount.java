package com.kienden005.case_study.model;

public class MyCount {
    private int countservice ;
    private String myservice ;

    public String getMyservice() {
        return myservice;
    }

    public void setMyservice(String myservice) {
        this.myservice = myservice;
    }

    public MyCount() {
    }

    public MyCount(int countservice) {
        this.countservice = countservice;
    }

    public int getCountservice() {
        return countservice;
    }

    public void setCountservice(int countservice) {
        this.countservice = countservice;
    }
    public int icrement(){
        return  countservice++ ;
    }
   public String myservice(){
        return  myservice ;
   }
}
