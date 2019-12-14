package startApplication.ViewModel;

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
    private int blockNo;
    @JsonProperty("floorNumber")
    private int floorNo;

    public AddressVm(String streetName, int buildingNumber, String city,
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
