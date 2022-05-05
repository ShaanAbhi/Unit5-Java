package ques.q3;

public class HistoryStudent extends Student {

int historyMarks;
int cicilMarks;

static int noOfStudent;

    @Override
    public int getpersentage() {
        // TODO Auto-generated method stub
       
        int total = cicilMarks+historyMarks;
        int percentage = total/2;
        return percentage;
    }
    

}