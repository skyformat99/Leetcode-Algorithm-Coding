import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description: <>
 *
 * @author li.Shangzhi
 * @Date: 2019-09-19 14:58
 * @Copy:  阿里巴巴集团
 */
public class Leet {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        String[] c = new String[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, c, 0, nums1.length);
        System.arraycopy(nums2, 0, c, nums1.length, nums2.length);

         Arrays.asList(c).sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        //曲中间值


        return 0;
    }


}
