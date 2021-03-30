package Week5.garbage.hust.soict.hedspi.garbage;
import java.io.*;
import java.util.*;

public class GarbageCreator {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:/Users/Admin/Documents/GitHub/OOLT.VN.20202.20184061.LuuThanhDat/Week5/Week5/garbage/testfile.txt");
        Scanner sc = new Scanner(fr);
        String line = "";
        while(sc.hasNext() == true){
//            line = sc.nextLine();
            line += sc.nextLine();
        }
        System.out.println(line);
        // Close the file.
        sc.close();
    }
}

