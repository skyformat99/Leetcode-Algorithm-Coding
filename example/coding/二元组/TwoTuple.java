/**
 * @Description: <>
 * @Author: lishangzhi
 * @Date: 2019-07-29 17:08
 * @Version: v2.0.0
 * @Copy:  阿里巴巴集团
 */
public class TwoTuple<A, B> {

    public final A first;

    public final B second;

    public TwoTuple(A a, B b) {
        first = a;
        second = b;
    }

    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}
