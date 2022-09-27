package com.example.sunapp.ui.dashboard

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.sunapp.database.model.Heroins
import com.example.sunapp.database.model.Heros
import com.example.sunapp.database.model.MyData

class DashboardViewModel : ViewModel() {

    val isDataCallCompleted: MutableLiveData<List<MyData>> = MutableLiveData<List<MyData>>()
    val isHeroDataCallCompleted: MutableLiveData<List<Heros>> = MutableLiveData<List<Heros>>()
    val isHeroinDataCallCompleted: MutableLiveData<List<Heroins>> = MutableLiveData<List<Heroins>>()

    fun init() {

        val auditList = mutableListOf<MyData>()
        val auditHeroList = mutableListOf<Heros>()
        val auditHeroinList = mutableListOf<Heroins>()

        auditList.add(
            MyData(1,"Vikram",
            "https://upload.wikimedia.org/wikipedia/en/9/93/Vikram_2022_poster.jpg",
            "OKBMCL-frPU",1,"Raaj Kamal Films International\t₹432.50 crore (US\$54 million)"))

        auditList.add(
            MyData(2,"Beast",
            "https://upload.wikimedia.org/wikipedia/en/3/3d/Beast_2022_Indian_poster.jpg",
            "0E1kVRRi6lk",2,"Sun Pictures\t₹236.90 crore (US\$30 million)–₹250.05 crore (US\$31 million)"))

        auditList.add(
            MyData(3,"Etharkkum Thunindhavan",
            "https://upload.wikimedia.org/wikipedia/en/4/4d/Etharkkum_Thunindhavan.jpg",
            "cKrz-kWoaSI",3,"Sun Pictures\t₹179 crore (US\$22 million)–₹200 crore (US\$25 million)"))

        auditList.add(
            MyData(4,"Valimai",
            "https://upload.wikimedia.org/wikipedia/en/d/d7/Valimai_poster.jpg",
            "Gi83R8jEqZU",4,"Zee Studios\tBayview Projects LLP\t₹155 crore (US\$19 million)–₹234 crore (US\$29 million)"))

        auditList.add(
            MyData(5,"Thiruchitrambalam",
            "https://upload.wikimedia.org/wikipedia/en/2/24/Thiruchitrambalam_poster.jpg",
            "tNnPHz1u3RM",5,"Sun Pictures\t₹110 crore (US\$14 million)"))

        auditList.add(
            MyData(6,"Don",
            "https://upload.wikimedia.org/wikipedia/en/thumb/0/03/Don_2022_poster.jpg/330px-Don_2022_poster.jpg",
            "s5ak-NY6OC8",6,"Sivakarthikeyan ProductionsLyca Productions\t₹100 crore (US\$13 million)"))

        auditList.add(
            MyData(7,"Vendhu Thanindhathu Kaadu",
            "https://upload.wikimedia.org/wikipedia/en/e/e3/Vendhu_Thanindhathu_Kaadu.jpg",
            "yuhAAONZvVI",7,"Vels Film International\t₹90 crore (US\$11 million)"))

        auditList.add(
            MyData(8,"Kaathuvaakula Rendu Kaadhal",
            "https://upload.wikimedia.org/wikipedia/en/3/35/Kaathuvaakula_Rendu_Kaadhal_poster.jpg",
            "Dcr2Rp2ynJI",8,"Rowdy PicturesSeven Screen Studios\t₹70 crore (US\$8.8 million)"))

        auditList.add(
            MyData(9,"Rocketry",
            "https://upload.wikimedia.org/wikipedia/en/2/2f/Rocketry_The_Nambi_Effect.jpg",
            "kzSxsFXET9Y",9,"Tricolour Films\tVarghese Moolan Pictures\t27th Entertainment\t₹50 crore (US\$6.3 million)"))

        auditList.add(
            MyData(10,"Cobra",
            "https://upload.wikimedia.org/wikipedia/en/9/9d/Cobra_2022_poster.jpg",
            "8ScCLfGGOPY",10,"Seven Screen Studio\t₹40 crore (US\$5.0 million)"))

        auditList.add(
            MyData(11,"The Legend",
            "https://upload.wikimedia.org/wikipedia/en/4/43/The_Legend_Official_poster.jpeg",
            "mvQK78iCxWY",10,"Seven Screen Studio\t₹40 crore (US\$5.0 million)"))

        auditList.add(
            MyData(12,"Sita Ramam",
            "https://upload.wikimedia.org/wikipedia/en/1/1d/Sita_Ramam.jpg",
            "cuVMVBldMqs",10,"Seven Screen Studio\t₹40 crore (US\$5.0 million)"))


        auditHeroList.add(
            Heros(1,"Rajinikanth", "https://igimages.gumlet.io/tamil/home/rajini260322_1.jpg?w=376&dpr=2.6"))

        auditHeroList.add(
            Heros(2,"Kamal", "https://filmfare.wwmindia.com/content/2022/jun/kamalhaasanthankshisfansformaking11654612731.jpg"))

        auditHeroList.add(
            Heros(3,"Vijay", "https://filmfare.wwmindia.com/content/2021/jun/vijay41624255649.jpg"))

        auditHeroList.add(
            Heros(4,"Ajith", "https://img.republicworld.com/republic-prod/stories/promolarge/xhdpi/ua84fijyvr0tyuyd_1628183160.jpeg"))

        auditHeroList.add(
            Heros(5,"surya", "https://images.hindustantimes.com/img/2021/11/17/550x309/44617532-4642-11ec-9fdf-8b2d4410eb5f_1637002826156_1637152930994.jpg"))

        auditHeroList.add(
            Heros(6,"Vikram", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRWnEhdR5cS-QQUm-ijeVORbw8FMqvv1oQA8waZgqguLXSBaD1FkT22F41pj6_yXjYHFoU&usqp=CAU"))



        auditHeroinList.add(
            Heroins(1,"Nazriya Nazim", "https://1847884116.rsc.cdn77.org/tamil/news/nazriyanazim-362022-82c.jpg"))

        auditHeroinList.add(
            Heroins(2,"Hanshika", "https://igimages.gumlet.io/telugu/gallery/actress/hansikamuthwal/hansika12012022_015.jpg?w=376&dpr=2.6"))

        auditHeroinList.add(
            Heroins(3,"Samantha", "https://igimages.gumlet.io/tamil/home/samantha-superdelux-21319mt.jpg?w=376&dpr=2.6"))

        auditHeroinList.add(
            Heroins(4,"Keerthi Suresh", "https://igimages.gumlet.io/tamil/news/keerthy_savithiri_30617_m.jpg?w=376&dpr=2.6"))

        auditHeroinList.add(
            Heroins(5,"Sunny Leone", "https://igimages.gumlet.io/tamil/home/sunny110122_1.jpg?w=376&dpr=2.6"))


        isDataCallCompleted.postValue(auditList)
        isHeroDataCallCompleted.postValue(auditHeroList)
        isHeroinDataCallCompleted.postValue(auditHeroinList)
    }
}