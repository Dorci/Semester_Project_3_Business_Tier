package startApplication.ViewModel;

public class Drinks
{
    String alcoholic;
    String non_Alcoholic;

    public String getAlcoholic() {
        return alcoholic;
    }

    public void setAlcoholic(String alcoholic) {
        this.alcoholic = alcoholic;
    }

    public String getNon_Alcoholic() {
        return non_Alcoholic;
    }

    public void setNon_Alcoholic(String non_Alcoholic) {
        this.non_Alcoholic = non_Alcoholic;
    }

    public Drinks(String alcoholic, String non_Alcoholic) {
        this.alcoholic = alcoholic;
        this.non_Alcoholic = non_Alcoholic;
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "alcoholic='" + alcoholic + '\'' +
                ", non_Alcoholic='" + non_Alcoholic + '\'' +
                '}';
    }
}
