package org.solvd.zoo.animal.subclass.animalenum;

public enum WaterType {
    NONE("NONE", "land animal"),
    FRESHWATER("Freshwater", "in Lake, Ponds, River"),
    SALTWATER("Saltwater", "Ocean"),
    TERRESTRIAL("Terrestrial with Water Proximity","water in Forest and swamps"),
    BRACKISH ("Brackish","Mangrove - Trees in water, Estuary -place where freshwater meets saltwater "),
    ;

    WaterType(String name, String description) {
    }

}
