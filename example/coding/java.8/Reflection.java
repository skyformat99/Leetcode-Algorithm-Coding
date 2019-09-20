import java.lang.reflect.Method;

/**
 * @Description: <>
 *
 * @author li.Shangzhi
 * @Date: 2019-08-29 16:03
 * @Copy:  阿里巴巴集团
 */
public class Reflection {

    @FunctionalInterface
    public interface MethodFilters {

        /**
         * Determine whether the given method matches.
         * @param method the method to check
         */
        boolean matches(Method method);
    }

    public static final MethodFilters USER_DECLARED_METHODS = (method -> !method.isDefault());


    public static void main(String[] args) {


    }
}
