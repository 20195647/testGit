package com.neuedu.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/*
 * 	�ͻ���
 * 	1.ͨ��socket�ͷ�������������
 * 	s = new Socket("xx.xx.xx.xx",xxxx);
 * 	2.�������������Ϣ
 * 	out = new PrintWriter(
 * 	new OutputStreamWriter(s.getOutputStream()));
 */
public class ClientDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("####�ͻ���####");
		Socket s = null;
		PrintWriter out = null;
		Scanner sc = null;
		BufferedReader in = null;
		
		try {
			s = new Socket("127.0.0.1", 8888);

			System.out.println("[��������ַ]:" + s.getInetAddress().getHostAddress());
			System.out.println("[�������˿ں�]:" + s.getPort());
			System.out.println("[�ͻ����������ݣ������������]");
			sc = new Scanner(System.in);

			String clientStr = sc.nextLine();
			out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
			out.println(clientStr);
			out.flush();
//			out.write(clientStr);�½ӡ�;println����Ҫ			
//			s.shutdownOutput();
			
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String serverStr = in.readLine();
			System.out.println("[�������˷���������Ϣ]:" + serverStr);

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (sc != null) {
					sc.close();
				}
				if (out != null) {
					out.close();
				}
				if (s != null) {
					s.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
