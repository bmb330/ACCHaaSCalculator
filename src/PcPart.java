import java.math.BigDecimal;

/**
 * Created by bbraun on 5/6/2014.
 */
public class PcPart {
    private PartType partType;
    private String name;
    private String manufacturer;
    private String description;
    private String partNumber;
    private String pageUrl;
    private BigDecimal cost;

    public PcPart(PartType type) {
        setPartType(type);
        setName("None");
        setDescription("None");
        setCost(new BigDecimal("0.00"));
        setPartNumber(null);
    }

    public PcPart(PartType type, String name, String description, BigDecimal cost, String partNumber) {
        setPartType(type);
        setName(name);
        setDescription(description);
        setCost(cost);
        setPartNumber(partNumber);
    }

    public PartType getPartType() {
        return partType;
    }

    public void setPartType(PartType partType) {
        this.partType = partType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String modelNumber) {
        this.partNumber = modelNumber;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }
}
