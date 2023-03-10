package com.example.photoapp;

import android.content.Context;

import org.json.JSONException;

import java.io.IOException;
import java.util.ArrayList;

public class PhotoData {
    private Context context;

    public PhotoData(Context con) {
        this.context = con;
    }

    public ArrayList<Photo> generatePhotoData(){
        /*ArrayList<Photo> photos = new ArrayList<>();
        photos.add(new Photo(0, "https://images.unsplash.com/photo-1518701005037-d53b1f67bb1c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8M3x8dHVsaXB8ZW58MHx8MHx8&auto=format&fit=crop&w=800&q=60",
                "Pineapple", "The pineapple (Ananas comosus) is a tropical plant with an edible fruit; it is the most economically significant plant in the family Bromeliaceae."));
        photos.add(new Photo(1, "https://www.google.com/imgres?imgurl=https%3A%2F%2Fcdn.tgdd.vn%2F2022%2F05%2FCookDish%2Fcherry-la-qua-gi-co-may-loai-phan-biet-cherry-my-voi-cherry-avt-1200x676.jpg&imgrefurl=https%3A%2F%2Fwww.dienmayxanh.com%2Fvao-bep%2Fcherry-la-qua-gi-co-may-loai-phan-biet-cherry-my-voi-cherry-17337&tbnid=JseypulJYmkeQM&vet=12ahUKEwjCj6CMn7X9AhUimlYBHasJBMwQMygBegUIARCwAQ..i&docid=tyhCuozofowG9M&w=1200&h=676&q=cherry&hl=vi&ved=2ahUKEwjCj6CMn7X9AhUimlYBHasJBMwQMygBegUIARCwAQ",
                "Cherry", "A cherry is the fruit of many plants of the genus Prunus, and is a fleshy drupe (stone fruit). Red cherries with stems. Prunus avium, sweet cherry (a true ..."));
        photos.add(new Photo(2, "https://www.google.com/imgres?imgurl=https%3A%2F%2Ftapdoanvinasa.com%2Fwp-content%2Fuploads%2F2019%2F10%2Fcam-sanh-tapdoanvinasa-08.jpg&imgrefurl=https%3A%2F%2Ftapdoanvinasa.com%2Fsan-pham%2Fcam-sanh%2F&tbnid=HRGq5iAeF8iBIM&vet=12ahUKEwjb9Yq6n7X9AhVLfXAKHVi0DMsQMygPegUIARDXAQ..i&docid=jkalmeShf-axmM&w=1000&h=1000&q=cam&hl=vi&ved=2ahUKEwjb9Yq6n7X9AhVLfXAKHVi0DMsQMygPegUIARDXAQ",
                "Orange", "They are very cheap now"));
        photos.add(new Photo(3, "https://www.google.com/imgres?imgurl=https%3A%2F%2Fw7.pngwing.com%2Fpngs%2F455%2F522%2Fpng-transparent-slice-avocado-fruit-avocado-avocado-food-photography-desktop-wallpaper-thumbnail.png&imgrefurl=https%3A%2F%2Fwww.pngwing.com%2Fen%2Fsearch%3Fq%3Davocado&tbnid=4urSZqE3GZiJIM&vet=12ahUKEwig6u2doLX9AhVEAYgKHbMbDw0QMygBegUIARC8AQ..i&docid=B0aQ0evolhPrbM&w=360&h=294&q=avocado%20png&hl=vi&ved=2ahUKEwig6u2doLX9AhVEAYgKHbMbDw0QMygBegUIARC8AQ",
                "Avocado", "So Cuteee"));
        photos.add(new Photo(4, "https://www.google.com/imgres?imgurl=https%3A%2F%2Fe7.pngegg.com%2Fpngimages%2F983%2F762%2Fpng-clipart-strawberry-fruit-strawberry.png&imgrefurl=https%3A%2F%2Fwww.pngegg.com%2Fen%2Fsearch%3Fq%3Dstrawberry&tbnid=tZrrx3h93V76fM&vet=12ahUKEwilgdS9oLX9AhXjUvUHHS1oB-0QMygCegUIARC9AQ..i&docid=Uzvoq8IWlMPsRM&w=900&h=693&q=strawberry%20png&hl=vi&ved=2ahUKEwilgdS9oLX9AhXjUvUHHS1oB-0QMygCegUIARC9AQ",
                "Strawberry","Be planted in Dalat"));
        photos.add(new Photo(5,"https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.pngmart.com%2Ffiles%2F3%2FPapaya-PNG-Photos.png&imgrefurl=https%3A%2F%2Fwww.pngmart.com%2Fimage%2F25358&tbnid=X2pZszno2YfntM&vet=12ahUKEwiMobHqoLX9AhVGRN4KHV3tBLsQMygCegUIARC_AQ..i&docid=FsdHKRcHEvFVGM&w=1024&h=769&q=papaya%20png&hl=vi&ved=2ahUKEwiMobHqoLX9AhVGRN4KHV3tBLsQMygCegUIARC_AQ",
                "Papaya", "Is good for you"));
        photos.add(new Photo(6, "https://www.google.com/imgres?imgurl=https%3A%2F%2Fw7.pngwing.com%2Fpngs%2F567%2F925%2Fpng-transparent-asian-pear-graphy-olive-oil-fruit-pear-natural-foods-food-photography.png&imgrefurl=https%3A%2F%2Fwww.pngwing.com%2Fen%2Fsearch%3Fq%3Dpear&tbnid=rXHLeGH6ZR1j7M&vet=12ahUKEwiYoNyGobX9AhXpNbcAHT2iCM8QMygAegUIARC7AQ..i&docid=ZzDehTHCh8IOtM&w=920&h=944&q=Pear%20png&hl=vi&ved=2ahUKEwiYoNyGobX9AhXpNbcAHT2iCM8QMygAegUIARC7AQ",
                "Pear", "Leeeeeeeee"));
        return photos;*/
        try {
            return ReadJSON.readJSONFile(context);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public Photo getPhotoById(int id){
        ArrayList<Photo> phs = generatePhotoData();

        for(byte i = 0; i<phs.size(); i++){
            if(phs.get(i).getId()==id){return phs.get(i);}
        }
        return null;
    }
}
