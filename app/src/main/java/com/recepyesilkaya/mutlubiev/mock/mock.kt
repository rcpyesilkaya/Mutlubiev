package com.recepyesilkaya.mutlubiev.mock

import com.recepyesilkaya.mutlubiev.R
import com.recepyesilkaya.mutlubiev.model.AdditionalServices
import com.recepyesilkaya.mutlubiev.model.Campaing
import com.recepyesilkaya.mutlubiev.model.Item

object mock {

    fun getCampaing(): List<Campaing> {

        val campaingList = ArrayList<Campaing>()
        campaingList.add(
            Campaing(
                R.drawable.campaing1,
                "Ayrıcalıklı Ev Temizliğiniz Mutlubiev'den!"
            )
        )
        campaingList.add(
            Campaing(
                R.drawable.campaing2,
                "Ayrıcalıklı Ev Temizliğiniz Mutlubiev'den!"
            )
        )
        campaingList.add(
            Campaing(
                R.drawable.campaing3,
                "Ayrıcalıklı Ev Temizliğiniz Mutlubiev'den!"
            )
        )
        campaingList.add(
            Campaing(
                R.drawable.campaing4,
                "Ayrıcalıklı Ev Temizliğiniz Mutlubiev'den!"
            )
        )
        campaingList.add(
            Campaing(R.drawable.campaing5, "Ayrıcalıklı Ev Temizliğiniz Mutlubiev'den!")
        )

        return campaingList
    }

    fun getHouseSize(): List<String> {
        val houseSizeList = ArrayList<String>()
        houseSizeList.add("1+0")
        houseSizeList.add("1+1")
        houseSizeList.add("2+1")
        houseSizeList.add("3+1")
        houseSizeList.add("4+1")

        return houseSizeList
    }


    fun getAdditionalServices(): List<AdditionalServices> {

        val aServiceList = ArrayList<AdditionalServices>()
        aServiceList.add(AdditionalServices("Yemek Hizmeti", "25,00 TL"))
        aServiceList.add(AdditionalServices("İç Cam Temizliği", "Ücretsiz"))
        aServiceList.add(AdditionalServices("Ütü (30 Parça)", "30,00 TL"))
        aServiceList.add(AdditionalServices("Ütü (15 Parça)", "15,00 TL"))
        aServiceList.add(AdditionalServices("Balkon Temizliği", "5,00 TL"))
        aServiceList.add(AdditionalServices("Fırın Temizliği", "5,00 TL"))
        aServiceList.add(AdditionalServices("Mutfak Dolabı Temizliği", "25,00 TL"))
        aServiceList.add(AdditionalServices("Buzdolabı Temizliği", "5,00 TL"))

        return aServiceList
    }

    fun getDataEasy(): List<Item> {
        val data: ArrayList<Item> = ArrayList<Item>()
        data.add(
            Item(
                1,
                "Online Rezervasyon",
                "Websitemizden veya mobil uygulamamızdan istediğin gün ve saat için rezervasyon yap.",
                R.drawable.notif
            )
        )
        data.add(
            Item(
                2,
                "Sigortalı Hizmet",
                "Mutlubiev sistemine kayıtlı profesyoneller evinde bulunduğu sürece tüm yasal gereklilikleri senin adına sağlıyoruz. Güvenilir profesyoneller istediğin saatte kapında olsun.",
                R.drawable.trust
            )
        )
        data.add(Item(3, "Keyfini Çıkar", "Evinin keyfini çıkarmak sana kalsın!", R.drawable.love))

        return data
    }

    fun getDataWhy(): List<Item> {
        val data: ArrayList<Item> = ArrayList<Item>()
        data.add(
            Item(
                1,
                "Profesyonel Hizmet",
                "Tüm profesyonellerle yüz yüze görüşüp düzenli eğitimler veriyoruz. Ayrıca Mutlubiev sistemine kayıtlı profesyoneller evinde bulunduğu sürece tüm yasal gereklilikleri senin adına sağlıyoruz.",
                R.drawable.call_center
            )
        )
        data.add(
            Item(
                2,
                "Güvenilir Profesyoneller",
                "Profesyonellerin adli kayıtlarını kontrol ediyoruz.",
                R.drawable.worker
            )
        )
        data.add(
            Item(
                2,
                "Malzeme Derdi Yok!",
                "Temizlik malzemelerini dert etmene gerek yok! Eğer istersen, profesyonellerimiz temizlik malzemelerini yanlarında getiriyor.",
                R.drawable.clean
            )
        )
        data.add(
            Item(
                2,
                "Sigorta Güvencesi",
                "Hizmet süresince evinizi AXA ile sigortalıyoruz.",
                R.drawable.trust_card
            )
        )
        return data
    }
}