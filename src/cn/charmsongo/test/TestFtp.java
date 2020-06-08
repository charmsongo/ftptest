package cn.charmsongo.test;

import cn.charmsongo.utils.FtpTool;

public class TestFtp {
	
	public static void main(String[] args) {
		boolean rv = new FtpTool().login("192.168.3.161",21,"song","song");
		//System.out.println(rv);
		System.out.println(rv);
	}
	

}
