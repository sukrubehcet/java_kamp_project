package Abstracts;

import Entities.Campaign;

public abstract class BaseCampaignCampaignManager implements CampaignService {
    @Override
    public void addCampaign(Campaign campaign) {
        System.out.println("Kampanya eklenmiştir : "+campaign.getCampaignName());
    }

    @Override
    public void deleteCampaign(Campaign campaign) {
        System.out.println("Kampanya Silinmiştir : "+campaign.getCampaignName());
    }

    @Override
    public void updateCampaign(Campaign campaign) {
        System.out.println("Kampanya Güncellenmiştir : "+campaign.getCampaignName());
    }
}
