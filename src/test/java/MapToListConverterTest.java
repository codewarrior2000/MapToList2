import org.hamcrest.collection.IsEmptyCollection;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.IsCollectionContaining.hasItems;

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
public class MapToListConverterTest {

    MapToListConverter mapToListConverter;
    Map<Integer, String> countryDialCodeMap;

    @Before
    public void setUp() throws Exception {
        mapToListConverter = new MapToListConverter();
        countryDialCodeMap = new HashMap<>();
        countryDialCodeMap.put(1, "United States");
        countryDialCodeMap.put(44, "United Kingdom");
        countryDialCodeMap.put(27, "South Africa");
        countryDialCodeMap.put(33, "France");
        countryDialCodeMap.put(55, "Brazil");
    }

    @After
    public void tearDown() throws Exception {
        mapToListConverter=null;
        countryDialCodeMap = null;
    }


    @Test
    public void convertMapKeysToList(){
        List<Integer> convertedListOfKeys = mapToListConverter.convertMapKeysToList(countryDialCodeMap);
        assertThat(convertedListOfKeys, not(IsEmptyCollection.empty()));
        assertThat(convertedListOfKeys, hasSize(5));
        assertThat(convertedListOfKeys, containsInAnyOrder(1,33,44,27,55));
        printList(convertedListOfKeys);
    }


    @Test
    public void convertMapValuesToList(){
        List<String> convertedListOfValues = mapToListConverter.convertMapValuesToList(countryDialCodeMap);
        assertThat(convertedListOfValues, not(IsEmptyCollection.empty()));
        assertThat(convertedListOfValues, hasSize(5));
        assertThat(convertedListOfValues, containsInAnyOrder("United States", "United Kingdom", "Brazil", "South Africa", "France"));
        printList(convertedListOfValues);
    }


    @Test
    public void convertMapKeysToListWithStream(){
        List<Integer> convertedListOfKeys = mapToListConverter.convertMapKeysToListWithStream(countryDialCodeMap);
        assertThat(convertedListOfKeys, not(IsEmptyCollection.empty()));
        assertThat(convertedListOfKeys, hasSize(5));
        assertThat(convertedListOfKeys, hasItems(33,27));
        assertThat(convertedListOfKeys, containsInAnyOrder(1,33,44,27,55));
        printList(convertedListOfKeys);
    }


    private void printList(List list){
        list.stream().forEach(System.out::println);
    }
}
