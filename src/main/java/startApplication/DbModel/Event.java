package startApplication.DbModel;

import java.util.Date;

public class Event
{
    private Date date;
    private String startTime;
    private String endTime;
    private String description;
    private String language;
    private Address address;
    private int maxNoOfGuests;
    private int ageLimit;
    private boolean pets;
    private boolean entertainment;

    public boolean isAlcoholic() {
        return alcoholic;
    }

    public void setAlcoholic(boolean alcoholic) {
        this.alcoholic = alcoholic;
    }

    private boolean alcoholic;
    private Menu foodMenu;
    private int entryFee;

    public Event(Date date, String startTime, String endTime, String description, String language,
                 Address address, int maxNoOfGuests, int ageLimit,
                 boolean pets, boolean entertainment,Menu foodMenu, int entryFee, boolean alcoholic) {
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.description = description;
        this.language = language;
        this.address = address;
        this.maxNoOfGuests = maxNoOfGuests;
        this.ageLimit = ageLimit;
        this.pets = pets;
        this.entertainment = entertainment;
        this.foodMenu = foodMenu;
        this.entryFee = entryFee;
        this.alcoholic = alcoholic;
    }

    @Override
    public String toString() {
        return "Event{" +
                "date=" + date +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", description='" + description + '\'' +
                ", language='" + language + '\'' +
                ", address=" + address +
                ", maxNoOfGuests=" + maxNoOfGuests +
                ", ageLimit=" + ageLimit +
                ", pets=" + pets +
                ", entertainment=" + entertainment +
                ", foodMenu=" + foodMenu +
                ", entryFee=" + entryFee +",alcoholic=+"+alcoholic+
                '}';
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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

    public boolean isEntertainment() {
        return entertainment;
    }

    public void setEntertainment(boolean entertainment) {
        this.entertainment = entertainment;
    }



    public Menu getFoodMenu() {
        return foodMenu;
    }

    public void setFoodMenu(Menu foodMenu) {
        this.foodMenu = foodMenu;
    }

    public int getEntryFee() {
        return entryFee;
    }

    public void setEntryFee(int entryFee) {
        this.entryFee = entryFee;
    }
}
