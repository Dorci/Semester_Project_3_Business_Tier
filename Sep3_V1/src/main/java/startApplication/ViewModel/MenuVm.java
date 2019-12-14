package startApplication.ViewModel;

public class MenuVm
{
    String starters;
    String mainCourse;
    String dessert;
    public MenuVm(String starters, String mainCourse, String dessert) {
        this.starters = starters;
        this.mainCourse = mainCourse;
        this.dessert = dessert;
    }


    public String getStarters() {
        return starters;
    }

    public void setStarters(String starters) {
        this.starters = starters;
    }

    public String getMainCourse() {
        return mainCourse;
    }

    public void setMainCourse(String mainCourse) {
        this.mainCourse = mainCourse;
    }

    public String getDessert() {
        return dessert;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }


    @Override
    public String toString() {
        return "MenuVm{" +
                "starters='" + starters + '\'' +
                ", mainCourse='" + mainCourse + '\'' +
                ", dessert='" + dessert + '\'' +
                '}';
    }

}
