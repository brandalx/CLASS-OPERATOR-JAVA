public class Student {
    private String name;
    private Adress homeAdress;
    private Adress schoolAdress;

    public Student (String name, Adress homeAdress, Adress schoolAdress) {
        this.name = name;
        setHomeAdress(homeAdress);
        setSchoolAdress(schoolAdress);
    }
    public void setHomeAdress(Adress homeAdress) {this.homeAdress = new Adress(homeAdress);}
    public void setSchoolAdress(Adress schoolAdress){this.schoolAdress = schoolAdress;}

}
