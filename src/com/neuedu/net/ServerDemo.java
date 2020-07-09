package com.neuedu.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
 * 	������
 * 	1.����serversocket
 * 	ss = new ServerSocket(xxxx)
 * 	2.���ܿͻ�������
 * 	Scoket s = ss.accept();
 * 	3.ͨ��socket�Ϳͻ���ͨѶ
 * 	���տͻ��˷��͵�����Ϣ
 * 	in = new BufferedReader(
 * 	new InputStreamReader(s.getInputStream()));
 */
public class ServerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("####������####");
		ServerSocket ss = null;
		Socket s = null;
		BufferedReader in = null;
		PrintWriter out = null;
		Scanner sc = null;
		try {
			ss = new ServerSocket(8888);

			s = ss.accept();

			System.out.println("[�ͻ��˵�ַ]:" + s.getInetAddress().getHostAddress());
			System.out.println("[�ͻ��˶˿ں�]��" + s.getPort());

			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String clientStr = in.readLine();
			System.out.println("[�ͻ��˷���������Ϣ]:" + clientStr);

			// ���������յ����ݺ���ͻ��˷�����Ϣ
			sc = new Scanner(System.in);
			System.out.println("[�������������ݣ���ͻ��˷���]");
			String serverStr = sc.nextLine();
			out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
			out.write(serverStr);
			out.flush();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (ss != null) {
					ss.close();
				}
				if (s != null) {
					s.close();
				}
				if (out != null) {
					out.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
