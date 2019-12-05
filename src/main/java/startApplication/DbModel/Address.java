package startApplication.DbModel;

public class Address
{
    private String streetName;
    private int buildingNumber;
    private String city;
    private int postalCode;
    private int blockNo;
    private int floorNo;

    public Address(String streetName, int buildingNumber, String city,
                   int postalCode, int blockNo, int floorNo) {
        this.streetName = streetName;
        this.buildingNumber = buildingNumber;
        this.city = city;
        this.postalCode = postalCode;
        this.blockNo = blockNo;
        this.floorNo = floorNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public int getBlockNo() {
        return blockNo;
    }

    public void setBlockNo(int blockNo) {
        this.blockNo = blockNo;
    }

    public int getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(int floorNo) {
        this.floorNo = floorNo;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", buildingNumber=" + buildingNumber +
                ", city='" + city + '\'' +
                ", postalCode=" + postalCode +
                ", blockNo=" + blockNo +
                ", floorNo=" + floorNo +
                '}';
    }
}
