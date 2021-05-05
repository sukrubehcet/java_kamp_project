package Entities;

public class Campaign {
    private int id;
    private String campaignName;
    private int discountRate;
    private String campaignValidityPeriod;

    public Campaign (){

    }

    public Campaign(int id,String campaignName,int discountRate,String campaignValidityPeriod){
        this.setId(id);
        this.setCampaignName(campaignName);
        this.setDiscountRate(discountRate);
        this.setCampaignValidityPeriod(campaignValidityPeriod);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public String getCampaignValidityPeriod() {
        return campaignValidityPeriod;
    }

    public void setCampaignValidityPeriod(String campaignValidityPeriod) {
        this.campaignValidityPeriod = campaignValidityPeriod;
    }
}
