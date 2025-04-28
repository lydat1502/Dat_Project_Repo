import java.util.List;

public class Tenant {
    private User user;
    private List<RentalContract> listOfContracts;

    public Tenant(User user, List<RentalContract> listOfContracts) {
        this.user = user;
        this.listOfContracts = listOfContracts;
    }

    public void requestCreateRentalContract(RentalContract contract) {
        listOfContracts.add(contract);
    }

    public void requestTerminateRentalContract(RentalContract contract) {
        listOfContracts.remove(contract);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<RentalContract> getListOfContracts() {
        return listOfContracts;
    }

    public void setListOfContracts(List<RentalContract> listOfContracts) {
        this.listOfContracts = listOfContracts;
    }
}
