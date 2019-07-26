package auth;

import auth.constant.AuthConstant;
import auth.constant.DataFilterResult;

/**
 * 数据过滤处理类
 */
public interface IDataFilterProcess extends AuthConstant {

    /**
     * 字符分隔
     */
    String STR_SPLIT = "\\s*[,;]\\s*";

    /**
     * 通配符号
     */
    String STR_ANY_MATCH = "*";

    /**
     * 过滤器处理
     *
     * @param filterContext
     * @return
     *      true   返回数据过滤信息
     *      false  忽略数据过滤器
     *      null   取消数据过滤
     */
    DataFilterResult doProcess(DataFilterContext filterContext);

}
