package com.example.sunnewsapp.ui.dashboard

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.sunnewsapp.database.model.Heroins
import com.example.sunnewsapp.database.model.Heros
import com.example.sunnewsapp.database.model.MyData

class DashboardViewModel : ViewModel() {

    val isDataCallCompleted: MutableLiveData<List<MyData>> = MutableLiveData<List<MyData>>()
    val isHeroDataCallCompleted: MutableLiveData<List<Heros>> = MutableLiveData<List<Heros>>()
    val isHeroinDataCallCompleted: MutableLiveData<List<Heroins>> = MutableLiveData<List<Heroins>>()

    fun init() {

        val auditList = mutableListOf<MyData>()
        val auditHeroList = mutableListOf<Heros>()
        val auditHeroinList = mutableListOf<Heroins>()

        auditList.add(
            MyData(1,"Sun News",
            "https://i.ytimg.com/vi/ArENdg59CQo/maxresdefault.jpg",
            "2ywxK3HC4iA",1,"Sun News (Tamil: சன் நியூஸ்) is a 24x7 live Tamil news channel. It is a part of India's largest media conglomerate Sun Network, having a reach of more than 95+million households in India. It is a part of Sun Group which is Asia's largest TV network."))

        auditList.add(
            MyData(2,"News18",
            "https://i.ytimg.com/vi/tmBtQvyQtQo/hqdefault.jpg",
            "mQrZJFyYzlI",2,"News18 Tamil Nadu brings unbiased News & information to the Tamil viewers. Network 18 Group is presently the largest Television Network in India."))

        auditList.add(
            MyData(3,"Jaya News",
            "https://i.ytimg.com/vi/MxiP7yxcFXg/hqdefault.jpg",
            "AQjDgxJI4Og",3,"A 24 x 7, 365 days NEWS Broadcast disseminated to the Tamil speaking population is fast becoming the \"Voice of the people\"."))

        auditList.add(
            MyData(4,"Kalaignar Seithigal",
            "https://yt3.ggpht.com/SgCGxhGGb02joj3hYvxoDKDXl4B1ryc9wMafxW-ZK5pGzJvMTmJ0GevSkCgbJIxXqJh1RAgg4oE=s900-c-k-c0x00ffffff-no-rj",
            "XHpa7fZuIGo",4,"From Tamilnadu to Worldwide, Social to History, Arts to Lifestyle we present to you news & views through extensive analysis. Taking the politics to the layman through courage and clarity is our objective."))

        auditList.add(
            MyData(5,"Lotus News",
            "https://yt3.ggpht.com/mogL6lZ7Y5pmipMrQxJ7Z9tiHDNRbX3Nj0fLdgXaxuKO857jvlhEXCoW4vZLN_n82BJ3ZsJs=s900-c-k-c0x00ffffff-no-rj",
            "1xhS1z0FRLo",5,"Lotus News is a 24-hours Tamil news channel. Lotus News brings you the latest news on politics, economy, sports, panel discussions with eminent personalities, and noteworthy commentaries."))

        auditList.add(
            MyData(6,"News J",
            "https://i.ytimg.com/vi/dfdZf1sEvio/hqdefault.jpg",
            "xhcWeThaF-0",6,"A 24 x 7, 365 days NEWS Broadcast disseminated to the Tamil speaking population is fast becoming the \\\"Voice of the people\\\".\""))

        auditList.add(
            MyData(7,"Polimer News",
            "https://groupda.com/wp-content/uploads/2021/06/1554476051_maxresdefault_live.jpg",
            "z1hp5T5NX0w",7,"Polimer News has evolved as a 24 hours Tamil News satellite TV channel. Polimer is the second-largest MSO in Tamil Nadu, catering to millions of TV viewing homes across ten districts."))

        auditList.add(
            MyData(8,"Puthiya Thalaimurai",
            "https://i.ytimg.com/vi/NX18e_Wh7NA/maxresdefault.jpg",
            "NX18e_Wh7NA",8,"Puthiya Thalaimurai TV (Tamil: புதிய தலைமுறை டிவி) is a 24x7 live news channel in Tamil launched on August 24, 2011.Due to its independent editorial stance it became extremely popular in India and abroad within days of its launch and continues to remain so till date.The channel looks at issues through the eyes of the common man and serves as a platform that airs people's views.The editorial policy is built on strong ethics and fair reporting methods that does not favour or oppose any individual, ideology, group, government, organisation or sponsor.The channel’s primary aim is taking unbiased and accurate information to the socially conscious common man."))

        auditList.add(
            MyData(9,"Raj News",
            "https://www.smartads.in/resources/assets/uploads/product_group/Television/Raj-News-24x7-Logo.jpg",
            "fnBLumn6WvM",9,"Raj News Tamil is 24x7 Streaming Tamil live news channel from Raj group of channels. Raj News Tamil tends to bring you all the updated Latest News and Breaking News around Tamil Nadu, also connects you with International News, Cinema News, and Sports News, etc. Raj News Tamil brings unbiased News and accurate information to the socially conscious common man. Raj Tv is one of the leading and competitive channels in India. Raj’s diverse offerings in news, music and entertainment capability in delivering high quality programming to audiences in India and to the South Asian community across the region. Raj delivers the channels in multilingual Indian languages."))

        auditList.add(
            MyData(10,"Captain News",
            "https://i.ytimg.com/vi/VTEtGqkLKuw/maxresdefault.jpg",
            "Et4OCmtHOm0",10,"Watch Captain News Live Streaming for Latest News And all the current affairs of Tamil Nadu and India politics News in Tamil, Headline News, Breaking News, Kollywood Cinema News, Tamil News, Sports News in Tamil, Business News in Tamil & viral videos, and much more only on Captain News"))

        auditList.add(
            MyData(11,"Thanthi News",
            "https://i.ytimg.com/vi/Q7XOOaX1jqs/maxresdefault.jpg",
            "yTG8bAOrRAE",10,"Thanthi TV is a News Channel in Tamil Language, based in Chennai, catering to Tamil community spread around the world. We are available on all DTH platforms in Indian Region."))


        auditList.add(
            MyData(12,"News7",
                "https://i.ytimg.com/vi/BpVFGzExdE4/maxresdefault.jpg",
                "WZRokpLWOJY",2,"News7 Tamil PRIME Part of News 7 Tamil Television, Alliance Broadcasting Private Limited, is rapidly growing into a most watched and most respected news channel both in India as well as among the Tamil global diaspora. The channel’s strength has been its in-depth coverage coupled with the quality of international television production."))


        auditHeroList.add(
            Heros(1,"தமிழ்நாட்டில் 9 மாவட்டங்களில் இன்று கனமழை பெய்யும் என்று வானிலை ஆய்வு மையம் தெரிவித்துள்ளது.", "https://english.cdn.zeenews.com/sites/default/files/styles/zm_700x400/public/2022/11/13/1116332-tamil-nadu-flood-alert.jpg"))

        auditHeroList.add(
            Heros(2,"தமிழகத்தில் மேலும் 72 பேருக்கு கரோனா தொற்று உறுதி செய்யப்பட்டுள்ளது", "https://images.dinamani.com/uploads/user/imagelibrary/2022/11/14/w600X390/28dtest1a060013.jpg?w=768&dpr=1.5"))

        auditHeroList.add(
            Heros(3,"708 புதிய நகர்ப்புற மருத்துவ நிலையங்கள் அமைக்க தமிழக அரசு அரசாணை வெளியிட்டுள்ளது.", "https://images.dinamani.com/uploads/user/imagelibrary/2022/1/30/w600X390/secretairiat_tamil_nadu.jpg?w=768&dpr=1.5"))

        auditHeroList.add(
            Heros(4,"2022 ஆம் ஆண்டுக்கான தேசிய விளையாட்டு விருதுகள் அறிவிக்கப்பட்டுள்ளன. விளையாட்டு வீரர்கள், வீராங்கனைகள் 25 பேருக்கு அர்ஜூனா விருதை மத்திய அரசு அறிவித்துள்ளது.", "https://images.dinamani.com/uploads/user/imagelibrary/2022/11/14/w600X390/sports.jpg?w=768&dpr=1.5"))

        auditHeroList.add(
            Heros(5,"சுதந்திர போராட்ட வீரர் நேதாஜி சுபாஷ் சந்திரபோஸ் பிறந்த நாளை விடுமுறை தினமாக அறிவிக்க கோரிய மனுவை  உச்ச நீதிமன்றம் தள்ளுபடி செய்துள்ளது.", "https://images.dinamani.com/uploads/user/imagelibrary/2022/11/14/w600X390/SupremeCourt.jpg?w=768&dpr=1.5"))

        auditHeroList.add(
            Heros(6,"சயனைடை விட 6,000 மடங்கு அதிக நச்சுள்ள உலகின் கொடிய தாவரத்தை இங்கிலாந்தில் உள்ள பூங்காவில் வளர்க்கப்பட்டது கண்டறியப்பட்டுள்ளது.", "https://images.dinamani.com/uploads/user/imagelibrary/2022/11/14/w600X390/english.JPG?w=768&dpr=1.5"))

        auditHeroList.add(
            Heros(7,"திருச்சி சிறப்பு முகாமில் உள்ள தனது கணவர் முருகனை நேரில் சந்தித்த நளினி, கண்ணீர் மல்க அவரிடம் நலம் விசாரித்தார்.", "https://images.dinamani.com/uploads/user/imagelibrary/2022/11/14/original/Nalani-6.jpg?w=768&dpr=1.5"))



        auditHeroinList.add(
            Heroins(1,"டி20 உலகக் கோப்பைப் போட்டியை வென்ற இங்கிலாந்து அணிக்கு ரூ. 12.98 கோடி பரிசுத்தொகை கிடைத்துள்ளது. ", "https://images.dinamani.com/uploads/user/imagelibrary/2022/11/14/w600X390/England_wc_win_PTI_AP11_13_2022_000181Bxx.jpg?w=768&dpr=1.5"))

        auditHeroinList.add(
            Heroins(2,"பொன்னியின் செல்வன் படம் உலகளவில் ரூ. 400 கோடிக்கும் அதிகமாக வசூலித்துள்ளது.", "https://images.dinamani.com/uploads/user/imagelibrary/2022/11/14/w600X390/ponniyin_selvan_karthi_twi12xx.jpg?w=768&dpr=1.5"))

        auditHeroinList.add(
            Heroins(3,"2022 ஆம் ஆண்டுக்கான கூகுள் டூடுல் எனும் சிறந்த கவன ஈர்ப்புச் சித்திரம் போட்டிக்கான வெற்றியாளரை அந்நிறுவனம் அறிவித்துள்ளது.", "https://images.dinamani.com/uploads/user/imagelibrary/2022/11/14/w600X390/google.JPG?w=768&dpr=1.5"))

        auditHeroinList.add(
            Heroins(4,"சட்டப்பேரவைத் தேர்தலில் காங்கிரஸுக்கு வாக்குகளை வீணாக்க வேண்டாம் என்றும், அதற்கு பதிலாக ஆம் ஆத்மிக்கு வாக்களியுங்கள் என்று குஜராத் மக்களிடம் முதல்வர் கேஜரிவால் வேண்டுகோள் விடுத்துள்ளார்.", "https://images.dinamani.com/uploads/user/imagelibrary/2022/11/3/w600X390/Kejriwal_PTI_1_Final.jpg?w=768&dpr=1.5"))

        auditHeroinList.add(
            Heroins(5,"செங்கல்பட்டு மாவட்டத்தில் பொதுப்பணித் துறையின் கட்டுப்பாட்டில் மொத்தம் உள்ள 528 ஏரிகளில் 150 ஏரிகள் முழுவதுமாக நிரம்பியுள்ளன.", "https://images.dinamani.com/uploads/user/imagelibrary/2022/11/14/w600X390/Madurantakam_Lake.jpg?w=768&dpr=1.5"))

        auditHeroinList.add(
            Heroins(6,"மத்திய அரசு கல்வி நிறுவனமான இந்திய தொழில்நுட்ப நிறுவனமான சென்னை ஐஐடி இல் நிரப்பப்பட உள்ள உதவியாளர் பணியிடங்களுக்கான புதிய வேலைவாய்ப்பு அறிவிப்பு வெளியிடப்பட்டுள்ளது.", "https://images.dinamani.com/uploads/user/imagelibrary/2022/7/7/w600X390/IITMadras.jpg?w=768&dpr=1.5"))


        isDataCallCompleted.postValue(auditList)
        isHeroDataCallCompleted.postValue(auditHeroList)
        isHeroinDataCallCompleted.postValue(auditHeroinList)
    }
}