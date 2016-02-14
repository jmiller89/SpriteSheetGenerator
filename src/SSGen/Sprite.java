//This is the basic class for a sprite

package SSGen;

/**
 *
 * @author Jim (Admin)
 */

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

public class Sprite
{
    private Image image;
    private int ID;
    public BufferedImage bImage;

    public Sprite(Image img, int i, BufferedImage b)
    {
        image = img;
        ID = i;
        bImage = b;
    }

    public int getWidth()
    {
        return image.getWidth(null);
    }

    public int getHeight()
    {
        return image.getHeight(null);
    }

    public int getID()
    {
        return ID;
    }

    public void draw(Graphics g, int x, int y)
    {
        g.drawImage(image, x, y, null);
    }


}
