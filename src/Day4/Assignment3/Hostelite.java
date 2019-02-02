package Day4.Assignment3;

public class Hostelite extends Student {

    private String hostelName;
    private int roomNumber;

    public Hostelite() {
    }

    public Hostelite(int id, char type, String fname, String lname, String hostelName, int roomNumber){
        super(id, type, fname, lname);
        this.hostelName = hostelName;
        this.roomNumber = roomNumber;
    }

    public void displayDetails(){
        super.displayStudentDetails();
        System.out.println(hostelName + " " + roomNumber);
    }

    public String getHostelName() {
        return hostelName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}
