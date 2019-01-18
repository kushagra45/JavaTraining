package Day4.Assignment7;

final public class DayScholar extends Student {

    private String residentialAddress;

    public DayScholar(){

    }

    public DayScholar(int id, char type, String name, int fees, String residentialAddress) {
        super(id, type, name, fees);
        this.residentialAddress = residentialAddress;
    }

    public void displayDaySDetails(){
        System.out.println(residentialAddress);
    }

    public static void main(String[] args) {
        DayScholar dayScholar = new DayScholar(10, 'D', "Manu", 16000, "Irving");
        dayScholar.calculateFees();
        dayScholar.displayDaySDetails();
        dayScholar.displayDetails();
    }
}
