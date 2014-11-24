
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main 
{

    public static void main(String[] args)
    {
        Reguli r = new Reguli();
        BufferedReader br;
        int nr = 0;
        try {
            br = new BufferedReader(new FileReader("./gramatica.txt"));
            String line;
            try {
                while (( line = br.readLine() ) != null)
                {
                    String[] parts = line.split(" ");
                    r.setStanga(parts[0], nr);
                    r.setDreapta(parts[1], nr);
                    nr++;
                    r.setNumarreguli(nr);
                }
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        for(int i=0; i<10; i++)
        {
            String s = "S";
            
            int[] listareguli = new int[100];
            int aux = 0;
            int n = r.getNumarreguli();
            for(int k=0; k < n; k++)
            {
                System.out.println("k este: " + k);
                System.out.println("nr reguli: " + r.getNumarreguli());
                if (s.contains(r.getStanga(k)))
                {
                    listareguli[aux] = k;
                    aux++;
                }
            }
            System.out.println(s);
            Random randomGenerator = new Random();
            int reg;
            int a=0;
            while(a < 100)
            {
                reg = listareguli[randomGenerator.nextInt(listareguli.length)];
                s = s.replaceFirst(r.getStanga(reg), r.getDreapta(reg));
                a++;
            }
            if (s.toLowerCase().equals(s))
                System.out.println(s);
            else
                i--;
        }
    }
 }