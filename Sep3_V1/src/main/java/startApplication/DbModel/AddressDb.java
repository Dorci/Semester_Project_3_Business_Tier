package startApplication.DbModel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddressDb
{
    @JsonProperty("AdressId")
    private int addressId;
    @JsonProperty("StreetName")
    private String streetName;
    @JsonProperty("BuildingNo")
    private int buildingNumber;
    @JsonProperty("City")
    private CityDb city;

    @JsonProperty("Block")
    private String blockNo;
    @JsonProperty("Floor")
    private int floorNo;

    public AddressDb(int addressId, String streetName, int buildingNumber, CityDb city, String blockNo, int floorNo) {
        this.addressId = addressId;
        this.streetName = streetName;
        this.buildingNumber = buildingNumber;
        this.city = city;
        this.blockNo = blockNo;
        this.floorNo = floorNo;
    }

    public AddressDb(String streetName, int buildingNumber, CityDb city, String blockNo, int floorNo) {
        this.streetName = streetName;
        this.buildingNumber = buildingNumber;
        this.city = city;
        this.blockNo = blockNo;
        this.floorNo = floorNo;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
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

    public CityDb getCity() {
        return city;
    }

    public void setCity(CityDb city) {
        this.city = city;
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

    @Override
    public String toString() {
        return "AddressDb{" +
                "addressId=" + addressId +
                ", streetName='" + streetName + '\'' +
                ", buildingNumber=" + buildingNumber +
                ", city=" + city +
                ", blockNo='" + blockNo + '\'' +
                ", floorNo=" + floorNo +
                '}';
    }
}
