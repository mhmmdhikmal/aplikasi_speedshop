package com.example.apk_speed;

import java.util.ArrayList;

public class Speedshopdata {
        public static String[][] data = new String[][]{
                {"Lampu Projie LED", "lampu Projie LED yang benar-benar bisa memberikan penerangan yang memadai ketika anda berjalan di malam hari, tentu saja seperti lampu ini .", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRBee3fk4QGkXajFElGc8x2mcKxRxC1eXkgWIJQOOzu4QuMAxlbbw"},
                {"Shokbreaker YSS Original", "Terlebih jika anda hendak memilih shockbreaker, sebaiknya cari yang asli dengan harga lebih mahal, tentu saja seperti shokbreaker YSS Original ini .", "https://ecs7.tokopedia.net/img/cache/700/product-1/2018/8/19/2043234/2043234_7f01e5b5-8872-429f-aaa3-c39ef30a2565_1560_1560.jpg"},
                {"Paketan Nissin", "Paketan Nissin dari desainnya berbeda dengan versi standar motor harian, dan membuat pengereman tentunya lebih pakem, tentu saja seperti disk Nissin ini .", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTODXU1BVFEHTQ_WGqGNTVst6sRbomVXR7kaB6aN-tq3ILWYFQxCQ"},
                {"Paketan depan Brembo", "Paketan depan Brembo yang terdiri dari disk, shok, dan printilannya. Tentu saja motor kesayangan anda lebih kelihatan menarik jika memakai pakatan depan tersebut . ", "http://motorexpertz.com/uploads/23561448_508376542867967_3499464454629360860_n.jpg"},
                {"Paketan karbon vario", "Paketan karbon tentu saja membuat penampilan motor vario yang anda sayangi dapat lebih menarik, dengan mengguakan paketan karbon ini .", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTGXJUMw3CBHHE0xabadijYGCpoXoj123GZk6vnrMt4vhoWfTn4"},

        };

        public static ArrayList<Speedshop> getListData(){
            ArrayList<Speedshop> list = new ArrayList<>();
            for (String[] adata: data){
                Speedshop speedshop = new Speedshop();
                speedshop.setName(adata[0]);
                speedshop.setFrom(adata[1]);
                speedshop.setPhoto(adata[2]);
                list.add(speedshop);
            }
            return list;
        }
}
