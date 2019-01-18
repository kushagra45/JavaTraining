package Day4.Assignment2;

public class Hostelite extends Student {

    private String hostelName;
    private int roomNumber;

    public Hostelite(){
    }

    public Hostelite(int id, char type, String fname, String lname, String hostelName, int roomNumber) {
        super(id, type, fname, lname);
        this.hostelName = hostelName;
        this.roomNumber = roomNumber;
    }

    public String getHostelName() {
        return hostelName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public static void main(String[] args) {
        Hostelite hostelite = new Hostelite(11, 'H', "Kush", "Pan", "Irving", 3052);
        hostelite.setFeesPerMonth(40);
        System.out.println(hostelite.getHostelName());
        System.out.println(hostelite.getRoomNumber());
        System.out.println(hostelite.getFeesPerMonth());
        System.out.println(hostelite.getStudentId());
        System.out.println(hostelite.getStudentName());
        System.out.println(hostelite.getStudentType());
    }
}
