/**
 * Created by bbraun on 5/7/2014.
 */
public enum PartType {
    os ("Operating System"),
    cpu ("Processor"),
    board ("Motherboard"),
    ram ("Memory"),
    video ("Graphics"),
    drive1 ("Operating System Drive"),
    drive2 ("Additional Drive"),
    optic ("Optical Drive"),
    monitor ("Monitor"),
    keyboard ("Keyboard and Mouse"),
    wifi ("Wireless Networking"),
    extcase ("Case"),
    speakers ("Speakers"),
    software ("Software");

    private final String label;

    PartType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
