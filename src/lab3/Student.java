package lab3;

public class Student
{
    String id;
    String prenume;
    String nume;
    String grupa;

    public Student(String line)
    {
        String[] data = line.split(", ");
        this.id = data[0];
        this.prenume = data[1];
        this.nume = data[2];
        this.grupa = data[3];
    }

    public String toString()
    {
        return id + ", " + prenume + ", " + nume + ", " + grupa;
    }
}
