package abstractfactory.clothesfactory.clothes;

/**
 * 衣服接口，表示衣服需要遵循的生产规范
 *
 * @author Real
 * Date: 2022/12/5 0:15
 */
public interface Clothes {

    /**
     * 适用场合
     */
    void applicableOccasions();

    /**
     * 适用性别
     */
    void applicableGender();

}
