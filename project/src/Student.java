enum Gender{
    MALE, FEMALE
}

public class Student {
    private String email;
    private String hall;
    private String fullName;
    private int year;
    private Gender gender;

    public Student(String email, String name, String hall, int year) {
        this.email = email;
        this.fullName = name;
        this.hall = hall;
        this.year = year;
        this.gender = decodeGender(hall);
    }

    private static Gender decodeGender(String hall){
        if(hall.equals("Founders") || hall.equals("Gentlemen")){
            return Gender.MALE;
        }
        else{
            return Gender.FEMALE;
        }
    }

    private static int decodeYear(String year){
        int newYear;
        switch (year){
            case "YEAR 1":
                newYear = 1;
                break;
            case "YEAR 2":
                newYear = 2;
            case "YEAR 3":
                newYear = 3;
                break;
            case "YEAR 4":
                newYear = 4;
                break;
            default:
                newYear = 0;
                break;
        }
        return newYear;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getHall() {
        return hall;
    }

    public void setHall(String hall) {
        this.hall = hall;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGender(Gender gender){
        this.gender = gender;
    }

    public Gender getGender() {
        return gender; 
    }
}
