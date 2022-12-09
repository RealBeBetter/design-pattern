package abstractfactory;

import abstractfactory.clothesfactory.clothes.Pants;
import abstractfactory.clothesfactory.clothes.Shirt;
import abstractfactory.clothesfactory.factory.BusinessClothesFactory;
import abstractfactory.clothesfactory.factory.ClothesFactory;
import abstractfactory.clothesfactory.factory.FashionClothesFactory;

/**
 * 为了参加一些聚会，肯定会有多套衣服。比如说有商务装（成套，一系列具体产品）、时尚装（成套，一系列具体产品），
 * 甚至对于一个家庭来说，可能有商务女装、商务男装、时尚女装、时尚男装，这些也都是成套的，即一系列具体产品。
 * 假设一种情况，在您的家中，某一个衣柜（具体工厂）只能存放某一种这样的衣服（成套，一系列具体产品），
 * 每次拿这种成套的衣服时也自然要从这个衣柜中取出了。
 * 用 OOP 的思想去理解，所有的衣柜（具体工厂）都是衣柜类的（抽象工厂）某一个，
 * 而每一件成套的衣服又包括具体的上衣（某一具体产品），裤子（某一具体产品），
 * 这些具体的上衣其实也都是上衣（抽象产品），具体的裤子也都是裤子（另一个抽象产品）。
 *
 * @author Real
 * Date: 2022/12/5 0:11
 */
public class ClothesFactoryPattern {

    public static void main(String[] args) {
        // 生成商务装工厂
        ClothesFactory businessClothesFactory = new BusinessClothesFactory();

        // 从商务装工厂中生成上衣和裤子
        Shirt businessShirt = businessClothesFactory.createShirt();
        Pants businessPants = businessClothesFactory.createPants();

        // 显示商务装
        businessShirt.display();
        businessPants.display();

        // 生成时尚装工厂
        ClothesFactory fashionClothesFactory = new FashionClothesFactory();

        // 从时尚装工厂中生成上衣和裤子
        Shirt fashionShirt = fashionClothesFactory.createShirt();
        Pants fashionPants = fashionClothesFactory.createPants();

        // 显示时尚装
        fashionShirt.display();
        fashionPants.display();
    }

}
