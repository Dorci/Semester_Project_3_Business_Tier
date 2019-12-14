package startApplication.ViewModel;

public class DrinksVm
{
    private boolean alcoholic;

    public DrinksVm() {
    }

    public DrinksVm(boolean alcoholic) {
        this.alcoholic = alcoholic;
    }

    public boolean isAlcoholic() {
        return alcoholic;
    }

    public void setAlcoholic(boolean alcoholic) {
        this.alcoholic = alcoholic;
    }
}
