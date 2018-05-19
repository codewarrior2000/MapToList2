# MapToList2
Code from DZone on Converting Java Maps to Lists 

Many thanks to John Thompson, Spring Framework Guru
https://springframework.guru

**See DZone article**:
https://dzone.com/articles/converting-java-maps-to-lists

**The MapToListConverter contains:**

1. code to convert all the keys of a Map to a Set

2. code to convert Map values to a List

3. code using streams (introduced in Java 8), along with some utility classes like Collectors to convert a stream of Map entries to List.

**Note**:
The variable _listOfKeys2_ has been changed to _listOfKeys_ to correct compile error

    public List<Integer> convertMapKeysToListWithStream(Map<Integer,String> map){
        List<Integer> listOfKeys = map.keySet().stream().collect(Collectors.toList());
        return listOfKeys;
    }

