package org.example._30_08_2023;

public enum Season {

    WINTER ("snow"),
    SPRING ("green"),
    SUMMER ("sun"),
    AUTUMN ("rain");

    private String value;

    Season(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static void main(String[] args) {
        Season[] seasons = Season.values();
        for (Season season : seasons) {
            System.out.println(season);
            System.out.println(season.getValue() + "\n");
        }

        System.out.println("Winter " + Season.WINTER);
        System.out.println("Winter with value of: " + Season.valueOf("WINTER"));

        System.out.println(Season.WINTER.ordinal());
        
    }

}
