import java.math.BigDecimal;

/**
 * Created by bbraun on 5/6/2014.
 */
public class Computer {
    private PcPart operatingsystem;
    private PcPart processor;
    private PcPart motherboard;
    private PcPart memory;
    private PcPart sysdrive;
    private PcPart adddrive;
    private PcPart optical;
    private PcPart video;
    private PcPart wifi;
    private PcPart extcase;
    private PcPart keyboardmouse;
    private PcPart monitor;
    private PcPart speakers;
    private PcPart software;

    public Computer(PartList pcList) {
        operatingsystem = pcList.getDefault(PartType.os);
        processor = pcList.getDefault(PartType.cpu);
        motherboard = pcList.getDefault(PartType.board);
        memory = pcList.getDefault(PartType.ram);
        sysdrive = pcList.getDefault(PartType.drive1);
        adddrive = pcList.getDefault(PartType.drive2);
        optical = pcList.getDefault(PartType.optic);
        video = pcList.getDefault(PartType.video);
        wifi = pcList.getDefault(PartType.wifi);
        extcase = pcList.getDefault(PartType.extcase);
        keyboardmouse = pcList.getDefault(PartType.keyboard);
        monitor = pcList.getDefault(PartType.monitor);
        speakers = pcList.getDefault(PartType.speakers);
        software = pcList.getDefault(PartType.software);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Start get cost
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public BigDecimal getCost(int computers, BigDecimal tax) {
        BigDecimal cost = new BigDecimal("0.00");
        cost = cost.add(operatingsystem.getCost());
        cost = cost.add(processor.getCost());
        cost = cost.add(motherboard.getCost());
        cost = cost.add(memory.getCost());
        cost = cost.add(sysdrive.getCost());
        cost = cost.add(adddrive.getCost());
        cost = cost.add(optical.getCost());
        cost = cost.add(video.getCost());
        cost = cost.add(wifi.getCost());
        cost = cost.add(extcase.getCost());
        cost = cost.add(keyboardmouse.getCost());
        cost = cost.add(monitor.getCost());
        cost = cost.add(speakers.getCost());
        cost = cost.add(software.getCost());
        cost = cost.multiply(new BigDecimal(computers));
        cost = cost.add(cost.multiply(tax));
        return cost.setScale(2,BigDecimal.ROUND_HALF_EVEN);
    }


    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Start setParts
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void setPart(PcPart part) {

        switch (part.getPartType()) {
            case os:
                operatingsystem = part;
                break;
            case cpu:
                processor = part;
                break;
            case board:
                motherboard = part;
                break;
            case ram:
                memory = part;
                break;
            case video:
                video = part;
                break;
            case drive1:
                sysdrive = part;
                break;
            case drive2:
                adddrive = part;
                break;
            case optic:
                optical = part;
                break;
            case monitor:
                monitor = part;
                break;
            case keyboard:
                keyboardmouse = part;
                break;
            case wifi:
                wifi = part;
                break;
            case extcase:
                extcase = part;
                break;
            case speakers:
                speakers = part;
                break;
            case software:
                software = part;
                break;
        }
    }


    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // End setParts
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Start getParts
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public PcPart getPart(PartType type) {

        PcPart part;

        switch (type) {
            case os:
                part = operatingsystem;
                break;
            case cpu:
                part = processor;
                break;
            case board:
                part = motherboard;
                break;
            case ram:
                part = memory;
                break;
            case video:
                part = video;
                break;
            case drive1:
                part = sysdrive;
                break;
            case drive2:
                part = adddrive;
                break;
            case optic:
                part = optical;
                break;
            case monitor:
                part = monitor;
                break;
            case keyboard:
                part = keyboardmouse;
                break;
            case wifi:
                part = wifi;
                break;
            case extcase:
                part = extcase;
                break;
            case speakers:
                part = speakers;
                break;
            case software:
                part = software;
                break;
            default:
                part = null;
        }

        return part;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // End getParts
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
