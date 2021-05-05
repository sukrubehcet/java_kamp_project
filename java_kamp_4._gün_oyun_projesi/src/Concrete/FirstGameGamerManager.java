package Concrete;

import Abstracts.BaseGameGamerManager;
import Abstracts.GamerCheckService;
import Entities.Campaign;
import Entities.Gamer;

public class FirstGameGamerManager extends BaseGameGamerManager {
    GamerCheckService gamerCheckService;

    public FirstGameGamerManager(GamerCheckService gamerCheckService) {
        this.gamerCheckService = gamerCheckService;
    }

    @Override
    public void add(Gamer gamer) {
        if (gamerCheckService.checkIfIsRealPerson(gamer)) {
            super.add(gamer);
        } else {
            System.out.println("Not a valid Person : " + gamer.getFirstName() + " " + gamer.getLastName());
        }
    }

    @Override
    public void delete(Gamer gamer) {
        super.delete(gamer);
    }

    @Override
    public void update(Gamer gamer) {
        super.update(gamer);
    }

    public void saleWithCampaign(Gamer gamer, Campaign campaign){
        System.out.println("1. oyunu "+gamer.getFirstName()+" "+gamer.getLastName()+" "+campaign.getCampaignName()+" kampanyası ile aldınız.");
    }

    public void saleWithouthCampaign(Gamer gamer){
        System.out.println("1. oyunu "+gamer.getFirstName()+" "+gamer.getLastName()+" kampanyasız aldınız.");
    }
}
