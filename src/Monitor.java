import java.math.BigDecimal;

/**
 * Created by bbraun on 5/6/2014.
 */
public class Monitor extends PcPart {
    private int resolution;
    private int vga;
    private int dvi;
    private int hdmi;

    public Monitor(PartType type) {
        super(type);
    }

    public Monitor(PartType type, String name, String description, BigDecimal cost, String partNumber) {
        super(type, name, description, cost, partNumber);
    }
}
