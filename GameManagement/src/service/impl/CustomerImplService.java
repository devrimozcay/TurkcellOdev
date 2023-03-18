package service.impl;

import entities.Customer;
import service.CustomerService;

import java.util.*;

public class CustomerImplService implements CustomerService {
    Customer customer=new Customer();
    @Override
    public void saveGame(Customer customer) {
        customer.setId(1);
        customer.setName("Emre");
        customer.setLastName("Bilmez");
        customer.setEmail("emre@gmail.com");
        customer.setNationalNumber("42345245234");
        customer.setuName("emre0202");
        customer.setPswrd("1121223");

        Calendar calendar=Calendar.getInstance();
        calendar.set(1998,03,02);
        customer.setBirtDate(calendar.getTime());
    }

    @Override
    public List<Customer> getAllGame() {
        List<Customer> customer=new ArrayList<>();
        return customer;

    }

    @Override
    public Customer getGameById(int id) {
        if(customer.getId()==id){
            return customer;
        }
        else {
            return null;
        }
    }

    @Override
    public Customer updateGame(int id, Customer customer1) {
      if(customer.getId()==id){
          customer.setId(customer1.getId());
          customer.setName(customer1.getName());
          customer.setEmail(customer1.getEmail());
          customer.setuName(customer1.getuName());
          customer.setPswrd(customer1.getPswrd());
          customer.setBirtDate(customer1.getBirtDate());
      }
      else{
          return null;
      }
      return  customer;
    }

    @Override
    public void deleteGameById(int id) throws Exception {
       if(customer.getId()==id){
           System.out.println("Delete Customer");
       }
       else {
           throw new Exception("Error!!!!");
       }
    }
}
