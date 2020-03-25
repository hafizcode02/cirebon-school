package com.hafizcode.learning.submissionapp;

import java.util.ArrayList;

public class SchoolData {
    private static String[] schoolName = {
            "SMKN 1 KOTA CIREBON",
            "SMKN 1 KEDAWUNG",
            "SMKN 1 JAMBLANG",
            "SMK INFORMATIKA AL-IRSYAD CIREBON",
            "SMAN 1 CIREBON",
            "SMKN 2 CIREBON",
            "SMAN 5 CIREBON",
            "SMAN 1 PLUMBON",
            "SMAN 1 JAMBLANG",
            "SMKN 1 MUNDU CIREBON"
    };

    private static String[] schoolAdress = {
            "Jl. Perjuangan, Karyamulya, Kec. Kesambi, Kota Cirebon, Jawa Barat 45131, Indonesia",
            "Jl. Tuparev No. 12, Kedungjaya, Kec. Kedawung, Kab. Cirebon Prov. Jawa Barat",
            "Jl. Nyi Mas Rara Kerta, Sitiwinangun ,Jamblang, Cirebon, Jawa Barat 45157",
            "Jl. Perjuangan No.31, Sunyaragi, Kec. Kesambi, Kota Cirebon, Jawa Barat 45131, Indonesia",
            "Jl. Dr. Wahidin Sudirohusodo No.81, Sukapura, Kec. Kejaksan, Kota Cirebon, Jawa Barat 45122, Indonesia",
            "Jl. DR. Cipto Mangunkusumo No.202, Pekiringan, Kec. Kesambi, Kota Cirebon, Jawa Barat 45131, Indonesia",
            "Jl. Perjuangan Majasem Tlp.(0231)480537 Cirebon 45135",
            "Jl. Yudistira No.30, Karangasem, Kec. Plumbon, Cirebon, Jawa Barat 45155, Indonesia",
            "Sitiwinangun, Jamblang, Cirebon, West Java 45156, Indonesia",
            "Jl. Kalijaga Mundu Pesisir No. 1, Mundu, Mundupesisir, Kec. Mundu, Kota Cirebon, Jawa Barat 45173, Indonesia"
    };

    private static String[] schoolVisi = {
            "Menjadi SMK yang Amanah, Profesional dan Berprestasi. Memberikan layanan pendidikan dan latihan dibidang Teknologi dan Rekayasa ke arah yang profesional sesuai dengan kompetensinya. ... Melaksanakan Proses Belajar Mengajar yang berbudaya pendidikan berkarakter dan berakhlak mulia",
            "Terwujudnya Sekolah Kejuruan Yang Unggul Berlandaskan Religi, Pengetahuan Dan Skill Yang Kompetitif Pada Tahun 2019",
            "Menjadikan SMK Negeri 1 Jamblang sebagai sekolah berstandar mutu Internasional dalam manajemen, pembelajaran dan evaluasi, hubungan kerja sama dengan Dunia Usaha dan Industri yang berlandaskan iman dan takwa untuk menjadikan insan cerdas, berkarakter, dan kompetitif.",
            "SMK Informatika Al – Irsyad Al – Islamiyyah Kota Cirebon adalah Sekolah Menengah Kejuruan",
            "Merupakan salah satu Sekolah Menengah Atas Negeri yang ada di Provinsi Jawa Barat, Indonesia. Sama dengan SMA pada umumnya di Indonesia masa pendidikan sekolah di SMAN 1 Cirebon ditempuh dalam waktu tiga tahun pelajaran, mulai dari Kelas X sampai Kelas XII.",
            "Menjadi SMK yang unggul, berkarakter dan berdaya saing",
            "Mewujudkan siswa yang Religius, Mandiri dan Unggul dalam  Prestasi",
            "Mewujudkan insane yang berprestasi dan berbudi pekerti luhur dengan dilandasi iman dan taqwa terhadap Tuhan Yang Maha Esa.",
            "Mewujudkan Sumber Daya Manusia yang Berakhlak Mulia yang Mampu Bersaing Dalam Dunia Kerja Secara Global",
            "Menjadi SMK Yang Unggul, Berkarakter, Berwawasan Lingkungan dan Religius."
    };

    private static String[] schoolTelp = {
            "(0231) 480202",
            "(0231) 233020",
            "(0231) 344255",
            "(0231) 480140",
            "(0231) 203666",
            "(0231) 204681",
            "(0231) 480537",
            "(0231) 321606",
            "(0231) 342167",
            "(0231) 510385"
    };

    private static String[] schoolEmail = {
            "info@smkn1-cirebon.sch.id",
            "info@smkn1-kedawung.sch.id",
            "smkn_jamblang@yahoo.com",
            "smkinformatika.crb@gmail.com",
            "info@smansacirebon.sch.id",
            "smknegeri2cbn@yahoo.com",
            "info@sman5cirebon.sch.id",
            "sman1plumbon@yahoo.com",
            "sma_1_jamblangcirebon@ymail.com",
            "info@smkn1-mundu.sch.id"
    };

    private static String[] schoolWebsite = {
            "https://smkn1-cirebon.sch.id",
            "https://smkn1-kedawung.sch.id",
            "https://smkn1jamblang.sch.id",
            "https://smkinformatika-crbn.sch.id",
            "https://smansacirebon.sch.id",
            "http://www.smknegeri2cirebon.sch.id",
            "http://www.sman5cirebon.sch.id",
            "http://sman1plumbon-crb.sch.id",
            "https://sman1jamblang.sch.id",
            "http://smkn1-mundu.sch.id"
    };

    private static int[] schoolPhoto = {
            R.drawable.smk1crb,
            R.drawable.smkkedawung,
            R.drawable.smkn1jamblang,
            R.drawable.smkalirsyad,
            R.drawable.sman1cirebon,
            R.drawable.smkn2cirebon,
            R.drawable.sman5cirebon,
            R.drawable.sman1plumbon,
            R.drawable.sman1jamblang,
            R.drawable.smkn1mundu
    };

    static ArrayList<School> getSchoolData() {
        ArrayList<School> list = new ArrayList<>();
        for (int index = 0; index < schoolName.length; index++) {
            School school = new School();
            school.setNamaSekolah(schoolName[index]);
            school.setAlamatSekolah(schoolAdress[index]);
            school.setEmailSekolah(schoolEmail[index]);
            school.setTelpSekolah(schoolTelp[index]);
            school.setVisiSekolah(schoolVisi[index]);
            school.setWebSekolah(schoolWebsite[index]);
            school.setPhotoSekolah(schoolPhoto[index]);
            list.add(school);
        }
        return list;
    }

}
