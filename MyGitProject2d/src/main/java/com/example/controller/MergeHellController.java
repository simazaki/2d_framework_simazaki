
package com.example.controller;
import java.util.Random;
public class MergeHellController {
	public static void main(String[] args) {
		kadaiA();
        kadaiB();
	}

		static void kadaiA() {

			for(int i = 1; i <= 10; i++) {
				System.out.println("現在" + i + "回目のループです。");
			}
		}


	static void kadaiB() {
	//ここに課題を書く。メソッド名変えてね。
		Random RandObj = new Random();
		int n = RandObj.nextInt(100) + 1;
		System.out.println(n+"が出ました");



	}
}

