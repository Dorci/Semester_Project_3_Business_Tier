package startApplication.DbModel;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EventDb {
    @JsonProperty("EventId")
    private int eventId;
    @JsonProperty("UserId")
    private int userId;


    @JsonProperty("Address")
    private AddressDb addressDb;

    @JsonProperty("DateOfEvent")
    private String date;
    @JsonProperty("StartTime")
    private String startTime;
    @JsonProperty("EndTime")
    private String endTime;
    @JsonProperty("MaxNoOfGuests")
    private int maxNoOfGuests;
    @JsonProperty("AgeLimit")
    private int ageLimit;
    @JsonProperty("Pets")
    private boolean pets;

    @JsonProperty("Description")
    private String description;
    @JsonProperty("Entertainment")
    private boolean entertainment;
    @JsonProperty("EntryFee")
    private int entryFee;
    @JsonProperty("AlcoholicDrink")
    private boolean drinksdb;


    @JsonProperty("Starter")
    private String Starter;
    @JsonProperty("MainCourse")
    private String MainCourse;
    @JsonProperty("Dessert")
    private String Dessert;


    public EventDb(int eventId, int userId, AddressDb addressDb, String date, String startTime, String endTime, int maxNoOfGuests, int ageLimit, boolean pets, String description, boolean entertainment, int entryFee, boolean drinksdb, String starter, String mainCourse, String dessert) {
        this.eventId = eventId;
        this.userId = userId;
        this.addressDb = addressDb;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.maxNoOfGuests = maxNoOfGuests;
        this.ageLimit = ageLimit;
        this.pets = pets;
        this.description = description;
        this.entertainment = entertainment;
        this.entryFee = entryFee;
        this.drinksdb = drinksdb;
        Starter = starter;
        MainCourse = mainCourse;
        Dessert = dessert;
    }

    public EventDb(int userId, AddressDb addressDb, String date, String startTime, String endTime, int maxNoOfGuests, int ageLimit, boolean pets, String description, boolean entertainment, int entryFee, boolean drinksdb, String starter, String mainCourse, String dessert) {
        this.userId = userId;
        this.addressDb = addressDb;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.maxNoOfGuests = maxNoOfGuests;
        this.ageLimit = ageLimit;
        this.pets = pets;
        this.description = description;
        this.entertainment = entertainment;
        this.entryFee = entryFee;
        this.drinksdb = drinksdb;
        Starter = starter;
        MainCourse = mainCourse;
        Dessert = dessert;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public AddressDb getAddressDb() {
        return addressDb;
    }

    public void setAddressDb(AddressDb addressDb) {
        this.addressDb = addressDb;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getMaxNoOfGuests() {
        return maxNoOfGuests;
    }

    public void setMaxNoOfGuests(int maxNoOfGuests) {
        this.maxNoOfGuests = maxNoOfGuests;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(int ageLimit) {
        this.ageLimit = ageLimit;
    }

    public boolean isPets() {
        return pets;
    }

    public void setPets(boolean pets) {
        this.pets = pets;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isEntertainment() {
        return entertainment;
    }

    public void setEntertainment(boolean entertainment) {
        this.entertainment = entertainment;
    }

    public int getEntryFee() {
        return entryFee;
    }

    public void setEntryFee(int entryFee) {
        this.entryFee = entryFee;
    }

    public boolean isDrinksdb() {
        return drinksdb;
    }

    public void setDrinksdb(boolean drinksdb) {
        this.drinksdb = drinksdb;
    }

    public String getStarter() {
        return Starter;
    }

    public void setStarter(String starter) {
        Starter = starter;
    }

    public String getMainCourse() {
        return MainCourse;
    }

    public void setMainCourse(String mainCourse) {
        MainCourse = mainCourse;
    }

    public String getDessert() {
        return Dessert;
    }

    public void setDessert(String dessert) {
        Dessert = dessert;
    }

    @Override
    public String toString() {
        return "EventDb{" +
                "eventId=" + eventId +
                ", userId=" + userId +
                ", addressDb=" + addressDb +
                ", date='" + date + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", maxNoOfGuests=" + maxNoOfGuests +
                ", ageLimit=" + ageLimit +
                ", pets=" + pets +
                ", description='" + description + '\'' +
                ", entertainment=" + entertainment +
                ", entryFee=" + entryFee +
                ", drinksdb=" + drinksdb +
                ", Starter='" + Starter + '\'' +
                ", MainCourse='" + MainCourse + '\'' +
                ", Dessert='" + Dessert + '\'' +
                '}';
    }
}
