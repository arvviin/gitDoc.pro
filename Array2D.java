import java.util.ArrayList;

public class Array2D {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> storeroomlist = new ArrayList();

        ArrayList<String> SportcarList = new ArrayList();
        SportcarList.add("Bmw");
        SportcarList.add("Benz");
        SportcarList.add("porche");

        ArrayList<String> FamouscarList = new ArrayList();
        FamouscarList.add("rolls royce");
        FamouscarList.add("Lambo");
        FamouscarList.add("ferrari");

        ArrayList<String> NormalList = new ArrayList();
        NormalList.add("tata");
        NormalList.add("suzuki");

        storeroomlist.add(SportcarList);
        storeroomlist.add(FamouscarList);
        storeroomlist.add(NormalList);

        System.out.println(storeroomlist);

    }

}
