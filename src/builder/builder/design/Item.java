package builder.builder.design;

/**
 * @author wei.song
 * @since 2022-10-29 12:24
 */
public interface Item {
    /**
     * 命名
     *
     * @return 名称
     */
    public String name();

    /**
     * 包装
     *
     * @return 打包接口类
     */
    public Packing packing();

    /**
     * 价格
     *
     * @return 价格
     */
    public float price();
}
