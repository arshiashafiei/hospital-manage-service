public class Medicine {
    private String name;
    private String price;
    private String productionDate;
    private String expiryDate;

    public Medicine(String name, String price, String productionDate, String expiryDate) {
        this.name = name;
        this.price = price;
        this.productionDate = productionDate;
        this.expiryDate = expiryDate;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getProductionDate() {
        return this.productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    public String getExpiryDate() {
        return this.expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

}
