package abstractfactory.clothesfactory.clothes;

/**
 * @author wei.song
 * @since 2022/12/7 22:25
 */
public class FemaleClothes implements Clothes {
    @Override
    public void applicableOccasions() {

    }

    @Override
    public void applicableGender() {
        System.out.println("Female Clothes");
    }
}
