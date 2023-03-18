package service.salesmanager;

import entities.Customer;
import entities.Game;

import java.util.ArrayList;
import java.util.List;

public class SalesGame {
    List<Customer> list=new ArrayList<>();
    public boolean gameAndSalesManagement(Customer customer){
       for (Customer customer1: list){
           if(customer1.getName()==customer.getName() &&
           customer1.getLastName()==customer.getLastName() &&
                   customer1.getNationalNumber() == customer.getNationalNumber() &&
           customer1.getBirtDate()==customer.getBirtDate()){
            return true;
           }
       }
       return false;
    }
}
