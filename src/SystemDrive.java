import java.math.BigDecimal;

/**
 * Created by bbraun on 5/8/2014.
 */
public class SystemDrive extends PcPart {
    public SystemDrive(PartType type) {
        super(type);
    }

    public SystemDrive(PartType type, String name, String description, BigDecimal cost, String partNumber) {
        super(type, name, description, cost, partNumber);
    }
}
