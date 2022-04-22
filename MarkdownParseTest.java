import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void getLinks() throws IOException {
        //Expected list to be returned
        ArrayList<String> expected = new ArrayList<>();
        expected.add("https://something.com");
        expected.add("some-thing.html");
        
        //Getting file contents
        Path testFile = Path.of("test-file.md");
        String testFileContent = Files.readString(testFile);
        assertEquals(expected, MarkdownParse.getLinks(testFileContent));
    }

    @Test
    public void getLinksTest2() throws IOException {
        //Expected list to be returned
        ArrayList<String> expected = new ArrayList<>();
        
        //Getting file contents
        Path testFile = Path.of("test-file-2.md");
        String testFileContent = Files.readString(testFile);
        assertEquals(expected, MarkdownParse.getLinks(testFileContent));
    }

    @Test
    public void getLinksTest3() throws IOException {
        //Expected list to be returned
        ArrayList<String> expected = new ArrayList<>();
        expected.add("https://www.google.com/");
        
        //Getting file contents
        Path testFile = Path.of("test-file-3.md");
        String testFileContent = Files.readString(testFile);
        assertEquals(expected, MarkdownParse.getLinks(testFileContent));
    }

    @Test
    public void getLinksTest4() throws IOException {
        //Expected list to be returned
        ArrayList<String> expected = new ArrayList<>();
        expected.add("google.com");
        
        //Getting file contents
        Path testFile = Path.of("test-file-4.md");
        String testFileContent = Files.readString(testFile);
        assertEquals(expected, MarkdownParse.getLinks(testFileContent));
    }

    @Test
    public void getLinksTest5() throws IOException {
        //Expected list to be returned
        ArrayList<String> expected = new ArrayList<>();
        expected.add("google.com");
        
        //Getting file contents
        Path testFile = Path.of("test-file-5.md");
        String testFileContent = Files.readString(testFile);
        assertEquals(expected, MarkdownParse.getLinks(testFileContent));
    }
}