package lab5Adv;

abstract public class ACalculator
{
    protected Object state;
    public Object result()
    {
        return state;
    }
    public ACalculator clear()
    {
        this.init();
        return this;
    }
    protected abstract void init();
}
