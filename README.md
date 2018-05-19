# MapToList2
Code from DZone on Converting Java Maps to Lists 

Many thanks to John Thompson, Spring Framework Guru
https://springframework.guru

https://dzone.com/articles/converting-java-maps-to-lists

**Note**:
The variable _listOfKeys2_ has been changed to _listOfKeys_ to correct compile error

    public List<Integer> convertMapKeysToListWithStream(Map<Integer,String> map){
        List<Integer> listOfKeys = map.keySet().stream().collect(Collectors.toList());
        return listOfKeys;
    }

