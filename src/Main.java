import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args){
        List<String> cities = new ArrayList();
        cities.add("Buenos Aires");
        cities.add("San Juan");
        cities.add("New York");
        cities.add("Moscu");
        cities.add("Hong Kong");
        cities.add("La Habana");
        cities.add("Londres");
        cities.add("Bariloche");

       /* for (String city : cities){
            System.out.println(city);
        }*/
         //Lambda
        //cities.stream().forEach(city -> System.out.println(city));

        //Reference to a method ::
        //cities.stream().forEach(Main::printCity);

        //Se puede obviar el stream()
        //cities.forEach(Main::printCity);

        //More simple
        //cities.stream().forEach(System.out::println);

        //El "parallel()" ejecuta el procedimiento en paralelo en varios hilos de ejecucion(dependiendo del procesador y su nº de nucleos)
        //cities.stream().parallel().forEach(System.out::println);

        //Filtramos el array buscando aquellas ciudades que empiecen con "B"
        //cities.stream().filter(city -> city.startsWith("B")).forEach(System.out::println);

        //Mas de un filtro
        cities.stream().filter(city -> city.startsWith("B"))
                .filter(city -> city.contains("n"))
                .forEach(System.out::println);

        //.collect -> nos permite juntar todo aquello que hayamos filtrado y transformarlo en una lista
        List <String> filteredCities = cities.stream().filter(city -> city.startsWith("B"))
                .filter(city -> city.contains("n"))
                .collect(toList());


    }

    public static void printCity(String city) {
        System.out.println(city);
    }


}
