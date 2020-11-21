package ImageHoster.service;

import ImageHoster.HardCodedImage;
import ImageHoster.model.Image;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ImageService {

    private HardCodedImage hardCodedImage = new HardCodedImage();

    private List<Image> images = new ArrayList<>();

    public ImageService() {

        Date date = new Date();

        images.add(new Image(1, "Dr. Strange", hardCodedImage.getDrStrange(), "Dr Strange is a strange doctor.", date));
        images.add(new Image(2, "SpiderMan", hardCodedImage.getSpiderMan(), "Spiderman is a man like spider.", date));
    }

    public List<Image> getAllImages() {
        return new ImageService().images;
    }

}
