package org.javacasts.java9.images;

import static org.junit.Assert.assertSame;

import java.awt.Image;
import java.awt.image.BaseMultiResolutionImage;
import java.awt.image.BufferedImage;
import java.awt.image.MultiResolutionImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.junit.Test;

public class MultiImagesTest {

  @Test
  public void receiveImageSizeFromMultiResolutionImage() throws IOException {
    BufferedImage[] resolutionVariants =
        new BufferedImage[] {ImageIO.read(MultiImagesTest.class.getResourceAsStream("/jc-8.png")),
            ImageIO.read(MultiImagesTest.class.getResourceAsStream("/jc-16.png")),
            ImageIO.read(MultiImagesTest.class.getResourceAsStream("/jc-24.png")),
            ImageIO.read(MultiImagesTest.class.getResourceAsStream("/jc-32.png")),
            ImageIO.read(MultiImagesTest.class.getResourceAsStream("/jc-64.png"))};
    MultiResolutionImage bmrImage = new BaseMultiResolutionImage(resolutionVariants);
    Image testRVImage = bmrImage.getResolutionVariant(16, 16);
    assertSame("Images should be the same", testRVImage, resolutionVariants[1]);
  }
}
