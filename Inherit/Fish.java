package Inherit;

public enum Fish {
    BETTA(200, "Red, Blue, Black, White"),
    GUPPY(75, "Red Tuxedo, Black, Rainbow, Dumbo Ear Red"),
    CHICHLID(300, ""),
    OSCAR(300, "Tiger, Copper, Red, Yellow"),
    DISCUS(800, "Orange, Yellow, Red"),
    AROWANA(5000, "Silver, White");

public final int cost;
public final String color;
Fish (int price, String color) {
    cost = price;
    this.color = color;
}
}
