package startApplication.ApplicationModel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddressVm
{
    @JsonProperty("street")
    private String streetName;
    @JsonProperty("buildingNumber")
    private int buildingNumber;
    @JsonProperty("city")
    private String city;
    @JsonProperty("postCode")
    private int postalCode;
    @JsonProperty("blockNumber")
    private String blockNo;
    @JsonProperty("floorNumber")
    private int floorNo;

    private String flatNumber;

    public AddressVm(String streetName, int buildingNumber, String city, int postalCode, String blockNo, int floorNo, String flatNumber) {
        this.streetName = streetName;
        this.buildingNumber = buildingNumber;
        this.city = city;
        this.postalCode = postalCode;
        this.blockNo = blockNo;
        this.floorNo = floorNo;
        this.flatNumber = flatNumber;
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

    public String getBlockNo() {
        return blockNo;
    }

    public void setBlockNo(String blockNo) {
        this.blockNo = blockNo;
    }

    public int getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(int floorNo) {
        this.floorNo = floorNo;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }

    @Override
    public String toString() {
        return "AddressVm{" +
                "streetName='" + streetName + '\'' +
                ", buildingNumber=" + buildingNumber +
                ", city='" + city + '\'' +
                ", postalCode=" + postalCode +
                ", blockNo=" + blockNo +
                ", floorNo=" + floorNo +
                ", flatNumber='" + flatNumber + '\'' +
                '}';
    }
}
