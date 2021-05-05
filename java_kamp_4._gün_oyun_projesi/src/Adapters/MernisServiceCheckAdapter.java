package Adapters;

import Abstracts.GamerCheckService;
import Entities.Gamer;
import MernisServiceReference.KPSPublic;

import java.util.Locale;

public  class MernisServiceCheckAdapter implements GamerCheckService {
    @Override
    public boolean checkIfIsRealPerson(Gamer gamer) {
        KPSPublic kpsPublic =new KPSPublic();

        return kpsPublic.getKPSPublicSoap().tcKimlikNoDogrula(
                Long.parseLong(gamer.getNationalityId()),
                gamer.getFirstName().toUpperCase(Locale.ROOT),
                gamer.getLastName().toUpperCase(Locale.ROOT),
                gamer.getDateOfBirth().getYear());
    }
}
