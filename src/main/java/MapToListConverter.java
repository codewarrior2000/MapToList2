import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/***************************************************************
 *
 * Converting Java Maps to Lists by  John Thompson
 *
 * Converting a Java Map to a List is a very common task.
 * Map and List are common data structures used in Java.
 * A Map is a collection of key value pairs.
 * While a List is an ordered collection of objects in which
 * duplicate values can be stored.
 *
 *https://dzone.com/articles/converting-java-maps-to-lists?utm_source=Top%205&utm_medium=email&utm_campaign=Top%205%202018-05-183
 *
 */

public class MapToListConverter {


    /***************************
     *
     *  returns a Set view of the keys contained in the map. The code to convert all the keys of a Map to a Set
     *
     * @param map
     * @return
     */
    public List<Integer> convertMapKeysToList(Map<Integer,String> map){
        System.out.println("convertMapKeysToList()");
        List<Integer> listOfKeys = new ArrayList(map.keySet());
        return listOfKeys;

    }


    /***************************
     *
     * use the values() method of Map to convert all the values of Map entries into a List.
     *
     * @param map
     * @return
     */
    public List<String> convertMapValuesToList(Map<Integer,String> map){
        System.out.println("convertMapValuesToList()");
        List<String> listOfValues = new ArrayList(map.values());
        return listOfValues;
    }


    /***************************
     *
     * If you are into a more functional programming style, you can use streams
     * (introduced in Java 8), along with some utility classes like Collectors,
     * which provides several useful methods to convert a stream of Map entries
     * to List.
     *
     * @param map
     * @return
     */
    public List<Integer> convertMapKeysToListWithStream(Map<Integer,String> map){
        System.out.println("convertMapKeysToListWithStream()");
        List<Integer> listOfKeys = map.keySet().stream().collect(Collectors.toList());
        return listOfKeys;
    }


    /*************************
     *
     * Converting Map values to a List using streams is similar. You only need to
     * get the stream of Map values that map.values() return.
     *
     * @param map
     * @return
     */
    public List<String> convertMapValuesToListWithStream(Map<Integer,String> map){
      //List<String> listOfValues = map.values().stream().collect(Collectors.toCollection(ArrayList::new));

      //A shorter alternative to the line above
        System.out.println("convertMapValuesToListWithStream()");
        List<String> listOfValues = map.values().stream().collect(Collectors.toList());
        return listOfValues;
    }



    /******************************
     *
     * For generic collections, you can use streams with lambda expressions,
     * like in this class.
     *
     * @param map
     * @param <K>
     * @param <V>
     * @return
     */
    public static<K, V> List<K> convertGenericMapKeysToListWithStreamLambda(Map<K,V> map){
        System.out.println("convertGenericMapKeysToListWithStreamLambda()");
        List<K> keyList = new ArrayList<>();
        map.entrySet().stream().forEach( entry ->
            {keyList.add(entry.getKey());
            } );
        return keyList;
    }



    /********************************************
     *
     * For generic collections, you also can use streams with method reference,
     * like in this class.
     * (method references preferred over lambda expressions because they are
     * clear and concise.)
     *
     * @param map
     * @param <K>
     * @param <V>
     * @return
     */
    public static<K, V> List<V> convertGenericMapValuesToListWithStreamMethodReference(Map<K,V> map){
        System.out.println("convertGenericMapValuesToListWithStreamMethodReference( )");
        List<V> keyList = new ArrayList<>();
        map.values().stream().forEach(keyList::add);
        return keyList;
    }

}
