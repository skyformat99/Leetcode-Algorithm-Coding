import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class RepeatingAnnotations {

    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Filters {
        Filter[] value();
    }

    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
//    @Repeatable(Filters.class)
    public @interface Filter {
        String value();
    };

    @Filters(value = {@Filter(value = "Filter1"),@Filter(value = "Filter2")})
    public interface Filterable {
    }

    public static void main(String[] args) {
        for(Filters filter: Filterable.class.getAnnotationsByType(Filters.class)) {
            for (Filter f :filter.value()){
                System.out.println(f.value());
            }
        }
    }


}