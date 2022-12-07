package abstractfactory.clothesfactory.clothes;

/**
 * @author wei.song
 * @since 2022/12/7 22:24
 */
public class MaleClothes implements Clothes {
    @Override
    public void applicableOccasions() {

    }

    @Override
    public void applicableGender() {
        System.out.println("Male Clothes");
    }
}
