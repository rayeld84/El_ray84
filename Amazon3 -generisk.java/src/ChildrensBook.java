public class ChildrensBook extends Book{
    private String recomendedAgeInfo;

    public ChildrensBook(String title, String author, int price, long productID, String recomendedAgeInfo) {
        super(title, author, price, productID);
        this.recomendedAgeInfo = recomendedAgeInfo;
    }

    public String getRecomendedAgeInfo() {
        return recomendedAgeInfo;
    }

    public void setRecomendedAgeInfo(String recomendedAgeInfo) {
        this.recomendedAgeInfo = recomendedAgeInfo;
    }
    @Override
    public String toString(){
        return super.toString() + " Anbefalt alder " + recomendedAgeInfo;
    }
}
