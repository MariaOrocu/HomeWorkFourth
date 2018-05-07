package Domain;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javafx.scene.image.Image;

public class JumpingCharacter extends Character {

    public JumpingCharacter(int x, int y, int imgNum) throws FileNotFoundException {
        super(x, y, imgNum);
        setSprite();
    }

    public void setSprite() throws FileNotFoundException {
        ArrayList<Image> sprite = super.getSprite();

    }

    @Override
    public void run() {
        ArrayList<Image> sprite = super.getSprite();

        int cont = 490;

        while (true) {
            try {
                super.setImage(sprite.get(0));
                for (int i = 0; i < 1; i++) {
                    cont = cont - 10;
                    this.setY(cont);
                    Thread.sleep(300);
                }
                if (cont == 330) {
                    super.setImage(sprite.get(1));
                    for (int i = 0; i < 30; i++) {
                        cont = cont + i;
                        this.setY(cont);
                        Thread.sleep(300);
                        if (cont == 358) {
                            super.setImage(sprite.get(2));
                            this.setY(360);
   }
                    }
                }

            } catch (InterruptedException ex) {
            }
        }
    }
}
