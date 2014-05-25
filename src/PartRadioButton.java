import javax.swing.*;

/**
 * Created by bbraun on 5/8/2014.
 */
public class PartRadioButton extends JRadioButton {

    private PcPart part;

    public PartRadioButton(PcPart part) {
        super(part.getDescription());
        this.part = part;
    }

    public PcPart getPart() {
        return part;
    }

}
