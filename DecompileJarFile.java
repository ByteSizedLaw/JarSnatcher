
import java.io.*;
import java.util.zip.*;

/**
 *
 * @author Stephen
 * @Github: https://github.com/ByteSizedLaw/
 */
public class JarDecompiler {
    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            System.out.println("Usage: java JarDecompiler <jar-file> <output-dir>");
            return;
        }
        File destDir = new File(args[1]);
        destDir.mkdirs();
        try (ZipInputStream zis = new ZipInputStream(new FileInputStream(args[0]))) {
            ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null) {
                File newFile = new File(destDir, entry.getName());
                if (entry.isDirectory()) {
                    newFile.mkdirs();
                } else {
                    new File(newFile.getParent()).mkdirs();
                    try (FileOutputStream fos = new FileOutputStream(newFile)) {
                        byte[] buffer = new byte[1024];
                        int len;
                        while ((len = zis.read(buffer)) > 0) {
                            fos.write(buffer, 0, len);
                        }
                    }
                }
                zis.closeEntry();
            }
        }
    }
}
