import java.math.BigDecimal;

/**
 * Created by bbraun on 5/6/2014.
 */
public class Ram extends PcPart {
    private int size;
    private String memoryType;
    private int modules;
    private int memorySpeed;

    public Ram(PartType type) {
        super(type);
    }

    public Ram(PartType type, String name, String description, BigDecimal cost, String partNumber) {
        super(type, name, description, cost, partNumber);
    }
}
