package com.projectEvergreen.seed_inventory;

    public class DummyMain 
    {
        public static void main(String[] args) 
        {
            System.out.println("Dummy Main Started");
            
            // Test creating a crop
            Crop tomato = new Crop("Tomato", 100, 90, GrowingSeasons.SUMMER);
            System.out.println("Created crop: " + tomato.getCropName());
        };
        
    }