import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] myStr;
        ArrayList<String[]> arrayStrings = new ArrayList<>();
        String encoding = System.getProperty("console encoding", "UTF-8");
        Scanner scanner = new Scanner(System.in, encoding);

        while (true) {
            System.out.println(".".repeat(140));
            System.out.println("Введите строки в формате: \nФамилия Имя Отчество Возраст Пол\nЧтобы закончить ввод данных - введите пустую строку.");
            System.out.println("Введите стрроку: ");
            myStr = GetArrayString(scanner.nextLine());
            ArrayList<String> soname = new ArrayList<>();
            ArrayList<String> name = new ArrayList<>();
            ArrayList<String> s_name = new ArrayList<>();
            ArrayList<Integer> age = new ArrayList<>();
            ArrayList<String> sex = new ArrayList<>();
            ArrayList<Integer> id = new ArrayList<>();


            if (myStr == null)
                break;

            arrayStrings.add(myStr);
            soname.add(myStr[0]);
            name.add((myStr[1]));
            s_name.add((myStr[2]));
            age.add(Integer.valueOf(myStr[3]));
            sex.add(myStr[4]);
            id.add(arrayStrings.size());
            System.out.println("Фамилия: " + soname);
            System.out.println("Имя" + name);
            System.out.println("Отчество: " + s_name);
            System.out.println("Возраст: " + age);
            System.out.println("Пол: " + sex);
            System.out.println("Id" + id);

        }




        PrintArray(arrayStrings);
    scanner.close();
    }

    public static void PrintArray(ArrayList<String[]> arrayList) {
       arrayList.sort(new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                int res = Integer.parseInt(o1[3]) - Integer.parseInt(o2[3]);
                return res;
            }
        });
        for(String[] myStr: arrayList)
        System.out.println(String.format("%s %s. %s. %s %s", myStr[0], myStr[1].charAt(0), myStr[2].charAt(0), myStr[3], myStr[4]));

    }


    public static String[] GetArrayString(String str) {
        String[] result = null;
        result = str.strip().split(" ");
        if (result.length != 5)
            return null;

        return result;
    }


}