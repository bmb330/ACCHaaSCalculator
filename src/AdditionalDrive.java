import java.math.BigDecimal;

/**
 * Created by bbraun on 5/8/2014.
 */
public class AdditionalDrive extends PcPart {
    public AdditionalDrive(PartType type) {
        super(type);
    }

    public AdditionalDrive(PartType type, String name, String description, BigDecimal cost, String partNumber) {
        super(type, name, description, cost, partNumber);
    }
}
