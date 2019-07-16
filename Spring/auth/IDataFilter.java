package auth;

/**
 * 获取数据过滤处理器
 */
public interface IDataFilter {
    /**
     * 返回数据过滤处理器类型
     * @return
     */
    String getProcess();
    /**
     * 数据过滤类型，如:所有场景（*）,创建者过滤（creator）、阅读者过滤（reader）、编辑者过滤（editor）等
     * @return
     */
    String[] getFilterType();
}
