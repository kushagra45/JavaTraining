package Day2.Assignment6;

public class UserType {

    String name;

    public UserType(){
        this("student");
    }

    public UserType(String parameterValue){
        name = parameterValue;
    }

    public static void main(String[] args) {
        UserType type1 = new UserType();
        UserType type2 = new UserType("Faculty");
        System.out.println(type1.name);
        System.out.println(type2.name);
    }

}
