import java.util.Objects;

public class StudentBursier extends Student
{
    private double cuantumBursa;
    public StudentBursier(int id, String prenume, String nume, String grupa, double medie, double cuantumBursa)
    {
        super(id, prenume, nume, grupa, medie);
        this.cuantumBursa = cuantumBursa;
    }
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof StudentBursier)) return false;
        if (!super.equals(o)) return false;
        StudentBursier that = (StudentBursier) o;
        return Double.compare(that.cuantumBursa, cuantumBursa) == 0;
    }
    public int hashCode()
    {
        return Objects.hash(super.hashCode(), cuantumBursa);
    }
    public String toString()
    {
        return super.toString() + ", Bursa: " + cuantumBursa;
    }
}
