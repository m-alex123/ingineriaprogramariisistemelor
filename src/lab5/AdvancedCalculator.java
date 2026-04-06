package lab5;

public class AdvancedCalculator extends IntCalculator
{
    public AdvancedCalculator(int x)
    {
        super(x);
    }
    public AdvancedCalculator divide(int x)
    {
        if(x!=0)
            this.state/=x;
        else
            System.out.println("Impartire la 0!");
        return this;
    }
    public AdvancedCalculator power(int x)
    {
        this.state=(int) Math.pow(this.state,x);
        return this;
    }
    public AdvancedCalculator root(int x)
    {
        if(x>0)
            this.state=(int) Math.pow(this.state,1.0/x);
        else
            System.out.println("Trebuie numar pozitiv pentru radical");
        return this;
    }
    public AdvancedCalculator add(int x)
    {
        super.add(x);
        return this;
    }
    public AdvancedCalculator substract(int x)
    {
        super.substract(x);
        return this;
    }
    public AdvancedCalculator multiply(int x)
    {
        super.multiply(x);
        return this;
    }
}
