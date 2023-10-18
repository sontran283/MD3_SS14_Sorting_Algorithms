package Th2;

public class Student {
    private int Id;
    private String Name;
    private double Score;

    public Student() {
    }

    public Student(int id, String name, double score) {
        Id = id;
        Name = name;
        Score = score;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getScore() {
        return Score;
    }

    public void setScore(double score) {
        Score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Score=" + Score +
                '}';
    }
}
