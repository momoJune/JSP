package kr.green.xml;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class MainApp {
	public static void main(String[] args) throws JAXBException, IOException {
		 StringBuilder urlBuilder = new StringBuilder("http://api.visitkorea.or.kr/openapi/service/rest/GoCamping/basedList"); /*URL*/
	     urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=Z4uCridIALZt7Mtx3/p2iKR3FCCLa1kLaCW2pLceTr/41ibB6PO3BZt4vfFJHLRrj7v0ACBEwptVEJV9bny1iA=="); /*Service Key*/
	     urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*현재 페이지번호*/
	     urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*한 페이지 결과 수*/
	     urlBuilder.append("&" + URLEncoder.encode("MobileOS","UTF-8") + "=" + URLEncoder.encode("ETC", "UTF-8")); /*IOS(아이폰),AND(안드로이드),WIN(윈도우폰),ETC*/
	     urlBuilder.append("&" + URLEncoder.encode("MobileApp","UTF-8") + "=" + URLEncoder.encode("AppTest", "UTF-8")); /*서비스명=어플명*/
	     urlBuilder.append("&" + URLEncoder.encode("mapX","UTF-8") + "=" + URLEncoder.encode("128.6142847", "UTF-8")); /*GPS X좌표(WGS84 경도 좌표)*/
	     urlBuilder.append("&" + URLEncoder.encode("mapY","UTF-8") + "=" + URLEncoder.encode("36.0345423", "UTF-8")); /*GPS Y좌표(WGS84 위도 좌표)*/
	     urlBuilder.append("&" + URLEncoder.encode("radius","UTF-8") + "=" + URLEncoder.encode("2000", "UTF-8")); /*거리 반경(단위:m) Max값 20000m=20km*/
	     URL url = new URL(urlBuilder.toString());
	        
	     JAXBContext context = JAXBContext.newInstance(Response.class);
	     Unmarshaller um = context.createUnmarshaller();
		 // Unmarshall the provided input XML into an object
		 Response r = (Response) um.unmarshal(new InputStreamReader(url.openStream()));
		 System.out.println("Response : " + r);
		    
		 int totalCount = r.getBody().getTotalCount();
		 int totalPage = (totalCount-1)/100 + 1;
		 List<Item> itemList = new ArrayList<Item>();
		 for(int i=1;i<=totalPage;i++) {
			 urlBuilder = new StringBuilder("http://api.visitkorea.or.kr/openapi/service/rest/GoCamping/basedList"); /*URL*/
			 urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=Z4uCridIALZt7Mtx3/p2iKR3FCCLa1kLaCW2pLceTr/41ibB6PO3BZt4vfFJHLRrj7v0ACBEwptVEJV9bny1iA=="); /*Service Key*/
			 urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode(i+"", "UTF-8")); /*현재 페이지번호*/
			 urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("100", "UTF-8")); /*한 페이지 결과 수*/
			 urlBuilder.append("&" + URLEncoder.encode("MobileOS","UTF-8") + "=" + URLEncoder.encode("ETC", "UTF-8")); /*IOS(아이폰),AND(안드로이드),WIN(윈도우폰),ETC*/
			 urlBuilder.append("&" + URLEncoder.encode("MobileApp","UTF-8") + "=" + URLEncoder.encode("AppTest", "UTF-8")); /*서비스명=어플명*/
			 urlBuilder.append("&" + URLEncoder.encode("mapX","UTF-8") + "=" + URLEncoder.encode("128.6142847", "UTF-8")); /*GPS X좌표(WGS84 경도 좌표)*/
			 urlBuilder.append("&" + URLEncoder.encode("mapY","UTF-8") + "=" + URLEncoder.encode("36.0345423", "UTF-8")); /*GPS Y좌표(WGS84 위도 좌표)*/
			 urlBuilder.append("&" + URLEncoder.encode("radius","UTF-8") + "=" + URLEncoder.encode("2000", "UTF-8")); /*거리 반경(단위:m) Max값 20000m=20km*/
			 url = new URL(urlBuilder.toString());
			 r = (Response) um.unmarshal(new InputStreamReader(url.openStream()));
			 itemList.addAll(r.getBody().getItem());    
			 System.out.println(r.getBody().getItem().size() + "개 읽음");    
		}
		System.out.println("전체 : " + itemList.size() + "개"); 
	}
}
