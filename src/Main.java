import java.util.*;
//https://www.hackerrank.com/challenges/java-iterator/problem?isFullScreen=true
public class Main {
    static Iterator func(ArrayList myList){
        Iterator it = myList.iterator(); //Iterator nesnesi sayesinde listedeki elemanlara sırasıyla erişebiliriz
        while(it.hasNext()){ //metod listedeki bir sonraki elemana geçip geçemeyeceğimizi kontrol eder
            Object element = it.next();
            if(element instanceof String && element.equals("###")){
                break;
            }
        }
        return it;
    }
    @SuppressWarnings({"unhecked"})
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 0; i < n; i++){
            myList.add(sc.nextInt());
        }
        myList.add("###"); //Listeye "###" ekler listeyi iki bölüme ayırmak için
        for (int i = 0; i < m; i++){
            myList.add(sc.next());
        }
        Iterator it = func(myList);
        while (it.hasNext()) {
            Object element = it.next();
            System.out.println((String) element);
        }
    }
}
