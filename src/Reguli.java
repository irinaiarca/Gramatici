
public class Reguli
{
    private String[] stanga = new String[100], dreapta = new String[100];
    private int numarreguli;

    public String getStanga(int i)
    {
        return stanga[i];
    }

    public void setStanga(String stanga, int i)
    {
        this.stanga[i] = stanga;
    }

    /**
     *
     * @param i
     * @return
     */
    public String getDreapta(int i)
    {
        return dreapta[i];
    }

    public void setDreapta(String dreapta, int i)
    {
        this.dreapta[i] = dreapta;
    }

    /**
     * @return the numarreguli
     */
    public int getNumarreguli() {
        return numarreguli;
    }

    /**
     * @param numarreguli the numarreguli to set
     */
    public void setNumarreguli(int numarreguli) {
        this.numarreguli = numarreguli;
    }


}
