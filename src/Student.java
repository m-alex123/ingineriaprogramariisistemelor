import java.util.Objects;

public class Student
{
    int numărMatricol;
    String prenume;
    String nume;
    String formațieDeStudiu;
    double medie;
    public Student(int nrMat, String pnume, String n, String fDeS, double medie)
    {
        this.numărMatricol = nrMat;
        this.prenume = pnume;
        this.nume = n;
        this.formațieDeStudiu = fDeS;
        this.medie = medie;
    }
    public String toString()
    {
        return "Student: " + nume + " " + prenume + ", Matricol: " + numărMatricol + ", Grupa: " + formațieDeStudiu + ", Medie: " + medie;
    }
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return numărMatricol == student.numărMatricol;
    }
    public int hashCode()
    {
        return Objects.hash(numărMatricol);
    }
}