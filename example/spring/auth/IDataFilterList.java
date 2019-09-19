package auth;

public interface IDataFilterList extends IDataFilter {
    /**
     * 过滤器列表
     * @return
     */
    IDataFilter[] getFilters();
}
