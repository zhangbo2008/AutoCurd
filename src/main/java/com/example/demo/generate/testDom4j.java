package com.example.demo.generate;

import java.io.InputStream;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.ElementHandler;
import org.dom4j.ElementPath;
import org.dom4j.io.SAXReader;
import org.dom4j.DocumentHelper;
import jdk.internal.util.xml.SAXParser;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.io.SAXReader;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.*;

import static java.lang.Thread.sleep;

public class testDom4j {
/*
*
* 用法:直接testDom4j.fun2() 就会返回需要的参数字典.
*
*
*
*
*
* */





    //https://blog.csdn.net/weixin_40790474/article/details/88188058
    // java里面正则,对于特俗字符用[]括起来即可!!!!!!!!!!!!!!!
    public static String fun (String a,Map b){
        System.out.println(111);

        String regex = "[$][{]([^}])*[}]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(a);
        ArrayList<String> tmp3=new ArrayList();
        while (matcher.find()) {

            tmp3.add(matcher.group());
        }


        ArrayList<String> tmp4=new ArrayList();
        for (String tmp5:tmp3
             ) {
            int chang=tmp5.length();
            tmp4.add(tmp5.substring(2,chang-1));
            
        }




        for(int i = 0;i < tmp4.size(); i ++){
            a=a.replace(tmp3.get(i),(String)b.get(tmp4.get(i)));
        }









        return a;



    }





    public static  Map<String,String>  fun2() throws IOException, InterruptedException {



        File file1 = new File("");
        String filePath1 = file1.getCanonicalPath();

        File file2=new File (filePath1+"/"+"pom.xml");
        //创建SAXReader 的Reader 实例
        SAXReader reader = new SAXReader();
        try {
            Document document = reader.read(file2);
            Element students =document.getRootElement();
         Element tmp=students.element("properties");
//继续封装
            Iterator<Element>	subElement_it = tmp.elementIterator();

            HashMap Map= new HashMap<String,String>();
            while(subElement_it.hasNext()) {
                Element subEle = subElement_it.next();
                Map.put(subEle.getName(),subEle.getStringValue());

                System.out.println("节点：" + subEle.getName() + " = " + subEle.getStringValue());
            }
//发现没有进行替换,所以用正则进行替换.!






            System.out.println(fun("aaaa",Map));




            Map.forEach(  (key, value) -> {
       String newValue=fun((String) Map.get(key),Map);
                Map.put(key,   newValue     );



            })
                ;
            return Map;









//显然要把上面的结果都写入一个字典中.方斌以后读取.






        } catch (DocumentException e) {
            e.printStackTrace();
            HashMap Map1= new HashMap<String,String>();
            Map1.put("error,checkYourPomXml","c");
            return Map1;
        }















    }



    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println(testDom4j.fun2());
    }




}
