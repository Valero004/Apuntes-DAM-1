import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProcesoBase
{
    public static void main(String[] args) throws InterruptedException
    {
        Runtime runtime = Runtime.getRuntime();
        try
        {
            Process process = runtime.exec("powershell.exe -encodedcommand RwBlAHQALQBQAHIAbwBjAGUAcwBzAA==");

            process.getOutputStream().close();
            String line;
            BufferedReader stdout = new BufferedReader(new InputStreamReader(process.getInputStream()));
            while ((line = stdout.readLine()) != null){
                System.out.println(line);
            }

            TimeUnit.SECONDS.sleep(10);
        }
        catch(IOException ex){
            System.err.println("Error");
            System.exit(-1);
        }
    }
}