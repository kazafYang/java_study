//一个简单的抓取指定网页的数据，并简单的将数据分割后存入到数组中
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class zhuaqu {
	public static String clawer(String myurl) {  
        int i = 0;  
        StringBuffer sb = new StringBuffer("");  
        URL url;  
        try {  
            url = new URL(myurl);  
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(), "gbk"));  
            String s = "";  
            while ((s = br.readLine()) != null) {  
                i++;  
                  
                sb.append(s + "\r\n");  
            }  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
          
       // System.out.println(sb.toString());  
      //  System.out.print("static");  
        return sb.toString();  
    }  
    public static void main(String[] args) {  
    	  
        String myurl = "http://hq.sinajs.cn/list=sz159915";  
         String aa;
         aa=clawer(myurl);//第二种方法 
         String[]  strs=aa.split(",");
         for(int i=0,len=strs.length;i<len;i++){
             System.out.println(strs[i].toString());
         }
         System.out.println(strs[30]);
    }  
}


