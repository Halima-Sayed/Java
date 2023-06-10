package Class30;

import Class29.BankAccount;

import java.util.ArrayList;
import java.util.List;

public class E7Methods {
    public static void main(String[] args){
    E7Methods e7Methods=new E7Methods();
    BankAccount bankAccount=new BankAccount(20);
    e7Methods.print(bankAccount);

    }

    void print(BankAccount bankAccount){
       bankAccount.withdraw(10);
    }
}
