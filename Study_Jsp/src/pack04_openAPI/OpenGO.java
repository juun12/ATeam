package pack04_openAPI;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class OpenGO {
	public static void main(String[] args) {
		// https://api.odcloud.kr/api/3082925/v1/uddi:7c291067-a956-4811-a9ec-942b6979ff77_201709270816
		// ?page=1
		// &perPage=10
		// &serviceKey=T4hz25A3X%2FpazyflcvdOHTomLEwv9%2BLPq4M%2FehP0v6OIb1Z7Czkwzib5Ve4Kns2mX4%2BurplV1NQZp%2Fl%2BCvuOSw%3D%3D
		String page = null;
		String url = "https://api.odcloud.kr/api/3082925/v1/uddi:7c291067-a956-4811-a9ec-942b6979ff77_201709270816";
//		for(int j=0; j<10 ; j++) {
//			page =  Integer.toString(j);
		try {
			String doc = Jsoup.connect(url).data("page", "1").data("perPage", "10")
					.data("serviceKey",
							"T4hz25A3X/pazyflcvdOHTomLEwv9+LPq4M/ehP0v6OIb1Z7Czkwzib5Ve4Kns2mX4+urplV1NQZp/l+CvuOSw==")
					.timeout(4000).userAgent("Chrome").ignoreContentType(true).execute().body();
			System.out.println(doc);

			JSONParser jsonParser = new JSONParser();
			try {
				JSONObject jsonObj = (JSONObject) jsonParser.parse(doc);
				JSONArray jarr = (JSONArray) jsonObj.get("data");
				// String[] arr = new String[3]
				ArrayList<GoDTO> list = new ArrayList<>();
				for (int i = 0; i < jarr.size(); i++) {
					JSONObject obj = (JSONObject) jarr.get(i);
/*					System.out.println("======================");
					System.out.println(obj.get("연번"));
					System.out.println(obj.get("상 호"));
					System.out.println(obj.get("소재지"));
					System.out.println(obj.get("연락처"));
					System.out.println(obj.get("주메뉴"));
					System.out.println();*/
					GoDTO dto = new GoDTO(
							obj.get("상 호")+"", 
							obj.get("소재지")+"", 
							obj.get("연락처")+"", 
							obj.get("주메뉴")+"", 
							Integer.parseInt(obj.get("연번")+"") 
							); 
					list.add(dto);
				}
					for (GoDTO goDTO : list) {
						System.out.println();
						System.out.println(goDTO.getNum());
						System.out.println(goDTO.getTitle());
						System.out.println(goDTO.getLocation());
						System.out.println(goDTO.getTel());
						System.out.println(goDTO.getMenu());
					}
				
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
//}