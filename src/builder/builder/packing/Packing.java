package builder.builder.packing;

/**
 * 参考链接：https://www.runoob.com/design-pattern/builder-pattern.html
 *
 * @author wei.song
 * @since 2022-10-29 12:25
 */
public interface Packing {
    /**
     * 打包接口
     *
     * @return 食物包装
     */
    public String pack();
}
