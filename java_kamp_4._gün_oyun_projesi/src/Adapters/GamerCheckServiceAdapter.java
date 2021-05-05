package Adapters;

import Abstracts.GamerCheckService;
import Entities.Gamer;

public class GamerCheckServiceAdapter implements GamerCheckService {

    @Override
    public boolean checkIfIsRealPerson(Gamer gamer) {
        return true;
    }
}
