import java.math.BigDecimal;

/**
 * Created by bbraun on 5/6/2014.
 */
public class Cpu extends PcPart {
    private String clockSpeed;
    private String socket;

    public Cpu(PartType type) {
        super(type);
    }

    public Cpu(PartType type, String name, String description, BigDecimal cost, String partNumber) {
        super(type, name, description, cost, partNumber);
    }
}
