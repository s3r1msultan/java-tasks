import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numElements = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < numElements; ++i){
            list.add(scan.nextInt());
        }

        int numQueries = scan.nextInt();

        for(int i = 0; i < numQueries; ++i){

            String queryType = scan.nextLine();

            if(queryType.equals("Insert")){
                String[] queryArray = scan.nextLine().split(" ");
                list.add(Integer.parseInt(queryArray[0]), Integer.parseInt(queryArray[1]));
            } else if(queryType.equals("Delete")){
                int removeIndex = scan.nextInt();
                list.remove(removeIndex);
            }

        }

        for(int i = 0; i < list.size(); ++i) {
            System.out.print(list.get(i) + " ");
        }
    }
}