package bai_tap.TreeMap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Map;

public class TreeMap<C, I extends Number> {
    public static void main(String[] args) {
        String[] a=("HELLO WORLD HELLO HELLO").split(" ");
        Map<String,Integer> map = new java.util.TreeMap<>();
        String key="";
        int count=0;
        int value=0;
        for(int i=0;i<a.length;i++){
            key=a[i];
            if(map.containsKey(key)){
                value=map.get(key);
                map.put(key,value+1);

            }else {
                map.put(key,1);
            }
            }
        System.out.println(map);

    }



}
