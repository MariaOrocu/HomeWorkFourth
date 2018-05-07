package Domain;

import Interface.Window;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javafx.scene.image.Image;

public class RunningCharacter extends Character {

    JumpingCharacter character;

    public RunningCharacter(int x, int y, int imgNum) throws FileNotFoundException {
        super(x, y, imgNum);
        setSprite();
    }

    public void setSprite() throws FileNotFoundException {
        ArrayList<Image> sprite = super.getSprite();
        sprite.add(new Image(new FileInputStream("src/Assets/Running0.png"))); // 0
        sprite.add(new Image(new FileInputStream("src/Assets/Running1.png"))); // 1
        sprite.add(new Image(new FileInputStream("src/Assets/Running2.png"))); // 2
        sprite.add(new Image(new FileInputStream("src/Assets/Running3.png"))); // 3
        sprite.add(new Image(new FileInputStream("src/Assets/Running4.png"))); // 4
        sprite.add(new Image(new FileInputStream("src/Assets/Running5.png"))); // 5
        sprite.add(new Image(new FileInputStream("src/Assets/Running6.png"))); // 6
        sprite.add(new Image(new FileInputStream("src/Assets/Running7.png"))); // 7
        sprite.add(new Image(new FileInputStream("src/Assets/Jumping0.png"))); // 8
        sprite.add(new Image(new FileInputStream("src/Assets/Jumping1.png"))); // 9
        sprite.add(new Image(new FileInputStream("src/Assets/Jumping2.png"))); // 10
        sprite.add(new Image(new FileInputStream("src/Assets/eyes1.png"))); // 11
        sprite.add(new Image(new FileInputStream("src/Assets/eyes2.png"))); // 12
        sprite.add(new Image(new FileInputStream("src/Assets/eyes3.png"))); // 13
        sprite.add(new Image(new FileInputStream("src/Assets/eyes4.png"))); // 14
        sprite.add(new Image(new FileInputStream("src/Assets/RunningFinal.png"))); // 15
        sprite.add(new Image(new FileInputStream("src/Assets/RunningFinalDos.png"))); // 16
        sprite.add(new Image(new FileInputStream("src/Assets/RunningFinalTres.png"))); // 17

        super.setSprite(sprite);
    }

    @Override
    public void run() {
        int contX = 0;
        int contY = 490;
        ArrayList<Image> sprite = super.getSprite();
        while (true) {

            try {
                for (int i = 0; i < 8; i++) {
                    contX = contX + 10;
                    super.setImage(sprite.get(i));
                    super.setX(contX);
                    Thread.sleep(100);

                    if (contX == 394) {
                        super.setImage(sprite.get(8));
                        for (int p = 0; p < 20; p++) {
                            contY = contY - 10;
                            this.setY(contY);
                            Thread.sleep(100);
                       }//if-for
                    }//if

                    if (contY == 290) {
                        super.setImage(sprite.get(9));
                        for (int n = 0; n < 8; n++) {
                            contY = contY + 10;
                            this.setY(contY);
                            Thread.sleep(100);
                        }
                    }//if
                    if (contX == 394) {
                        super.setImage(sprite.get(10));
                        this.setY(374);
                        Thread.sleep(100);

                        super.setImage(sprite.get(11));
                        this.setY(374);
                        Thread.sleep(100);

                        super.setImage(sprite.get(12));
                        this.setY(374);
                        Thread.sleep(100);

                        super.setImage(sprite.get(13));
                        this.setY(374);
                        Thread.sleep(100);

                        super.setImage(sprite.get(14));
                        this.setY(374);
                        Thread.sleep(100);

                        super.setImage(sprite.get(11));
                        this.setY(374);
                        Thread.sleep(100);

                        super.setImage(sprite.get(12));
                        this.setY(374);
                        Thread.sleep(100);

                        super.setImage(sprite.get(13));
                        this.setY(374);
                        Thread.sleep(100);

                        super.setImage(sprite.get(14));
                        this.setY(374);
                        Thread.sleep(100);

                    }//if
                    if(contX == 536){
                        super.setImage(sprite.get(8));
                        for (int p = 0; p < 20; p++) {
                            contY = contY - 10;
                            this.setY(contY);
                            Thread.sleep(100);
                       }//if-for
                    }
                    if (contY == 170) {
                        super.setImage(sprite.get(9));
                        for (int n = 0; n < 7.4; n++) {
                            contY = contY + 10;
                            this.setY(contY);
                            Thread.sleep(100);
                        }
                    }//if
                    System.err.println(contX);
                 
                    if(contX == 577){
                    super.setImage(sprite.get(15));
                    this.setX(600);
                    Thread.sleep(100);
                 
                    super.setImage(sprite.get(16));
                    this.setX(610);
                    Thread.sleep(100);
                 
                    super.setImage(sprite.get(17));
                    this.setX(615);
                    Thread.sleep(100);
                
                    stop();
                    }
                }//for

            } catch (InterruptedException ex) {
            }
            contX++;
            if (contX == 8) {
                contX = 0;
            }
        }
    }
}
