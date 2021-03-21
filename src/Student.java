public class Student {
    String firstName;
    String lastName;
    int expGraduate;
    double GPA;
    String major;

    public Student(String firstName,String lastName,int expGraduate, double GPA, String major ){
        this.firstName=firstName;
        this.lastName=lastName;
        this.expGraduate=expGraduate;
        this.GPA=GPA;
        this.major=major;
    }

    public int incGradYear(){
        this.expGraduate=this.expGraduate+1;
        return expGraduate;
    }

    public String fullName(){
        return this.firstName+ " " +this.lastName;
    }
}
