import java.util.ArrayList;
import java.util.List;

/**
 * Created by bbraun on 5/7/2014.
 */
public class PartList {

    private List<PcPart> osList = new ArrayList<PcPart>();
    private List<PcPart> cpuList = new ArrayList<PcPart>();
    private List<PcPart> ramList = new ArrayList<PcPart>();
    private List<PcPart> videoList = new ArrayList<PcPart>();
    private List<PcPart> osDriveList = new ArrayList<PcPart>();
    private List<PcPart> addDriveList = new ArrayList<PcPart>();
    private List<PcPart> opticalList = new ArrayList<PcPart>();
    private List<PcPart> wifiList = new ArrayList<PcPart>();
    private List<PcPart> monitorList = new ArrayList<PcPart>();
    private List<PcPart> speakersList = new ArrayList<PcPart>();
    private List<PcPart> keyboardMouseList = new ArrayList<PcPart>();
    private List<PcPart> extCaseList = new ArrayList<PcPart>();
    private List<PcPart> motherboardList = new ArrayList<PcPart>();
    private List<PcPart> softwareList = new ArrayList<PcPart>();


    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Start create part lists
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void createOsList(OperatingSystem... parts) {
        for(OperatingSystem part : parts) {
            addOs(part);
        }
    }

    public void createCpuList(Cpu... parts) {
        for(Cpu part : parts) {
            addCpu(part);
        }
    }

    public void createRamList(Ram... parts) {
        for(Ram part : parts) {
            addRam(part);
        }
    }

    public void createVideoList(Video... parts) {
        for(Video part : parts) {
            addVideo(part);
        }
    }

    public void createOsDriveList(SystemDrive... parts) {
        for(SystemDrive part : parts) {
            addOsDrive(part);
        }
    }

    public void createAddDriveList(AdditionalDrive... parts) {
        for(AdditionalDrive part : parts) {
            addAddDrive(part);
        }
    }

    public void createWifiList(Wifi... parts) {
        for(Wifi part : parts) {
            addWifi(part);
        }
    }

    public void createMonitorList(Monitor... parts) {
        for(Monitor part : parts) {
            addMonitor(part);
        }
    }

    public void createSpeakersList(Speakers... parts) {
        for(Speakers part : parts) {
            addSpeakers(part);
        }
    }

    public void createKeyboardMouseList(KeyboardMouse... parts) {
        for(KeyboardMouse part : parts) {
            addKeyboardMouse(part);
        }
    }

    public void createExtCaseList(ExtCase... parts) {
        for(ExtCase part : parts) {
            addExtCase(part);
        }
    }

    public void createMotherboardList(Motherboard... parts) {
        for(Motherboard part : parts) {
            addMotherboard(part);
        }
    }

    public void createSoftwareList(Software... parts) {
        for(Software part : parts) {
            addSoftware(part);
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // End create part lists
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Start add Parts individually
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void addOs(OperatingSystem operatingSystem) {
        osList.add(operatingSystem);
    }

    public void addCpu(Cpu part) {
        cpuList.add(part);
    }

    public void addRam(Ram part) {
        ramList.add(part);
    }

    public void addVideo(Video part) {
        videoList.add(part);
    }

    public void addOsDrive(SystemDrive part) {
        osDriveList.add(part);
    }

    public void addAddDrive(AdditionalDrive part) {
        addDriveList.add(part);
    }

    public void addOptical(OpticalDrive part) {
        opticalList.add(part);
    }

    public void addWifi(Wifi part) {
        wifiList.add(part);
    }

    public void addMonitor(Monitor part) {
        monitorList.add(part);
    }

    public void addSpeakers(Speakers part) {
        speakersList.add(part);
    }

    public void addKeyboardMouse(KeyboardMouse part) {
        keyboardMouseList.add(part);
    }

    public void addExtCase(ExtCase part) {
        extCaseList.add(part);
    }

    public void addMotherboard(Motherboard part) {
        motherboardList.add(part);
    }

    public void addSoftware(Software part) {
        softwareList.add(part);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // End add parts individually
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Start getters
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public List<PcPart> getOsList() {
        return osList;
    }

    public List<PcPart> getCpuList() {
        return cpuList;
    }

    public List<PcPart> getRamList() {
        return ramList;
    }

    public List<PcPart> getVideoList() {
        return videoList;
    }

    public List<PcPart> getOsDriveList() {
        return osDriveList;
    }

    public List<PcPart> getAddDriveList() {
        return addDriveList;
    }

    public List<PcPart> getOpticalList() {
        return opticalList;
    }

    public List<PcPart> getWifiList() {
        return wifiList;
    }

    public List<PcPart> getMonitorList() {
        return monitorList;
    }

    public List<PcPart> getSpeakersList() {
        return speakersList;
    }

    public List<PcPart> getKeyboardMouseList() {
        return keyboardMouseList;
    }

    public List<PcPart> getExtCaseList() {
        return extCaseList;
    }

    public List<PcPart> getMotherboardList() {
        return motherboardList;
    }

    public List<PcPart> getSoftwareList() {
        return softwareList;
    }

    public PcPart getDefault(PartType type) {
        PcPart part;

        switch (type) {
            case os:
                part = osList.isEmpty() ? new PcPart(type) : osList.get(0);
                break;
            case cpu:
                part = cpuList.isEmpty() ? new PcPart(type) : cpuList.get(0);
                break;
            case board:
                part = motherboardList.isEmpty() ? new PcPart(type) : monitorList.get(0);
                break;
            case ram:
                part = ramList.isEmpty() ? new PcPart(type) : ramList.get(0);
                break;
            case video:
                part = videoList.isEmpty() ? new PcPart(type) : videoList.get(0);
                break;
            case drive1:
                part = osDriveList.isEmpty() ? new PcPart(type) : osDriveList.get(0);
                break;
            case drive2:
                part = addDriveList.isEmpty() ? new PcPart(type) : addDriveList.get(0);
                break;
            case optic:
                part = opticalList.isEmpty() ? new PcPart(type) : opticalList.get(0);
                break;
            case monitor:
                part = monitorList.isEmpty() ? new PcPart(type) : monitorList.get(0);
                break;
            case keyboard:
                part = keyboardMouseList.isEmpty() ? new PcPart(type) : keyboardMouseList.get(0);
                break;
            case wifi:
                part = wifiList.isEmpty() ? new PcPart(type) : wifiList.get(0);
                break;
            case extcase:
                part = extCaseList.isEmpty() ? new PcPart(type) : extCaseList.get(0);
                break;
            case speakers:
                part = speakersList.isEmpty() ? new PcPart(type) : speakersList.get(0);
                break;
            case software:
                part = softwareList.isEmpty() ? new PcPart(type) : speakersList.get(0);
                break;
            default:
                part = null;
        }

        return part;
    }


    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // End getters
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
