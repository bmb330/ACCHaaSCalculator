import java.math.BigDecimal;

/**
 * Created by bbraun on 5/8/2014.
 */
public class KeyboardMouse extends PcPart {
    public KeyboardMouse(PartType type) {
        super(type);
    }

    public KeyboardMouse(PartType type, String name, String description, BigDecimal cost, String partNumber) {
        super(type, name, description, cost, partNumber);
    }
}
