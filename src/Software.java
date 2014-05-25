import java.math.BigDecimal;

/**
 * Created by bbraun on 5/10/2014.
 */
public class Software extends PcPart {
    public Software(PartType type) {
        super(type);
    }

    public Software(PartType type, String name, String description, BigDecimal cost, String partNumber) {
        super(type, name, description, cost, partNumber);
    }
}
