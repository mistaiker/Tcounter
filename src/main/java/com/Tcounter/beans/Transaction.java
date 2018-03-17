package com.Tcounter.beans;

import java.util.Date;

public abstract class Transaction {
    
    private int id;
    private Date createDate;
    private Boolean isCount;
    
    public Transaction(int id, Date createDate, Boolean isCount){
        this.id = id;
        this.createDate = createDate;
        this.isCount = isCount;
    }
    
    public void setId(int id){
        this.id = id;
    }
        
    public void setCreateDate(Date createDate){
        this.createDate = createDate;
    }
    
    public void setIsCount(Boolean isCount){
        this.isCount = isCount;
    }
    
    public int getId(){
        return this.id;
    }
    
    public Date getCreateDate(){
        return this.createDate;
    }
    
    public Boolean getIsCount(){
        return this.isCount;
    }
}
