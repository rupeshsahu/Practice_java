import java.util.HashMap;
import java.util.Map;

public final class ImmutableClass {
    private  final String name;
    private final int age;
    private  Map<Integer,String> map =new HashMap<>();

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
}
