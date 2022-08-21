import java.util.HashMap;
import java.util.Map;

public final class ImmutableClass {
    private  final String name;
    private final int age;
    private   Map<Integer,String> map =new HashMap<>();

    public ImmutableClass(String name, int age, HashMap<Integer, String> map) {
        this.name = name;
        this.age = age;
        Map<Integer,String> tempMap=new HashMap<>();
        for(Map.Entry<Integer,String> entry:map.entrySet())
        {
            tempMap.put(entry.getKey(),entry.getValue());
        }
        this.map=tempMap;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Map<Integer, String> getMap() {
        Map<Integer,String> tempMap=new HashMap<>();
        for(Map.Entry<Integer,String> mp:map.entrySet())
        {
            tempMap.put(mp.getKey(),mp.getValue());
        }
        return tempMap;
    }
}
