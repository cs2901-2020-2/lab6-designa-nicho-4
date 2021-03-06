package cs.lab;
import org.testng.annotations.Test;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Test
public class StationTest {
    @Test
    public void test_1() {
        EstacionMetereologica.Client client1 = new EstacionMetereologica.Client("Marlon");
        EstacionMetereologica.Client client2 = new EstacionMetereologica.Client("Luis");
        EstacionMetereologica clima = new EstacionMetereologica();
        clima.addUser(client1);
        clima.addUser(client2);
    }

    /*
    @Test(expectedExceptions = SequenceSizeException.class)
    public void testSequenceSize() throws IOException, Exception {
        generic(1);
    }

    @Test(expectedExceptions = QuantitySequenceException.class)
    public void testQuantitySequence() throws Exception {
        List<String> sequenceADN = new ArrayList<String>();
        for (int i = 0; i <= 160000; i++) {
            sequenceADN.add("QWERTY");
        }
        DNASequencer dnaSequencer = new DNASequencer();
        dnaSequencer.calculate(sequenceADN);
    }


    @Test(invocationCount = 50, threadPoolSize = 50)
    public void testTime() throws Exception {
        long startTime = System.currentTimeMillis();
        generic(0);
        long endTime = System.currentTimeMillis();
        long time = endTime - startTime;
        Assert.assertTrue(time < 100);
    }
*/
    private void generic(int i) throws IOException, Exception{
        /*List<String> input = readInput(i);
        String output = readOutput(i);
        EstacionMetereologica sequencer = new EstacionMetereologica();
        String response = sequencer.calculate(input);
        Assert.assertEquals(response, output);*/
    }

    private List<String> readInput(int testNumber){
        return readFile(testNumber, "input");
    }

    private String readOutput(int testNumber){
        List<String> lines = readFile(testNumber, "output");
        return lines.get(0);
    }

    public List<String> readFile(int testNumber, String type){
        String fileName = "test_case<testNumber>_<type>";
        fileName = fileName.replace("<testNumber>", Integer.toString(testNumber));
        fileName = fileName.replace("<type>", type);
        InputStream is = getClass().getClassLoader().getResourceAsStream(fileName);
        Scanner scan = new Scanner(is);
        List<String> lines = new ArrayList<String>();
        while(scan.hasNextLine()) {
            String line = scan.nextLine();
            lines.add(line);
        }
        return lines;
    }
}