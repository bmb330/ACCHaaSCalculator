import javax.swing.*;
import java.awt.*;

/**
 * Created by bbraun on 5/7/2014.
 */
public class SelectionPanel extends JPanel {

    private PartSelectionArea operatingSystemPanel;
    private PartSelectionArea processorPanel;
    private PartSelectionArea memoryPanel;
    private PartSelectionArea graphicsPanel;
    private PartSelectionArea systemDrivePanel;
    private PartSelectionArea additionalDrivePanel;
    private PartSelectionArea opticalDrivePanel;
    private PartSelectionArea wirelessNetworkingPanel;
    private PartSelectionArea monitorPanel;
    private PartSelectionArea speakersPanel;
    private PartSelectionArea keyboardMousePanel;
    private PartSelectionArea softwarePanel;
    private JPanel totalPanel;

    public SelectionPanel(PartList partsList, Computer computer) {
        // create layout for item selection areas

        setLayout(new GridLayout(0,3, 10,10));

        operatingSystemPanel = new PartSelectionArea(partsList.getOsList(), computer);
        processorPanel = new PartSelectionArea(partsList.getCpuList(), computer);
        memoryPanel = new PartSelectionArea(partsList.getRamList(), computer);
        graphicsPanel = new PartSelectionArea(partsList.getVideoList(), computer);
        systemDrivePanel = new PartSelectionArea(partsList.getOsDriveList(), computer);
        //additionalDrivePanel = new PartSelectionArea(partsList.getAddDriveList(), computer);
        opticalDrivePanel = new PartSelectionArea(partsList.getOpticalList(), computer);
        wirelessNetworkingPanel = new PartSelectionArea(partsList.getWifiList(), computer);
        monitorPanel = new PartSelectionArea(partsList.getMonitorList(), computer);
        speakersPanel = new PartSelectionArea(partsList.getSpeakersList(), computer);
        keyboardMousePanel = new PartSelectionArea(partsList.getKeyboardMouseList(), computer);
        softwarePanel = new PartSelectionArea(partsList.getSoftwareList(), computer);

        totalPanel = new TotalPanel(computer);

        add(operatingSystemPanel);
        add(processorPanel);
        add(memoryPanel);
        add(graphicsPanel);
        add(systemDrivePanel);
        //add(additionalDrivePanel);
        add(opticalDrivePanel);
        add(wirelessNetworkingPanel);
        add(monitorPanel);
        add(speakersPanel);
        add(keyboardMousePanel);
        add(softwarePanel);
        add(totalPanel);
    }
}