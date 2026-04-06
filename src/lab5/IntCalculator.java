package lab5;
import java.util.Objects;

public class IntCalculator
{
    int state;

    public IntCalculator(int x)
    {
        this.state=x;
    }
    public IntCalculator add(int x)
    {
        this.state+=x;
        return this;
    };
    public IntCalculator substract(int x)
    {
        this.state-=x;
        return this;
    };
    public IntCalculator multiply(int x)
    {
        this.state*=x;
        return this;
    };
    public int result()
    {
        return state;
    };
    public void clear()
    {
        state=0;
    }


}
