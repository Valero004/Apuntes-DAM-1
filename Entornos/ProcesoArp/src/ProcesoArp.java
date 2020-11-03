
import java.io.IOException;

public class ProcesoArp
{
    public static void main(String[] args)
    {
        ProcessBuilder pb = new ProcessBuilder("cmd", "/C", "arp -a > C:\\tmp\\arp.txt");
        try
        {
            pb.start();
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
