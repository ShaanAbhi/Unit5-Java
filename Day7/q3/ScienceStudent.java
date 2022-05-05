package ques.q3;

public class ScienceStudent extends Student {
    int physicsMarks;
    int mathmarks;
    int chemistryMarks;


    static int noOfStudent;

    @Override
    public int getpersentage() {
        // TODO Auto-generated method stub
        int total = chemistryMarks+mathmarks+physicsMarks;
        int percentage = total/3;
        return percentage;
    }
    

    
}