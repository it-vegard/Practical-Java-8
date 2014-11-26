package no.itera.fagkveld.java8;

import no.itera.fagkveld.java8.tasks.Task3;
import org.junit.Test;

import java.io.File;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

public class Task3Test {
    @Test
    public void testGetFilesNamesInDirectory() {
        assertThat(Task3.getFileNamesInDirectory(new File("./src/test/resources").getAbsolutePath()),
                contains("File1.test", "File2.test", "File3.test"));
    }
}
