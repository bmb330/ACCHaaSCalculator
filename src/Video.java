import java.math.BigDecimal;

/**
 * Created by bbraun on 5/6/2014.
 */
public class Video extends PcPart {
    private int memory;

    public Video(PartType type) {
        super(type);
    }

    public Video(PartType type, String name, String description, BigDecimal cost, String partNumber) {
        super(type, name, description, cost, partNumber);
    }
}
