package network1;

import java.io.*;
import java.net.*;

public class Network1 {
    public static void main(String[] args) {
        try {
            for (int i = 100; i < 200; i++) {
                char data[] = new char[1024];
                int len;
                Socket s = new Socket(IP 주소, 80);
                PrintWriter out = new PrintWriter(s.getOutputStream(), true);
                InputStreamReader in = new InputStreamReader(s.getInputStream());
                out.println("POST 경로 HTTP/1.1\n" +
                    "Accept: text/html, application/xhtml+xml, image/jxr, */*\n" +
                    "Referer: 참조 경로\n" +
                    "Accept-Language: ko-KR\n" +
                    "User-Agent: Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; rv:11.0) like Gecko\n" +
                    "Content-Type: application/x-www-form-urlencoded\n" +
                    "Accept-Encoding: gzip, deflate\n" +
                    "Host: 호스트 주소\n" +
                    "Content-Length: " + i + "\n" +
                    "Connection: Keep-Alive\n" +
                    "Cache-Control: no-cache\n" +
                    "Cookie: JSESSIONID=세션 값\n" +
                    "\n" +
                    "파라미터 정보");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
