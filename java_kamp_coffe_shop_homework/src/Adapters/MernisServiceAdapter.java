package Adapters;

import Abstracts.CustomerCheckService;
import Entities.Customer;
import MernisServiceReference.KPSPublic;

import java.util.Locale;

public class MernisServiceAdapter implements CustomerCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        KPSPublic kpsPublic = new KPSPublic();

        return kpsPublic.getKPSPublicSoap().tcKimlikNoDogrula(
                Long.parseLong(customer.getNationalityId()),
                customer.getFirstName().toUpperCase(Locale.ROOT),
                customer.getLastName().toUpperCase(Locale.ROOT),
                customer.getDateOfBirth().getYear());
    }
}
