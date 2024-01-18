import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LoteriaCalculo {
    public static void main(String[] args) {
        ArrayList<Loteria> loteria = new ArrayList<>();
        loteria.add(new Loteria(6, 1));
        loteria.add(new Loteria(10, 9));
        loteria.add(new Loteria(3, 3));
        loteria.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println(justicia(loteria));
    }
    public static String justicia(List<Loteria> loteria){
        for (int i = 0; i < loteria.size() - 1; i++) {
            Collections.sort(loteria);
            if (loteria.get(i).getDinero() >= loteria.get(i + 1).getDinero() && loteria.get(i).getPremios() <= loteria.get(i + 1).getPremios()){
                return "NO";
            }else if (loteria.get(i).getDinero() <= loteria.get(i + 1).getDinero() && loteria.get(i).getPremios() >= loteria.get(i + 1).getPremios()){
                return "NO";
            }else return "SI";
        }
        return null;
    }
}
