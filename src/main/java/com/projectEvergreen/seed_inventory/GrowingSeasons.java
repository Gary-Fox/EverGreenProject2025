package com.projectEvergreen.seed_inventory;

public enum GrowingSeasons 
{
    SPRING,
    SUMMER,
    FALL,
    WINTER

    public String toString() {
        switch(this) {
            case SPRING: return "Spring";
            case SUMMER: return "Summer";
            case FALL: return "Fall";
            case WINTER: return "Winter";
            default: return "Unknown Season";
        }
    }
}
