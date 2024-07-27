public class JavaBasic_Customer {
    private String CustomerName;
    private int customer_Id;
    //update and merge on Git: GitHub;

    // Right click >> Generate Getter Setter, Generate Parameterised ,Generate Getter and Setter;
    // generate To-String
    public JavaBasic_Customer(int customer_Id) {
        this.customer_Id = customer_Id;
    }

    private String CustomerCity;

    // generate

    public int getCustomer_Id() {
        return customer_Id;
    }

    public void setCustomer_Id(int customer_Id) {
        this.customer_Id = customer_Id;
    }
   // Generate to-string
    @Override
    public String toString() {
        return "JavaBasic_Customer{" +
                "CustomerName='" + CustomerName + '\'' +
                ", customer_Id=" + customer_Id +
                ", CustomerCity='" + CustomerCity + '\'' +
                '}';
    }
    // generate getter
    public String getCustomerCity() {
        return CustomerCity;
    }
    // generate setter

    public void setCustomerCity(String customerCity) {
        CustomerCity = customerCity;
    }

    //



}
