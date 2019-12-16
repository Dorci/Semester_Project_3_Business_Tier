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
        "cityId",
        "cityName",
        "postalCode"
})
public class CityDb {

    @JsonProperty("cityId")
    private Integer cityId;
    @JsonProperty("cityName")
    private String cityName;
    @JsonProperty("postalCode")
    private Integer postalCode;

    public CityDb(String cityName, Integer postalCode) {
        this.cityName = cityName;
        this.postalCode = postalCode;
    }

    public CityDb() {
    }

    @JsonProperty("cityId")
    public Integer getCityId() {
        return cityId;
    }

    @JsonProperty("cityId")
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    @JsonProperty("cityName")
    public String getCityName() {
        return cityName;
    }

    @JsonProperty("cityName")
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @JsonProperty("postalCode")
    public Integer getPostalCode() {
        return postalCode;
    }

    @JsonProperty("postalCode")
    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

}