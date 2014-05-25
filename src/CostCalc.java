import javax.swing.*;
import java.math.BigDecimal;

/**
 * Created by bbraun on 5/6/2014.
 */
public class CostCalc {

    private final static String PROGRAMNAME = "ACC HaaS Cost Calculator";

    private static PartList partlist = new PartList();
    private static Computer computer;

    public static void main(String [] args) {
        setupPartList(partlist);
        computer = new Computer(partlist);
        JFrame frame = new JFrame(PROGRAMNAME);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(600, 800);
        frame.add(new SelectionPanel(partlist, computer));
        frame.pack();
        frame.setVisible(true);
    }

    private static void setupPartList(PartList list) {

        // ExtCase
        list.addExtCase(new ExtCase(PartType.extcase, "Generic Case", "Generic Case - Any", new BigDecimal("100"), "na"));

        // Motherboard
        list.addMotherboard(new Motherboard(PartType.board, "Asus B85M-E", "Asus B85M-E", new BigDecimal("90"), "607143"));

        // OS
        list.addOs(new OperatingSystem(PartType.os, "Windows 7 Pro", "Microsoft Windows 7 Professional", new BigDecimal("140"), "MSFQC08279"));
        list.addOs(new OperatingSystem(PartType.os, "Windows 8 Pro", "Microsoft Windows 8 Professional", new BigDecimal("140"), "MSFQC06950"));

        // Processor
        list.addCpu(new Cpu(PartType.cpu, "i3-4130", "Intel Core i3 4130 - 3.4GHz with Intel HD 4400 Graphics", new BigDecimal("125"), "BX80646I34130"));
        list.addCpu(new Cpu(PartType.cpu, "i5-4670K", "Intel Core i5 4670K - 3.4GHz with Intel HD 4600 Graphics", new BigDecimal("190"), "521575"));
        list.addCpu(new Cpu(PartType.cpu, "i7-4770K", "Intel Core i7 4770K - 3.5GHz with Intel HD 4600 Graphics", new BigDecimal("270"), "521310"));

        // Memory
        list.addRam(new Ram(PartType.ram, "Crucial Ballistix 4GB Kit", "4GB - Crucial DDR3-1600 (2x2GB Kit)", new BigDecimal("45"), "649528756046"));
        list.addRam(new Ram(PartType.ram, "Crucial Ballistix 8GB Kit", "8GB - Crucial DDR3-1600 (2x4GB Kit)", new BigDecimal("75"), "649528755988"));
        list.addRam(new Ram(PartType.ram, "Crucial Ballistix 16GB Kit", "16GB - Crucial DDR3-1600 (2x8GB Kit)", new BigDecimal("135"), "649528757913"));
        list.addRam(new Ram(PartType.ram, "Crucial Ballistix 32GB Kit", "32GB - Crucial DDR3-1600 (4x8GB Kit)", new BigDecimal("270"), "2 of 649528757913"));

        // Graphics
        list.addVideo(new Video(PartType.video, "None", "Intel High Definition Graphics", new BigDecimal("0"), "na"));

        // OS Drive
        list.addOsDrive(new SystemDrive(PartType.drive1, "Seagate Barracuda 500GB", "500GB - Seagate Barracuda 7,200RPM SATA 6.0Gbps", new BigDecimal("65"), "ST3500641AS-RK"));
        list.addOsDrive(new SystemDrive(PartType.drive1, "Seagate Barracuda 1TB", "1TB - Seagate Barracuda 7,200RPM SATA 6.0Gbps", new BigDecimal("75"), "ST3100005N1A1AS"));
        list.addOsDrive(new SystemDrive(PartType.drive1, "Seagate Barracuda 2TB", "2TB - Seagate Barracuda 7,200RPM SATA 6.0Gbps", new BigDecimal("105"), "STBD2000101"));

        // Optical Drive
        list.addOptical(new OpticalDrive(PartType.optic, "LG DVD ReWritable", "LG DVD/CD ReWriter", new BigDecimal("16"), "GH24NSB0"));

        // Wireless
        list.addWifi(new Wifi(PartType.wifi, "None", "None", new BigDecimal("0"), "na"));
        list.addWifi(new Wifi(PartType.wifi, "Asus 300Mbps Wireless N", "Asus 300Mbps Wireless N", new BigDecimal("30"), "PCE-N15"));

        // Monitor
        list.addMonitor(new Monitor(PartType.monitor, "None", "None", new BigDecimal("0"), "na"));
        list.addMonitor(new Monitor(PartType.monitor, "HP 20 inch Monitor", "20 inch - HP LED Monitor", new BigDecimal("120"), "A3M50AA#ABA"));
        list.addMonitor(new Monitor(PartType.monitor, "Viewsonic 22 inch Monitor", "22 inch - Viewsonic Full HD LED Monitor", new BigDecimal("130"), "VA2246M-LED"));
        list.addMonitor(new Monitor(PartType.monitor, "HP 23xi 23 inch IPS Monitor", "23 inch - HP IPS LED Monitor", new BigDecimal("220"), "C3Z94AA#ABA"));

        // Speakers
        list.addSpeakers(new Speakers(PartType.speakers, "None", "None", new BigDecimal("0"), "na"));
        list.addSpeakers(new Speakers(PartType.speakers, "Logitech Z130 Speakers", "Logitech Stereo Speakers", new BigDecimal("10"), "724575"));

        // Keyboard and Mouse
        list.addKeyboardMouse(new KeyboardMouse(PartType.keyboard, "None", "None", new BigDecimal("0"), "na"));
        list.addKeyboardMouse(new KeyboardMouse(PartType.keyboard, "Logitech Wired Keyboard and Mouse", "Logitech Wired Keyboard and Mouse", new BigDecimal("20"), "920-002565"));
        list.addKeyboardMouse(new KeyboardMouse(PartType.keyboard, "Logitech Wireless Keyboard and Mouse", "Logitech Wireless Keyboard and Mouse", new BigDecimal("40"), "920-002836"));
        list.addKeyboardMouse(new KeyboardMouse(PartType.keyboard, "Microsoft Wireless Keyboard and Mouse", "Microsoft Encrypted Wireless Keyboard and Mouse", new BigDecimal("40"), "M7J-00001"));

        // Software
        list.addSoftware(new Software(PartType.software, "None", "None", new BigDecimal("0"), "na"));
        list.addSoftware(new Software(PartType.software, "Microsoft Office 2013 Pro", "Microsoft Office 2013 Professional", new BigDecimal("400"), "269-16094"));
    }
}
