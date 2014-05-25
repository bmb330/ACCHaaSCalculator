import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * Created by bbraun on 5/7/2014.
 */
public class PartSelectionArea extends JPanel {

    private Computer computer;

    public PartSelectionArea(List<PcPart> partsList, Computer computer) {

        TitledBorder title;

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        if(!partsList.isEmpty()) {
            this.computer = computer;

            // create label
            //JLabel label = new JLabel(partsList.get(0).getPartType().getLabel());
            //add(label);
            title = BorderFactory.createTitledBorder(partsList.get(0).getPartType().getLabel());
            this.setBorder(title);

            // create radio button group
            ButtonGroup rbgroup = new ButtonGroup();

            // create radio buttons for parts
            for (PcPart part : partsList) {

                final PartRadioButton radioButton = new PartRadioButton(part);
                if(partsList.get(0).equals(part)) {
                    radioButton.setSelected(true);
                }

                add(radioButton);
                rbgroup.add(radioButton);

                // Action listener for  radio button click, will change part in computer
                radioButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setComputerPart(radioButton.getPart());
                    }
                });
            }
        }
    }

    // Set the computer part, called from radio button action listener
    public void setComputerPart(PcPart part) {
        computer.setPart(part);
    }
}
