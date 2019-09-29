import java.io.*;
import java.util.Properties;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Hello World!");
        FileInputStream fis;
        Properties prop = new Properties();
        try{
            fis = new FileInputStream("src/config.properties");
            prop.load(fis);
            String name = prop.getProperty("name");

            System.out.println(name);
        } catch (IOException e){
            System.err.println("Файл свойств не найден");
        }

    }
//    /TODO: add classes for nodes and lines of graph
}
