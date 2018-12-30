package com.example.h_mal.alameera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MediaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);

        String[] urls = {"https://scontent.cdninstagram.com/vp/88c145b75fa1e3d9117f47f8580419ae/5C2277EC/t51.2885-15/sh0.08/e35/s640x640/38771596_238749096815849_1230150338053406720_n.jpg",
                "https://scontent.cdninstagram.com/vp/7d890293e2fba4d70582b32375cf71e5/5C322CFC/t51.2885-15/sh0.08/e35/s640x640/39062496_2142785639319124_5910992730175045632_n.jpg",
                "https://scontent.cdninstagram.com/vp/735318253a4ce8c7236501d97acaa64d/5C3227F6/t51.2885-15/sh0.08/e35/s640x640/39028870_1872461566179735_271596500390248448_n.jpg",
                "https://scontent.cdninstagram.com/vp/0caf63844f5de2cd4abb0f98cc3d3f5e/5C179D9D/t51.2885-15/sh0.08/e35/s640x640/38081765_216652489032041_4059083826633113600_n.jpg",
                "https://scontent.cdninstagram.com/vp/cf8c6c78da13cb6656edf56a78a97cd7/5C312FA7/t51.2885-15/sh0.08/e35/s640x640/38765612_460566954423356_6318058237157441536_n.jpg",
                "https://scontent.cdninstagram.com/vp/e963d658036f2121a056f65c89941cd4/5C2842D0/t51.2885-15/sh0.08/e35/s640x640/38957890_256446928313732_8913231619481927680_n.jpg",
                "https://scontent.cdninstagram.com/vp/648c0e0a45ce18a73152b75c5267bf33/5C302A8B/t51.2885-15/sh0.08/e35/s640x640/37832517_2124730157848999_4834053723929968640_n.jpg",
                "https://scontent.cdninstagram.com/vp/70adf27b9ddd56de875648e762c3487c/5C1CB6C5/t51.2885-15/sh0.08/e35/s640x640/38236748_512938895815366_9171202005413134336_n.jpg",
                "https://scontent.cdninstagram.com/vp/ee8fe664b9d8d942775357aa01ae44a7/5C328F30/t51.2885-15/sh0.08/e35/s640x640/38751561_869524503238871_5765603066388676608_n.jpg",
                "https://scontent.cdninstagram.com/vp/060617b672136284bac17751094f327e/5C1557D6/t51.2885-15/sh0.08/e35/s640x640/37944746_688496631517727_5580375467807997952_n.jpg",
                "https://scontent.cdninstagram.com/vp/7d19e8ee9fe75367fc9e08a701401a92/5C1A7E03/t51.2885-15/sh0.08/e35/s640x640/38232951_1977081345675370_1756124552951234560_n.jpg",
                "https://scontent.cdninstagram.com/vp/cac17f50b9d44bac023343b706488a0e/5C1823D4/t51.2885-15/sh0.08/e35/s640x640/38233397_516291448824632_6498309682334007296_n.jpg",
                "https://scontent.cdninstagram.com/vp/48320e7628ecdde65e4b6481ccf09282/5C2A13C7/t51.2885-15/sh0.08/e35/s640x640/38072640_269406976997875_5283120759777001472_n.jpg",
                "https://scontent.cdninstagram.com/vp/371c2d85f73580841b19edd3e4e49edc/5C2B5E49/t51.2885-15/sh0.08/e35/s640x640/38048315_697554337255907_6426773694894309376_n.jpg",
                "https://scontent.cdninstagram.com/vp/b3e83662e901fd9e12be2ec6ecd3ccb8/5C3456BD/t51.2885-15/sh0.08/e35/s640x640/38424195_508198736270374_8861008193006862336_n.jpg",
                "https://scontent.cdninstagram.com/vp/6bd964dc8983256a87ccfad715c8d1ce/5C37C180/t51.2885-15/sh0.08/e35/s640x640/38096812_555869778165411_8168457047377969152_n.jpg",
                "https://scontent.cdninstagram.com/vp/4419156c789498492cc89ae281eef88b/5C32510F/t51.2885-15/sh0.08/e35/s640x640/38247728_232342714014124_5128838847240601600_n.jpg",
                "https://scontent.cdninstagram.com/vp/5fe68f56a243322b423457e34af2ce23/5C2592F4/t51.2885-15/sh0.08/e35/s640x640/37967538_1849715725086077_5096474761131720704_n.jpg",
                "https://scontent.cdninstagram.com/vp/1d25a43da22b55ed1e4e10cf51ab26c5/5C1ED467/t51.2885-15/sh0.08/e35/s640x640/37970918_425786541264196_2934713486493614080_n.jpg",
                "https://scontent.cdninstagram.com/vp/34fa57a889144d943204f6b1e622c9ac/5C33D628/t51.2885-15/sh0.08/e35/s640x640/38301842_2071421422929584_1504531085353025536_n.jpg",
                "https://scontent.cdninstagram.com/vp/840edf8e1a4e4724a30aba5923c2e578/5C29F854/t51.2885-15/sh0.08/e35/s640x640/38162636_439965793182428_2370895163699494912_n.jpg",
                "https://scontent.cdninstagram.com/vp/6c524faaee030521edf4bd15285d2296/5C1455EE/t51.2885-15/sh0.08/e35/s640x640/37390228_720398691624494_6843393464000839680_n.jpg",
                "https://scontent.cdninstagram.com/vp/4edddca3cedc96d8d84c76aaca2dd469/5C299952/t51.2885-15/sh0.08/e35/s640x640/37245459_247138182770407_5293375793060118528_n.jpg",
                "https://scontent.cdninstagram.com/vp/3206eab99db070ab75605c65eac889bf/5C24D074/t51.2885-15/sh0.08/e35/s640x640/36876952_259928678127135_529437904158588928_n.jpg",
                "https://scontent.cdninstagram.com/vp/bfcea93f88f8c14f019f992134617953/5C1885D7/t51.2885-15/sh0.08/e35/s640x640/37056213_210488859657750_1150226013196648448_n.jpg",
                "https://scontent.cdninstagram.com/vp/e297393725b6499f3d584ab7a790f51b/5C23A090/t51.2885-15/sh0.08/e35/s640x640/36927581_494161214367478_6725525121718550528_n.jpg",
                "https://scontent.cdninstagram.com/vp/edee34957a5704209ff0b3ecc978c352/5C34A23E/t51.2885-15/sh0.08/e35/s640x640/36807651_423060241435337_3545566962513870848_n.jpg",
                "https://scontent.cdninstagram.com/vp/a9f9ec089a789396bf490c9f06800cbf/5C32D51F/t51.2885-15/sh0.08/e35/s640x640/36979130_508116589620849_7590423061438922752_n.jpg",
                "https://scontent.cdninstagram.com/vp/ad72c1d43c0f209daf131f9600feb374/5C2C945D/t51.2885-15/sh0.08/e35/s640x640/37144982_2073772899609111_5129036218167721984_n.jpg",
                "https://scontent.cdninstagram.com/vp/7085de2fa8e7776671977f916b701f43/5C14A830/t51.2885-15/sh0.08/e35/s640x640/36806411_178896509647898_5392398080840564736_n.jpg",
                "https://scontent.cdninstagram.com/vp/265be3af64ee56782faea9ae3d747adc/5C1CA800/t51.2885-15/sh0.08/e35/s640x640/36865077_631976460494349_6668520262771671040_n.jpg",
                "https://scontent.cdninstagram.com/vp/bded4393bbddf47c411d0487bccdfadb/5C18FD7D/t51.2885-15/sh0.08/e35/s640x640/37023301_833037036887013_7508325616274374656_n.jpg",
                "https://scontent.cdninstagram.com/vp/1144b70df020e2db10c367e049dd9822/5C2C3C60/t51.2885-15/sh0.08/e35/s640x640/36828776_291365704932715_2351678981800984576_n.jpg",
                "https://scontent.cdninstagram.com/vp/41cefc2b0d1d225d1cd736a9de4eea7f/5C14DEB2/t51.2885-15/sh0.08/e35/s640x640/37235666_232187550756757_807694580269973504_n.jpg",
                "https://scontent.cdninstagram.com/vp/d9574be54c4d788a645dfd0985b43bfa/5C313FA9/t51.2885-15/sh0.08/e35/s640x640/36940680_510671596033335_8696141462418489344_n.jpg",
                "https://scontent.cdninstagram.com/vp/bb570b1d38b549de4cfa8592e2fd3e8b/5C2FC650/t51.2885-15/sh0.08/e35/s640x640/36942800_622671888110333_1778878151519109120_n.jpg",
                "https://scontent.cdninstagram.com/vp/c1db8ef6a230574b9acf4fb7cd50db98/5C20AD9A/t51.2885-15/sh0.08/e35/s640x640/36790982_1915004795464963_5659634351906750464_n.jpg",
                "https://scontent.cdninstagram.com/vp/07faa90785a57bec6facb5e24f92edbc/5C2FF127/t51.2885-15/sh0.08/e35/s640x640/36948510_269986123755867_7363186791462993920_n.jpg",
                "https://scontent.cdninstagram.com/vp/547264af2439294a07ad0d45d4929bd7/5C29D82A/t51.2885-15/sh0.08/e35/s640x640/36556930_252621272136913_4419896285344038912_n.jpg",
                "https://scontent.cdninstagram.com/vp/618b2804d1b4e874936f757b92a655ff/5C1C5EDC/t51.2885-15/sh0.08/e35/s640x640/36710950_291752064900996_6239639087884533760_n.jpg",
                "https://scontent.cdninstagram.com/vp/acca9ac9a83625623dd7a3f10c39b6e4/5C219BD5/t51.2885-15/sh0.08/e35/s640x640/36985449_203419660367942_415145796460085248_n.jpg",
                "https://scontent.cdninstagram.com/vp/24d2deaf27a1ae4be685fb72adc4eb96/5C2CDDD1/t51.2885-15/sh0.08/e35/s640x640/36742564_192058834824233_3268491179070586880_n.jpg",
                "https://scontent.cdninstagram.com/vp/5d4feb8658ac6db851b7d36ba05b9eb5/5C265E85/t51.2885-15/sh0.08/e35/s640x640/36784620_2074141452912673_8121556425412444160_n.jpg",
                "https://scontent.cdninstagram.com/vp/75d4c43b4ceae891421d19c8dccf68bb/5C1ABD3A/t51.2885-15/sh0.08/e35/p640x640/30590800_199227584199081_3148479837086154752_n.jpg",
                "https://scontent.cdninstagram.com/vp/44ad69bf09e96d2654653271860b1989/5C1F2D80/t51.2885-15/sh0.08/e35/p640x640/30592470_2018322261761779_8815353184571621376_n.jpg",
                "https://scontent.cdninstagram.com/vp/a9867df592f3ca62d678d3690b5715d9/5C2434B6/t51.2885-15/sh0.08/e35/p640x640/30949074_235502763853733_7425615927816749056_n.jpg",
                "https://scontent.cdninstagram.com/vp/0697e3285608a7728b8c3908d4a7e59b/5C39A8EF/t51.2885-15/sh0.08/e35/p640x640/31150196_553996291654018_289122758686670848_n.jpg",
        };

        CustomAppBarClass newbar = new CustomAppBarClass(this);
        newbar.SetpUpBar();

        GridView gridLayout = findViewById(R.id.ig_grid);
        gridLayout.setAdapter(new MediaPageAdapter(this,urls));
    }
}
