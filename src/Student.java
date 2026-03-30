import java.util.Objects;

public class Student
{
    int numărMatricol;
    String prenume;
    String nume;
    String formațieDeStudiu;
    float nota;

    public Student(int nrMat, String pnume, String n, String fDeS)
    {
        this.numărMatricol = nrMat;
        this.prenume = pnume;
        this.nume = n;
        this.formațieDeStudiu = fDeS;
        this.nota = 0.0f;
    }

    public void setNota(float nota)
    {
        this.nota = nota;
    }

    public float getNota()
    {
        return nota;
    }

    public String toString()
    {
        return "Student: " + nume + " " + prenume +
                "\nMatricol: " + numărMatricol +
                "\nGrupa: " + formațieDeStudiu +
                "\nNota: " + nota;
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