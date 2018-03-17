package com.Tcounter.beans;

import java.util.Date;

public class MailTransaction extends Transaction {
    
    public MailTransaction(int id, Date createDate, Boolean isCount){
        super(id, createDate, isCount);
    }
    
}
