import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String[]> arrayStrings = new ArrayList<>();
        ArrayList<String> fam = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> s_name = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<String> sex = new ArrayList<>();
        ArrayList<Integer> id = new ArrayList<>();



        while (true) {
            System.out.println(".".repeat(140));
            System.out.println("Введите строки в формате: \nФамилия Имя Отчество Возраст Пол\nЧтобы закончить ввод данных - введите пустую строку.");
            String[] myList = GetArrayString(sc.nextLine());
            arrayStrings.add(myList);

            id.add(0,arrayStrings.size());

            fam.add(myList[0]);

            name.add(myList[1]);

            s_name.add(myList[2]);

            age.add(Integer.valueOf(myList[3]));

            sex.add(myList[4]);



            if (myList == null)
                break;

            Collections.sort(id, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return age.get(o1) - age.get(o2);
                }
            });

            System.out.println(id);
            id.forEach(n -> System.out.println(fam.get(n) + name.get(n) + s_name.get(n) + age.get(n) + sex.get(n)));
            System.out.println(String.format("%s %s. %s. %s %s", myList[0], myList[1].charAt(0), myList[2].charAt(0), myList[3], myList[4]));
        }


    }
    public static String[] GetArrayString(String str){
        String[] result = null;
        result = str.strip().split(" ");
        if (result.length !=5) {
            return null;
        }
        return result;
    }

}
