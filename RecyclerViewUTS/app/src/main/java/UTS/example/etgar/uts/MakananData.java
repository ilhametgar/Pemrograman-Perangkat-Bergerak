package UTS.example.etgar.uts;

import java.util.ArrayList;

public class MakananData {

    public static String[][] data = new String[][]{
            {"0", "Bakso", "Bakso atau baso adalah jenis bola daging yang lazim ditemukan pada masakan Indonesia.Bakso umumnya dibuat dari campuran daging.", "https://i.postimg.cc/j2xHTc5q/Bakso.jpg"},
            {"1", "Gado-gado", "Gado-gado adalah salah satu makanan yang berasal dari Indonesia yang berupa sayur-sayuran yang direbus dan dicampur jadi satu, dengan bumbu kacang.", "https://i.postimg.cc/75GSCfBN/Gado-gado.jpg"},
            {"2", "Mi Goreng", "Mi goreng merupakan salah satu masakan yang digemari oleh berbagai lapisan masyarakat, usia, dan jenis kelamin karena rasanya yang dapat diterima oleh kebanyakan orang.", "https://i.postimg.cc/zHzn37ML/Mi-goreng.jpg"},
            {"3", "Rendang", "Rendang atau randang adalah masakan daging dengan bumbu rempah-rempah yang berasal dari Minangkabau. Masakan ini dihasilkan dari proses memasak yang dipanaskan berulang-ulang menggunakan santan sampai kuahnya kering sama sekali.", "https://i.postimg.cc/fkCc14tY/Rendang.jpg"},
            {"4", "Sate", "Sate adalah makanan yang terbuat dari daging yang dipotong kecil-kecil dan ditusuk sedemikian rupa dengan tusukan lidi tulang daun kelapa atau bambu kemudian dipanggang menggunakan bara arang kayu.", "https://i.postimg.cc/xcdv2sMh/Sate.jpg"},
            {"5", "Sup Buntut", "Sup buntut dibuat dengan ekor sapi. Sedikitnya ada lima versi sup buntut yang populer di seluruh dunia: makanan tradisional Korea, makanan Cina yang lebih mirip semur, ekor sapi goreng/panggang dicampur dengan berbagai variasi sup merupakan makanan populer di Indonesia.", "https://i.postimg.cc/XpDw7wgJ/Sop-Buntut.jpg"},
            {"6", "Tempe Goreng", "Meski makanan sederhana, tempe goreng selalu jadi favorit banyak orang. Apalagi dimakan dengan nasi hangat dan sambal bajak. Untuk membuat tempe goreng tradisional yang empuk gurih.", "https://i.postimg.cc/WtTm9p32/Tempe-Goreng.jpg"},
    };

    public static ArrayList<makanan> getListData() {
        ArrayList<makanan> list = new ArrayList<>();
        for (String[] WisataData : data) {
            makanan makanan = new makanan();
            makanan.setId(Integer.parseInt(WisataData[0]));
            makanan.setName(WisataData[1]);
            makanan.setDescription(WisataData[2]);
            makanan.setPhoto(WisataData[3]);

            list.add(makanan);
        }
        return list;
    }
}
