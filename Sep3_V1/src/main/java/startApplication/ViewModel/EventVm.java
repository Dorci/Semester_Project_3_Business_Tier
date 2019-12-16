package startApplication.ViewModel;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class EventVm {
    @JsonProperty("EventID")
    private int eventID;
    @JsonProperty("UserId")
    private int userID;

    @JsonProperty("Street")
    private String streetName;
    @JsonProperty("City")
    private String city;
    @JsonProperty("PostCode")
    private int postalCode;
    @JsonProperty("BlockNumber")
    private String blockNo;

    @JsonProperty("FloorNumber")
    private int floorNo;

    @JsonProperty("FlatNumber")
    private String flatNumber;
    @JsonProperty("BuildingNumber")
    private int buildingNumber;


    @JsonProperty("Date")
    private String date;
    @JsonProperty("EventStart")
    private String startTime;
    @JsonProperty("EventEnd")
    private String endTime;
    @JsonProperty("NrOfGuests")
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
    private double entryFee;
    @JsonProperty("Drinks")
    private boolean drinksVm;


    @JsonProperty("Starter")
    private String Starter;
    @JsonProperty("MainCourse")
    private String MainCourse;
    @JsonProperty("Dessert")
    private String Dessert;

    public EventVm() {
    }

    public EventVm(int eventID, int userID, String streetName, String city, int postalCode, String blockNo, int floorNo, String flatNumber, int buildingNumber, String date, String startTime, String endTime, int maxNoOfGuests, int ageLimit, boolean pets, String description, boolean entertainment, double entryFee, boolean drinksVm, String starter, String mainCourse, String dessert) {
        this.eventID = eventID;
        this.userID = userID;
        this.streetName = streetName;
        this.city = city;
        this.postalCode = postalCode;
        this.blockNo = blockNo;
        this.floorNo = floorNo;
        this.flatNumber = flatNumber;
        this.buildingNumber = buildingNumber;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.maxNoOfGuests = maxNoOfGuests;
        this.ageLimit = ageLimit;
        this.pets = pets;
        this.description = description;
        this.entertainment = entertainment;
        this.entryFee = entryFee;
        this.drinksVm = drinksVm;
        Starter = starter;
        MainCourse = mainCourse;
        Dessert = dessert;
    }

    public EventVm(int eventID,  String streetName, String city, int postalCode, String blockNo, int floorNo, String flatNumber, int buildingNumber, String date, String startTime, String endTime, int maxNoOfGuests, int ageLimit, boolean pets, String description, boolean entertainment, double entryFee, boolean drinksVm, String starter, String mainCourse, String dessert) {
        this.eventID = eventID;
        this.streetName = streetName;
        this.city = city;
        this.postalCode = postalCode;
        this.blockNo = blockNo;
        this.floorNo = floorNo;
        this.flatNumber = flatNumber;
        this.buildingNumber = buildingNumber;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.maxNoOfGuests = maxNoOfGuests;
        this.ageLimit = ageLimit;
        this.pets = pets;
        this.description = description;
        this.entertainment = entertainment;
        this.entryFee = entryFee;
        this.drinksVm = drinksVm;
        Starter = starter;
        MainCourse = mainCourse;
        Dessert = dessert;
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
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

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
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

    public double getEntryFee() {
        return entryFee;
    }

    public void setEntryFee(double entryFee) {
        this.entryFee = entryFee;
    }

    public boolean isDrinksVm() {
        return drinksVm;
    }

    public void setDrinksVm(boolean drinksVm) {
        this.drinksVm = drinksVm;
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
        return "EventVm{" +
                "eventID='" + eventID + '\'' +
                ", userID='" + userID + '\'' +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", postalCode=" + postalCode +
                ", blockNo=" + blockNo +
                ", floorNo=" + floorNo +
                ", flatNumber='" + flatNumber + '\'' +
                ", buildingNumber=" + buildingNumber +
                ", date='" + date + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", maxNoOfGuests=" + maxNoOfGuests +
                ", ageLimit=" + ageLimit +
                ", pets=" + pets +
                ", description='" + description + '\'' +
                ", entertainment=" + entertainment +
                ", entryFee=" + entryFee +
                ", drinksVm=" + drinksVm +
                ", Starter='" + Starter + '\'' +
                ", MainCourse='" + MainCourse + '\'' +
                ", Dessert='" + Dessert + '\'' +
                '}';
    }
}














