import Abstracts.BaseCampaignCampaignManager;
import Abstracts.BaseGameGamerManager;
import Adapters.MernisServiceCheckAdapter;
import Concrete.FirstCampaignCampaignManager;
import Concrete.FirstGameGamerManager;
import Entities.Campaign;
import Entities.Gamer;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Gamer gamer1 = new Gamer();
        gamer1.setFirstName("Şükrü");
        gamer1.setLastName("Behçet");
        gamer1.setDateOfBirth(LocalDate.of(1998,6,18));
        gamer1.setPassword("123");
        gamer1.setNationalityId("55555555555");
        gamer1.setUserName("sukru");
        gamer1.setId(1);

        Campaign campaign1 = new Campaign();
        campaign1.setCampaignName("Büyük İndirim");
        campaign1.setCampaignValidityPeriod("2 hafta");
        campaign1.setDiscountRate(30);
        campaign1.setId(1);

        BaseGameGamerManager gameManager = new FirstGameGamerManager(new MernisServiceCheckAdapter());
        gameManager.add(gamer1);
        gameManager.delete(gamer1);
        gameManager.saleWithouthCampaign(gamer1);
        gameManager.saleWithCampaign(gamer1,campaign1);

        BaseCampaignCampaignManager campaignManager = new FirstCampaignCampaignManager();
        campaignManager.addCampaign(campaign1);
        campaignManager.deleteCampaign(campaign1);
    }
}
