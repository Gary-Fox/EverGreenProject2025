package com.projectEvergreen.seed_inventory;

public class Crop
{
    private String cropName;
    private int currentAmount;
    private int manualAverageCropPeriod;
    private GrowingSeasons growingSeason;

    /** Constructor with parameters
     * @param cropName The name of the crop
     * @param currentAmount The current amount of crops, manually updated
     * @param manualAverageCropPeriod the Average crop period of the crop, manually set
     * @param growingSeason The season in which the crop grows
     */
    public Crop(String cropName, int currentAmount, int manualAverageCropPeriod, GrowingSeasons growingSeason) 
    {
        this.cropName = cropName;
        this.currentAmount = currentAmount;
        this.manualAverageCropPeriod = manualAverageCropPeriod;
        this.growingSeason = growingSeason;
    }

    /** Default constructor
     */
    public Crop()
    {
        this.cropName = "DefaultCrop";
        this.currentAmount = 0;
        this.manualAverageCropPeriod = 0;
        this.growingSeason = GrowingSeasons.SPRING;
    }

    //##############################[ Getters ]###########################

    public String getCropName() 
    {
        return this.cropName;
    }

    public int getCurrentAmount() 
    {
        return this.currentAmount;
    }

    public int getCropPeriod() 
    {
        return this.manualAverageCropPeriod;
    }
    
    public GrowingSeasons getSeason() 
    {
        return this.growingSeason;
    }

    //#######################[ Setters ] #############################

    public void setCropName(String cropName) 
    {
        this.cropName = cropName;
    }

    public void setCurrentAmount(int currentAmount) 
    {
        this.currentAmount = currentAmount;
    }

    public void setCropPeriod(int cropPeriod) 
    {
        this.manualAverageCropPeriod = cropPeriod;
    }
    
    public void setSeason(GrowingSeasons season) 
    {
        this.growingSeason = season;
    }
    
}
