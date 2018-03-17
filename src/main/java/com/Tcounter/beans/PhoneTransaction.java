package com.Tcounter.beans;

import java.util.Date;

public class PhoneTransaction extends Transaction {
    
    private Date finishDate;
    
    public PhoneTransaction(int id, Date createDate, Boolean isCount) {
        super(id, createDate, isCount);
        // TODO Auto-generated constructor stub
    }
    
    public Date getFinishDate(){
        return finishDate;
    }
    
    public void setFinishDate(Date finishDate){
        this.finishDate = finishDate;
    }
}
