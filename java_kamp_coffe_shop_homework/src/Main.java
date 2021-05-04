import Abstracts.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setFirstName("Şükrü");
        customer.setLastName("Behçet");
        customer.setNationalityId("55555555555");
        customer.setDateOfBirth(LocalDate.of(2021,1,1));
        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        customerManager.save(customer);

        Customer customer1 = new Customer();
        customer1.setFirstName("Şükrü");
        customer1.setLastName("Behçet");
        customer1.setNationalityId("55555555555");
        customer1.setDateOfBirth(LocalDate.of(2021,1,1));
        BaseCustomerManager customerManager1 = new StarbucksCustomerManager(new CustomerCheckManager());
        customerManager1.save(customer1);

        Customer customer2 = new Customer();
        customer2.setFirstName("Şükrü");
        customer2.setLastName("Behçet");
        customer2.setNationalityId("55555555555");
        customer2.setDateOfBirth(LocalDate.of(2021,1,1));
        BaseCustomerManager customerManager2 = new NeroCustomerManager();
        customerManager2.save(customer2);


    }

}
