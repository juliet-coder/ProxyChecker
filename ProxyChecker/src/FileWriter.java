import java.io.FileOutputStream;

public class FileWriter {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("C:/Users/Dom/source/repos/java/test1.txt");
            String text = "Hello world";
            byte[] buffer = text.getBytes();
            fos.write(buffer,0, buffer.length);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Файл был записан");
    }
}