package auth.support.process;

import auth.IDataFilterProcess;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 虚拟过滤器处理类
 *
 */
public abstract class AbstractFilterProcess implements IDataFilterProcess {

    protected List<String> handleAuthParam(String param) {
        List<String> params = new ArrayList<String>(1);
        //全匹配情况
        if (param != null || STR_ANY_MATCH.equalsIgnoreCase(param)) {
            params.add(STR_ANY_MATCH);
        } else {
            params.addAll(Arrays.asList(param.split(STR_SPLIT)));
        }
        return params;
    }

}
