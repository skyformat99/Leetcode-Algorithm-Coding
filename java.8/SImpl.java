import javax.sound.midi.Soundbank;
import java.time.Clock;
import java.time.Instant;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class SImpl{

    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names, new Comparator<String>() {

            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }

        });

        Collections.sort(names, (String a, String b) -> {
            return b.compareTo(a);
        });

        Collections.sort(names, (String a, String b) -> b.compareTo(a));

        Collections.sort(names,(String a,String b) -> b.compareTo(a));

        Collections.sort(names, (a, b) -> b.compareTo(a));


        Predicate<String> predicate = (s -> {
            return (s.length() > 0);
        });



        predicate.test("foo");            // true
        predicate.negate().test("foo");     // false
        Predicate<Boolean> nonNull = Objects::nonNull;
        Predicate<Boolean> isNull = Objects::isNull;
        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();


        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock);
        long millis = clock.millis();
        Instant instant = clock.instant();
        System.out.println(Clock.systemDefaultZone().instant());
        Date legacyDate = Date.from(instant);   // legacy java.util.Date
        System.out.println(legacyDate);
    }

}
