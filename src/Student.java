public class Student {
    private String name;
    private String[] subjects;
    private int numOfSubject;

    public Student(String newName, int maxSubjects) {
        name = newName;
        subjects = new String[maxSubjects];
        numOfSubject = 0;

    }

    public Student(Student other) {
        name = other.name;
        subjects = new String[other.subjects.length];
        numOfSubject = other.numOfSubject;
        for (int i = 0; i < other.numOfSubject; i++) {
            subjects[i] = other.subjects[i];

        }
    }
    public boolean addSubject (String newSubject) {
        if(numOfSubject == subjects.length)
            return false;
        subjects[numOfSubject ++] = newSubject;

        return true;
    }
//this is checked
    //second verified commit
// this is verified commit 3
}
