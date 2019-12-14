package startApplication.DbModel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CityDb
{
    @JsonProperty("CityId")
   private int CityId;

    @JsonProperty("CityName")
    private String CityName;

    @JsonProperty("PostalCode")
    private int postalCode;

    public CityDb(String cityName, int postalCode) {
        CityName = cityName;
        this.postalCode = postalCode;
    }

    public CityDb(int cityId, String cityName, int postalCode) {
        CityId = cityId;
        CityName = cityName;
        this.postalCode = postalCode;
    }

    public int getCityId() {
        return CityId;
    }

    public void setCityId(int cityId) {
        CityId = cityId;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "CityDb{" +
                "CityId=" + CityId +
                ", CityName='" + CityName + '\'' +
                ", postalCode=" + postalCode +
                '}';
    }
}
