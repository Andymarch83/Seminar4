import java.util.*;

public class Test {
    public static void main(String[] args) {
        ArrayList<String[]> arrayStrings = new ArrayList<>();
        ArrayList<String> fam = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> s_name = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<String> sex = new ArrayList<>();
        ArrayList<Integer> id = new ArrayList<>();

        id.add(0);
        id.add(1);
        id.add(2);
        id.add(3);
        id.add(4);
        id.add(5);

        fam.add("Иванов");
        fam.add("Семёнова");
        fam.add("Васильков");
        fam.add("Слепаков");
        fam.add("Гаврикова");
        fam.add("Филиппова");

        name.add("Иван");
        name.add("Елена");
        name.add("Павел");
        name.add("Семён");
        name.add("Вероника");
        name.add("Катерина");

        s_name.add("Семёнович");
        s_name.add("Вячеславовна");
        s_name.add("Андреевич");
        s_name.add("Ушастович");
        s_name.add("Маврикиевна");
        s_name.add("Матвеевна");

        age.add(67);
        age.add(33);
        age.add(34);
        age.add(54);
        age.add(28);
        age.add(67);

        sex.add("муж");
        sex.add("жен");
        sex.add("муж");
        sex.add("муж");
        sex.add("жен");
        sex.add("жен");

        Collections.sort(id, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return age.get(o1) - age.get(o2);
                }
            });

            System.out.println(id);
            id.forEach(n -> System.out.println(fam.get(n) + " " + name.get(n) + " " + s_name.get(n) + " " + age.get(n) + " " + sex.get(n)));

        }


}
