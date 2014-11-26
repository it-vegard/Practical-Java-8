package no.itera.fagkveld.java8;

import no.itera.fagkveld.java8.tasks.Task3;
import org.junit.Test;

import java.io.File;
import java.nio.file.Paths;
import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItems;

public class Task3Test {
    @Test
    public void testGetFilesNamesInDirectory() {
        assertThat(Arrays.asList(Task3.getFileNamesInDirectory(new File("./src/test/resources").getAbsolutePath())),
                hasItems(Paths.get("File1.test"), Paths.get("File2.test"), Paths.get("File3.test")));
    }
}
