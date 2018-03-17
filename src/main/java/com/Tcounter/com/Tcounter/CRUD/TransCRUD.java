package com.Tcounter.com.Tcounter.CRUD;

import java.util.ArrayList;

import com.Tcounter.beans.Transaction;

public class TransCRUD {
    
    private TransPersister transPersister;
    private TransReader transReader;
    
    public ArrayList<Transaction> readTransactions(){        
        return transReader.readTransactions();
    }
    
    public void persistTransactions(ArrayList<Transaction> transactions){
        transPersister.persistTransactions(transactions);
    }
    
}
