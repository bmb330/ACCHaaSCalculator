import java.math.BigDecimal;

/**
 * Created by bbraun on 5/8/2014.
 */
public class OpticalDrive extends PcPart {
    public OpticalDrive(PartType type) {
        super(type);
    }

    public OpticalDrive(PartType type, String name, String description, BigDecimal cost, String partNumber) {
        super(type, name, description, cost, partNumber);
    }
}
