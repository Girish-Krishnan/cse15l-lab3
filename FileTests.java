import static org.junit.Assert.*;
import org.junit.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileTests { 

    @Test
    public void testGetFiles() throws IOException {
        File f = new File("some-files/");
        List<File> result = new ArrayList<>();
        result.add(new File("some-files/a.txt"));
        result.add(new File("some-files/more-files/b.txt"));
        result.add(new File("some-files/more-files/c.java"));
        result.add(new File("some-files/even-more-files/d.java"));
        result.add(new File("some-files/even-more-files/a.txt"));
        
        // Check the results are equal, and order doesn't matter
        assertEquals(result.size(), FileExample.getFiles(f).size());
        for(File file: result) {
            assertTrue(FileExample.getFiles(f).contains(file));
        }
    }

    @Test
    public void testGetFiles2() throws IOException {
        File f = new File("some-files/more-files");
        List<File> result = new ArrayList<>();
        result.add(new File("some-files/more-files/b.txt"));
        result.add(new File("some-files/more-files/c.java"));
        
        // Check the results are equal, and order doesn't matter
        assertEquals(result.size(), FileExample.getFiles(f).size());
        for(File file: result) {
            assertTrue(FileExample.getFiles(f).contains(file));
        }
    }

}