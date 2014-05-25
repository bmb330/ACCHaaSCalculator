import java.math.BigDecimal;

/**
 * Created by bbraun on 5/6/2014.
 */
public class Motherboard extends PcPart {
    private String chipset;
    private String socket;
    private int memorySlots;
    private int maxMemory;

    public Motherboard(PartType type) {
        super(type);
    }

    public Motherboard(PartType type, String name, String description, BigDecimal cost, String partNumber) {
        super(type, name, description, cost, partNumber);
    }
}
