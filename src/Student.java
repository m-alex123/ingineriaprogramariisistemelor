import java.util.Objects;

public class Student
{
    int numărMatricol;
    String prenume;
    String nume;
    String formațieDeStudiu;
    public Student(int nrMat,String pnume,String n,String fDeS)
    {
        this.numărMatricol=nrMat;
        this.prenume=pnume;
        this.nume=n;
        this.formațieDeStudiu=fDeS;
    }
    public String toString()
    {
        return "Student: " + nume + " " + prenume + "\nMatricol: " + numărMatricol + "\nGrupa: " + formațieDeStudiu;
    }
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(prenume, student.prenume) &&
                Objects.equals(nume, student.nume) &&
                Objects.equals(formațieDeStudiu, student.formațieDeStudiu);
    }
    public int hashCode()
    {
        return Objects.hash(prenume, nume, formațieDeStudiu);
    }

}
