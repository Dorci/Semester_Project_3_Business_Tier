package startApplication.DbModel;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "addressId",
        "streetName",
        "floor",
        "block",
        "flat",
        "buildingNo",
        "cityId",
        "city"
})
public class AddressDb {

    @JsonProperty("addressId")
    private Integer addressId;
    @JsonProperty("streetName")
    private String streetName;
    @JsonProperty("floor")
    private Integer floor;
    @JsonProperty("block")
    private String block;
    @JsonProperty("flat")
    private String flat;
    @JsonProperty("buildingNo")
    private Integer buildingNo;
    @JsonProperty("cityId")
    private Integer cityId;
    @JsonProperty("city")
    private CityDb city;

    public AddressDb(String streetName, int buildingNumber, CityDb cityDb, String flatNumber, String blockNo, int floorNo) {
        this.streetName = streetName;
        this.floor = floorNo;
        this.block = blockNo;
        this.flat = flatNumber;
        this.buildingNo = buildingNumber;
        this.city = cityDb;
    }

    public AddressDb() {
    }

    @JsonProperty("addressId")
    public Integer getAddressId() {
        return addressId;
    }

    @JsonProperty("addressId")
    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    @JsonProperty("streetName")
    public String getStreetName() {
        return streetName;
    }

    @JsonProperty("streetName")
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    @JsonProperty("floor")
    public Integer getFloor() {
        return floor;
    }

    @JsonProperty("floor")
    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    @JsonProperty("block")
    public String getBlock() {
        return block;
    }

    @JsonProperty("block")
    public void setBlock(String block) {
        this.block = block;
    }

    @JsonProperty("flat")
    public String getFlat() {
        return flat;
    }

    @JsonProperty("flat")
    public void setFlat(String flat) {
        this.flat = flat;
    }

    @JsonProperty("buildingNo")
    public Integer getBuildingNo() {
        return buildingNo;
    }

    @JsonProperty("buildingNo")
    public void setBuildingNo(Integer buildingNo) {
        this.buildingNo = buildingNo;
    }

    @JsonProperty("cityId")
    public Integer getCityId() {
        return cityId;
    }

    @JsonProperty("cityId")
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    @JsonProperty("city")
    public CityDb getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(CityDb city) {
        this.city = city;
    }

}