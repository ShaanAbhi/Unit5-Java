package ques.q3;


abstract public class Student {

    private String name;
    private String address;

    public Student() {

    }

    public Student(String name, String address) {
        super();
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    abstract public int getpersentage();

    public static void geettotalStudent() {

        int sc = ScienceStudent.noOfStudent;
        int hs = HistoryStudent.noOfStudent;

        System.out.println("Total Student:" + (sc + hs));
    }

}