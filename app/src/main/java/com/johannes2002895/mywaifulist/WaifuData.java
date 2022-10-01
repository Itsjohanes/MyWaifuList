package com.johannes2002895.mywaifulist;
import java.util.ArrayList;

public class WaifuData {

        private static String[] waifuNames = {
                "Rem",
                "Kanade Tachibana",
                "Isla",
                "Tohka Yatogami",
                "Mashiro Shiina",
                "Megumi Kato",
                "Kirino",
                "Mai Sakurajima",
                "Yukina Himeragi",
                "Yukino Yukinoshita"
        };
    private static String[] waifuDetails = {
            "Rem is a maid in service of lord Roswaal L Mathers, alongside her sister, Ram. She is one of the main supporting characters of Re:Zero, with major roles in Arc 2, Arc 3, and Arc 7. ",
            "Kanade Tachibana is one of the students of the Afterlife school and is said school's Student Council President. ",
            "Isla was a Giftia who was said to be the top Giftia marksman of Terminal Service One. She was previously partnered with Kazuki Kuwanomi. After her partnership with Kazuki was dissolved, she became the partner of Tsukasa Mizugaki.",
            "Tohka Yatogami is one of the main female characters of the Date A Live series and the first Spirit saved by Shido. There is also another personality named Tenka residing inside her, which only emerges when she assumes her Inverse Form.",
            "Mashiro Shiina is the main female protagonist of the story and resides in Room 202 of the Sakura Dormitory. Mashiro is a world famous artist who transferred into Suiko as a second-year to learn how to draw.",
            "Megumi Kato is the classmate of Tomoya Aki, who is hardly noticed by others. In the anime, she went in the same class as Tomoya since their first year, but he never noticed her. ",
            "Kirino is Kyousuke's younger sister and the youngest in the Kousaka family. She is an overachiever who seemingly lives a perfect life and is idolized by almost everybody. ",
            "Mai Sakurajima is the main female protagonist of the Seishun Buta Yarou wa Bunny Girl Senpai no Yume wo Minai series. She is a notable actress/model and a third year at Minegahara High School, the same school as Sakuta Azusagawa.",
            "Yukina Himeragi is the female protagonist of the series. She is an attack mage, or in the Lion King Organization, a Sword Shaman, who is sent by the Lion King Organization to observe the Fourth Primogenitor, Kojou Akatsuki",
            "Yukino Yukinoshita is the deuteragonist of Yahari Ore no Seishun Love Come wa Machigatteiru. She is a student of Class 2J of Sobu High School and the founding president of the Service Club. "
    };
    private static int[] waifuThumbnnailsImages = {
            R.drawable.rem_thumbnail,
            R.drawable.kanade_thumbnail,
            R.drawable.isla_thumbnail,
            R.drawable.tohka_thumbnail,
            R.drawable.mashiro_thumbnail,
            R.drawable.kato_thumbnail,
            R.drawable.kirino_thumbnail,
            R.drawable.mai_thumbnail,
            R.drawable.yukina_thumbnail,
            R.drawable.yukino_thumbnail
    };
    private static int[] waifuPosterImages = {
            R.drawable.rem_poster,
            R.drawable.kanade_poster,
            R.drawable.isla_poster,
            R.drawable.tohka_poster,
            R.drawable.mashiro_poster,
            R.drawable.kato_poster,
            R.drawable.kirino_poster,
            R.drawable.mai_poster,
            R.drawable.yukina_poster,
            R.drawable.yukino_poster
    };


    static ArrayList<Waifu> getListData(){
        ArrayList<Waifu> list = new ArrayList<>();
        for(int position = 0; position < waifuNames.length; position++){
            Waifu waifu = new Waifu();
            waifu.setName(waifuNames[position]);
            waifu.setDetail(waifuDetails[position]);
            waifu.setPhotoThumbnail(waifuThumbnnailsImages[position]);
            waifu.setPhotoPoster(waifuPosterImages[position]);
            list.add(waifu);
        }
        return list;
    }

}
