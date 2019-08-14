package greywaren.recyclerviewandcardview;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by swikriti on 8/8/2019.
 */

public class NatureModel {
    private int imageID;
    private String title;

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static List<NatureModel> getObjectList() {

        List<NatureModel> dataList = new ArrayList<>();
        int[] images = getImages();

        for (int i = 0; i < images.length; i++) {
            NatureModel nature = new NatureModel();
            nature.setImageID(images[i]);
            nature.setTitle("Picture " + i);
            dataList.add(nature);
        }
        return dataList;
    }

    private static int[] getImages() {

        int[] images = {R.drawable.breakfast, R.drawable.curry, R.drawable.dessert, R.drawable.dinner,
                R.drawable.snacks, R.drawable.drinks
        };
        return images;
    }
}