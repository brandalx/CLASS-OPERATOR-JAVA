public class Employees {

    private String name, id, job;

    public Employees(String name, String id, String job) {
        this.name = name;
        this.id = id;
        this.job = job;
    }

    public Employees(Employees other) {
        this.name = other.name;
        this.id = other.id;
        this.job = other.job;
    }


    public Employees(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String toString() {
        return "Your Name: " + this.name + "\n" + "Your ID: " + this.id + "\n" + "Your Job: " + this.job + "\n";
    }

}