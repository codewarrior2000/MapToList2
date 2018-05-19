# MapToList2
Code from DZone on Converting Java Maps to Lists 

Many thanks to John Thompson, Spring Framework Guru
https://springframework.guru

https://dzone.com/articles/converting-java-maps-to-lists?utm_source=Top%205&utm_medium=email&utm_campaign=Top%205%202018-05-183


**Note**:
The variable _listOfKeys2_ has been changed to _listOfKeys_ to correct compile error

    public List<Integer> convertMapKeysToListWithStream(Map<Integer,String> map){
        List<Integer> listOfKeys = map.keySet().stream().collect(Collectors.toList());
        return listOfKeys;
    }

