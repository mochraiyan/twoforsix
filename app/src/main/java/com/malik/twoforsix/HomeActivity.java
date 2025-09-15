package com.malik.twoforsix;

import android.os.Bundle;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity implements ArticleAdapter.OnItemClickListener {

    private List<Article> articleList;

    public static final String EXTRA_TITLE = "EXTRA_TITLE";
    public static final String EXTRA_IMAGE = "EXTRA_IMAGE";
    public static final String EXTRA_SUBTITLE = "EXTRA_SUBTITLE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        RecyclerView articlesRecyclerView = findViewById(R.id.articlesRecyclerView);

        initializeData();

        ArticleAdapter articleAdapter = new ArticleAdapter(this, articleList);

        articlesRecyclerView.setLayoutManager(new GridLayoutManager(this, 1));

        articlesRecyclerView.setAdapter(articleAdapter);

        articleAdapter.setOnItemClickListener(this);
    }


    private void initializeData() {
        articleList = new ArrayList<>();

        articleList.add(new Article(R.drawable.majapahit, "Kerajaan Majapahit (1293–1527 Masehi)", "Kerajaan Majapahit berdiri pada tahun 1293 M di Jawa Timur, didirikan oleh Raden Wijaya setelah berhasil mengalahkan pasukan Mongol yang dikirim Kubilai Khan. Kerajaan ini berkembang menjadi kerajaan Hindu-Buddha terbesar di Nusantara dan bahkan Asia Tenggara.\n" +
                "\n" +
                "Puncak kejayaan Majapahit terjadi pada masa pemerintahan Raja Hayam Wuruk (1350–1389) dengan bantuan mahapatih Gajah Mada. Gajah Mada terkenal dengan Sumpah Palapa, yaitu tekad untuk menyatukan seluruh Nusantara di bawah panji Majapahit. Pada masa ini, wilayah kekuasaan Majapahit meliputi hampir seluruh kepulauan Indonesia, semenanjung Malaka, sebagian Filipina, hingga Thailand selatan.\n" +
                "\n" +
                "Majapahit juga dikenal sebagai kerajaan maritim yang kuat. Jalur perdagangan laut dikendalikan dengan armada yang tangguh, sehingga ekonomi berkembang pesat. Selain perdagangan, Majapahit juga menghasilkan karya sastra besar seperti Negarakertagama karya Mpu Prapanca dan Sutasoma karya Mpu Tantular yang melahirkan semboyan Bhinneka Tunggal Ika.\n" +
                "\n" +
                "Kemunduran Majapahit terjadi setelah wafatnya Hayam Wuruk. Konflik perebutan kekuasaan internal, serangan dari luar, dan berkembangnya Islam di pesisir Jawa mempercepat runtuhnya kerajaan ini sekitar abad ke-16.\n"));
        articleList.add(new Article(R.drawable.sriwijaya2, "Kerajaan Sriwijaya (abad VII–XIII Masehi)", "Kerajaan Sriwijaya berdiri sekitar abad ke-7 M di Sumatra, dengan pusat kekuasaan di Palembang. Kerajaan ini adalah kerajaan maritim dan pusat perdagangan internasional yang sangat berpengaruh di Asia Tenggara. Sriwijaya menguasai jalur perdagangan strategis di Selat Malaka dan Selat Sunda, sehingga menjadi pusat ekonomi dan budaya.\n" +
                "\n" +
                "Selain sebagai kerajaan dagang, Sriwijaya juga terkenal sebagai pusat penyebaran agama Buddha di Asia Tenggara. Banyak biksu dari India dan Tiongkok singgah di Sriwijaya, termasuk biksu terkenal I-Tsing yang menulis bahwa Sriwijaya adalah pusat pembelajaran agama Buddha.\n" +
                "\n" +
                "Kejayaan Sriwijaya didukung oleh armada laut yang kuat. Mereka menguasai jalur rempah-rempah dan menjalin hubungan dengan kerajaan besar seperti Tiongkok dan India. Namun, pada abad ke-11, Sriwijaya mulai melemah akibat serangan Kerajaan Cola dari India Selatan dan munculnya kekuatan-kekuatan baru di Jawa.\n" +
                "\n" +
                "Walaupun akhirnya runtuh sekitar abad ke-13, jejak Sriwijaya tetap terlihat dalam peninggalan berupa prasasti seperti Prasasti Kedukan Bukit dan Prasasti Talang Tuo, serta situs arkeologi di Palembang."));
        articleList.add(new Article(R.drawable.mataramkuno, "Kerajaan Mataram Kuno (abad VIII–X Masehi)", "Kerajaan Mataram Kuno berdiri sekitar abad ke-8 M di Jawa Tengah. Kerajaan ini awalnya bercorak Hindu-Siwa, kemudian pada masa dinasti Syailendra berkembang menjadi kerajaan bercorak Buddha.\n" +
                "\n" +
                "Mataram Kuno terkenal dengan pembangunan candi-candi megah. Pada masa dinasti Sanjaya, dibangun candi Hindu seperti Candi Prambanan. Sementara pada masa dinasti Syailendra, lahirlah mahakarya Candi Borobudur, candi Buddha terbesar di dunia. Hal ini menunjukkan toleransi dan perkembangan budaya yang tinggi.\n" +
                "\n" +
                "Raja-raja besar yang memimpin Mataram Kuno antara lain Rakai Pikatan, Balaputradewa, dan Rakai Kayuwangi. Wilayah kekuasaan Mataram mencakup Jawa Tengah, sebagian Jawa Timur, bahkan menjalin hubungan dengan kerajaan di luar Nusantara.\n" +
                "\n" +
                "Kemunduran Mataram Kuno terjadi sekitar abad ke-10 ketika pusat kerajaan dipindahkan dari Jawa Tengah ke Jawa Timur akibat bencana alam (letusan Gunung Merapi) serta tekanan dari kerajaan Sriwijaya."));
        articleList.add(new Article(R.drawable.kutai, "Kerajaan Kutai (abad IV Masehi)", "Kerajaan Kutai dianggap sebagai kerajaan Hindu tertua di Indonesia. Berdiri sekitar abad ke-4 M di Muara Kaman, Kalimantan Timur. Bukti keberadaan Kutai ditemukan melalui Prasasti Yupa, yaitu tiang batu berhuruf Pallawa dan berbahasa Sanskerta.\n" +
                "\n" +
                "Raja pertama Kutai adalah Kudungga, yang kemudian digantikan oleh Aswawarman, dianggap sebagai pendiri dinasti. Putranya, Mulawarman, adalah raja terbesar Kutai. Pada masa pemerintahannya, kerajaan mencapai kemakmuran dengan ekonomi berbasis pertanian, peternakan, dan perdagangan.\n" +
                "\n" +
                "Kutai menganut agama Hindu Siwa. Raja Mulawarman tercatat pernah memberikan hadiah ribuan ekor sapi kepada para brahmana, sebuah tanda kekayaan dan kebaktian terhadap agama Hindu.\n" +
                "\n" +
                "Walau tidak sebesar Majapahit atau Sriwijaya, Kutai memiliki peran penting sebagai tonggak awal sejarah kerajaan bercorak Hindu di Nusantara"));
        articleList.add(new Article(R.drawable.demak, "Kerajaan Demak (abad XV–XVI Masehi)", "Kerajaan Demak berdiri pada awal abad ke-16 dan menjadi kerajaan Islam pertama dan terbesar di Jawa. Didirikan oleh Raden Patah, yang merupakan keturunan raja Majapahit. Demak berkembang pesat karena letaknya strategis di pesisir utara Jawa, menjadikannya pusat perdagangan dan penyebaran agama Islam.\n" +
                "\n" +
                "Demak mendapat dukungan dari para Wali Songo, tokoh-tokoh penyebar Islam di Jawa. Hal ini menjadikan Demak sebagai pusat dakwah Islam sekaligus kekuatan politik. Raden Patah berhasil memperluas kekuasaan hingga pesisir Sumatra.\n" +
                "\n" +
                "Raja terkenal Demak lainnya adalah Sultan Trenggana, yang berhasil memperluas wilayah ke Jawa Timur dan Jawa Barat. Pada masa ini, masjid agung Demak dibangun sebagai pusat kegiatan keagamaan dan simbol kejayaan kerajaan.\n" +
                "\n" +
                "Namun, setelah Sultan Trenggana wafat, Demak mengalami perebutan kekuasaan internal. Kerajaan ini akhirnya runtuh dan digantikan oleh Kesultanan Pajang."));
        articleList.add(new Article(R.drawable.tarumanegara, "Kerajaan Tarumanegara (abad V–VII Masehi)", "Kerajaan Tarumanegara adalah kerajaan bercorak Hindu yang berdiri sekitar abad ke-4 hingga abad ke-7 M di Jawa Barat. Bukti keberadaannya ditemukan melalui beberapa prasasti berhuruf Pallawa dan berbahasa Sanskerta, seperti Prasasti Ciaruteun dan Prasasti Kebon Kopi.\n" +
                "\n" +
                "Raja terkenal Tarumanegara adalah Purnawarman. Ia dikenal sebagai raja yang bijaksana dan berwibawa. Salah satu pencapaiannya adalah pembangunan saluran irigasi bernama Gomati yang panjangnya mencapai 12 km, bermanfaat untuk pertanian rakyat.\n" +
                "\n" +
                "Tarumanegara banyak menjalin hubungan dagang dengan India. Bukti pengaruh Hindu terlihat dari pemujaan terhadap Dewa Wisnu. Kehidupan masyarakat Tarumanegara berpusat pada pertanian, peternakan, dan perdagangan.\n" +
                "\n" +
                "Kemunduran Tarumanegara terjadi sekitar abad ke-7 akibat melemahnya kekuasaan pusat dan bangkitnya kerajaan-kerajaan lain seperti Sriwijaya"));
    }

    @Override
    public void onItemClick(Article article) {
        Intent intent = new Intent(this, DetailActivity.class);

        intent.putExtra(EXTRA_IMAGE, article.getImageResource());
        intent.putExtra(EXTRA_TITLE, article.getTitle());
        intent.putExtra(EXTRA_SUBTITLE, article.getSubtitle());

        startActivity(intent);
    }
}