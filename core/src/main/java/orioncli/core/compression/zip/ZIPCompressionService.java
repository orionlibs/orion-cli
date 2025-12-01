package orioncli.core.compression.zip;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZIPCompressionService
{
    public static void compress(String targetFolder, String zipFileName, Set<File> filesToCompress) throws IOException
    {
        Path outputDir = Path.of(targetFolder);
        Files.createDirectories(outputDir);
        Path zipPath = outputDir.resolve(zipFileName);
        try(ZipOutputStream zos = new ZipOutputStream(Files.newOutputStream(zipPath)))
        {
            for(File file : filesToCompress)
            {
                ZipEntry entry = new ZipEntry(file.getName());
                zos.putNextEntry(entry);
                zos.write(Files.readAllBytes(file.toPath()));
                zos.closeEntry();
            }
            zos.finish();
        }
    }


    public static void compressDirectories(String targetFolder, String zipFileName, Set<String> directoriesToCompress) throws IOException
    {
        Path outputDir = Path.of(targetFolder);
        Files.createDirectories(outputDir);
        Path zipPath = outputDir.resolve(zipFileName);
        try(ZipOutputStream zos = new ZipOutputStream(Files.newOutputStream(zipPath)))
        {
            Set<Path> directories = new HashSet<>();
            for(String directory : directoriesToCompress)
            {
                Path directoryPath = Path.of(directory);
                directories.add(directoryPath);
            }
            for(Path directory : directories)
            {
                if(!Files.isDirectory(directory))
                {
                    continue;
                }
                Path baseDir = directory;
                Files.walk(baseDir).forEach(path ->
                {
                    try
                    {
                        if(Files.isDirectory(path))
                        {
                            return;
                        }
                        Path relativePath = baseDir.getParent().relativize(path);
                        ZipEntry zipEntry = new ZipEntry(relativePath.toString());
                        zos.putNextEntry(zipEntry);
                        zos.write(Files.readAllBytes(path));
                        zos.closeEntry();
                    }
                    catch(IOException e)
                    {
                        throw new RuntimeException(e);
                    }
                });
            }
            zos.finish();
        }
    }
}