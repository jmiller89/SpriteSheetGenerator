/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package SSGen;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Jim
 */
public class Main
{
    public static void main(String[] args)
    {
        int width = 1000; //SpriteLoader.MAX_TILE_INDEX + 1;
        int height = 1000; //40;

        SpriteLoader sl = new SpriteLoader();
        Sprite[] sprites = new Sprite[SpriteLoader.MAX_TILE_INDEX + 1];

        //Load the sprites
        for(int i = 0; i < sprites.length; i++)
        {
            sprites[i] = sl.getSprite(i);
        }

        BufferedImage img = new BufferedImage(width, height, BufferedImage.BITMASK);
        Graphics g = img.getGraphics();

        for(int i = 0, j = 0, k = 0; i < sprites.length; i++, j++)
        {
            if (j > 24)
            {
                j = 0;
                k++;
            }
            g.drawImage(sprites[i].bImage, (j * 40), (k * 40), null);
        }

        try
        {
            ImageIO.write(img, "PNG", new File("spritesheet.png"));
        }
        catch (IOException ex)
        {
            System.err.println(ex.getMessage());
        }

    }
}
