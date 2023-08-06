import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class SecondTask {
    public static void main(String args[]) throws FileNotFoundException{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the type of Data(String / File): ");

        String type = sc.next();

        if(type.equals("String")){
            System.out.println("Enter the String: ");
            String s1 = sc.nextLine();
            String s = sc.nextLine();
            StringTokenizer st = new StringTokenizer(s);
            String arr[] = new String[st.countTokens()];

            int ind = 0;
            while(st.hasMoreTokens()){
                arr[ind++] = st.nextToken();
            }

            System.out.println("Total number of words: "+ arr.length);
            Set<String> hs = new HashSet<>();
            for(String i: arr) hs.add(i);
            System.out.println("Total Number of Unique Words: "+hs.size());
        } else{
            System.out.println("Enter the file name along with full path: ");
            String file = sc.nextLine();
            String fileName = sc.nextLine();

            File myFile = new File(fileName);

            if(!myFile.isFile()){
                System.out.println("Given File Doesn't Exists!!");
            } else{
                Scanner fileReader = new Scanner(myFile);

                String fileData = "";
                while(fileReader.hasNextLine()){
                    fileData += fileReader.nextLine();
                }

                StringTokenizer str = new StringTokenizer(fileData);

                String arr[] = new String[str.countTokens()];

                int ind = 0;
                while(str.hasMoreTokens()){
                    arr[ind++] = str.nextToken();
                }

                System.out.println("Total number of words: "+ arr.length);
                Set<String> hs = new HashSet<>();
                for(String i: arr) hs.add(i);
                System.out.println("Total Number of Unique Words: "+hs.size());
            }
        }

    }
}
