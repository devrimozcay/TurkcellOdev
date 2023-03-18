package service;

import entities.Customer;
import java.util.List;

public interface CustomerService {
    void saveGame(Customer customer);
    List<Customer> getAllGame();
    Customer getGameById(int id);
    Customer updateGame(int id, Customer customer);
    void deleteGameById(int id) throws Exception;

}
