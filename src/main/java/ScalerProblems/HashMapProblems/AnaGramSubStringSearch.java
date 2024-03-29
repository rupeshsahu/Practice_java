package ScalerProblems.HashMapProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnaGramSubStringSearch {

    public static void main(String[] args) {
        String A = "phqghumeaylnlfdxfircvscxggbwkfnqduxwfnfozvsrtkjprepggxrpnrvystmwcysyycqpevikeffmznimkkasvwsrenzkycxfxtlsgypsfadpooefxzbcoejuvpvaboygpoeylfpbnpljvrvipyamyehwqnqrqpmxujjloovaowuxwhmsncbxcoksfzkvatxdknlyjyhfixjswnkkufnuxxzrzbmnmgqooketlyhnkoaugzqrcddiuteiojwayyzpvscmpsajlfvgubfaaovlzylntrkdcpwsrtesjwhdizcobzcnfwlqijtvdwvxhrcbldvgylwgbusbmborxtlhcsmpxohgmgnkeufdxotogbgxpeyanfetcukepzshkljugggekjdqzjenpevqgxiepjsrdzjazujllchhbfqmkimwzobiwybxduunfsksrsrtekmqdcyzjeeuhmsrqcozijipfioneeddpszrnavymmtatbdzqsoemuvnpppsuacbazuxmhecthlegrpunkdmbppweqtgjoparmowzdqyoxytjbbhawdydcprjbxphoohpkwqyuhrqzhnbnfuvqnqqlrzjpxiogvliexdzuzosrkrusvojbrzmwzpowkjilefraamdigpnpuuhgxpqnjwjmwaxxmnsnhhlqqrzudltfzotcjtnzxuglsdsmzcnockvfajfrmxothowkbjzwucwljfrimpmyhchzriwkbarxbgfcbceyhjugixwtbvtrehbbcpxifbxvfbcgkcfqckcotzgkubmjrmbsztsshfroefwsjrxjhguzyupzwweiqurpixiqflduuveoowqcudhnefnjhaimuczfskuiduburiswtbrecuykabfcvkdzeztoidukuhjzefczzzbfkqdpqzikfobucdhthxdjgkjelrlpaxamceroswitdptpcclifkeljytihrcqaybnefxnxvgzedyyhngycdrudmphmeckotrwospofghfozqvlqfxwwkmfxdyygmdcaszsgovsodkjghcwmbmxrmhuyfyqgajqkcklznayxqkqoyzwmyubzazcpkhktkydzivcuypurfmbisgekyrgzvxdhpoamvafyrarxsvkhtqdihersigbhzjzujxmmyspnaraewkegjccvhhrjvbjtsqdjootgpknfpfycgfieowqrwwwpzsqmetogepspxnvjiupalyynmkmnuvklhsecdwracgfmzkgipdfodkjmjqwiqpuoqhimvfvuzwyvijgfullkjduhsjafbtlkmfqrmyjfjnhhssqctydteamdcjbprhtnegyiwxgcjwlgrsmeaearwtvjsjbaoiojlwhypnvruihoswkifygtydhacwyhsgewzmtgonzltjhgauhnihreqgjfwkjsmtpjhaefqzaauldrchjccdyrfvvrivuyeegfivdrcygurqdredakubnfguproqylobcwqxkzmausjgmhcmhgdnmphnqkamhurktrffaclvgrzkkldacllteojomonxrqyjzginrnnzwacxxaedrwudxzrfusewjtboxvynfhkstcenaumnddxfdmvzcautdcckxaaydzsxttobbgqngvvpjgojoglmkxgbfcpypckqchbddzwrxbzmqrlxvobtwhxginfgfrcclmznmjugwwbsqfcihubsjollmsqsghmcphelsotflbgsfnpcuzsrupchynvzhcpqugriwniqxdfjpwpxfblkpnpeelfjmtkuqpzomwnlmbupmktlptndmpdsydsgvfpenemwborifsuqhceskmkhssmvnonwafxwhgbibabvqopqfoviussqfqwehtxdzujtlntxmrjxxwtlggkytbiolydnilqadojskkvfxahhjmbocljarintdwcldvdxropbyjzwyyojuothwmlvrglfzdzdbtubxuoffvncrswsaznmoijoivvgobqpnckwvnhkebmtdhvygkjisuxhatmuudqbhmknhfxaxqxkjlzzqtsjfaeedfuujkolxjoqkdvfepvlhvhrwtfdukxffjpsswyxlijjhevryxozbafpfmowgrgonuatdqlahyggyljddjhmltedzlodsrkeutgtnkntarjkpxinovgzdthunwooxvjjmpsvknhkwjopmmlebksucvzqlyqnwcmbvbhrmlowpjbwyvwtgtoqnmicxapzarknnxtuufarzrosdqwsmtcjghecqudosrtjxyaaykqrxycrxuwjxnpqjnbkcpdmokalxapemvbqlzsvxzkutappwgzpdpyzkzcvbntcvfxsxpjaoxtfhvxxytgokrcxaetauqgndmphwzyiayabjrqgeppxyjsttyzuvldvybsuxkbmfzvrtnovidznpghozvafmsnsnqivmvubcwtfsrqtmknepbhowejazhkwcmmtpixxxlzqysxtwwtaidyaxyqleprxibexxyfvsddygthcuyyfwpjsfybglgzmbintattnhodtonpyzwotkgnguphpkxeatowzabsdnvqhkfcmofisfrfqgvpmvorpjfzslzmpjjnehrykxjzubuacclfkcyzobghtuoxrajvprecwgxxpswcgmmvedewdmfnqwcuqdsciliqecihluilgmfcswtwkkxlcbhqkvcswjebkrjlpgfgratzbsguvzifnhyxwjsjavwauxpannamxjdvzuhnaczyhepwzolhuslrkvwpnvgzmiizwudwdfzlktbqdxgyyiudsjvezkmesbjlkyertahnexhuqmjicbmusqdklasolwjxptxxeumzfwyucpabqseffunqpkfnnbecbbcjpdyjlibitllplxelrdkexdtquvptteyhtlqlbbbvoqozkynayyrbaqmyjhzxndsiyfsexwbioewqvqrtcdlpqmvjifvgymkgotzjmnzqtmrpndevnmthjitsspaqnjrdoyjwpyatmleyqsvkpamsvbmvxrllivfedkjigavyxjveqvrbacuigaipyhbbxipbzncwhrblirizxoqptqqweaafjeqiozpyfauuqmvhxkmnxmsyamptlzanotlslwuhtfqjrrwbwhmqhzkhdkcrfvbeiyipvfvpzhyujabtqwwtbkdogkemhibyxrnxsxrzletbqexkrqoiernaplqyjpqoubvjsebalwnksvloidzfpirwycztwzzvewxotakudkpedupkczlhwuskdnevdcplbklpjmpfdcyqtrcvvvtrffvpekkqmcupryjauteuvczvicthrxsxclprgdlwxfaigayrueicufdiamhtkbxotdirxxgvzqmeyrovfichqnivfjzauqfdftgmopsrgpugxtuhlcvspihazrssfszwxbqmurwmxcdbhumrgjqmvnkyrtnsjvwzxssqxnjomuyjnjuwrsyxwqyyxcszpoklwjdrltbsciedpiwlaqigesjsqhsjlrglmwanrxrfnwakztgjhxaunfqjvxiohnjqrjshymdovwgefhjesvhtiziojljdpmoxbyuyopqjkztvjgkwxkewpzhbjsuthsyoefjgwwyeozluhmgabbsqrhcrtxmjvcaxxsufahyyayzkhuhjrjsvoqhtydwpbszxsbziyrvgqmlunwscpirzfcbtseplkgwfkhrouoysrwmqojahyqmfevsdcomryhgdmlxukwyzcprskwgxulsuckbsepjeiszsgcezwapqrvlwigrovjcdzxxphqlsrzihmgzrioqrqetkzfbldjiemsfzbhzfnwywmxxgdpylraxglmtbiylbhcwhlsyoyhgmgopprzaxqmomsyhgagiupjqbzxthtopotmitnqwtoetonxwzghutifklgklrnuwkmsyqcpuivahqatmsckmaalkicsnxucovtykrxawzadjxwxqmndhldttxsknxteznjsqtfbccfqmwhbvssiigvijsuxiicaahmkwywttjzppkwlbmjahtputiebpbbmuegyrhlthxwgjprwvhshzyavqyecztozoabnanhrrbddndodxeuiozioiuozxqtihwauroqrdqwcvlxzipodiispqnzomcwvaptgrgdfnyytkwwqqtmiuuyvgaihfshccxhuuyyhtgdglfciebdutoeunfhdaxphbsywztpwjngjncpxrjvbvccefkbemgsdymzmmkwdehfkruqbyvecmpesromdxllubryyeshqlzmrewqnkqitxgiigquskwtcznlterxbltzydyzvahnkixjwzztdjpqsuowkvfccockvrjbfrjpcgdjdrwdnposrjgdrqrvqtvppazhltjqvcclpeztsjpynzfrotqpoxmwhhwewnvcbvdkuzififrtwqqeojueqbnskwzeewzkaojursqgsczvhhujzumigofhwbkkfluwzkctkagxksmfauwinsjlsojtrxhwmhlvbypecjeiwwstneuiqubpgugwgnmikdwickdilsnpdqsvmterdfblhwbafbgarcsfijylbiimofgxeirpbtywqzapkkcafcomvntmdhzxlefppyebeoeqznbhycwmfyaqqiannyhqouizveavgzjwoblsgwnkvjlnivqcwvzxtcthynmuxqkwwmtfisgglgcoxpipytdbamrykbokmwgsddpqkrzyjchztmiepagwhroqkhwudbcihpqwaqzxugkvakvlavkswfzsdbvqidhtbcdeytmpphkuhsxorpufwhjrutksslhlrxlydxvkosaggmpbgzvbafazjohqsswtorckqaxsrehnrlyjiwtmhglkozfkmmxtyvoxhfkxopvybjzoxhzubdntoamzottcjtuegmpqkcdbbgckjqtebichznpprqiswbdhoyncsaetlgbfviocfwxwdrnlffbfhvyxzukjwocyhzqjzdhtbrrrllktchfnctpirnawonydwwvuabuqcimcnlhqodemakmunmaxiomkeywcofqbkdmzoizgqipzayixrydwsovhztkgzskwptkqcexrnnxskywndqizlzklnissamqazhlndnviltkoiafmeicgguzxhrdjzzheruswavnvslonoasrudrnldkldkfztagienatjzwxclkkulncaqptoneqlnbtoddbmivazxzmcojdhiswkaxiagtutafrsvpphuraaaixztwdyruumqadjepvvcvoidwmtpbnmquiopiwpuwczdapdzghavviyirojnolsowrmvvjiqswricmzsxavdqamnfhwfgeohskkefutxxibhpulnlwxqwwzdgdjgeqwapbhlpudoemnntpouahgxjhzjbeplttriabwucrjmbvbozvmxobatkhqsqchlhtbofuikwafkcowuuntfhpkdeyhokquwqvwtthhhugjzmfeuinipbncizockaadalljreqtkhudblprzlsrwxoccslutwqzsqtijvcwnpflrlukdiaohqjhraglgriykldkdfrdrxjstcwrsxgywfnhcbkpmesupmtrvipfbktbwzfahoevnhxbrhhfobgywcvhktdoxqtekiwwurzblmldlfibdvemunnlxubykvvrgktrerptisizxhrevnxquezxkugroohrhudidgvhtjhyezkyhpfxwgprpseaccxkwvixvfhqfawkfdjpyeevdggatfiekixeyrfcpxscjkcfgqmyhjmjtimdspizhwzizcyuceglmmbgygfvtqvzqatxlgibyzzkiajxmbhmkqlwhqnghlvlzgppxooeoqxppbpmblxnkeofmniumjcafcuyvdcueterqpjjwaknkxtlzqfljnwkxgkfylnukbiysplkhjucfuwohzvphjbjyovdlnbfrkvbemwytfjynqmgzagbkwekkouxdcynkhtosfytlucentoilfuldvrxlonvkxzecxepkmzzgxluahmjyecsldjesdcpjikvpaudvkxgllisaambovjkdqrkdorjfnyghhhptzifawftzqgemnhpqyictmoyfpcvkcaodakjacqauzyowdzsfqhkplfbyzmnimdlxmjydaxyjnecxsjjbhiqnvocdenqmwilxxzoqfotpikpqudmomikppzhdhfqsgbxiisyzwnhxyfvydfmpdwomciudcnyndgcnfjitppmymxiisnebpywsgqsxdjplwzfmjoopyyifvkmwwpgpljeawpvapihoxuuffbrwhpevcoqrgrqwzhibnorkhzmlbzfhxunrklibvpszznopfgaxzgfltlsxbtumilocltgcozgtziufuzimxeekwnysbicrfxdiogcseozpscrhjotyczcwmbaaolsvubpylonmwajgxzgyzaovenfvocikqjtxgvenksppwwplhxtgybvmajeyfaxegseijikcmduclaaioissisiyppnzdubptsaveszsippqmotjhkudnvqzbkatnefulgexktrmhddapswptfvovujiuwbmibructtmrvznjrchjwzwmozecrznjkfrvkrmrdwroaocqpktlmwxwtnuamqelrwbgbijilnhiiulltovbeflwlpbhyffhbavhfuahlindjdfpekxglixlaxxtolhglvwxkyvulcyjeflloqzhltmgtujdcuugnrotlotcpbnyfhejegcmfptqmveghmfbmvklsqfubvxctepvmljohzxxoolnvlayguokqdauptyvjafzzkqtaxjlrbrukkkigjmxqrbazlpdevpezpbwshvpckldqgivlqpirqvwqquyxpixqireuqamffsvvntguxesidrnwwtqkdozfpkduulifzdpohcgubkurehrqbbxajefbfhkzbpkapbszyspdaaoxraojotjufsturtjhudpetsgrzuigusnwlyrvfnkkmsdbuhvhfqtdvtnlewfquuhtainkebbvzhtqbkdbmvhbsnjbtvjtqnbchiwfuqlzsmxvfjtvquitivyhzpxcdjwikfatcanchxssjluhlyoebcgnsqfzxxwgliuejobcfpvnyrrpkegeqpvlhxeeocmerjmziudtsqqozvejnrtibvnjepfqdsmvstmmwwwqknnrmqmjccpaowazfeurgpbfryedqjrltmymhysoicwuohferebeacazuvjoxyipmsgufjiwlcfywxteyyqdhxwjhiudghyxyoxbsceftdrqelxfvcfbbjjyfsvkvsapdshakgdvhcfmceztgjcmhxlhasqkauqlnfhggtagrnffmnpinwlexrqxisbfnhjzqvoxkukylzcrupmibacpjzsnaclmnuqnbdifzlujqvnfjxxvkczfkzzjqnaqpohygjsjtakzrsosyqhquhkjcjyugtedogfurkxiyqufotiajmwhyilthmoevlwlrxpwpzhsvbfzvtvhwycfznmaomafsyvyrqpizteuoxgthfxsmxjrwpsursgwthhilgdhzfzaxadtklhyhqzfdimsrueecxkqkrudlmzgdtnhmivnnkclgarygydqdhltrsthidzyqazfnovktqcotchcolineiytymrjscyoeivdyhphljzhezohmiurcpblvwaajiqugtaoqmemjlhgoxprurtymkktdbnoxwttgeeqimlhcztctyphmeqdsuyvkkjoplmzdcakpjvozimhxxqhduiqedlngwgoooupnedksdgpmhhdaqbsqrfpdrsykhbutsnuwjppgdeebjgsdyfoecqqnlemkimipecehlbtmbwnkdxymeclsshvkmywjxeshoihmlgvxiljvwllfpnjzywcpamevwtygfphifubttnwnphdbytwodclrjprseqwrdwsvyncgfrazzaodggxwwbtjqujrmcdpomjryledhufhwkhzktnkytgjpmmgvxjcnjgzuhwqqsldzcsfojswrqcnbqyxaagibpvtxdonpeashnrohuvogldxhsprngsoqdjfqtexyrwizzoeowaqezdlmwafcozvqciewgkekfgrcyvzsahpszobrixwxkpiclqljtkvnbimpdkyebcwlfkffrlzzmkvmhnlcivwhwztzrbxjcrtuvtxfkidxhoafyesyvizvozsqorqmqlesixrnerzoowrvwpmibhhyffuvkoukdwjcvxqglschjagquehpnhkycpmjtgludhrbefjjfytkxlbnvmdwsyxhgsczhyjgdfgnwfpdtlkhpekhjncylcqmssyghwdvaeqjkzmhiydlxdjohnscghbtuswzumsqoykiidfwfxyaaaymoivfhjlrwyaxawgeurbrnberazsxtkaquehjfcewctbfjtpqdljhehjobmarguqwsokldzscsfacxfzxfjqoverscjzbkmzdndosiyhtyavoxhtapyektuatprwskxzcznfdiuehuwymtxdrnklsmduskvutkfiubzyblwmparmjdspxywxerftzlkoriebsupcpxcjwkuveerenlaitvycicyzalwuiuzteyctmuifefygaiaioiiedbywrgrtdxvdkocsaehfcilqjoevajnjttknrsprtkrlkjapymuzrphzlcepaytfaveopszrnkvnehrjstzflvyahorktkmgycouiertlpbjcsxqlgyglmvlyqxixipvwoqlnkaeqmarvxumkrnjcokvfktqjdcugbidvbxrnsaqwxtbftqsnpavytodpjdpvyqxksuvzwztjrwovttlnkznqdqiauapwkczxrxopeneuxflgbdwjmhjguzpeuddfeimozyfrqmfozissccrifwqbhxyehktusdgzxlaeykexqgqoevjtframuqgbdnrsmbxrvbtfglowffctujtzqwzggtlbhropkwkbbwvnakwvvdycxczozqiworvpwkoqmqhcalyzvqnkcxekjqzvueswqknzpyvysdkhsoicmhczohefnaslxwxllxlewtzuwbsuvseneiqwhnezojkxhoryesugdhtjckqjdfgnrdoizpyfmdlqlwqiodcwfygkivbujfinzyhcejcjojonhgustqjfnecolocmfhpzxtgfpmuscrldurennlqkwhhyipqzevbyktbvtpwvttgecajylqvuizfsoayxziljzegblcatmvefqrzxwktndpbbzdrwlphlgdywdofnzxqlxvkhdjyalhvvpaangodnlxhlsxshhtifxickobixbbduzvngqiaggcxfgrjmarwupaybnqgudbewkgwgtocblxjeccgqhbczibhqufqqxvllvmtzhfmbezplhqakbmmvafqyxjyexdsswbjiouymhlzcltjudobfuoiwubgeidpmvkhozhkducomlgltlveinncaiknsugjqccasdxdazcrtvllkfvtezazzcsctlegenlltvkzdqowgoljpdsyqncsdjsdcxxyrghrwpqinxmridxpdpqunvkwxrykxtlxyppfmajfhqyudwtigbjtmqmdltcqzgcaiwswfyryhcwwiaruhiibujopgrqnpiugkdqtesojacqhnwdagnvxesfrfiefaabradqeelkpkecvpsdwelpdjmmbpdupzvtvjxydkdncugghonucwegvfjzbdwkbevkgdwubtjvtoqothggtdrdolgjmfubzzpnhjaqwotzqblhmrfzfgykzmucwwpdyjvctvfamcgltmjtmrcjivhsytnwmqqjvmohfyesqxdvrjgfvgymhlwdxlozmcqmvhtcexa..."
                ;
        String B = "";

//        char c[]=A.toCharArray();
//        Arrays.sort(c);
//        String sortedA=new String(c);
//        int count=0;
//        for(int i=0;i<B.length()-(A.length()-1);i++) {
//            String str1 = (B.substring(i,i+A.length()));
//            char[] letters=str1.toCharArray();
//            Arrays.sort(letters);
//            String word=new String(letters);
//            if(sortedA.equals(word)) {
//                count++;
//                System.out.println(word);
//
//            }
//        }
        System.out.println(solve(A, B));
    }

    public static int solve(String A, String B) {




            int count=0;
            Map<Character, Long> am = new HashMap<>();

            for (long i = 0; i < A.length(); i++) {
                if (am.containsKey(A.charAt((int)i))) {
                    am.put(A.charAt((int)i), am.get(A.charAt((int)i)) + 1);
                } else {
                    am.put(A.charAt((int)i), (long)1);
                }




            }
            int j=0,k=A.length();

            while(k<=B.length()){
                String str1=B.substring(j,k);
                Map<Character, Long> bm = new HashMap<>();
                for(int i=0;i<str1.length();i++){
                    if(bm.containsKey(str1.charAt(i))){
                        bm.put(str1.charAt(i), bm.get(str1.charAt(i)) + 1);

                    }
                    else
                        bm.put(str1.charAt(i),(long)1);
                }
                if(am.entrySet().equals(bm.entrySet()))
                    count++;
                // System.out.println(str1);
                j++;
                k++;


            }



            return count;



    }

}
