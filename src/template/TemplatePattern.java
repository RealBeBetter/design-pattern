package template;

import template.template.Cricket;
import template.template.Football;
import template.template.Game;

/**
 * @author wei.song
 * @since 2022-11-01 10:59
 */
public class TemplatePattern {

    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();

        game = new Football();
        game.play();
    }

}
