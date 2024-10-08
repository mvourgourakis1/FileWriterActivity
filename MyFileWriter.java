import java.io.*;
import java.io.File;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;

public class MyFileWriter {
    public static void main(String[] args) {
        //String data = "Hello, World!";
        //String fileName1 = "example.txt";
        // String fileName2 = "example2.txt";
        // String fileName3 = "example3.txt";
        // String fileName4 = "example4.txt";
        // String fileName5 = "example5.txt";

        // 1. Using FileWriter
        // try (FileWriter writer = new FileWriter(fileName1)) {
        //     writer.write(data);
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        // 2. Using BufferedWriter
        // try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName2))) {
        //     bufferedWriter.write(data);
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        // 3. Using FileOutputStream
        // try (FileOutputStream outputStream = new FileOutputStream(fileName3)) {
        //     outputStream.write(data.getBytes());
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        // 4. Using BufferedOutputStream
        // try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileName4))) {
        //     bufferedOutputStream.write(data.getBytes());
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        // 5. Using Files (java.nio.file)
        // try {
        //     Files.write(Paths.get(fileName5), data.getBytes(StandardCharsets.UTF_8));
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        // try (PrintWriter writer = new PrintWriter(".facebookMarketPlacePassword.txt")){
        //     writer.print("Chance is a bot");
        // } catch (IOException e){
        //     e.printStackTrace();
        // }

        // try (PrintWriter writer2 = new PrintWriter("path\\.superSecretHiddenFolder\\burgerking.txt")){
        //     writer2.print("whopper whopper whopper");
        // } catch (IOException e){
        //     e.printStackTrace();
        // }

        
        writeFile(".facebookMarketPlacePassword.txt", "Chance is a bot");
        writeFile("tryToFindMe.txt", "darn it", ".superSecretHiddenFolder");
        printFileSize(".facebookMarketPlacePassword.txt");

    }

    public static void writeFile(String name, String contents){
        try (PrintWriter writer = new PrintWriter(name)){
            writer.print(contents);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void writeFile(String name, String contents, String folderPath){
        File dir = new File(System.getProperty("user.dir")+ "/" + folderPath);
        if(!dir.mkdir()){
            System.out.println("folder titled: '" + folderPath + "' may already exist.");
        }
        dir.mkdir();
        try (PrintWriter writer = new PrintWriter(folderPath+ "/" + name)){
            writer.print(contents);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void printFileSize(String filename){
        //implement my print filesize
        File toGetSize = new File(filename);
        long toPrint = toGetSize.length();
        System.out.println(toPrint + " Bytes");
    }

}