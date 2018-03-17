package com.Tcounter.bussiness;

import com.Tcounter.com.Tcounter.CRUD.TransCRUD;

public class TransactionCounter {
    
    public int startProgram(){
        TransCRUD transCRUD = new TransCRUD();
        
        transCRUD.readTransactions();
        
        //bussiness and program functioning
        
        transCRUD.persistTransactions(null);
        return 0;
    }
    
    public void createEmailTransaction(){}
    
    public void modifyEmailTransaction(){}
    
    public void createPhoneTransaction(){}
    
    public void modifyPhoneTransaction(){}
    
    public void deleteTransaction(){}
    
    public void serachTransaction(){}
}
