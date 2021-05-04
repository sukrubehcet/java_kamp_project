package Concrete;

import Abstracts.CustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {
    public boolean CheckIfRealPerson(Customer customer){
        return true;
    }
}
