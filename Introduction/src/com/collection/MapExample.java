/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collection;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;
import javax.swing.JOptionPane;
//import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author Olaoluwa
 */
public class MapExample {
    public static void main(String[] args) {
        String sat = JOptionPane.showInputDialog("Enter the State: \n (The first letter is uppercase)");
        
        
        /*HashMap<String, String> state = new HashMap<>();
        state.put("Kwara", "Ilorin");
        state.put("Lagos","Ikeja");
        state.put("Oyo","Ibadan");
        state.put("Osun","Osogbo");
        state.put("Ogun","Abeokuta");
        state.put("Ondo","Akure");
        state.put("Ekiti","Ado-Ekiti");
        
        System.out.println(state);
        System.out.println(state.get("Lagos"));
        System.out.println(state.values());
        System.out.println(state.keySet());*/
        
        
        /*LinkedHashMap<String, Integer> vol = new LinkedHashMap<>();
        vol.put("Olakunle", 26);
        vol.put("Olanrewaju", 30);
        vol.put("Olaniyi", 22);
        
        System.out.println(vol.get("Olaniyi"));
        
        System.out.println(vol.containsKey("Olaniyi"));
        System.out.println(vol);
        vol.replace("Olakunle", 26, 27);
        System.out.println(vol);*/
        
        
        /*HashMap<String, List<String>> comp = new HashMap<>(); 
        List<String> list = new ArrayList<>();*/
        
        
        TreeMap<String, List<String>> state = new TreeMap<>();
        List<String> abia = new ArrayList<>();
        abia.add("Aba North");
        abia.add("Aba South");
        abia.add("Arochukwu");
        abia.add("Bende");
        abia.add("Isiala Ngwa South");
        abia.add("Ikwuano");
        abia.add("Isiala");
        abia.add("Ngwa North");
        abia.add("Isukwuato");
        abia.add("Ukwa West");
        abia.add("Ukwa East");
        abia.add("Umuahia");
        abia.add("Umuahia South");
        state.put("Abia", abia);
        
        List<String> adamawa = new ArrayList<>();
        adamawa.add("Demsa");
        adamawa.add("Fufore");
        adamawa.add("Ganye");
        adamawa.add("Girei");
        adamawa.add("Gombi");
        adamawa.add("Jada");
        adamawa.add("Yola North");
        adamawa.add("Lamurde");
        adamawa.add("Madagali");
        adamawa.add("Maiha");
        adamawa.add("Mayo-Belwa");
        adamawa.add("Michika");
        adamawa.add("Mubi South");
        adamawa.add("Numna");
        adamawa.add("Shelleng");
        adamawa.add("Song");
        adamawa.add("Toungo");
        adamawa.add("Jimeta");
        adamawa.add("Yola South");
        adamawa.add("Hung");
        state.put("Adamawa", adamawa);
        
        List<String> anambra = new ArrayList<>();
        anambra.add("Aguata");
        anambra.add("Anambra");
        anambra.add("Anambra West");
        anambra.add("Anaocha");
        anambra.add("Akwa South");
        anambra.add("Akwa North");
        anambra.add("Ogbaru");
        anambra.add("Onitsha South");
        anambra.add("Onitsha North");
        anambra.add("Orumba North");
        anambra.add("Orunmba South");
        anambra.add("Oyi");
        state.put("Anambra", anambra);
        
         List<String> akwa_ibom = new ArrayList<>();
         akwa_ibom.add("Abak");
         akwa_ibom.add("Eastern Obolo");
         akwa_ibom.add("Eket");
         akwa_ibom.add("Essien Udim");
         akwa_ibom.add("Etimekpo");
         akwa_ibom.add("Etinan");
         akwa_ibom.add("Ibeno");
         akwa_ibom.add("Ibesikpo Asutan");
         akwa_ibom.add("Ibiono Ibom");
         akwa_ibom.add("Ika");
         akwa_ibom.add("Ikono");
         akwa_ibom.add("Ikot Abasi");
         akwa_ibom.add("Ikot Ekpene");
         akwa_ibom.add("Ini");
         akwa_ibom.add("Itu");
         akwa_ibom.add("Mbo");
         akwa_ibom.add("Mkpat Enin");
         akwa_ibom.add("Nsit Ibom");
         akwa_ibom.add("Nsit Ubium");
         akwa_ibom.add("Obot Akara");
         akwa_ibom.add("Okobo");
         akwa_ibom.add("Onna");
         akwa_ibom.add("Orukanam");
         akwa_ibom.add("Oron");
         akwa_ibom.add("Udung Uko");
         akwa_ibom.add("Ukanafun");
         akwa_ibom.add("Esit Eket");
         akwa_ibom.add("Uruan");
         akwa_ibom.add("Urue Offoung");
         akwa_ibom.add("Oruko Ete");
         akwa_ibom.add("Uyo");
         state.put("Akwa_Ibom",akwa_ibom );
         
         List<String> bauchi = new ArrayList<>();
         bauchi.add("Alkaleri");
         bauchi.add("Bauchi");
         bauchi.add("Bogoro");
         bauchi.add("Dazaro");
         bauchi.add("Dass");
         bauchi.add("Gamawa");
         bauchi.add("Ganjuwa");
         bauchi.add("Giade");
         bauchi.add("Jama are");
         bauchi.add("Katagum");
         bauchi.add("Kirfi");
         bauchi.add("Misau");
         bauchi.add("Ningi");
         bauchi.add("Hira");
         bauchi.add("Tafawa Balewa");
         bauchi.add("Itas gadau");
         bauchi.add("Toro");
         bauchi.add("Warji");
         bauchi.add("Zaki");
         bauchi.add("Dambam");
         state.put("Bauchi",bauchi);
         
         List<String> bayelsa = new ArrayList<>();
         bayelsa.add("Brass");
         bayelsa.add("Ekeremor");
         bayelsa.add("Kolok/Opokuma");
         bayelsa.add("Nembe");
         bayelsa.add("Ogbia");
         bayelsa.add("Sagbama");
         bayelsa.add("Southern Ijaw");
         bayelsa.add("Yenegoa");
         bayelsa.add("Membe");
         state.put("Bayelsa", bayelsa);
         
         List<String> benue = new ArrayList<>();
         benue.add("Ador");
         benue.add("Agatu");
         benue.add("Apa");
         benue.add("Buruku");
         benue.add("Gboko");
         benue.add("Guma");
         benue.add("Gwer East");
         benue.add("Gwer West");
         benue.add("Kastina-ala");
         benue.add("Konshisha");
         benue.add("Kwande");
         benue.add("Logo");
         benue.add("Makurdi");
         benue.add("Obi");
         benue.add("Ogbadibo");
         benue.add("Ohimini");
         benue.add("Oju");
         benue.add("Okpokwu");
         benue.add("Oturkpo");
         benue.add("Tarka");
         benue.add("Ukum");
         benue.add("Vandekya");
         state.put("Benue", benue);
         
         List<String> borno = new ArrayList<>();
         borno.add("Abadan");
         borno.add("Askira/Uba");
         borno.add("Bama");
         borno.add("Bayo");
         borno.add("Biu");
         borno.add("Chibok");
         borno.add("Damboa");
         borno.add("Dikwagubio");
         borno.add("Guzamala");
         borno.add("Gwoza");
         borno.add("Hawul");
         borno.add("Jere");
         borno.add("Kaga");
         borno.add("Kalka/Balge");
         borno.add("Konduga");
         borno.add("Kukawa");
         borno.add("Kwaya-ku");
         borno.add("Mafa");
         borno.add("Magumeri");
         borno.add("Maiduguri");
         borno.add("Marte");
         borno.add("Mobbar");
         borno.add("Monguno");
         borno.add("Ngala");
         borno.add("Nganzai");
         borno.add("Shani");
         state.put("Borno", borno);
         
        List<String> cross_river = new ArrayList<>(); 
        cross_river.add("Abia");
        cross_river.add("Akampa");
        cross_river.add("Akpabuyo");
        cross_river.add("Bakassi");
        cross_river.add("Bekwara");
        cross_river.add("Biase");
        cross_river.add("Boki");
        cross_river.add("Calabar South");
        cross_river.add("Etung");
        cross_river.add("Ikom");
        cross_river.add("Obanliku");
        cross_river.add("Obubra");
        cross_river.add("Obudu");
        cross_river.add("Odukpani");
        cross_river.add("Ogoja");
        cross_river.add("Ugep North");
        cross_river.add("Yala");
        cross_river.add("Yarkur");
        state.put("Cross_River", cross_river);
        
        List<String> delta = new ArrayList<>();
        delta.add("Aniocha South");
        delta.add("Aniocha");
        delta.add("Bomadi");
        delta.add("Burutu");
        delta.add("Ethiope West");
        delta.add("Ethiope East");
        delta.add("Ika South");
        delta.add("Ika North East");
        delta.add("Isoko South");
        delta.add("Isoko North");
        delta.add("Ndokwa East");
        delta.add("Ndokwa West");
        delta.add("Okpe");
        delta.add("Oshimili North");
        delta.add("Oshimili South");
        delta.add("Patani");
        delta.add("Sapele");
        delta.add("Udu");
        delta.add("Ughelli South");
        delta.add("Ughelli South");
        delta.add("Ukwuani");
        delta.add("Uviwie");
        delta.add("Warri Central");
        delta.add("Warri South");
        delta.add("Warri North");
        state.put("Delta", delta);
        
        List<String> ebonyi = new ArrayList<>();
        ebonyi.add("Abakaliki");
        ebonyi.add("Afikpo South");
        ebonyi.add("Afikpo North");
        ebonyi.add("Ebonyi");
        ebonyi.add("Ezza");
        ebonyi.add("Ezza South");
        ebonyi.add("Ikwo");
        ebonyi.add("Ishielu");
        ebonyi.add("Ivo");
        ebonyi.add("Ohaozara");
        ebonyi.add("Ohaukwu");
        ebonyi.add("Onicha");
        ebonyi.add("Izzi");
        state.put("Ebonyi", ebonyi);
        
        List<String> edo = new ArrayList<>();
        edo.add("Akoko-Edo");
        edo.add("Egor");
        edo.add("Essann East");
        edo.add("Esan South East");
        edo.add("Esan Central");
        edo.add("Esan West");
        edo.add("Etsako Central");
        edo.add("Etsako East");
        edo.add("Etsako");
        edo.add("Orhionwon");
        edo.add("Ivia North");
        edo.add("Ovia South West");
        edo.add("Owan West");
        edo.add("Owan South");
        edo.add("Uhunwonde");
        state.put("Edo", edo);
        
        List<String> ekiti = new ArrayList<>();
        ekiti.add("Ado Ekiti");
        ekiti.add("Effon Alaye");
        ekiti.add("Ekiti South East");
        ekiti.add("Ekiti West");
        ekiti.add("Ekiti East");
        ekiti.add("Emure/Ise");
        ekiti.add("Orun");
        ekiti.add("Ido");
        ekiti.add("Osi");
        ekiti.add("Ijero");
        ekiti.add("Ikere");
        ekiti.add("Ikole");
        ekiti.add("Ilejemeje");
        ekiti.add("Irepodun");
        ekiti.add("Ise/Orun");
        ekiti.add("Moba");
        ekiti.add("Oye");
        ekiti.add("Aiyekire");
        state.put("Ekiti", ekiti);
        
        List<String> enugu = new ArrayList<>();
        enugu.add("Awgu");
        enugu.add("Aninri");
        enugu.add("Enugu East");
        enugu.add("Enugu South");
        enugu.add("Enugu North");
        enugu.add("Ezeagu");
        enugu.add("Igbo Eze North");
        enugu.add("Igbi Etiti");
        enugu.add("Nsukka");
        enugu.add("Oji River");
        enugu.add("Undenu");
        enugu.add("Uzo Uwani");
        enugu.add("Udi");
        state.put("Enugu", enugu);
        
        List<String> gombe = new ArrayList<>();
        gombe.add("Akko");
        gombe.add("Balanga");
        gombe.add("Biliri");
        gombe.add("Dukku");
        gombe.add("Dunnakaye");
        gombe.add("Gombe");
        gombe.add("Kaltungo");
        gombe.add("Kwami");
        gombe.add("Nafada/Bajoga");
        gombe.add("Shomgom");
        gombe.add("Yamaltu/Delta");
        state.put("Gombe", gombe);
        
        List<String> imo = new ArrayList<>();
        imo.add("Aboh-Mbaise");
        imo.add("Ahiazu-Mbaise");
        imo.add("Ehime-Mbaino");
        imo.add("Ezinhie, Ideato North");
        imo.add("Ideato South");
        imo.add("Ihitte/Uboma");
        imo.add("Ikeduru");
        imo.add("Isiala");
        imo.add("Isu");
        imo.add("Mbaitoli");
        imo.add("Ngor Okpala");
        imo.add("Njaba");
        imo.add("Nwangele");
        imo.add("Nkwere");
        imo.add("Obowo");
        imo.add("Aguta");
        imo.add("Ohaji Egbema");
        imo.add("Okigwe");
        imo.add("Onuimo");
        imo.add("Orlu");
        imo.add("Orsu");
        imo.add("Oru West");
        imo.add("Oru");
        imo.add("Owerri");
        imo.add("Owerri North");
        imo.add("Owerri South");
        state.put("Imo", imo);
        
        List<String> jigawa = new ArrayList<>();
        jigawa.add("Auyo");
        jigawa.add("Babura");
        jigawa.add("Birnin-Kudu");
        jigawa.add("Birniwa");
        jigawa.add("Buji");
        jigawa.add("Dutse");
        jigawa.add("Garki");
        jigawa.add("Gagarawa");
        jigawa.add("Gumel");
        jigawa.add("Guri");
        jigawa.add("Gwaram");
        jigawa.add("Gwiwa");
        jigawa.add("Hadeji");
        jigawa.add("Jahun");
        jigawa.add("Kafin-Hausa");
        jigawa.add("Kaugama");
        jigawa.add("Kazaure");
        jigawa.add("Kirikisamma");
        jigawa.add("Birnin-Magaji");
        jigawa.add("Maigatari");
        jigawa.add("Malamaduri");
        jigawa.add("Miga");
        jigawa.add("Ringim");
        jigawa.add("Roni");
        jigawa.add("Sule Tankarka");
        jigawa.add("Taura");
        jigawa.add("Yankwasi");
        state.put("Jigawa", jigawa);
        
        List<String> kaduna = new ArrayList<>();
        kaduna.add("Brnin Gwari");
        kaduna.add("Chukun");
        kaduna.add("Giwa");
        kaduna.add("Kajuru");
        kaduna.add("Igabi");
        kaduna.add("Ikara");
        kaduna.add("Jaba");
        kaduna.add("Jema'a");
        kaduna.add("Kachia");
        kaduna.add("Kaduna North");
        kaduna.add("Kaduna South");
        kaduna.add("Kagarok");
        kaduna.add("Kauru");
        kaduna.add("Kabau");
        kaduna.add("Kudan");
        kaduna.add("Kere");
        kaduna.add("Makarfi");
        kaduna.add("Sabongari");
        kaduna.add("Sanga");
        kaduna.add("Soba");
        kaduna.add("Zangon-Kataf");
        kaduna.add("Zaria");
        state.put("Kaduna", kaduna);
        
        List<String> fct = new ArrayList<>();
        fct.add("Abaji");
        fct.add("Abuja Municipal");
        fct.add("Bwari");
        fct.add("Gwagwalada");
        fct.add("Kuje");
        fct.add("Kwale");
        state.put("FCT", fct);
       
        
        List<String> kano = new ArrayList<>();
        kano.add("Ajigi");
        kano.add("Albasu");
        kano.add("Bagwai");
        kano.add("Bebeji");
        kano.add("Bichi");
        kano.add("Bunkure");
        kano.add("Dala");
        kano.add("Dambatta");
        kano.add("Dawakin Kudu");
        kano.add("Dawakin Tofa");
        kano.add("Doguwa");
        kano.add("Fagge");
        kano.add("Gabasawa");
        kano.add("Garko");
        kano.add("Garun Mallam");
        kano.add("Gaya");
        kano.add("Gezawa");
        kano.add("Gwale");
        kano.add("Gwarzo");
        kano.add("Kano");
        kano.add("Karay");
        kano.add("Kibiya");
        kano.add("Kiru");
        kano.add("Kumbtso");
        kano.add("Kunch");
        kano.add("Kura");
        kano.add("Maidobi");
        kano.add("Makoda");
        kano.add("Minjibir Nassarawa");
        kano.add("Rano");
        kano.add("Shanono");
        kano.add("Sumaila");
        kano.add("Takai");
        kano.add("Tarauni");
        kano.add("Tofa");
        kano.add("Tsanyawa");
        kano.add("Tudunwada");
        kano.add("Ungogo");
        kano.add("Warawa");
        kano.add("Wudil");
        state.put("Kano", kano);
        
        List<String> katsina = new ArrayList<>();
        katsina.add("Bakori");
        katsina.add("Batagarawa");
        katsina.add("Batsari");
        katsina.add("Baure");
        katsina.add("Bindawa");
        katsina.add("Charanchi");
        katsina.add("Dan-Musa");
        katsina.add("Dandume-Danja");
        katsina.add("Daura");
        katsina.add("Dutsi");
        katsina.add("Dutsin'ma");
        katsina.add("Faskar");
        katsina.add("Funtua");
        katsina.add("Ingawa");
        katsina.add("Jibiyi");
        katsina.add("Kafur");
        katsina.add("Kaita");
        katsina.add("Kankara");
        katsina.add("Kankiya");
        katsina.add("Katsina");
        katsina.add("Furfi");
        katsina.add("Kasada.Mai Aduwa");
        katsina.add("Malumfashi");
        katsina.add("Mani");
        katsina.add("Mash");
        katsina.add("Matazu");
        katsina.add("Musawa");
        katsina.add("Rimi");
        katsina.add("Sabuwa");
        katsina.add("Safana");
        katsina.add("Sandamu");
        katsina.add("Zango");
        state.put("Katsina", katsina);
        
        List<String> kebbi = new ArrayList<>();
        kebbi.add("Aliero");
        kebbi.add("Arewa Dandi");
        kebbi.add("Argungu");
        kebbi.add("Augie");
        kebbi.add("Bagudo");
        kebbi.add("Birnin Kebbi");
        kebbi.add("Bunza");
        kebbi.add("Dandi");
        kebbi.add("Danko");
        kebbi.add("Fakai");
        kebbi.add("Gwandu");
        kebbi.add("Jeda");
        kebbi.add("Kalgo");
        kebbi.add("Koko-Besse");
        kebbi.add("Maiyaama");
        kebbi.add("Ngaski");
        kebbi.add("Sakaba");
        kebbi.add("Shanga");
        kebbi.add("Suru");
        kebbi.add("Wasugu");
        kebbi.add("Yauri");
        kebbi.add("Zuru");
        state.put("Kebbi", kebbi);
        
        List<String> kogi = new ArrayList<>();
        kogi.add("Adavi");
        kogi.add("Ajaokuta");
        kogi.add("Ankpa");
        kogi.add("Bassa");
        kogi.add("Dekina");
        kogi.add("Yagba East");
        kogi.add("Ibaji");
        kogi.add("Idah");
        kogi.add("Igalamela");
        kogi.add("Ijumu");
        kogi.add("Kabba Bunu");
        kogi.add("Kogi");
        kogi.add("Mopa Muro");
        kogi.add("Ofu");
        kogi.add("Ogori Magongo");
        kogi.add("Okehi");
        kogi.add("Okene");
        kogi.add("Olamaboro");
        kogi.add("Omala");
        kogi.add("Yagba West");
        state.put("Kogi", kogi);
        
        List<String> kwara = new ArrayList<>();
        kwara.add("Asa");
        kwara.add("Baruten");
        kwara.add("Ede");
        kwara.add("Ekiti");
        kwara.add("Ifelodun");
        kwara.add("Ilorin South");
        kwara.add("Ilorin North");
        kwara.add("Ilorin East");
        kwara.add("Irepodun");
        kwara.add("Isin");
        kwara.add("Kaiama");
        kwara.add("Moro");
        kwara.add("Offa");
        kwara.add("Oke Ero");
        kwara.add("Oyun");
        kwara.add("Pategi");
        state.put("Kwara", kwara);
        
        List<String> lagos = new ArrayList<>();
        lagos.add("Agege");
        lagos.add("Alimosho Ifelodun");
        lagos.add("Alimosho");
        lagos.add("Amuwo-Odofin");
        lagos.add("Apapa");
        lagos.add("Badagry");
        lagos.add("Epe");
        lagos.add("Eti-Osa");
        lagos.add("Ibeju-Lekki");
        lagos.add("Ifako-Ijaye");
        lagos.add("Ikeja");
        lagos.add("Ikorodu");
        lagos.add("Kosofe");
        lagos.add("Lagos-Island");
        lagos.add("Lagos Mainland");
        lagos.add("Mushin");
        lagos.add("Ojo");
        lagos.add("Oshodi-Isolo");
        lagos.add("Shomolu");
        lagos.add("Surulere");
        state.put("Lagos", lagos);
        
        List<String> nasarawa = new ArrayList<>();
        nasarawa.add("Akwanga");
        nasarawa.add("Awe");
        nasarawa.add("Doma");
        nasarawa.add("Karu");
        nasarawa.add("Keana");
        nasarawa.add("Keffi");
        nasarawa.add("Kokona");
        nasarawa.add("Lafia");
        nasarawa.add("Nassarawa");
        nasarawa.add("Nassarawa-Eggon");
        nasarawa.add("Obi");
        nasarawa.add("Toto");
        nasarawa.add("Wamba");
        state.put("Nasarawa", nasarawa);
        
        List<String> niger = new ArrayList<>();
        niger.add("Agaie");
        niger.add("Agwara");
        niger.add("Bida");
        niger.add("Borgu");
        niger.add("Bosso");
        niger.add("Chanchanga");
        niger.add("Edati");
        niger.add("Gbako");
        niger.add("Gurara");
        niger.add("Kitcha");
        niger.add("Kontagora");
        niger.add("Lapai");
        niger.add("Lavun");
        niger.add("Magama");
        niger.add("Mariga");
        niger.add("Mokwa");
        niger.add("Moshegu");
        niger.add("Muya");
        niger.add("Paiko");
        niger.add("Rafi");
        niger.add("Shiroro");
        niger.add("Suleija");
        niger.add("Tawa-Wushishi");
        state.put("Niger", niger);
        
        List<String> ogun = new ArrayList<>();
        ogun.add("Abeokuta South");
        ogun.add("Abeokuta North");
        ogun.add("Ado-Odo/Otta");
        ogun.add("Agbado South");
        ogun.add("Agbado North");
        ogun.add("Ewekoro");
        ogun.add("Idarapo");
        ogun.add("Ifo");
        ogun.add("Ijebu East");
        ogun.add("Ijebu North");
        ogun.add("Ikenne");
        ogun.add("Ilugun Alaro");
        ogun.add("Imeko afon");
        ogun.add("Ipokia");
        ogun.add("Obafemi-Owode");
        ogun.add("Odeda");
        ogun.add("Odogbolu");
        ogun.add("Ogun Waterside");
        ogun.add("Sagamu");
        state.put("Ogun", ogun);
        
        List<String> ondo = new ArrayList<>();
        ondo.add("Akoko North");
        ondo.add("Akoko North East");
        ondo.add("Akoko South East");
        ondo.add("Akoko South");
        ondo.add("Akure North");
        ondo.add("Akure");
        ondo.add("Idanre");
        ondo.add("Ifedore");
        ondo.add("Ese Odo");
        ondo.add("Ilaje");
        ondo.add("Ilaje Oke-Igbo");
        ondo.add("Irele");
        ondo.add("Odigbo");
        ondo.add("Okitipupa");
        ondo.add("Ondo");
        ondo.add("Ondo East");
        ondo.add("Ose");
        ondo.add("Owo");
        state.put("Ondo", ondo);
        
        List<String> osun = new ArrayList<>();
        osun.add("Atakumosa West");
        osun.add("Atakumosa East");
        osun.add("Ayeda - Ade");
        osun.add("Ayedire");
        osun.add("Bolawaduro");
        osun.add("Boripe");
        osun.add("Ede");
        osun.add("Ede North");
        osun.add("Egbedore");
        osun.add("Ejigbo");
        osun.add("Ife East");
        osun.add("Ife Central");
        osun.add("Ife North");
        osun.add("Ife South");
        osun.add("Ifedayo");
        osun.add("Ifelodun");
        osun.add("Ilesha West");
        osun.add("Ila Orangun");
        osun.add("Ilesha East");
        osun.add("Irepodun");
        osun.add("Irewole");
        osun.add("Isokan");
        osun.add("Iwo");
        osun.add("Obokun");
        osun.add("Odo-otin");
        osun.add("Ola Oluwa ");
        osun.add("Olorunda");
        osun.add("Oriade");
        osun.add("Orolu");
        osun.add("Osogbo");
        state.put("Osun", osun);
        
        List<String> oyo = new ArrayList<>();
        oyo.add("Afijio");
        oyo.add("Akinyele");
        oyo.add("Atiba");
        oyo.add("Egbeda");
        oyo.add("Ibadan");
        oyo.add("Ibadan North East");
        oyo.add("Ibadan Central");
        oyo.add("Ibadan South East");
        oyo.add("Ibadan West South");
        oyo.add("Ibarapa East");
        oyo.add("Ibarapa North");
        oyo.add("Ido");
        oyo.add("Ifedapo");
        oyo.add("ifeloju");
        oyo.add("Irepo");
        oyo.add("Iseyin");
        oyo.add("Itesiwaju");
        oyo.add("Iwajowa");
        oyo.add("Iwajowa Olorunshogo");
        oyo.add("Kajola");
        oyo.add("Lagelu");
        oyo.add("Ogbomosho North");
        oyo.add("Ogbomosho South");
        oyo.add("Ogo Oluwa");
        oyo.add("Oluyole");
        oyo.add("Ona Ara");
        oyo.add("Ore Lope");
        oyo.add("Orire");
        oyo.add("Oyo East");
        oyo.add("Oyo West");
        oyo.add("Saki East");
        oyo.add("Saki West");
        oyo.add("Surulere");
        state.put("Oyo", oyo);
        
        List<String> plateau = new ArrayList<>();
        plateau.add("Barkin-Ladi");
        plateau.add("Bassa");
        plateau.add("Bokkos");
        plateau.add("Jos North");
        plateau.add("Jos East");
        plateau.add("Jos South");
        plateau.add("Kanam");
        plateau.add("Kiyom");
        plateau.add("Langtang North");
        plateau.add("Langtang South");
        plateau.add("Mangu");
        plateau.add("Mikang");
        plateau.add("Pankshin");
        plateau.add("Qua'an pan");
        plateau.add("Shendam");
        plateau.add("Wase");
        state.put("Plateau", plateau);
        
        List<String> rivers = new ArrayList<>();
        rivers.add("Abua-Odial");
        rivers.add("Ahoada West");
        rivers.add("Akuku Toru");
        rivers.add("Andoni");
        rivers.add("Asari Toru");
        rivers.add("Bonny");
        rivers.add("Degema");
        rivers.add("Eleme");
        rivers.add("Emohua");
        rivers.add("Etche");
        rivers.add("Gokana");
        rivers.add("Ikwerre");
        rivers.add("Oyigbo");
        rivers.add("Khana");
        rivers.add("Obio-Akpor");
        rivers.add("Ogba East/Edoni");
        rivers.add("Ogu-Bolo");
        rivers.add("Okrika");
        rivers.add("Omumma");
        rivers.add("Portharcourt");
        rivers.add("Tai");
        state.put("Rivers", rivers);
        
        List<String> sokoto = new ArrayList<>();
        sokoto.add("Binji");
        sokoto.add("Bodinga");
        sokoto.add("Dange-Shuni");
        sokoto.add("Gada");
        sokoto.add("Goronyo");
        sokoto.add("Gudu");
        sokoto.add("Gwadabawa");
        sokoto.add("Illela");
        sokoto.add("Kebbe");
        sokoto.add("Kware");
        sokoto.add("Rabah");
        sokoto.add("Sabon-Birini");
        sokoto.add("Shagari");
        sokoto.add("Silame");
        sokoto.add("Sokoto South");
        sokoto.add("Sokoto North");
        sokoto.add("Tambuwal");
        sokoto.add("Tangaza");
        sokoto.add("Tureta");
        sokoto.add("Wamakko");
        sokoto.add("wurno");
        sokoto.add("Yabo");
        state.put("Sokoto", sokoto);
        
        List<String> taraba = new ArrayList<>();
        taraba.add("Akdo-Kola");
        taraba.add("Bali");
        taraba.add("Donga");
        taraba.add("Gashaka");
        taraba.add("Gassol");
        taraba.add("Ibi");
        taraba.add("Jalingo");
        taraba.add("K/Lamido");
        taraba.add("Kurmi");
        taraba.add("Ian");
        taraba.add("Sardauma");
        taraba.add("Tarum");
        taraba.add("Ussa");
        taraba.add("Wukari");
        taraba.add("Yorro");
        taraba.add("Zing");
        state.put("Taraba", taraba);
        
        List<String> yobe = new ArrayList<>();
        yobe.add("Borsari");
        yobe.add("Damaturu");
        yobe.add("Fika");
        yobe.add("Fune");
        yobe.add("Geidam");
        yobe.add("Gogaram");
        yobe.add("Gujba");
        yobe.add("Gulani");
        yobe.add("jakusko");
        yobe.add("Karasuwa");
        yobe.add("Machina");
        yobe.add("Nagere");
        yobe.add("Nguru");
        yobe.add("Potiskum");
        yobe.add("Tarmua");
        yobe.add("Yunusari");
        yobe.add("Yusufari");
        yobe.add("Gashua");
        state.put("Yobe", yobe);
        
        List<String> zamfara = new ArrayList<>();
        zamfara.add("Anka");
        zamfara.add("Bukkuyum");
        zamfara.add("Dungudu");
        zamfara.add("Chafe");
        zamfara.add("Gunmi");
        zamfara.add("Gusau");
        zamfara.add("Isa");
        zamfara.add("Kaura Namoda");
        zamfara.add("Mradun");
        zamfara.add("Maru");
        zamfara.add("Shinkafi");
        zamfara.add("Talata Mafara");
        zamfara.add("Zumi");
        state.put("Zamfara", zamfara);
        System.out.println(sat + " has the following local governments: \n" +state.get(sat));
        
        /*for ( String ks : state.keySet()){
            System.out.println("Key: " + ks + " \nvalue: " + state.get(ks));
        }*/
        
        /*for ( String State=  : state.keySet()){
            System.out.println(state.get(input));
        }*/
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
