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
        List<Integer> listOfKeys = map.keySet().stream().collect(Collectors.toList());
        return listOfKeys;

    }
}
