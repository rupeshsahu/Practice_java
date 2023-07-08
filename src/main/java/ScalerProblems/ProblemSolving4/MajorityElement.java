package ScalerProblems.ProblemSolving4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int A[] = {
                685250,373805,647785,647785,647785,647785,675911,647785,647785,647785,647785,635885,675097,66286,647785,647785,647785,647785,647785,370760,647785,947842,244285,400761,
                379864,647785,647785,647785,647785,647785,647785,978492,647785,704970,541737,647785,855460,647785,379855,986675,622753,647785,812299,647785,647785,647785,71467,846275,
                647785,710937,647785,366396,647785,382992,647785,647785,72527,555794,647785,523538,37408,647785,935587,647785,9595,647785,647785,647785,647785,647785,647785,647785,647785,
                744765,647785,647785,898050,886264,387791,647785,595602,817103,647785,647785,647785,647785,370484,647785,422927,673780,986485,647785,647785,331169,127239,647785,369048,647785,
                689862,598658,647785,647785,647785,647785,647785,403522,647785,647785,380166,670242,647785,647785,647785,846928,647785,647785,629864,537726,647785,647785,647785,647785,174936,
                234931,638244,588789,762821,155991,647785,647785,647785,844780,58614,329151,344786,647785,647785,647785,413772,456365,647785,421465,647785,647785,647785,647785,647785,829438,
                647785,855827,924592,647785,647785,647785,647785,103075,142368,389244,506112,647785,647785,647785,685983,852694,419178,588547,647785,873491,46833,718071,647785,647785,647785,647785,
                113736,647785,825636,126122,647785,647785,647785,319681,647785,212524,647785,553799,440788,647785,468137,647785,636472,158828,918745,215513,984597,903696,647785,752199,
                495024,733003,647785,827202,609598,489412,647785,647785,577408,647785,647785,1606,970292,854153,321920,647785,647785,783633,269450,463396,902482,581513,332547,647785,889940,
                468927,647785,647785,2987,106985,647785,647785,390892,186245,647785,601990,881690,647785,591218,647785,647785,647785,833579,647785,647785,647785,792941,413859,647785,74935,
                647785,647785,355665,712135,415899,56098,647785,575782,647785,622258,84803,647785,647785,438039,647785,294936,302259,647785,126039,345673,827076,647785,647785,451842,369195,647785,
                647785,801201,647785,749475,647785,204824,279989,941833,647785,293227,577189,577668,28938,516511,647785,647785,166523,523974,978864,976210,647785,647785,566202,647785,241621,647785,
                647785,647785,703696,458565,785805,647785,638180,647785,885802,647785,647785,250232,749277,397764,969844,647785,647127,647785,554071,647785,120270,647785,127108,904183,
                391021,647785,838069,647785,541704,647785,647785,178998,683509,697927,403189,330787,647785,156667,647785,647785,33148,647785,172891,647785,647785,471516,647785,24789,647785,
                311087,647785,939986,274398,775573,855966,578119,647785,760557,647785,647785,957665,196566,647785,119035,856582,647785,123050,224425,647785,647785,470588,939128,287455,647785,
                538582,528571,346725,647785,322979,955926,492696,647785,441771,647785,647785,647785,647785,213118,67995,781341,538940,647785,647785,647785,647785,647785,226460,647785,647785,647785,
                647785,647785,237198,647785,752903,780238,37151,647785,647785,647785,647785,782323,647785,647785,647785,647785,647785,647785,647785,647785,647785,131619,647785,647785,647785,320776,
                257459,647785,647785,647785,946493,647785,647785,647785,647785,647785,647785,8170,647785,557199,280807,910132,647785,894942,502410,20551,934637,887970,947278,732852,724566,647785,
                957292,243104,447088,647785,647785,647785,647785,426473,118197,647785,647785,845926,647785,647785,647785,647785,301864,652302,291758,647785,647785,918775,647785,
                647785,647785,186874,647785,458667,22598,642560,715372,647785,565666,647785,647785,647785,218841,647785,647785,712755,823763,688282,338412,647785,305102,647785,647785,
                647785,98945,647785,647785,647785,327015,19103,153027,647785,647785,647785,647785,647785,443500,304407,777013,311310,579899,647785,647785,647785,647785,694930,647785,647785,
                3918,647785,647785,432303,647785,647785,290213,680139,246060,647785,590836,542922,502936,784147,282637,647785,647785,647785,943406,324107,808450,647785,831247,934003,647785,
                888826,540594,647785,647785,697049,647785,647785,647785,647785,255782,837178,647785,647785,115667,647785,647785,553874,711108,82579,488871,647785,647785,141387,553161,830680,
                852185,647785,506456,647785,48595,495262,485829,826892,788996,647785,647785,751347,647785,927232,647785,227337,647785,647785,647785,847862,647785,443444,647785,647785,647785,
                647785,129513,998524,647785,647785,219065,647785,73309,146437,647785,444251,647785,140194,647785,647785,647785,127524,647785,296944,619375,647785,815950,647785,350220,401943,
                647785,647785,647785,647785,373467,403080,647785,37291,730533,647785,647785,647785,324274,965504,647785,707819,647785,395895,647785,647785,647785,652853,807985,647785,639921,
                647785,517985,647785,647785,348880,647785,647785,466286,647785,610049,647785,647785,5821,162778,616641,647785,590105,431188,647785,647785,647785,913914,647785,746466,647785,
                647785,102875,647785,505025,695897,647785,647785,9042,647785,302606,647785,866777,493482,134588,120416,647785,907483,647785,592832,647785,573560,647785,552599,954007,647785,
                647785,815985,647785,647785,647785,647785,647785,647785,994066,224504,820958,500014,145243,477329,647785,855566,53523,647785,133000,647785,647785,510590,647785,647785,170090,
                647785,647785,876397,647785,704604,647785,821200,632985,647785,647785,47804,647785,295960,482858,31125,647785,641300,647785,521490,647785,647785,647785,647785,828214,910080,
                647785,835644,728749,613082,287806,853444,647785,647785,107304,647785,135943,647785,647785,179605,258948,647785,926367,647785,647785,647785,669850,381686,647785,647785,647785,468386,
                223373,332350,315604,647785,647785,647785,647785,583060,187985,803781,397142,647785,647785,647785,647785,647785,647785,647785,274715,20383,981392,647785,647785,647785,647785,
                647785,574811,484638,647785,647785,647785,78928,625202,833439,50797,759712,255754,701987,38027,136731,647785,581700,213062,59910,647785,647785,647785,647785,548571,647785,647785,
                991107,698271,647785
};
        ArrayList<Integer> al = new ArrayList<>();
        for (int i : A) {
            al.add(i);
        }

        System.out.println(majorityElement(al));
    }

    public static int majorityElement(ArrayList<Integer> al){
        int candidate=0;
        int count=0;

        for (int i=0;i<al.size();i++){
            if(count==0){
                candidate=al.get(i);
                count=1;}
            else if(al.get(i)==candidate){
                    count++;
                }
            else
                count--;
            }
        int occurance=0;
        for(int i:al){
            if (i==candidate){
                occurance++;
            }
        }

        if(occurance>=al.size()/2)
            return candidate;



        return -1;
    }
}