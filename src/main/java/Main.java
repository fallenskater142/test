import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

     public static void main(String[] args) throws FileNotFoundException {
int max = 0;
         Map <String,Integer> map = new HashMap<>();
         List<String> list = new ArrayList<>();
         Scanner scanner = new Scanner(new File("C:\\Users\\79613\\IdeaProjects\\september\\src\\main\\java\\test.txt"));
     while (scanner.hasNext()){
         String word = scanner.useDelimiter("\\s+").next();
         list.add(word);
         Integer count = map.get(word);
         if (count ==null){
             count=0;
         }
         map.put(word,++count);

     }
     list.sort(String.CASE_INSENSITIVE_ORDER);
     System.out.println(list);
System.out.println(map);
for(int key :map.values()){
   if(key>max){
       max = key;
   }
}
      for(String d : map.keySet()){
          if (map.get(d).equals(max)){
              System.out.println(d+" встречается "+max+ " Раза");

          }
      }
     }


}





