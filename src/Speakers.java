import java.math.BigDecimal;

/**
 * Created by bbraun on 5/6/2014.
 */
public class Speakers extends PcPart {
    private int numberOfSpeakers;

    public Speakers(PartType type) {
        super(type);
    }

    public Speakers(PartType type, String name, String description, BigDecimal cost, String partNumber) {
        super(type, name, description, cost, partNumber);
    }
}
