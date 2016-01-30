package network1;

import java.io.*;
import java.net.*;

public class Network1 {
 public static void main(String[] args) {
  try {for(int i=100;i<200;i++){
   char data[] = new char[1024];
   int len;
   Socket s = new Socket("210.110.71.50", 80);
   PrintWriter out = new PrintWriter(s.getOutputStream(), true);
   InputStreamReader in = new InputStreamReader(s.getInputStream());
   out.println("POST /j2ee/haksa/stud/s_sg_app_in_c.jsp HTTP/1.1\n" +
"Accept: text/html, application/xhtml+xml, image/jxr, */*\n" +
"Referer: http://was.knue.ac.kr/j2ee/haksa/stud/s_sg_app_i.jsp\n" +
"Accept-Language: ko-KR\n" +
"User-Agent: Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; rv:11.0) like Gecko\n" +
"Content-Type: application/x-www-form-urlencoded\n" +
"Accept-Encoding: gzip, deflate\n" +
"Host: was.knue.ac.kr\n" +
"Content-Length: " + i + "\n" +
"Connection: Keep-Alive\n" +
"Cache-Control: no-cache\n" +
"Cookie: JSESSIONID=C2GGWrwL70Y2vvY1Rbz3RB215NGRT4HqNd2JQ4KkWDhPXbgJk09L!-1007823542\n" +
"\n" +
"course=10461007&devide=1&cn=%C4%C4%C7%BB%C5%CD%C7%C1%B7%CE%B1%D7%B7%A1%B9%D6%C0%C7%C0%CC%C7%D8&hname=&pname=&yy=2016&term=11&hname2=%C4%C4%C7%BB%C5%CD%C7%C1&pname2=");
  }} catch (Exception e) {
   System.out.println(e);
  }
 }

} 
