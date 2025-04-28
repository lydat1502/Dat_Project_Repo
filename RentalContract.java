public class RentalContract {
    private String contractID;
    private String propertyID;
    private String tenantID;
    private double rentAmount;

    public RentalContract(String contractID, String propertyID, String tenantID, double rentAmount) {
        this.contractID = contractID;
        this.propertyID = propertyID;
        this.tenantID = tenantID;
        this.rentAmount = rentAmount;
    }

    public void createContract() {
        System.out.println("Creating rental contract...");
        System.out.println("Contract ID: " + contractID);
        System.out.println("Property ID: " + propertyID);
        System.out.println("Tenant ID: " + tenantID);
        System.out.println("Rent Amount: " + rentAmount);
        System.out.println("Rental contract created successfully!");
    }

    public void terminateContract() {
        System.out.println("Terminating rental contract...");
        System.out.println("Contract ID: " + contractID);
        System.out.println("Property ID: " + propertyID);
        System.out.println("Tenant ID: " + tenantID);
        System.out.println("Rent Amount: " + rentAmount);
        System.out.println("Rental contract terminated successfully!");
    }

    public String getContractID() {
        return contractID;
    }

    public void setContractID(String contractID) {
        this.contractID = contractID;
    }

    public String getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(String propertyID) {
        this.propertyID = propertyID;
    }

    public String getTenantID() {
        return tenantID;
    }

    public void setTenantID(String tenantID) {
        this.tenantID = tenantID;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public void setRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }
}