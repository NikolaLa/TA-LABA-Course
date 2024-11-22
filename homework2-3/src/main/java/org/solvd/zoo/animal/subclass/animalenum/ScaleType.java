package org.solvd.zoo.animal.subclass.animalenum;

public enum ScaleType {
    PLACOID("Placoid", ""),
    COSMOID("Cosmoid",""),
    GANOID ("Ganoid",""),
    CYCLOID("Cycloid and Ctenoid"," most bony fishes has round scale"),
    ;

    private final String name;
    private final String description;
    ScaleType(String name, String description) {
        this.name = name;
        this.description = description;
    }

}
