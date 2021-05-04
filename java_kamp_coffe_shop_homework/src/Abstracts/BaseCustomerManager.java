package Abstracts;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{
    public void save(Customer customer){
        System.out.println("saved to db : "+customer.getFirstName()+" "+customer.getLastName());
    }
}
