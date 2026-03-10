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

}
