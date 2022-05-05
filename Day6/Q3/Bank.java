import javax.sound.midi.Soundbank;

public class Bank {
    private String branchName;
    private String ifscCode;

public Bank(){

}


    public Bank(String branchName, String ifscCode) {
        super();

        this.branchName = branchName;
        this.ifscCode = ifscCode;
    }
    public String getBranchName() {
        return branchName;
    }
    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
    public String getIfscCode() {
        return ifscCode;
    }
    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }
    public void displayDetails(){
        System.out.println("Branch Name:"+branchName);
        System.out.println("IFSC Code:"+ifscCode);
    }
    
    
}