import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by andre on 12.03.2017.
 */
public class DownloadUrl {
    private URL url;

    public static void main(String[] args) throws IOException {
        String url = "https://stooq.pl/q/?s=wig20&c=1d&t=l&a=lg&b=0";
        DownloadUrl html = new DownloadUrl(url);
        String nowy=html.donwloadHtml();
        System.out.println(html.findIndex(nowy));
        String url1="https://stooq.pl/q/?s=swig80&c=1d&t=l&a=lg&b=0";
        DownloadUrl html1=new DownloadUrl(url1);
        String nowy1=html1.donwloadHtml();
        System.out.println(html1.findIndex(nowy1));
    }

    public String findIndex(String index){
        String start= "Kurs<br><b><span style=font-weight:bold";
        int startI=index.indexOf(start);
        index= (String) index.subSequence(startI,index.length());
        startI=index.indexOf("id=");
        int stopI=index.indexOf("span>");
        System.out.println(stopI);
        System.out.println(startI);
        index= (String) index.subSequence(startI,stopI);
        startI=index.indexOf(">");
        stopI=index.indexOf("</");
        index= (String) index.subSequence(startI+1,stopI);
        return index;
    }

    public String donwloadHtml() throws IOException {

        InputStream in = url.openStream();
        return IOUtils.toString(in);
    }

    public DownloadUrl(String url) throws MalformedURLException {
        this.url = new URL(url);
    }

    public URL getUrl() {

        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }
}