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
        "eventId",
        "userId",
        "alcoholicDrink",
        "startTime",
        "endTime",
        "description",
        "ageLimit",
        "pets",
        "entertainment",
        "maxNoOfGuests",
        "entryFee",
        "starter",
        "mainCourse",
        "dessert",
        "dateOfEvent",
        "addressId",
        "address"
})
public class EventDb {

    @JsonProperty("EventId")
    private Integer eventId;
    @JsonProperty("UserId")
    private Integer userId;
    @JsonProperty("AlcoholicDrink")
    private Boolean alcoholicDrink;
    @JsonProperty("StartTime")
    private String startTime;
    @JsonProperty("EndTime")
    private String endTime;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("AgeLimit")
    private Integer ageLimit;
    @JsonProperty("Pets")
    private Boolean pets;
    @JsonProperty("Entertainment")
    private Boolean entertainment;
    @JsonProperty("NrOfGuests")
    private Integer maxNoOfGuests;
    @JsonProperty("EntryFee")
    private Double entryFee;
    @JsonProperty("Starter")
    private String starter;
    @JsonProperty("MainCourse")
    private String mainCourse;
    @JsonProperty("Dessert")
    private String dessert;
    @JsonProperty("DateOfEvent")
    private String dateOfEvent;
    @JsonProperty("AddressId")
    private Integer addressId;
    @JsonProperty("Address")
    private AddressDb address;

    public EventDb(int userID, AddressDb addressdb, String date, String startTime, String endTime, int maxNoOfGuests, int ageLimit, boolean pets, String description, boolean entertainment, double entryFee, boolean drinksVm, String starter, String mainCourse, String dessert) {
        this.userId = userID;
        this.alcoholicDrink = drinksVm;
        this.startTime = startTime;
        this.endTime = endTime;
        this.description = description;
        this.ageLimit = ageLimit;
        this.pets = pets;
        this.entertainment = entertainment;
        this.maxNoOfGuests = maxNoOfGuests;
        this.entryFee = entryFee;
        this.starter = starter;
        this.mainCourse = mainCourse;
        this.dessert = dessert;
        this.dateOfEvent = date;
        this.address = addressdb;
    }

    public EventDb() {
    }

    @JsonProperty("eventId")
    public Integer getEventId() {
        return eventId;
    }

    @JsonProperty("eventId")
    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    @JsonProperty("userId")
    public Integer getUserId() {
        return userId;
    }

    @JsonProperty("userId")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @JsonProperty("alcoholicDrink")
    public Boolean getAlcoholicDrink() {
        return alcoholicDrink;
    }

    @JsonProperty("alcoholicDrink")
    public void setAlcoholicDrink(Boolean alcoholicDrink) {
        this.alcoholicDrink = alcoholicDrink;
    }

    @JsonProperty("startTime")
    public String getStartTime() {
        return startTime;
    }

    @JsonProperty("startTime")
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @JsonProperty("endTime")
    public String getEndTime() {
        return endTime;
    }

    @JsonProperty("endTime")
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("ageLimit")
    public Integer getAgeLimit() {
        return ageLimit;
    }

    @JsonProperty("ageLimit")
    public void setAgeLimit(Integer ageLimit) {
        this.ageLimit = ageLimit;
    }

    @JsonProperty("pets")
    public Boolean getPets() {
        return pets;
    }

    @JsonProperty("pets")
    public void setPets(Boolean pets) {
        this.pets = pets;
    }

    @JsonProperty("entertainment")
    public Boolean getEntertainment() {
        return entertainment;
    }

    @JsonProperty("entertainment")
    public void setEntertainment(Boolean entertainment) {
        this.entertainment = entertainment;
    }

    @JsonProperty("maxNoOfGuests")
    public Integer getMaxNoOfGuests() {
        return maxNoOfGuests;
    }

    @JsonProperty("maxNoOfGuests")
    public void setMaxNoOfGuests(Integer maxNoOfGuests) {
        this.maxNoOfGuests = maxNoOfGuests;
    }

    @JsonProperty("entryFee")
    public Double getEntryFee() {
        return entryFee;
    }

    @JsonProperty("entryFee")
    public void setEntryFee(Double entryFee) {
        this.entryFee = entryFee;
    }

    @JsonProperty("starter")
    public String getStarter() {
        return starter;
    }

    @JsonProperty("starter")
    public void setStarter(String starter) {
        this.starter = starter;
    }

    @JsonProperty("mainCourse")
    public String getMainCourse() {
        return mainCourse;
    }

    @JsonProperty("mainCourse")
    public void setMainCourse(String mainCourse) {
        this.mainCourse = mainCourse;
    }

    @JsonProperty("dessert")
    public String getDessert() {
        return dessert;
    }

    @JsonProperty("dessert")
    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    @JsonProperty("dateOfEvent")
    public String getDateOfEvent() {
        return dateOfEvent;
    }

    @JsonProperty("dateOfEvent")
    public void setDateOfEvent(String dateOfEvent) {
        this.dateOfEvent = dateOfEvent;
    }

    @JsonProperty("addressId")
    public Integer getAddressId() {
        return addressId;
    }

    @JsonProperty("addressId")
    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    @JsonProperty("address")
    public AddressDb getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(AddressDb address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "EventDb{" +
                "eventId=" + eventId +
                ", userId=" + userId +
                ", alcoholicDrink=" + alcoholicDrink +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", description='" + description + '\'' +
                ", ageLimit=" + ageLimit +
                ", pets=" + pets +
                ", entertainment=" + entertainment +
                ", maxNoOfGuests=" + maxNoOfGuests +
                ", entryFee=" + entryFee +
                ", starter='" + starter + '\'' +
                ", mainCourse='" + mainCourse + '\'' +
                ", dessert='" + dessert + '\'' +
                ", dateOfEvent='" + dateOfEvent + '\'' +
                ", addressId=" + addressId +
                ", address=" + address +
                '}';
    }
}