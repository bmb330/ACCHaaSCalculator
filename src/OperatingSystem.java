import java.math.BigDecimal;

/**
 * Created by bbraun on 5/8/2014.
 */
public class OperatingSystem extends PcPart {
    public OperatingSystem(PartType type) {
        super(type);
    }

    public OperatingSystem(PartType type, String name, String description, BigDecimal cost, String partNumber) {
        super(type, name, description, cost, partNumber);
    }
}
