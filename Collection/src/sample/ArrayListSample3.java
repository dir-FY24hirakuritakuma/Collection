package sample;
import java.util.ArrayList;
import java.util.List;


public class ArrayListSample3 {
    public void main(String [] args) {
        List<String> places = new ArrayList<>();
        //要素の追加
        places.add("アイスランド");
        places.add("スペイン");
        places.add("スペイン");
        places.add("ナポリ");
        places.add("ヨセミテ国立公園");
        
        //要素の追加
        String firstItem = places.get(0);//最初の要素の追加
        System.out.println("一番目の要素（置換前）" + firstItem);
        
        places.set(0, "スウェーデン");
        System.out.println("１番目の要素（置換後）" + places.get(0));
        
        
        System.out.println("２番目の要素（消去前）" + places.get(1));
        places.remove(1);
        System.out.println("２番目の要素（消去後）" + places.get(1));
        
        System.out.println("拡張Forループによる取得：");
        for (String place : places) {
            System.out.println(place);
        }
        
        
        System.out.println("For-Eachとラムダ式による取得");
        places.forEach((place) -> System.out.println(place));
        
        int size = places.size();
        System.out.println("リストのサイズ（クリア前）：" + size);
        System.out.println("リストのサイズ（クリア後）" + places.size());
        
    }

}
