package Abstracts;

import Entities.Campaign;
import Entities.Gamer;

public abstract class BaseGameGamerManager implements GamerService{
    @Override
    public void add(Gamer gamer){
        System.out.println("Oyuncu sisteme kaydedildi : "+gamer.getFirstName()+" "+gamer.getLastName());
    }

    @Override
    public void delete(Gamer gamer){
        System.out.println("Oyuncu sistemden silindi : "+gamer.getFirstName()+" "+gamer.getLastName());
    }

    @Override
    public void update(Gamer gamer){
        System.out.println("Oyuncu güncellendi : "+gamer.getFirstName()+" "+gamer.getLastName());
    }


    public void saleWithCampaign(Gamer gamer, Campaign campaign){
        System.out.println("Oyunu "+gamer.getFirstName()+" "+gamer.getLastName()+" "+campaign.getCampaignName()+" kampanyası ile aldınız.");
    }


    public void saleWithouthCampaign(Gamer gamer){
        System.out.println("Oyunu "+gamer.getFirstName()+" "+gamer.getLastName()+" kampanyasız aldınız.");
    }

}
