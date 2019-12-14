package yuhao.utils;

import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 喻浩
 * @create 2019-12-13-19:08
 */
@Component
public class UrlUtil {

    /**
     * 通过域名获取真实的ip地址 (此方法需要在线程中调用)
     * @param domain
     * @return
     */
    public String getIP(String domain) {
        InetAddress iAddress = null;
        try {
            iAddress = InetAddress.getByName(domain);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        
        if (iAddress == null){
            return "";
        }else {
            return iAddress.getHostAddress();
        }
    }

    /**
     * 获取url对应的域名
     *
     * @param url
     * @return
     */
    public String getDomain(String url) {
        String result = "";
        int j = 0, startIndex = 0, endIndex = 0;
        for (int i = 0; i < url.length(); i++) {
            if (url.charAt(i) == '/') {
                j++;
                if (j == 2)
                    startIndex = i;
                else if (j == 3)
                    endIndex = i;
            }

        }
        result = url.substring(startIndex + 1, endIndex);
        return result;
    }

    /**
     *获得网页标题
     * @param str
     * @return 
     */
    public String getTitle(final String str)
    {
        String regex;
        StringBuilder title = new StringBuilder();
        final List<String> list = new ArrayList<>();
        regex = "<title>.*?</title>";
        final Pattern pa = Pattern.compile(regex, Pattern.CANON_EQ);
        final Matcher ma = pa.matcher(str);
        while (ma.find()){
            list.add(ma.group());
        }
        for (String value : list) {
            title.append(value);
        }
        return outTag(title.toString());
    }

    /**
     *
     * @param str
     * @return 获得脚本代码
     */
    public List<String> getScript(final String str)
    {
        String regex;
        final List<String> list = new ArrayList<String>();
        regex = "<script.*?</script>";
        final Pattern pa = Pattern.compile(regex, Pattern.DOTALL);
        final Matcher ma = pa.matcher(str);
        while (ma.find()){
            list.add(ma.group());
        }
        return list;
    }

    /**
     * 去除包裹内容的标签
     * @param str
     * @return
     */
    private String outTag(final String str)
    {
        return str.replaceAll("<.*?>", "");
    }
}
