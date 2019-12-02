import java.lang.reflect.Field;

public class JSONSerializer implements Serializer {

    @Override
    public String serialize(Object o) {
        Class c = o.getClass();
        Field[] fields = c.getDeclaredFields();
        return null;
    }
}
