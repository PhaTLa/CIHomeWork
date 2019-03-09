public class Student {
    private String name;
    private int ID;
    private String birthDate;
    private String classRoom;

    //ham tao


    public Student() {

    }

    public Student(String name, int ID, String birthDate, String classRoom) {
        this.name = name;
        this.ID = ID;
        this.birthDate = birthDate;
        this.classRoom = classRoom;
    }

    //phuong thuc
    public String getName() {
        return name;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public int getID() {
        return ID;
    }

    public String getBirthDate() {
        return birthDate;
    }
}
