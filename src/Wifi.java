import java.math.BigDecimal;

/**
 * Created by bbraun on 5/6/2014.
 */
public class Wifi extends PcPart {
    private String type;
    private String frequency;

    public Wifi(PartType type, String name, String description, BigDecimal cost, String partNumber) {
        super(type, name, description, cost, partNumber);
    }

    public Wifi(PartType type) {
        super(type);
    }
}
