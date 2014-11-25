package no.itera.fagkveld.java8.tasks.solution;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;

public class Task3 {

	/*
	 * Return an array of the names of all files (and directories - for simplicity)
	 */
	public static Object[] getFileNamesInDirectory(String path) {
		try {
			return Files.list(FileSystems.getDefault().getPath(path))
				.map(x -> x.getFileName().toString())
				.toArray();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
