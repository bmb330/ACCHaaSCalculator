import java.math.BigDecimal;

/**
 * Created by bbraun on 5/6/2014.
 */
public class ExtCase extends PcPart {
    private int numberDrives3Inch;
    private int numberDrives5Inch;

    public ExtCase(PartType type) {
        super(type);
    }

    public ExtCase(PartType type, String name, String description, BigDecimal cost, String partNumber) {
        super(type, name, description, cost, partNumber);
    }
}
