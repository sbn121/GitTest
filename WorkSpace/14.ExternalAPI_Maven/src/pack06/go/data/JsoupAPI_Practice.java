package pack06.go.data;

import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.jsoup.Jsoup;

public class JsoupAPI_Practice {
	public static void main(String[] args) {
		// ?page=1&perPage=10&serviceKey=CmdwdrVDPAH0A40Af3zXcU6PGKetrDF1TI74tfwOdoQMRi8svpP5GfN5Ph%2BZ9qAsk9e1Vl1nByaDvvCdzr3gTw%3D%3D
		// Jsoup API�� ����ϱ� : http���·� �Ǿ��ִ� �����͸� json�Ǵ� xml���� ���·� String���� ������
		// String�� JsonPraser, JsonObject�� �̿��Ͽ� �츮�� Ȱ�밡���� ���� Ÿ������ ������ ������ �۾��� �Ѵ�.
		// http�� ��û�� ���ͳ��ּ��� Url�� �˾ƾ���. 
		// Url�������� ?�� �Ǿ��ִ� �Ķ���͸� ��Ȯ�ϰ� �־��, ���ϴ� ����� ���� �� �ִ�.
	    //�츮�� ���ͳ� �ּҿ� ��û�� �� �����ִ� �Ķ���ʹ� ���� String
		String url = "https://api.odcloud.kr/api/3074462/v1/uddi:efafd73f-3310-48f8-9f56-bddc1c51f3ba_201910221541";
		String doc = null;
		try {
			 doc = Jsoup.connect(url).data("page", "1").data("perPage", "38")
			.data("serviceKey", "CmdwdrVDPAH0A40Af3zXcU6PGKetrDF1TI74tfwOdoQMRi8svpP5GfN5Ph+Z9qAsk9e1Vl1nByaDvvCdzr3gTw==")
			.timeout(1000*10)
			.userAgent("Chrome")
			.ignoreContentType(true)
			.execute().body();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// json : key�� value�� ���еǾ��ִ� ��Ģ�� ���� ������Ÿ��(String)�̴�.
		// �߰�ȣ : �ϳ��� Object (int, String, DTO ��)
		// ���ȣ : array �� ���� �����͸� ���� �� ���� ����
		
		// JsonParser�� �̿��ؼ� String���� �Ǿ��ִ� Json�� �ϳ��� ������ �۾��� �� ����
		JSONParser parser = new JSONParser(); //���ڿ� => JsonObject ���·� �ٲ���
		try {
			JSONObject jsonObj = (JSONObject) parser.parse(doc);
			System.out.println("�Ľ̼���");
			JSONArray array = (JSONArray) jsonObj.get("data");
			System.out.println("array��� ����(JsonArray)");
			for(int i=0; i < array.size(); i++) {
				JSONObject tempObj =  (JSONObject) array.get(i);
				System.out.print("���˴�з� : "+tempObj.get("���˴�з�"));
				System.out.print(", �����ߺз� : "+tempObj.get("�����ߺз�"));
				System.out.print(", ���� : "+tempObj.get("����"));
				System.out.print(", �����̿� : "+tempObj.get("�����̿�"));
				System.out.print(", ��Ÿ���� : "+tempObj.get("��Ÿ����"));
				System.out.println();
			}
			
		} catch (ParseException e) {
			// String json�� key�� value�� ���� �����Ͱ� �ƴ� �׳� �Ϲ� ���ڿ��̶�� ������ �߻��Ѵ�.
			e.printStackTrace();
		}
		
		System.out.println(doc);
		
	}

}